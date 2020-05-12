package com.xxicon.poker.core.filter;

import com.xxicon.poker.core.action.Action;
import com.xxicon.poker.core.action.ActionContext;
import com.google.protobuf.GeneratedMessageV3;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class FilterChain {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    private int index = 0;
    private FilterChainFactory filterChainFactory;

    public FilterChain() {
    }

    public FilterChain(FilterChainFactory filterChainFactory) {
        this.filterChainFactory = filterChainFactory;
    }

    public void doFilter(ActionContext context) throws Exception {
        Filter filter = this.getNextFilter();
        if (filter != null) {
            filter.doFilter(context, this);
        } else {
            Action action = context.getAction();
            if (action != null) {
                GeneratedMessageV3 result = action.execute(context);
                context.setRespMsg(result);
            } else {
                this.logger.warn("Action is null: {}", context.getActionKey());
            }
        }
    }

    private Filter getNextFilter() {
        List<Filter> filterList = this.filterChainFactory.getFilterList();
        if (filterList == null) {
            return null;
        }
        int size = filterList.size();
        if (size == 0 || this.index >= size) {
            return null;
        }
        this.index ++;
        return filterList.get(this.index-1);
    }
}
