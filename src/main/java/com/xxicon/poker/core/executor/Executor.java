package com.xxicon.poker.core.executor;

public interface Executor<T> {
    void execute(T event);
}
