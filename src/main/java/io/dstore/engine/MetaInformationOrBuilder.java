// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: dstore/engine/engine.proto

package io.dstore.engine;

public interface MetaInformationOrBuilder extends
    // @@protoc_insertion_point(interface_extends:dstore.engine.MetaInformation)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.dstore.engine.MetaInformation.Types type = 1;</code>
   */
  int getTypeValue();
  /**
   * <code>.dstore.engine.MetaInformation.Types type = 1;</code>
   */
  io.dstore.engine.MetaInformation.Types getType();

  /**
   * <code>string information = 2;</code>
   */
  java.lang.String getInformation();
  /**
   * <code>string information = 2;</code>
   */
  com.google.protobuf.ByteString
      getInformationBytes();

  /**
   * <code>string details = 3;</code>
   */
  java.lang.String getDetails();
  /**
   * <code>string details = 3;</code>
   */
  com.google.protobuf.ByteString
      getDetailsBytes();
}
