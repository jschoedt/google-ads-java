// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v1/resources/group_placement_view.proto

package com.google.ads.googleads.v1.resources;

public final class GroupPlacementViewProto {
  private GroupPlacementViewProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v1_resources_GroupPlacementView_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v1_resources_GroupPlacementView_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n<google/ads/googleads/v1/resources/grou" +
      "p_placement_view.proto\022!google.ads.googl" +
      "eads.v1.resources\0322google/ads/googleads/" +
      "v1/enums/placement_type.proto\032\036google/pr" +
      "otobuf/wrappers.proto\032\034google/api/annota" +
      "tions.proto\"\232\002\n\022GroupPlacementView\022\025\n\rre" +
      "source_name\030\001 \001(\t\022/\n\tplacement\030\002 \001(\0132\034.g" +
      "oogle.protobuf.StringValue\0222\n\014display_na" +
      "me\030\003 \001(\0132\034.google.protobuf.StringValue\0220" +
      "\n\ntarget_url\030\004 \001(\0132\034.google.protobuf.Str" +
      "ingValue\022V\n\016placement_type\030\005 \001(\0162>.googl" +
      "e.ads.googleads.v1.enums.PlacementTypeEn" +
      "um.PlacementTypeB\203\002\n%com.google.ads.goog" +
      "leads.v1.resourcesB\027GroupPlacementViewPr" +
      "otoP\001ZJgoogle.golang.org/genproto/google" +
      "apis/ads/googleads/v1/resources;resource" +
      "s\242\002\003GAA\252\002!Google.Ads.GoogleAds.V1.Resour" +
      "ces\312\002!Google\\Ads\\GoogleAds\\V1\\Resources\352" +
      "\002$Google::Ads::GoogleAds::V1::Servicesb\006" +
      "proto3"
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
          com.google.ads.googleads.v1.enums.PlacementTypeProto.getDescriptor(),
          com.google.protobuf.WrappersProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
        }, assigner);
    internal_static_google_ads_googleads_v1_resources_GroupPlacementView_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v1_resources_GroupPlacementView_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v1_resources_GroupPlacementView_descriptor,
        new java.lang.String[] { "ResourceName", "Placement", "DisplayName", "TargetUrl", "PlacementType", });
    com.google.ads.googleads.v1.enums.PlacementTypeProto.getDescriptor();
    com.google.protobuf.WrappersProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
