// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v1/resources/feed_item_target.proto

package com.google.ads.googleads.v1.resources;

public interface FeedItemTargetOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v1.resources.FeedItemTarget)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The resource name of the feed item target.
   * Feed item target resource names have the form:
   * `customers/{customer_id}/feedItemTargets/{feed_id}~{feed_item_id}~{feed_item_target_type}~{feed_item_target_id}`
   * </pre>
   *
   * <code>string resource_name = 1;</code>
   */
  java.lang.String getResourceName();
  /**
   * <pre>
   * The resource name of the feed item target.
   * Feed item target resource names have the form:
   * `customers/{customer_id}/feedItemTargets/{feed_id}~{feed_item_id}~{feed_item_target_type}~{feed_item_target_id}`
   * </pre>
   *
   * <code>string resource_name = 1;</code>
   */
  com.google.protobuf.ByteString
      getResourceNameBytes();

  /**
   * <pre>
   * The feed item to which this feed item target belongs.
   * </pre>
   *
   * <code>.google.protobuf.StringValue feed_item = 2;</code>
   */
  boolean hasFeedItem();
  /**
   * <pre>
   * The feed item to which this feed item target belongs.
   * </pre>
   *
   * <code>.google.protobuf.StringValue feed_item = 2;</code>
   */
  com.google.protobuf.StringValue getFeedItem();
  /**
   * <pre>
   * The feed item to which this feed item target belongs.
   * </pre>
   *
   * <code>.google.protobuf.StringValue feed_item = 2;</code>
   */
  com.google.protobuf.StringValueOrBuilder getFeedItemOrBuilder();

  /**
   * <pre>
   * The target type of this feed item target. This field is read-only.
   * </pre>
   *
   * <code>.google.ads.googleads.v1.enums.FeedItemTargetTypeEnum.FeedItemTargetType feed_item_target_type = 3;</code>
   */
  int getFeedItemTargetTypeValue();
  /**
   * <pre>
   * The target type of this feed item target. This field is read-only.
   * </pre>
   *
   * <code>.google.ads.googleads.v1.enums.FeedItemTargetTypeEnum.FeedItemTargetType feed_item_target_type = 3;</code>
   */
  com.google.ads.googleads.v1.enums.FeedItemTargetTypeEnum.FeedItemTargetType getFeedItemTargetType();

  /**
   * <pre>
   * The ID of the targeted resource. This field is read-only.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value feed_item_target_id = 6;</code>
   */
  boolean hasFeedItemTargetId();
  /**
   * <pre>
   * The ID of the targeted resource. This field is read-only.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value feed_item_target_id = 6;</code>
   */
  com.google.protobuf.Int64Value getFeedItemTargetId();
  /**
   * <pre>
   * The ID of the targeted resource. This field is read-only.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value feed_item_target_id = 6;</code>
   */
  com.google.protobuf.Int64ValueOrBuilder getFeedItemTargetIdOrBuilder();

  /**
   * <pre>
   * The targeted campaign.
   * </pre>
   *
   * <code>.google.protobuf.StringValue campaign = 4;</code>
   */
  boolean hasCampaign();
  /**
   * <pre>
   * The targeted campaign.
   * </pre>
   *
   * <code>.google.protobuf.StringValue campaign = 4;</code>
   */
  com.google.protobuf.StringValue getCampaign();
  /**
   * <pre>
   * The targeted campaign.
   * </pre>
   *
   * <code>.google.protobuf.StringValue campaign = 4;</code>
   */
  com.google.protobuf.StringValueOrBuilder getCampaignOrBuilder();

  /**
   * <pre>
   * The targeted ad group.
   * </pre>
   *
   * <code>.google.protobuf.StringValue ad_group = 5;</code>
   */
  boolean hasAdGroup();
  /**
   * <pre>
   * The targeted ad group.
   * </pre>
   *
   * <code>.google.protobuf.StringValue ad_group = 5;</code>
   */
  com.google.protobuf.StringValue getAdGroup();
  /**
   * <pre>
   * The targeted ad group.
   * </pre>
   *
   * <code>.google.protobuf.StringValue ad_group = 5;</code>
   */
  com.google.protobuf.StringValueOrBuilder getAdGroupOrBuilder();

  /**
   * <pre>
   * The targeted keyword.
   * </pre>
   *
   * <code>.google.ads.googleads.v1.common.KeywordInfo keyword = 7;</code>
   */
  boolean hasKeyword();
  /**
   * <pre>
   * The targeted keyword.
   * </pre>
   *
   * <code>.google.ads.googleads.v1.common.KeywordInfo keyword = 7;</code>
   */
  com.google.ads.googleads.v1.common.KeywordInfo getKeyword();
  /**
   * <pre>
   * The targeted keyword.
   * </pre>
   *
   * <code>.google.ads.googleads.v1.common.KeywordInfo keyword = 7;</code>
   */
  com.google.ads.googleads.v1.common.KeywordInfoOrBuilder getKeywordOrBuilder();

  /**
   * <pre>
   * The targeted geo target constant resource name.
   * </pre>
   *
   * <code>.google.protobuf.StringValue geo_target_constant = 8;</code>
   */
  boolean hasGeoTargetConstant();
  /**
   * <pre>
   * The targeted geo target constant resource name.
   * </pre>
   *
   * <code>.google.protobuf.StringValue geo_target_constant = 8;</code>
   */
  com.google.protobuf.StringValue getGeoTargetConstant();
  /**
   * <pre>
   * The targeted geo target constant resource name.
   * </pre>
   *
   * <code>.google.protobuf.StringValue geo_target_constant = 8;</code>
   */
  com.google.protobuf.StringValueOrBuilder getGeoTargetConstantOrBuilder();

  /**
   * <pre>
   * The targeted device.
   * </pre>
   *
   * <code>.google.ads.googleads.v1.enums.FeedItemTargetDeviceEnum.FeedItemTargetDevice device = 9;</code>
   */
  int getDeviceValue();
  /**
   * <pre>
   * The targeted device.
   * </pre>
   *
   * <code>.google.ads.googleads.v1.enums.FeedItemTargetDeviceEnum.FeedItemTargetDevice device = 9;</code>
   */
  com.google.ads.googleads.v1.enums.FeedItemTargetDeviceEnum.FeedItemTargetDevice getDevice();

  /**
   * <pre>
   * The targeted schedule.
   * </pre>
   *
   * <code>.google.ads.googleads.v1.common.AdScheduleInfo ad_schedule = 10;</code>
   */
  boolean hasAdSchedule();
  /**
   * <pre>
   * The targeted schedule.
   * </pre>
   *
   * <code>.google.ads.googleads.v1.common.AdScheduleInfo ad_schedule = 10;</code>
   */
  com.google.ads.googleads.v1.common.AdScheduleInfo getAdSchedule();
  /**
   * <pre>
   * The targeted schedule.
   * </pre>
   *
   * <code>.google.ads.googleads.v1.common.AdScheduleInfo ad_schedule = 10;</code>
   */
  com.google.ads.googleads.v1.common.AdScheduleInfoOrBuilder getAdScheduleOrBuilder();

  public com.google.ads.googleads.v1.resources.FeedItemTarget.TargetCase getTargetCase();
}
