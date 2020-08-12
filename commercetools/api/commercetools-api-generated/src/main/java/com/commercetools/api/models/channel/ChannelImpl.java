package com.commercetools.api.models.channel;

import com.commercetools.api.models.channel.ChannelRoleEnum;
import com.commercetools.api.models.common.Address;
import com.commercetools.api.models.common.BaseResource;
import com.commercetools.api.models.common.CreatedBy;
import com.commercetools.api.models.common.GeoJson;
import com.commercetools.api.models.common.LastModifiedBy;
import com.commercetools.api.models.common.LocalizedString;
import com.commercetools.api.models.review.ReviewRatingStatistics;
import com.commercetools.api.models.type.CustomFields;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ChannelImpl implements Channel {

   private String id;
   
   private Long version;
   
   private java.time.ZonedDateTime createdAt;
   
   private java.time.ZonedDateTime lastModifiedAt;
   
   private com.commercetools.api.models.common.LastModifiedBy lastModifiedBy;
   
   private com.commercetools.api.models.common.CreatedBy createdBy;
   
   private String key;
   
   private java.util.List<com.commercetools.api.models.channel.ChannelRoleEnum> roles;
   
   private com.commercetools.api.models.common.LocalizedString name;
   
   private com.commercetools.api.models.common.LocalizedString description;
   
   private com.commercetools.api.models.common.Address address;
   
   private com.commercetools.api.models.review.ReviewRatingStatistics reviewRatingStatistics;
   
   private com.commercetools.api.models.type.CustomFields custom;
   
   private com.commercetools.api.models.common.GeoJson geoLocation;

   @JsonCreator
   ChannelImpl(@JsonProperty("id") final String id, @JsonProperty("version") final Long version, @JsonProperty("createdAt") final java.time.ZonedDateTime createdAt, @JsonProperty("lastModifiedAt") final java.time.ZonedDateTime lastModifiedAt, @JsonProperty("lastModifiedBy") final com.commercetools.api.models.common.LastModifiedBy lastModifiedBy, @JsonProperty("createdBy") final com.commercetools.api.models.common.CreatedBy createdBy, @JsonProperty("key") final String key, @JsonProperty("roles") final java.util.List<com.commercetools.api.models.channel.ChannelRoleEnum> roles, @JsonProperty("name") final com.commercetools.api.models.common.LocalizedString name, @JsonProperty("description") final com.commercetools.api.models.common.LocalizedString description, @JsonProperty("address") final com.commercetools.api.models.common.Address address, @JsonProperty("reviewRatingStatistics") final com.commercetools.api.models.review.ReviewRatingStatistics reviewRatingStatistics, @JsonProperty("custom") final com.commercetools.api.models.type.CustomFields custom, @JsonProperty("geoLocation") final com.commercetools.api.models.common.GeoJson geoLocation) {
      this.id = id;
      this.version = version;
      this.createdAt = createdAt;
      this.lastModifiedAt = lastModifiedAt;
      this.lastModifiedBy = lastModifiedBy;
      this.createdBy = createdBy;
      this.key = key;
      this.roles = roles;
      this.name = name;
      this.description = description;
      this.address = address;
      this.reviewRatingStatistics = reviewRatingStatistics;
      this.custom = custom;
      this.geoLocation = geoLocation;
   }
   public ChannelImpl() {
      
   }
   
   /**
   *  <p>The unique ID of the channel.</p>
   */
   public String getId(){
      return this.id;
   }
   
   
   public Long getVersion(){
      return this.version;
   }
   
   
   public java.time.ZonedDateTime getCreatedAt(){
      return this.createdAt;
   }
   
   
   public java.time.ZonedDateTime getLastModifiedAt(){
      return this.lastModifiedAt;
   }
   
   /**
   *  <p>Present on resources updated after 1/02/2019 except for events not tracked.</p>
   */
   public com.commercetools.api.models.common.LastModifiedBy getLastModifiedBy(){
      return this.lastModifiedBy;
   }
   
   /**
   *  <p>Present on resources created after 1/02/2019 except for events not tracked.</p>
   */
   public com.commercetools.api.models.common.CreatedBy getCreatedBy(){
      return this.createdBy;
   }
   
   /**
   *  <p>Any arbitrary string key that uniquely identifies this channel within the project.</p>
   */
   public String getKey(){
      return this.key;
   }
   
   /**
   *  <p>The roles of this channel.
   *  Each channel must have at least one role.</p>
   */
   public java.util.List<com.commercetools.api.models.channel.ChannelRoleEnum> getRoles(){
      return this.roles;
   }
   
   /**
   *  <p>A human-readable name of the channel.</p>
   */
   public com.commercetools.api.models.common.LocalizedString getName(){
      return this.name;
   }
   
   /**
   *  <p>A human-readable description of the channel.</p>
   */
   public com.commercetools.api.models.common.LocalizedString getDescription(){
      return this.description;
   }
   
   /**
   *  <p>The address where this channel is located (e.g.
   *  if the channel is a physical store).</p>
   */
   public com.commercetools.api.models.common.Address getAddress(){
      return this.address;
   }
   
   /**
   *  <p>Statistics about the review ratings taken into account for this channel.</p>
   */
   public com.commercetools.api.models.review.ReviewRatingStatistics getReviewRatingStatistics(){
      return this.reviewRatingStatistics;
   }
   
   
   public com.commercetools.api.models.type.CustomFields getCustom(){
      return this.custom;
   }
   
   /**
   *  <p>A GeoJSON geometry object encoding the geo location of the channel.</p>
   */
   public com.commercetools.api.models.common.GeoJson getGeoLocation(){
      return this.geoLocation;
   }

   public void setId(final String id){
      this.id = id;
   }
   
   public void setVersion(final Long version){
      this.version = version;
   }
   
   public void setCreatedAt(final java.time.ZonedDateTime createdAt){
      this.createdAt = createdAt;
   }
   
   public void setLastModifiedAt(final java.time.ZonedDateTime lastModifiedAt){
      this.lastModifiedAt = lastModifiedAt;
   }
   
   public void setLastModifiedBy(final com.commercetools.api.models.common.LastModifiedBy lastModifiedBy){
      this.lastModifiedBy = lastModifiedBy;
   }
   
   public void setCreatedBy(final com.commercetools.api.models.common.CreatedBy createdBy){
      this.createdBy = createdBy;
   }
   
   public void setKey(final String key){
      this.key = key;
   }
   
   public void setRoles(final java.util.List<com.commercetools.api.models.channel.ChannelRoleEnum> roles){
      this.roles = roles;
   }
   
   public void setName(final com.commercetools.api.models.common.LocalizedString name){
      this.name = name;
   }
   
   public void setDescription(final com.commercetools.api.models.common.LocalizedString description){
      this.description = description;
   }
   
   public void setAddress(final com.commercetools.api.models.common.Address address){
      this.address = address;
   }
   
   public void setReviewRatingStatistics(final com.commercetools.api.models.review.ReviewRatingStatistics reviewRatingStatistics){
      this.reviewRatingStatistics = reviewRatingStatistics;
   }
   
   public void setCustom(final com.commercetools.api.models.type.CustomFields custom){
      this.custom = custom;
   }
   
   public void setGeoLocation(final com.commercetools.api.models.common.GeoJson geoLocation){
      this.geoLocation = geoLocation;
   }

}
