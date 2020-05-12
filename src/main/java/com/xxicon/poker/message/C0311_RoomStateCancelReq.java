// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/room.proto

package com.xxicon.poker.message;

/**
 * <pre>
 * 取消准备
 * </pre>
 *
 * Protobuf type {@code messages.C0311_RoomStateCancelReq}
 */
public  final class C0311_RoomStateCancelReq extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:messages.C0311_RoomStateCancelReq)
    C0311_RoomStateCancelReqOrBuilder {
private static final long serialVersionUID = 0L;
  // Use C0311_RoomStateCancelReq.newBuilder() to construct.
  private C0311_RoomStateCancelReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private C0311_RoomStateCancelReq() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new C0311_RoomStateCancelReq();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private C0311_RoomStateCancelReq(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.xxicon.poker.message.Room.internal_static_messages_C0311_RoomStateCancelReq_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.xxicon.poker.message.Room.internal_static_messages_C0311_RoomStateCancelReq_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.xxicon.poker.message.C0311_RoomStateCancelReq.class, com.xxicon.poker.message.C0311_RoomStateCancelReq.Builder.class);
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.xxicon.poker.message.C0311_RoomStateCancelReq)) {
      return super.equals(obj);
    }
    com.xxicon.poker.message.C0311_RoomStateCancelReq other = (com.xxicon.poker.message.C0311_RoomStateCancelReq) obj;

    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.xxicon.poker.message.C0311_RoomStateCancelReq parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.xxicon.poker.message.C0311_RoomStateCancelReq parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.xxicon.poker.message.C0311_RoomStateCancelReq parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.xxicon.poker.message.C0311_RoomStateCancelReq parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.xxicon.poker.message.C0311_RoomStateCancelReq parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.xxicon.poker.message.C0311_RoomStateCancelReq parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.xxicon.poker.message.C0311_RoomStateCancelReq parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.xxicon.poker.message.C0311_RoomStateCancelReq parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.xxicon.poker.message.C0311_RoomStateCancelReq parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.xxicon.poker.message.C0311_RoomStateCancelReq parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.xxicon.poker.message.C0311_RoomStateCancelReq parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.xxicon.poker.message.C0311_RoomStateCancelReq parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.xxicon.poker.message.C0311_RoomStateCancelReq prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * 取消准备
   * </pre>
   *
   * Protobuf type {@code messages.C0311_RoomStateCancelReq}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:messages.C0311_RoomStateCancelReq)
      com.xxicon.poker.message.C0311_RoomStateCancelReqOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.xxicon.poker.message.Room.internal_static_messages_C0311_RoomStateCancelReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.xxicon.poker.message.Room.internal_static_messages_C0311_RoomStateCancelReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.xxicon.poker.message.C0311_RoomStateCancelReq.class, com.xxicon.poker.message.C0311_RoomStateCancelReq.Builder.class);
    }

    // Construct using com.xxicon.poker.message.C0311_RoomStateCancelReq.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.xxicon.poker.message.Room.internal_static_messages_C0311_RoomStateCancelReq_descriptor;
    }

    @java.lang.Override
    public com.xxicon.poker.message.C0311_RoomStateCancelReq getDefaultInstanceForType() {
      return com.xxicon.poker.message.C0311_RoomStateCancelReq.getDefaultInstance();
    }

    @java.lang.Override
    public com.xxicon.poker.message.C0311_RoomStateCancelReq build() {
      com.xxicon.poker.message.C0311_RoomStateCancelReq result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.xxicon.poker.message.C0311_RoomStateCancelReq buildPartial() {
      com.xxicon.poker.message.C0311_RoomStateCancelReq result = new com.xxicon.poker.message.C0311_RoomStateCancelReq(this);
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.xxicon.poker.message.C0311_RoomStateCancelReq) {
        return mergeFrom((com.xxicon.poker.message.C0311_RoomStateCancelReq)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.xxicon.poker.message.C0311_RoomStateCancelReq other) {
      if (other == com.xxicon.poker.message.C0311_RoomStateCancelReq.getDefaultInstance()) return this;
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.xxicon.poker.message.C0311_RoomStateCancelReq parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.xxicon.poker.message.C0311_RoomStateCancelReq) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:messages.C0311_RoomStateCancelReq)
  }

  // @@protoc_insertion_point(class_scope:messages.C0311_RoomStateCancelReq)
  private static final com.xxicon.poker.message.C0311_RoomStateCancelReq DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.xxicon.poker.message.C0311_RoomStateCancelReq();
  }

  public static com.xxicon.poker.message.C0311_RoomStateCancelReq getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<C0311_RoomStateCancelReq>
      PARSER = new com.google.protobuf.AbstractParser<C0311_RoomStateCancelReq>() {
    @java.lang.Override
    public C0311_RoomStateCancelReq parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new C0311_RoomStateCancelReq(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<C0311_RoomStateCancelReq> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<C0311_RoomStateCancelReq> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.xxicon.poker.message.C0311_RoomStateCancelReq getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

