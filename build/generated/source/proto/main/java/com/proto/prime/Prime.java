// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: prime/prime.proto

package com.proto.prime;

public final class Prime {
  private Prime() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_prime_PrimeNumberRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_prime_PrimeNumberRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_prime_DecompositionResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_prime_DecompositionResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021prime/prime.proto\022\005prime\"$\n\022PrimeNumbe" +
      "rRequest\022\016\n\006number\030\001 \001(\005\"\'\n\025Decompositio" +
      "nResponse\022\016\n\006number\030\001 \001(\0052e\n\031PrimeDecomp" +
      "ositionService\022H\n\tDecompose\022\031.prime.Prim" +
      "eNumberRequest\032\034.prime.DecompositionResp" +
      "onse\"\0000\001B\023\n\017com.proto.primeP\001b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_prime_PrimeNumberRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_prime_PrimeNumberRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_prime_PrimeNumberRequest_descriptor,
        new java.lang.String[] { "Number", });
    internal_static_prime_DecompositionResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_prime_DecompositionResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_prime_DecompositionResponse_descriptor,
        new java.lang.String[] { "Number", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
