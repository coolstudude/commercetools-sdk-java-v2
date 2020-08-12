package com.commercetools.api.models.order;

import com.commercetools.api.models.order.ReturnItem;
import com.commercetools.api.models.order.CustomLineItemReturnItem;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class CustomLineItemReturnItemBuilder {
   
   
   private String id;
   
   
   private Long quantity;
   
   @Nullable
   private String comment;
   
   
   private com.commercetools.api.models.order.ReturnShipmentState shipmentState;
   
   
   private com.commercetools.api.models.order.ReturnPaymentState paymentState;
   
   
   private java.time.ZonedDateTime lastModifiedAt;
   
   
   private java.time.ZonedDateTime createdAt;
   
   
   private String customLineItemId;
   
   public CustomLineItemReturnItemBuilder id( final String id) {
      this.id = id;
      return this;
   }
   
   public CustomLineItemReturnItemBuilder quantity( final Long quantity) {
      this.quantity = quantity;
      return this;
   }
   
   public CustomLineItemReturnItemBuilder comment(@Nullable final String comment) {
      this.comment = comment;
      return this;
   }
   
   public CustomLineItemReturnItemBuilder shipmentState( final com.commercetools.api.models.order.ReturnShipmentState shipmentState) {
      this.shipmentState = shipmentState;
      return this;
   }
   
   public CustomLineItemReturnItemBuilder paymentState( final com.commercetools.api.models.order.ReturnPaymentState paymentState) {
      this.paymentState = paymentState;
      return this;
   }
   
   public CustomLineItemReturnItemBuilder lastModifiedAt( final java.time.ZonedDateTime lastModifiedAt) {
      this.lastModifiedAt = lastModifiedAt;
      return this;
   }
   
   public CustomLineItemReturnItemBuilder createdAt( final java.time.ZonedDateTime createdAt) {
      this.createdAt = createdAt;
      return this;
   }
   
   public CustomLineItemReturnItemBuilder customLineItemId( final String customLineItemId) {
      this.customLineItemId = customLineItemId;
      return this;
   }
   
   
   public String getId(){
      return this.id;
   }
   
   
   public Long getQuantity(){
      return this.quantity;
   }
   
   @Nullable
   public String getComment(){
      return this.comment;
   }
   
   
   public com.commercetools.api.models.order.ReturnShipmentState getShipmentState(){
      return this.shipmentState;
   }
   
   
   public com.commercetools.api.models.order.ReturnPaymentState getPaymentState(){
      return this.paymentState;
   }
   
   
   public java.time.ZonedDateTime getLastModifiedAt(){
      return this.lastModifiedAt;
   }
   
   
   public java.time.ZonedDateTime getCreatedAt(){
      return this.createdAt;
   }
   
   
   public String getCustomLineItemId(){
      return this.customLineItemId;
   }

   public CustomLineItemReturnItem build() {
       return new CustomLineItemReturnItemImpl(id, quantity, comment, shipmentState, paymentState, lastModifiedAt, createdAt, customLineItemId);
   }
   
   public static CustomLineItemReturnItemBuilder of() {
      return new CustomLineItemReturnItemBuilder();
   }
   
   public static CustomLineItemReturnItemBuilder of(final CustomLineItemReturnItem template) {
      CustomLineItemReturnItemBuilder builder = new CustomLineItemReturnItemBuilder();
      builder.id = template.getId();
      builder.quantity = template.getQuantity();
      builder.comment = template.getComment();
      builder.shipmentState = template.getShipmentState();
      builder.paymentState = template.getPaymentState();
      builder.lastModifiedAt = template.getLastModifiedAt();
      builder.createdAt = template.getCreatedAt();
      builder.customLineItemId = template.getCustomLineItemId();
      return builder;
   }
   
}
