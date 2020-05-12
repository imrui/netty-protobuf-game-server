package com.xxicon.poker.core.filter;

import lombok.Getter;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

public class FilterChainFactory {

    @Getter
    private List<Filter> filterList = new ArrayList<>();

    @PostConstruct
    public void init() {
        this.filterList.add(new LogMessageFilter());
    }

    public FilterChain createFilterChain() {
        return new FilterChain(this);
    }
}
