// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/role.proto

package com.xxicon.poker.message;

public final class Role {
  private Role() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_messages_C0101_UserLoginReq_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_messages_C0101_UserLoginReq_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_messages_C0101_UserLoginResp_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_messages_C0101_UserLoginResp_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_messages_C0102_ReconnectReq_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_messages_C0102_ReconnectReq_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_messages_C0102_ReconnectResp_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_messages_C0102_ReconnectResp_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_messages_RoleInfo_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_messages_RoleInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_messages_C0105_RoleRegisterReq_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_messages_C0105_RoleRegisterReq_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_messages_C0105_RoleRegisterResp_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_messages_C0105_RoleRegisterResp_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_messages_C0106_RoleLoginReq_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_messages_C0106_RoleLoginReq_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_messages_C0106_RoleLoginResp_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_messages_C0106_RoleLoginResp_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_messages_C0120_RoleAttributeResp_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_messages_C0120_RoleAttributeResp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\020proto/role.proto\022\010messages\"#\n\022C0101_Us" +
      "erLoginReq\022\r\n\005token\030\001 \001(\t\"Q\n\023C0101_UserL" +
      "oginResp\022\014\n\004code\030\001 \001(\005\022\013\n\003msg\030\002 \001(\t\022\017\n\007s" +
      "ession\030\003 \001(\t\022\016\n\006roleId\030\004 \001(\005\"%\n\022C0102_Re" +
      "connectReq\022\017\n\007session\030\001 \001(\t\"Q\n\023C0102_Rec" +
      "onnectResp\022\014\n\004code\030\001 \001(\005\022\013\n\003msg\030\002 \001(\t\022\017\n" +
      "\007session\030\003 \001(\t\022\016\n\006roleId\030\004 \001(\005\"Z\n\010RoleIn" +
      "fo\022\016\n\006roleId\030\001 \001(\005\022\020\n\010roleName\030\002 \001(\t\022\016\n\006" +
      "gender\030\003 \001(\005\022\r\n\005level\030\004 \001(\005\022\r\n\005money\030\005 \001" +
      "(\005\"9\n\025C0105_RoleRegisterReq\022\020\n\010roleName\030" +
      "\001 \001(\t\022\016\n\006gender\030\002 \001(\005\"U\n\026C0105_RoleRegis" +
      "terResp\022\014\n\004code\030\001 \001(\005\022\013\n\003msg\030\002 \001(\t\022 \n\004in" +
      "fo\030\003 \001(\0132\022.messages.RoleInfo\"$\n\022C0106_Ro" +
      "leLoginReq\022\016\n\006roleId\030\001 \001(\005\"R\n\023C0106_Role" +
      "LoginResp\022\014\n\004code\030\001 \001(\005\022\013\n\003msg\030\002 \001(\t\022 \n\004" +
      "info\030\003 \001(\0132\022.messages.RoleInfo\"7\n\027C0120_" +
      "RoleAttributeResp\022\r\n\005level\030\001 \001(\005\022\r\n\005mone" +
      "y\030\002 \001(\005B\034\n\030com.xxicon.poker.messageP\001b\006p" +
      "roto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_messages_C0101_UserLoginReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_messages_C0101_UserLoginReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_messages_C0101_UserLoginReq_descriptor,
        new java.lang.String[] { "Token", });
    internal_static_messages_C0101_UserLoginResp_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_messages_C0101_UserLoginResp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_messages_C0101_UserLoginResp_descriptor,
        new java.lang.String[] { "Code", "Msg", "Session", "RoleId", });
    internal_static_messages_C0102_ReconnectReq_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_messages_C0102_ReconnectReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_messages_C0102_ReconnectReq_descriptor,
        new java.lang.String[] { "Session", });
    internal_static_messages_C0102_ReconnectResp_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_messages_C0102_ReconnectResp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_messages_C0102_ReconnectResp_descriptor,
        new java.lang.String[] { "Code", "Msg", "Session", "RoleId", });
    internal_static_messages_RoleInfo_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_messages_RoleInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_messages_RoleInfo_descriptor,
        new java.lang.String[] { "RoleId", "RoleName", "Gender", "Level", "Money", });
    internal_static_messages_C0105_RoleRegisterReq_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_messages_C0105_RoleRegisterReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_messages_C0105_RoleRegisterReq_descriptor,
        new java.lang.String[] { "RoleName", "Gender", });
    internal_static_messages_C0105_RoleRegisterResp_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_messages_C0105_RoleRegisterResp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_messages_C0105_RoleRegisterResp_descriptor,
        new java.lang.String[] { "Code", "Msg", "Info", });
    internal_static_messages_C0106_RoleLoginReq_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_messages_C0106_RoleLoginReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_messages_C0106_RoleLoginReq_descriptor,
        new java.lang.String[] { "RoleId", });
    internal_static_messages_C0106_RoleLoginResp_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_messages_C0106_RoleLoginResp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_messages_C0106_RoleLoginResp_descriptor,
        new java.lang.String[] { "Code", "Msg", "Info", });
    internal_static_messages_C0120_RoleAttributeResp_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_messages_C0120_RoleAttributeResp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_messages_C0120_RoleAttributeResp_descriptor,
        new java.lang.String[] { "Level", "Money", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
