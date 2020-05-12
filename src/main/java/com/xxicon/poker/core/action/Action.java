package com.xxicon.poker.core.action;

import com.google.protobuf.GeneratedMessageV3;

public interface Action {
    GeneratedMessageV3 execute(ActionContext context);
}
