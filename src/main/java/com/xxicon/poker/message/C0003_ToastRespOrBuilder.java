// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/base.proto

package com.xxicon.poker.message;

public interface C0003_ToastRespOrBuilder extends
    // @@protoc_insertion_point(interface_extends:messages.C0003_ToastResp)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string message = 1;</code>
   * @return The message.
   */
  java.lang.String getMessage();
  /**
   * <code>string message = 1;</code>
   * @return The bytes for message.
   */
  com.google.protobuf.ByteString
      getMessageBytes();

  /**
   * <pre>
   * 0=info灰, 1=success绿, 2=warning橙, 3=error红
   * </pre>
   *
   * <code>int32 type = 2;</code>
   * @return The type.
   */
  int getType();
}
