// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/chat.proto

package com.xxicon.poker.message;

public final class Chat {
  private Chat() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_messages_ChatInfo_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_messages_ChatInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_messages_C0200_ChatNewsResp_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_messages_C0200_ChatNewsResp_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_messages_C0201_ChatSendReq_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_messages_C0201_ChatSendReq_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_messages_C0201_ChatSendResp_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_messages_C0201_ChatSendResp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\020proto/chat.proto\022\010messages\"P\n\010ChatInfo" +
      "\022\016\n\006roleId\030\001 \001(\005\022\020\n\010roleName\030\002 \001(\t\022\021\n\tro" +
      "leLevel\030\003 \001(\005\022\017\n\007content\030\004 \001(\t\"G\n\022C0200_" +
      "ChatNewsResp\022\017\n\007channel\030\001 \001(\005\022 \n\004info\030\002 " +
      "\001(\0132\022.messages.ChatInfo\"E\n\021C0201_ChatSen" +
      "dReq\022\017\n\007channel\030\001 \001(\005\022\017\n\007content\030\002 \001(\t\022\016" +
      "\n\006target\030\003 \001(\t\"/\n\022C0201_ChatSendResp\022\014\n\004" +
      "code\030\001 \001(\005\022\013\n\003msg\030\002 \001(\tB\034\n\030com.xxicon.po" +
      "ker.messageP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_messages_ChatInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_messages_ChatInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_messages_ChatInfo_descriptor,
        new java.lang.String[] { "RoleId", "RoleName", "RoleLevel", "Content", });
    internal_static_messages_C0200_ChatNewsResp_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_messages_C0200_ChatNewsResp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_messages_C0200_ChatNewsResp_descriptor,
        new java.lang.String[] { "Channel", "Info", });
    internal_static_messages_C0201_ChatSendReq_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_messages_C0201_ChatSendReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_messages_C0201_ChatSendReq_descriptor,
        new java.lang.String[] { "Channel", "Content", "Target", });
    internal_static_messages_C0201_ChatSendResp_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_messages_C0201_ChatSendResp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_messages_C0201_ChatSendResp_descriptor,
        new java.lang.String[] { "Code", "Msg", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
