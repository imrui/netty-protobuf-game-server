package com.xxicon.poker.core.executor;

public interface ExecutorRouter<T> {
    Executor<T> route(T event);
}
