// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/room.proto

package com.xxicon.poker.message;

public final class Room {
  private Room() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_messages_RoomRoleInfo_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_messages_RoomRoleInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_messages_C0300_RoomSyncResp_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_messages_C0300_RoomSyncResp_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_messages_C0301_RoomMatchReq_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_messages_C0301_RoomMatchReq_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_messages_C0302_RoomEnterReq_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_messages_C0302_RoomEnterReq_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_messages_C0302_RoomEnterResp_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_messages_C0302_RoomEnterResp_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_messages_C0303_RoomCreateReq_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_messages_C0303_RoomCreateReq_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_messages_C0304_RoomLeaveReq_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_messages_C0304_RoomLeaveReq_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_messages_C0304_RoomLeaveResp_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_messages_C0304_RoomLeaveResp_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_messages_C0305_RoomReMatchReq_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_messages_C0305_RoomReMatchReq_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_messages_C0306_RoomKickReq_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_messages_C0306_RoomKickReq_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_messages_C0306_RoomKickResp_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_messages_C0306_RoomKickResp_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_messages_C0310_RoomStateReadyReq_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_messages_C0310_RoomStateReadyReq_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_messages_C0310_RoomStateReadyResp_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_messages_C0310_RoomStateReadyResp_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_messages_C0311_RoomStateCancelReq_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_messages_C0311_RoomStateCancelReq_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_messages_C0311_RoomStateCancelResp_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_messages_C0311_RoomStateCancelResp_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_messages_C0312_RoomStateGoReq_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_messages_C0312_RoomStateGoReq_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_messages_C0312_RoomStateGoResp_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_messages_C0312_RoomStateGoResp_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_messages_C0313_RoomRoleSyncResp_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_messages_C0313_RoomRoleSyncResp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\020proto/room.proto\022\010messages\"c\n\014RoomRole" +
      "Info\022\r\n\005index\030\001 \001(\005\022\016\n\006roleId\030\002 \001(\005\022\020\n\010r" +
      "oleName\030\003 \001(\t\022\021\n\troleLevel\030\004 \001(\005\022\017\n\007isRe" +
      "ady\030\005 \001(\005\"\\\n\022C0300_RoomSyncResp\022\017\n\007owner" +
      "Id\030\001 \001(\005\022\016\n\006roomId\030\002 \001(\005\022%\n\005infos\030\003 \003(\0132" +
      "\026.messages.RoomRoleInfo\"\024\n\022C0301_RoomMat" +
      "chReq\"6\n\022C0302_RoomEnterReq\022\016\n\006roomId\030\001 " +
      "\001(\005\022\020\n\010password\030\002 \001(\t\";\n\023C0302_RoomEnter" +
      "Resp\022$\n\004role\030\001 \001(\0132\026.messages.RoomRoleIn" +
      "fo\"\'\n\023C0303_RoomCreateReq\022\020\n\010password\030\001 " +
      "\001(\t\"\024\n\022C0304_RoomLeaveReq\"%\n\023C0304_RoomL" +
      "eaveResp\022\016\n\006roleId\030\001 \001(\005\"\026\n\024C0305_RoomRe" +
      "MatchReq\"#\n\021C0306_RoomKickReq\022\016\n\006roleId\030" +
      "\001 \001(\005\"$\n\022C0306_RoomKickResp\022\016\n\006roleId\030\001 " +
      "\001(\005\"\031\n\027C0310_RoomStateReadyReq\"*\n\030C0310_" +
      "RoomStateReadyResp\022\016\n\006roleId\030\001 \001(\005\"\032\n\030C0" +
      "311_RoomStateCancelReq\"+\n\031C0311_RoomStat" +
      "eCancelResp\022\016\n\006roleId\030\001 \001(\005\"\026\n\024C0312_Roo" +
      "mStateGoReq\"\027\n\025C0312_RoomStateGoResp\"S\n\026" +
      "C0313_RoomRoleSyncResp\022\017\n\007ownerId\030\001 \001(\005\022" +
      "(\n\010roleInfo\030\002 \001(\0132\026.messages.RoomRoleInf" +
      "oB\034\n\030com.xxicon.poker.messageP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_messages_RoomRoleInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_messages_RoomRoleInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_messages_RoomRoleInfo_descriptor,
        new java.lang.String[] { "Index", "RoleId", "RoleName", "RoleLevel", "IsReady", });
    internal_static_messages_C0300_RoomSyncResp_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_messages_C0300_RoomSyncResp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_messages_C0300_RoomSyncResp_descriptor,
        new java.lang.String[] { "OwnerId", "RoomId", "Infos", });
    internal_static_messages_C0301_RoomMatchReq_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_messages_C0301_RoomMatchReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_messages_C0301_RoomMatchReq_descriptor,
        new java.lang.String[] { });
    internal_static_messages_C0302_RoomEnterReq_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_messages_C0302_RoomEnterReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_messages_C0302_RoomEnterReq_descriptor,
        new java.lang.String[] { "RoomId", "Password", });
    internal_static_messages_C0302_RoomEnterResp_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_messages_C0302_RoomEnterResp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_messages_C0302_RoomEnterResp_descriptor,
        new java.lang.String[] { "Role", });
    internal_static_messages_C0303_RoomCreateReq_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_messages_C0303_RoomCreateReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_messages_C0303_RoomCreateReq_descriptor,
        new java.lang.String[] { "Password", });
    internal_static_messages_C0304_RoomLeaveReq_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_messages_C0304_RoomLeaveReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_messages_C0304_RoomLeaveReq_descriptor,
        new java.lang.String[] { });
    internal_static_messages_C0304_RoomLeaveResp_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_messages_C0304_RoomLeaveResp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_messages_C0304_RoomLeaveResp_descriptor,
        new java.lang.String[] { "RoleId", });
    internal_static_messages_C0305_RoomReMatchReq_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_messages_C0305_RoomReMatchReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_messages_C0305_RoomReMatchReq_descriptor,
        new java.lang.String[] { });
    internal_static_messages_C0306_RoomKickReq_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_messages_C0306_RoomKickReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_messages_C0306_RoomKickReq_descriptor,
        new java.lang.String[] { "RoleId", });
    internal_static_messages_C0306_RoomKickResp_descriptor =
      getDescriptor().getMessageTypes().get(10);
    internal_static_messages_C0306_RoomKickResp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_messages_C0306_RoomKickResp_descriptor,
        new java.lang.String[] { "RoleId", });
    internal_static_messages_C0310_RoomStateReadyReq_descriptor =
      getDescriptor().getMessageTypes().get(11);
    internal_static_messages_C0310_RoomStateReadyReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_messages_C0310_RoomStateReadyReq_descriptor,
        new java.lang.String[] { });
    internal_static_messages_C0310_RoomStateReadyResp_descriptor =
      getDescriptor().getMessageTypes().get(12);
    internal_static_messages_C0310_RoomStateReadyResp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_messages_C0310_RoomStateReadyResp_descriptor,
        new java.lang.String[] { "RoleId", });
    internal_static_messages_C0311_RoomStateCancelReq_descriptor =
      getDescriptor().getMessageTypes().get(13);
    internal_static_messages_C0311_RoomStateCancelReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_messages_C0311_RoomStateCancelReq_descriptor,
        new java.lang.String[] { });
    internal_static_messages_C0311_RoomStateCancelResp_descriptor =
      getDescriptor().getMessageTypes().get(14);
    internal_static_messages_C0311_RoomStateCancelResp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_messages_C0311_RoomStateCancelResp_descriptor,
        new java.lang.String[] { "RoleId", });
    internal_static_messages_C0312_RoomStateGoReq_descriptor =
      getDescriptor().getMessageTypes().get(15);
    internal_static_messages_C0312_RoomStateGoReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_messages_C0312_RoomStateGoReq_descriptor,
        new java.lang.String[] { });
    internal_static_messages_C0312_RoomStateGoResp_descriptor =
      getDescriptor().getMessageTypes().get(16);
    internal_static_messages_C0312_RoomStateGoResp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_messages_C0312_RoomStateGoResp_descriptor,
        new java.lang.String[] { });
    internal_static_messages_C0313_RoomRoleSyncResp_descriptor =
      getDescriptor().getMessageTypes().get(17);
    internal_static_messages_C0313_RoomRoleSyncResp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_messages_C0313_RoomRoleSyncResp_descriptor,
        new java.lang.String[] { "OwnerId", "RoleInfo", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}