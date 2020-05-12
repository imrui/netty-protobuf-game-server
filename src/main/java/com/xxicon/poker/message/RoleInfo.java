// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/role.proto

package com.xxicon.poker.message;

/**
 * Protobuf type {@code messages.RoleInfo}
 */
public  final class RoleInfo extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:messages.RoleInfo)
    RoleInfoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use RoleInfo.newBuilder() to construct.
  private RoleInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private RoleInfo() {
    roleName_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new RoleInfo();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private RoleInfo(
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

            roleId_ = input.readInt32();
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            roleName_ = s;
            break;
          }
          case 24: {

            gender_ = input.readInt32();
            break;
          }
          case 32: {

            level_ = input.readInt32();
            break;
          }
          case 40: {

            money_ = input.readInt32();
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
    return com.xxicon.poker.message.Role.internal_static_messages_RoleInfo_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.xxicon.poker.message.Role.internal_static_messages_RoleInfo_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.xxicon.poker.message.RoleInfo.class, com.xxicon.poker.message.RoleInfo.Builder.class);
  }

  public static final int ROLEID_FIELD_NUMBER = 1;
  private int roleId_;
  /**
   * <pre>
   * 角色ID
   * </pre>
   *
   * <code>int32 roleId = 1;</code>
   * @return The roleId.
   */
  public int getRoleId() {
    return roleId_;
  }

  public static final int ROLENAME_FIELD_NUMBER = 2;
  private volatile java.lang.Object roleName_;
  /**
   * <pre>
   * 角色名
   * </pre>
   *
   * <code>string roleName = 2;</code>
   * @return The roleName.
   */
  public java.lang.String getRoleName() {
    java.lang.Object ref = roleName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      roleName_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * 角色名
   * </pre>
   *
   * <code>string roleName = 2;</code>
   * @return The bytes for roleName.
   */
  public com.google.protobuf.ByteString
      getRoleNameBytes() {
    java.lang.Object ref = roleName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      roleName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int GENDER_FIELD_NUMBER = 3;
  private int gender_;
  /**
   * <pre>
   * 性别 0=女, 1=男
   * </pre>
   *
   * <code>int32 gender = 3;</code>
   * @return The gender.
   */
  public int getGender() {
    return gender_;
  }

  public static final int LEVEL_FIELD_NUMBER = 4;
  private int level_;
  /**
   * <pre>
   * 等级
   * </pre>
   *
   * <code>int32 level = 4;</code>
   * @return The level.
   */
  public int getLevel() {
    return level_;
  }

  public static final int MONEY_FIELD_NUMBER = 5;
  private int money_;
  /**
   * <pre>
   * 金钱数
   * </pre>
   *
   * <code>int32 money = 5;</code>
   * @return The money.
   */
  public int getMoney() {
    return money_;
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
    if (roleId_ != 0) {
      output.writeInt32(1, roleId_);
    }
    if (!getRoleNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, roleName_);
    }
    if (gender_ != 0) {
      output.writeInt32(3, gender_);
    }
    if (level_ != 0) {
      output.writeInt32(4, level_);
    }
    if (money_ != 0) {
      output.writeInt32(5, money_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (roleId_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, roleId_);
    }
    if (!getRoleNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, roleName_);
    }
    if (gender_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, gender_);
    }
    if (level_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(4, level_);
    }
    if (money_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(5, money_);
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
    if (!(obj instanceof com.xxicon.poker.message.RoleInfo)) {
      return super.equals(obj);
    }
    com.xxicon.poker.message.RoleInfo other = (com.xxicon.poker.message.RoleInfo) obj;

    if (getRoleId()
        != other.getRoleId()) return false;
    if (!getRoleName()
        .equals(other.getRoleName())) return false;
    if (getGender()
        != other.getGender()) return false;
    if (getLevel()
        != other.getLevel()) return false;
    if (getMoney()
        != other.getMoney()) return false;
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
    hash = (37 * hash) + ROLEID_FIELD_NUMBER;
    hash = (53 * hash) + getRoleId();
    hash = (37 * hash) + ROLENAME_FIELD_NUMBER;
    hash = (53 * hash) + getRoleName().hashCode();
    hash = (37 * hash) + GENDER_FIELD_NUMBER;
    hash = (53 * hash) + getGender();
    hash = (37 * hash) + LEVEL_FIELD_NUMBER;
    hash = (53 * hash) + getLevel();
    hash = (37 * hash) + MONEY_FIELD_NUMBER;
    hash = (53 * hash) + getMoney();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.xxicon.poker.message.RoleInfo parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.xxicon.poker.message.RoleInfo parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.xxicon.poker.message.RoleInfo parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.xxicon.poker.message.RoleInfo parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.xxicon.poker.message.RoleInfo parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.xxicon.poker.message.RoleInfo parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.xxicon.poker.message.RoleInfo parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.xxicon.poker.message.RoleInfo parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.xxicon.poker.message.RoleInfo parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.xxicon.poker.message.RoleInfo parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.xxicon.poker.message.RoleInfo parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.xxicon.poker.message.RoleInfo parseFrom(
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
  public static Builder newBuilder(com.xxicon.poker.message.RoleInfo prototype) {
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
   * Protobuf type {@code messages.RoleInfo}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:messages.RoleInfo)
      com.xxicon.poker.message.RoleInfoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.xxicon.poker.message.Role.internal_static_messages_RoleInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.xxicon.poker.message.Role.internal_static_messages_RoleInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.xxicon.poker.message.RoleInfo.class, com.xxicon.poker.message.RoleInfo.Builder.class);
    }

    // Construct using com.xxicon.poker.message.RoleInfo.newBuilder()
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
      roleId_ = 0;

      roleName_ = "";

      gender_ = 0;

      level_ = 0;

      money_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.xxicon.poker.message.Role.internal_static_messages_RoleInfo_descriptor;
    }

    @java.lang.Override
    public com.xxicon.poker.message.RoleInfo getDefaultInstanceForType() {
      return com.xxicon.poker.message.RoleInfo.getDefaultInstance();
    }

    @java.lang.Override
    public com.xxicon.poker.message.RoleInfo build() {
      com.xxicon.poker.message.RoleInfo result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.xxicon.poker.message.RoleInfo buildPartial() {
      com.xxicon.poker.message.RoleInfo result = new com.xxicon.poker.message.RoleInfo(this);
      result.roleId_ = roleId_;
      result.roleName_ = roleName_;
      result.gender_ = gender_;
      result.level_ = level_;
      result.money_ = money_;
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
      if (other instanceof com.xxicon.poker.message.RoleInfo) {
        return mergeFrom((com.xxicon.poker.message.RoleInfo)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.xxicon.poker.message.RoleInfo other) {
      if (other == com.xxicon.poker.message.RoleInfo.getDefaultInstance()) return this;
      if (other.getRoleId() != 0) {
        setRoleId(other.getRoleId());
      }
      if (!other.getRoleName().isEmpty()) {
        roleName_ = other.roleName_;
        onChanged();
      }
      if (other.getGender() != 0) {
        setGender(other.getGender());
      }
      if (other.getLevel() != 0) {
        setLevel(other.getLevel());
      }
      if (other.getMoney() != 0) {
        setMoney(other.getMoney());
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
      com.xxicon.poker.message.RoleInfo parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.xxicon.poker.message.RoleInfo) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int roleId_ ;
    /**
     * <pre>
     * 角色ID
     * </pre>
     *
     * <code>int32 roleId = 1;</code>
     * @return The roleId.
     */
    public int getRoleId() {
      return roleId_;
    }
    /**
     * <pre>
     * 角色ID
     * </pre>
     *
     * <code>int32 roleId = 1;</code>
     * @param value The roleId to set.
     * @return This builder for chaining.
     */
    public Builder setRoleId(int value) {
      
      roleId_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 角色ID
     * </pre>
     *
     * <code>int32 roleId = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearRoleId() {
      
      roleId_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object roleName_ = "";
    /**
     * <pre>
     * 角色名
     * </pre>
     *
     * <code>string roleName = 2;</code>
     * @return The roleName.
     */
    public java.lang.String getRoleName() {
      java.lang.Object ref = roleName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        roleName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * 角色名
     * </pre>
     *
     * <code>string roleName = 2;</code>
     * @return The bytes for roleName.
     */
    public com.google.protobuf.ByteString
        getRoleNameBytes() {
      java.lang.Object ref = roleName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        roleName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * 角色名
     * </pre>
     *
     * <code>string roleName = 2;</code>
     * @param value The roleName to set.
     * @return This builder for chaining.
     */
    public Builder setRoleName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      roleName_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 角色名
     * </pre>
     *
     * <code>string roleName = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearRoleName() {
      
      roleName_ = getDefaultInstance().getRoleName();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 角色名
     * </pre>
     *
     * <code>string roleName = 2;</code>
     * @param value The bytes for roleName to set.
     * @return This builder for chaining.
     */
    public Builder setRoleNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      roleName_ = value;
      onChanged();
      return this;
    }

    private int gender_ ;
    /**
     * <pre>
     * 性别 0=女, 1=男
     * </pre>
     *
     * <code>int32 gender = 3;</code>
     * @return The gender.
     */
    public int getGender() {
      return gender_;
    }
    /**
     * <pre>
     * 性别 0=女, 1=男
     * </pre>
     *
     * <code>int32 gender = 3;</code>
     * @param value The gender to set.
     * @return This builder for chaining.
     */
    public Builder setGender(int value) {
      
      gender_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 性别 0=女, 1=男
     * </pre>
     *
     * <code>int32 gender = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearGender() {
      
      gender_ = 0;
      onChanged();
      return this;
    }

    private int level_ ;
    /**
     * <pre>
     * 等级
     * </pre>
     *
     * <code>int32 level = 4;</code>
     * @return The level.
     */
    public int getLevel() {
      return level_;
    }
    /**
     * <pre>
     * 等级
     * </pre>
     *
     * <code>int32 level = 4;</code>
     * @param value The level to set.
     * @return This builder for chaining.
     */
    public Builder setLevel(int value) {
      
      level_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 等级
     * </pre>
     *
     * <code>int32 level = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearLevel() {
      
      level_ = 0;
      onChanged();
      return this;
    }

    private int money_ ;
    /**
     * <pre>
     * 金钱数
     * </pre>
     *
     * <code>int32 money = 5;</code>
     * @return The money.
     */
    public int getMoney() {
      return money_;
    }
    /**
     * <pre>
     * 金钱数
     * </pre>
     *
     * <code>int32 money = 5;</code>
     * @param value The money to set.
     * @return This builder for chaining.
     */
    public Builder setMoney(int value) {
      
      money_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 金钱数
     * </pre>
     *
     * <code>int32 money = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearMoney() {
      
      money_ = 0;
      onChanged();
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


    // @@protoc_insertion_point(builder_scope:messages.RoleInfo)
  }

  // @@protoc_insertion_point(class_scope:messages.RoleInfo)
  private static final com.xxicon.poker.message.RoleInfo DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.xxicon.poker.message.RoleInfo();
  }

  public static com.xxicon.poker.message.RoleInfo getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RoleInfo>
      PARSER = new com.google.protobuf.AbstractParser<RoleInfo>() {
    @java.lang.Override
    public RoleInfo parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new RoleInfo(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<RoleInfo> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RoleInfo> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.xxicon.poker.message.RoleInfo getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

