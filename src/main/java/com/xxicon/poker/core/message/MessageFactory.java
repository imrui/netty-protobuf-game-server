package com.xxicon.poker.core.message;

import com.google.protobuf.*;

public interface MessageFactory {
    Class<GeneratedMessageV3> getMessageClass(String cmdId) throws ClassNotFoundException;
    Parser<GeneratedMessageV3> getParser(String cmdId);
    int getCmdId(String clazzName);
    GeneratedMessageV3 parseMessage(String cmdId, ByteString data) throws InvalidProtocolBufferException;
}

