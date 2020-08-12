package com.commercetools.api.models.message;

import com.commercetools.api.models.message.Message;
import com.commercetools.api.models.product.ProductVariant;
import com.commercetools.api.models.message.ProductVariantDeletedMessage;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ProductVariantDeletedMessageBuilder {
   
   
   private String id;
   
   
   private Long version;
   
   
   private java.time.ZonedDateTime createdAt;
   
   
   private java.time.ZonedDateTime lastModifiedAt;
   
   @Nullable
   private com.commercetools.api.models.common.LastModifiedBy lastModifiedBy;
   
   @Nullable
   private com.commercetools.api.models.common.CreatedBy createdBy;
   
   
   private Long sequenceNumber;
   
   
   private com.commercetools.api.models.common.Reference resource;
   
   
   private Long resourceVersion;
   
   @Nullable
   private com.commercetools.api.models.message.UserProvidedIdentifiers resourceUserProvidedIdentifiers;
   
   
   private com.commercetools.api.models.product.ProductVariant variant;
   
   
   private java.util.List<String> removedImageUrls;
   
   public ProductVariantDeletedMessageBuilder id( final String id) {
      this.id = id;
      return this;
   }
   
   public ProductVariantDeletedMessageBuilder version( final Long version) {
      this.version = version;
      return this;
   }
   
   public ProductVariantDeletedMessageBuilder createdAt( final java.time.ZonedDateTime createdAt) {
      this.createdAt = createdAt;
      return this;
   }
   
   public ProductVariantDeletedMessageBuilder lastModifiedAt( final java.time.ZonedDateTime lastModifiedAt) {
      this.lastModifiedAt = lastModifiedAt;
      return this;
   }
   
   public ProductVariantDeletedMessageBuilder lastModifiedBy(@Nullable final com.commercetools.api.models.common.LastModifiedBy lastModifiedBy) {
      this.lastModifiedBy = lastModifiedBy;
      return this;
   }
   
   public ProductVariantDeletedMessageBuilder createdBy(@Nullable final com.commercetools.api.models.common.CreatedBy createdBy) {
      this.createdBy = createdBy;
      return this;
   }
   
   public ProductVariantDeletedMessageBuilder sequenceNumber( final Long sequenceNumber) {
      this.sequenceNumber = sequenceNumber;
      return this;
   }
   
   public ProductVariantDeletedMessageBuilder resource( final com.commercetools.api.models.common.Reference resource) {
      this.resource = resource;
      return this;
   }
   
   public ProductVariantDeletedMessageBuilder resourceVersion( final Long resourceVersion) {
      this.resourceVersion = resourceVersion;
      return this;
   }
   
   public ProductVariantDeletedMessageBuilder resourceUserProvidedIdentifiers(@Nullable final com.commercetools.api.models.message.UserProvidedIdentifiers resourceUserProvidedIdentifiers) {
      this.resourceUserProvidedIdentifiers = resourceUserProvidedIdentifiers;
      return this;
   }
   
   public ProductVariantDeletedMessageBuilder variant( final com.commercetools.api.models.product.ProductVariant variant) {
      this.variant = variant;
      return this;
   }
   
   public ProductVariantDeletedMessageBuilder removedImageUrls( final java.util.List<String> removedImageUrls) {
      this.removedImageUrls = removedImageUrls;
      return this;
   }
   
   
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
   
   @Nullable
   public com.commercetools.api.models.common.LastModifiedBy getLastModifiedBy(){
      return this.lastModifiedBy;
   }
   
   @Nullable
   public com.commercetools.api.models.common.CreatedBy getCreatedBy(){
      return this.createdBy;
   }
   
   
   public Long getSequenceNumber(){
      return this.sequenceNumber;
   }
   
   
   public com.commercetools.api.models.common.Reference getResource(){
      return this.resource;
   }
   
   
   public Long getResourceVersion(){
      return this.resourceVersion;
   }
   
   @Nullable
   public com.commercetools.api.models.message.UserProvidedIdentifiers getResourceUserProvidedIdentifiers(){
      return this.resourceUserProvidedIdentifiers;
   }
   
   
   public com.commercetools.api.models.product.ProductVariant getVariant(){
      return this.variant;
   }
   
   
   public java.util.List<String> getRemovedImageUrls(){
      return this.removedImageUrls;
   }

   public ProductVariantDeletedMessage build() {
       return new ProductVariantDeletedMessageImpl(id, version, createdAt, lastModifiedAt, lastModifiedBy, createdBy, sequenceNumber, resource, resourceVersion, resourceUserProvidedIdentifiers, variant, removedImageUrls);
   }
   
   public static ProductVariantDeletedMessageBuilder of() {
      return new ProductVariantDeletedMessageBuilder();
   }
   
   public static ProductVariantDeletedMessageBuilder of(final ProductVariantDeletedMessage template) {
      ProductVariantDeletedMessageBuilder builder = new ProductVariantDeletedMessageBuilder();
      builder.id = template.getId();
      builder.version = template.getVersion();
      builder.createdAt = template.getCreatedAt();
      builder.lastModifiedAt = template.getLastModifiedAt();
      builder.lastModifiedBy = template.getLastModifiedBy();
      builder.createdBy = template.getCreatedBy();
      builder.sequenceNumber = template.getSequenceNumber();
      builder.resource = template.getResource();
      builder.resourceVersion = template.getResourceVersion();
      builder.resourceUserProvidedIdentifiers = template.getResourceUserProvidedIdentifiers();
      builder.variant = template.getVariant();
      builder.removedImageUrls = template.getRemovedImageUrls();
      return builder;
   }
   
}
