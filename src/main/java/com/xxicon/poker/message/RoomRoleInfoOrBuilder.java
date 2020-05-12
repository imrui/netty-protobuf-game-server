// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/room.proto

package com.xxicon.poker.message;

public interface RoomRoleInfoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:messages.RoomRoleInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * 房间位置
   * </pre>
   *
   * <code>int32 index = 1;</code>
   * @return The index.
   */
  int getIndex();

  /**
   * <code>int32 roleId = 2;</code>
   * @return The roleId.
   */
  int getRoleId();

  /**
   * <code>string roleName = 3;</code>
   * @return The roleName.
   */
  java.lang.String getRoleName();
  /**
   * <code>string roleName = 3;</code>
   * @return The bytes for roleName.
   */
  com.google.protobuf.ByteString
      getRoleNameBytes();

  /**
   * <code>int32 roleLevel = 4;</code>
   * @return The roleLevel.
   */
  int getRoleLevel();

  /**
   * <code>int32 isReady = 5;</code>
   * @return The isReady.
   */
  int getIsReady();
}
