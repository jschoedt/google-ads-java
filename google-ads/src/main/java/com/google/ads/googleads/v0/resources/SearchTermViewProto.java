// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v0/resources/search_term_view.proto

package com.google.ads.googleads.v0.resources;

public final class SearchTermViewProto {
  private SearchTermViewProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v0_resources_SearchTermView_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v0_resources_SearchTermView_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n8google/ads/googleads/v0/resources/sear" +
      "ch_term_view.proto\022!google.ads.googleads" +
      ".v0.resources\032@google/ads/googleads/v0/e" +
      "nums/search_term_targeting_status.proto\032" +
      "\036google/protobuf/wrappers.proto\"\362\001\n\016Sear" +
      "chTermView\022\025\n\rresource_name\030\001 \001(\t\0221\n\013sea" +
      "rch_term\030\002 \001(\0132\034.google.protobuf.StringV" +
      "alue\022.\n\010ad_group\030\003 \001(\0132\034.google.protobuf" +
      ".StringValue\022f\n\006status\030\004 \001(\0162V.google.ad" +
      "s.googleads.v0.enums.SearchTermTargeting" +
      "StatusEnum.SearchTermTargetingStatusB\200\002\n" +
      "%com.google.ads.googleads.v0.resourcesB\023" +
      "SearchTermViewProtoP\001ZJgoogle.golang.org" +
      "/genproto/googleapis/ads/googleads/v0/re" +
      "sources;resources\242\002\003GAA\252\002!Google.Ads.Goo" +
      "gleAds.V0.Resources\312\002!Google\\Ads\\GoogleA" +
      "ds\\V0\\Resources\352\002%Google::Ads::GoogleAds" +
      "::V0::Resourcesb\006proto3"
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
          com.google.ads.googleads.v0.enums.SearchTermTargetingStatusProto.getDescriptor(),
          com.google.protobuf.WrappersProto.getDescriptor(),
        }, assigner);
    internal_static_google_ads_googleads_v0_resources_SearchTermView_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v0_resources_SearchTermView_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v0_resources_SearchTermView_descriptor,
        new java.lang.String[] { "ResourceName", "SearchTerm", "AdGroup", "Status", });
    com.google.ads.googleads.v0.enums.SearchTermTargetingStatusProto.getDescriptor();
    com.google.protobuf.WrappersProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
