// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/role.proto

package com.xxicon.poker.message;

public interface C0102_ReconnectRespOrBuilder extends
    // @@protoc_insertion_point(interface_extends:messages.C0102_ReconnectResp)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int32 code = 1;</code>
   * @return The code.
   */
  int getCode();

  /**
   * <code>string msg = 2;</code>
   * @return The msg.
   */
  java.lang.String getMsg();
  /**
   * <code>string msg = 2;</code>
   * @return The bytes for msg.
   */
  com.google.protobuf.ByteString
      getMsgBytes();

  /**
   * <pre>
   * 新wss会话
   * </pre>
   *
   * <code>string session = 3;</code>
   * @return The session.
   */
  java.lang.String getSession();
  /**
   * <pre>
   * 新wss会话
   * </pre>
   *
   * <code>string session = 3;</code>
   * @return The bytes for session.
   */
  com.google.protobuf.ByteString
      getSessionBytes();

  /**
   * <pre>
   * 角色ID
   * </pre>
   *
   * <code>int32 roleId = 4;</code>
   * @return The roleId.
   */
  int getRoleId();
}
