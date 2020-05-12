// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/chat.proto

package com.xxicon.poker.message;

/**
 * <pre>
 * 聊天消息同步
 * </pre>
 *
 * Protobuf type {@code messages.C0200_ChatNewsResp}
 */
public  final class C0200_ChatNewsResp extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:messages.C0200_ChatNewsResp)
    C0200_ChatNewsRespOrBuilder {
private static final long serialVersionUID = 0L;
  // Use C0200_ChatNewsResp.newBuilder() to construct.
  private C0200_ChatNewsResp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private C0200_ChatNewsResp() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new C0200_ChatNewsResp();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private C0200_ChatNewsResp(
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
          case 8: {

            channel_ = input.readInt32();
            break;
          }
          case 18: {
            com.xxicon.poker.message.ChatInfo.Builder subBuilder = null;
            if (info_ != null) {
              subBuilder = info_.toBuilder();
            }
            info_ = input.readMessage(com.xxicon.poker.message.ChatInfo.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(info_);
              info_ = subBuilder.buildPartial();
            }

            break;
          }
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
    return com.xxicon.poker.message.Chat.internal_static_messages_C0200_ChatNewsResp_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.xxicon.poker.message.Chat.internal_static_messages_C0200_ChatNewsResp_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.xxicon.poker.message.C0200_ChatNewsResp.class, com.xxicon.poker.message.C0200_ChatNewsResp.Builder.class);
  }

  public static final int CHANNEL_FIELD_NUMBER = 1;
  private int channel_;
  /**
   * <pre>
   *频道 0=系统, 1=私聊, 2=房间, 3=世界
   * </pre>
   *
   * <code>int32 channel = 1;</code>
   * @return The channel.
   */
  public int getChannel() {
    return channel_;
  }

  public static final int INFO_FIELD_NUMBER = 2;
  private com.xxicon.poker.message.ChatInfo info_;
  /**
   * <code>.messages.ChatInfo info = 2;</code>
   * @return Whether the info field is set.
   */
  public boolean hasInfo() {
    return info_ != null;
  }
  /**
   * <code>.messages.ChatInfo info = 2;</code>
   * @return The info.
   */
  public com.xxicon.poker.message.ChatInfo getInfo() {
    return info_ == null ? com.xxicon.poker.message.ChatInfo.getDefaultInstance() : info_;
  }
  /**
   * <code>.messages.ChatInfo info = 2;</code>
   */
  public com.xxicon.poker.message.ChatInfoOrBuilder getInfoOrBuilder() {
    return getInfo();
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
    if (channel_ != 0) {
      output.writeInt32(1, channel_);
    }
    if (info_ != null) {
      output.writeMessage(2, getInfo());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (channel_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, channel_);
    }
    if (info_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getInfo());
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.xxicon.poker.message.C0200_ChatNewsResp)) {
      return super.equals(obj);
    }
    com.xxicon.poker.message.C0200_ChatNewsResp other = (com.xxicon.poker.message.C0200_ChatNewsResp) obj;

    if (getChannel()
        != other.getChannel()) return false;
    if (hasInfo() != other.hasInfo()) return false;
    if (hasInfo()) {
      if (!getInfo()
          .equals(other.getInfo())) return false;
    }
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
    hash = (37 * hash) + CHANNEL_FIELD_NUMBER;
    hash = (53 * hash) + getChannel();
    if (hasInfo()) {
      hash = (37 * hash) + INFO_FIELD_NUMBER;
      hash = (53 * hash) + getInfo().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.xxicon.poker.message.C0200_ChatNewsResp parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.xxicon.poker.message.C0200_ChatNewsResp parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.xxicon.poker.message.C0200_ChatNewsResp parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.xxicon.poker.message.C0200_ChatNewsResp parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.xxicon.poker.message.C0200_ChatNewsResp parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.xxicon.poker.message.C0200_ChatNewsResp parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.xxicon.poker.message.C0200_ChatNewsResp parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.xxicon.poker.message.C0200_ChatNewsResp parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.xxicon.poker.message.C0200_ChatNewsResp parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.xxicon.poker.message.C0200_ChatNewsResp parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.xxicon.poker.message.C0200_ChatNewsResp parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.xxicon.poker.message.C0200_ChatNewsResp parseFrom(
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
  public static Builder newBuilder(com.xxicon.poker.message.C0200_ChatNewsResp prototype) {
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
   * 聊天消息同步
   * </pre>
   *
   * Protobuf type {@code messages.C0200_ChatNewsResp}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:messages.C0200_ChatNewsResp)
      com.xxicon.poker.message.C0200_ChatNewsRespOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.xxicon.poker.message.Chat.internal_static_messages_C0200_ChatNewsResp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.xxicon.poker.message.Chat.internal_static_messages_C0200_ChatNewsResp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.xxicon.poker.message.C0200_ChatNewsResp.class, com.xxicon.poker.message.C0200_ChatNewsResp.Builder.class);
    }

    // Construct using com.xxicon.poker.message.C0200_ChatNewsResp.newBuilder()
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
      channel_ = 0;

      if (infoBuilder_ == null) {
        info_ = null;
      } else {
        info_ = null;
        infoBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.xxicon.poker.message.Chat.internal_static_messages_C0200_ChatNewsResp_descriptor;
    }

    @java.lang.Override
    public com.xxicon.poker.message.C0200_ChatNewsResp getDefaultInstanceForType() {
      return com.xxicon.poker.message.C0200_ChatNewsResp.getDefaultInstance();
    }

    @java.lang.Override
    public com.xxicon.poker.message.C0200_ChatNewsResp build() {
      com.xxicon.poker.message.C0200_ChatNewsResp result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.xxicon.poker.message.C0200_ChatNewsResp buildPartial() {
      com.xxicon.poker.message.C0200_ChatNewsResp result = new com.xxicon.poker.message.C0200_ChatNewsResp(this);
      result.channel_ = channel_;
      if (infoBuilder_ == null) {
        result.info_ = info_;
      } else {
        result.info_ = infoBuilder_.build();
      }
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
      if (other instanceof com.xxicon.poker.message.C0200_ChatNewsResp) {
        return mergeFrom((com.xxicon.poker.message.C0200_ChatNewsResp)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.xxicon.poker.message.C0200_ChatNewsResp other) {
      if (other == com.xxicon.poker.message.C0200_ChatNewsResp.getDefaultInstance()) return this;
      if (other.getChannel() != 0) {
        setChannel(other.getChannel());
      }
      if (other.hasInfo()) {
        mergeInfo(other.getInfo());
      }
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
      com.xxicon.poker.message.C0200_ChatNewsResp parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.xxicon.poker.message.C0200_ChatNewsResp) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int channel_ ;
    /**
     * <pre>
     *频道 0=系统, 1=私聊, 2=房间, 3=世界
     * </pre>
     *
     * <code>int32 channel = 1;</code>
     * @return The channel.
     */
    public int getChannel() {
      return channel_;
    }
    /**
     * <pre>
     *频道 0=系统, 1=私聊, 2=房间, 3=世界
     * </pre>
     *
     * <code>int32 channel = 1;</code>
     * @param value The channel to set.
     * @return This builder for chaining.
     */
    public Builder setChannel(int value) {
      
      channel_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     *频道 0=系统, 1=私聊, 2=房间, 3=世界
     * </pre>
     *
     * <code>int32 channel = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearChannel() {
      
      channel_ = 0;
      onChanged();
      return this;
    }

    private com.xxicon.poker.message.ChatInfo info_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.xxicon.poker.message.ChatInfo, com.xxicon.poker.message.ChatInfo.Builder, com.xxicon.poker.message.ChatInfoOrBuilder> infoBuilder_;
    /**
     * <code>.messages.ChatInfo info = 2;</code>
     * @return Whether the info field is set.
     */
    public boolean hasInfo() {
      return infoBuilder_ != null || info_ != null;
    }
    /**
     * <code>.messages.ChatInfo info = 2;</code>
     * @return The info.
     */
    public com.xxicon.poker.message.ChatInfo getInfo() {
      if (infoBuilder_ == null) {
        return info_ == null ? com.xxicon.poker.message.ChatInfo.getDefaultInstance() : info_;
      } else {
        return infoBuilder_.getMessage();
      }
    }
    /**
     * <code>.messages.ChatInfo info = 2;</code>
     */
    public Builder setInfo(com.xxicon.poker.message.ChatInfo value) {
      if (infoBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        info_ = value;
        onChanged();
      } else {
        infoBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.messages.ChatInfo info = 2;</code>
     */
    public Builder setInfo(
        com.xxicon.poker.message.ChatInfo.Builder builderForValue) {
      if (infoBuilder_ == null) {
        info_ = builderForValue.build();
        onChanged();
      } else {
        infoBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.messages.ChatInfo info = 2;</code>
     */
    public Builder mergeInfo(com.xxicon.poker.message.ChatInfo value) {
      if (infoBuilder_ == null) {
        if (info_ != null) {
          info_ =
            com.xxicon.poker.message.ChatInfo.newBuilder(info_).mergeFrom(value).buildPartial();
        } else {
          info_ = value;
        }
        onChanged();
      } else {
        infoBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.messages.ChatInfo info = 2;</code>
     */
    public Builder clearInfo() {
      if (infoBuilder_ == null) {
        info_ = null;
        onChanged();
      } else {
        info_ = null;
        infoBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.messages.ChatInfo info = 2;</code>
     */
    public com.xxicon.poker.message.ChatInfo.Builder getInfoBuilder() {
      
      onChanged();
      return getInfoFieldBuilder().getBuilder();
    }
    /**
     * <code>.messages.ChatInfo info = 2;</code>
     */
    public com.xxicon.poker.message.ChatInfoOrBuilder getInfoOrBuilder() {
      if (infoBuilder_ != null) {
        return infoBuilder_.getMessageOrBuilder();
      } else {
        return info_ == null ?
            com.xxicon.poker.message.ChatInfo.getDefaultInstance() : info_;
      }
    }
    /**
     * <code>.messages.ChatInfo info = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.xxicon.poker.message.ChatInfo, com.xxicon.poker.message.ChatInfo.Builder, com.xxicon.poker.message.ChatInfoOrBuilder> 
        getInfoFieldBuilder() {
      if (infoBuilder_ == null) {
        infoBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.xxicon.poker.message.ChatInfo, com.xxicon.poker.message.ChatInfo.Builder, com.xxicon.poker.message.ChatInfoOrBuilder>(
                getInfo(),
                getParentForChildren(),
                isClean());
        info_ = null;
      }
      return infoBuilder_;
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


    // @@protoc_insertion_point(builder_scope:messages.C0200_ChatNewsResp)
  }

  // @@protoc_insertion_point(class_scope:messages.C0200_ChatNewsResp)
  private static final com.xxicon.poker.message.C0200_ChatNewsResp DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.xxicon.poker.message.C0200_ChatNewsResp();
  }

  public static com.xxicon.poker.message.C0200_ChatNewsResp getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<C0200_ChatNewsResp>
      PARSER = new com.google.protobuf.AbstractParser<C0200_ChatNewsResp>() {
    @java.lang.Override
    public C0200_ChatNewsResp parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new C0200_ChatNewsResp(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<C0200_ChatNewsResp> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<C0200_ChatNewsResp> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.xxicon.poker.message.C0200_ChatNewsResp getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
