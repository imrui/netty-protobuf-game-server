package com.xxicon.poker.core.filter;

import com.xxicon.poker.core.action.ActionContext;

public interface Filter {
    void doFilter(ActionContext context, FilterChain chain) throws Exception;
}
