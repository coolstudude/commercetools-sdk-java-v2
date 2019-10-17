package com.commercetools.api.generated.models.order;

import com.commercetools.api.generated.models.order.ItemState;
import com.commercetools.api.generated.models.order.OrderUpdateAction;
import com.commercetools.api.generated.models.order.OrderImportLineItemStateAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class OrderImportLineItemStateActionBuilder {
   
   
   private String lineItemId;
   
   
   private java.util.List<com.commercetools.api.generated.models.order.ItemState> state;
   
   public OrderImportLineItemStateActionBuilder lineItemId( final String lineItemId) {
      this.lineItemId = lineItemId;
      return this;
   }
   
   public OrderImportLineItemStateActionBuilder state( final java.util.List<com.commercetools.api.generated.models.order.ItemState> state) {
      this.state = state;
      return this;
   }
   
   
   public String getLineItemId(){
      return this.lineItemId;
   }
   
   
   public java.util.List<com.commercetools.api.generated.models.order.ItemState> getState(){
      return this.state;
   }

   public OrderImportLineItemStateAction build() {
       return new OrderImportLineItemStateActionImpl(lineItemId, state);
   }
   
   public static OrderImportLineItemStateActionBuilder of() {
      return new OrderImportLineItemStateActionBuilder();
   }
   
   public static OrderImportLineItemStateActionBuilder of(final OrderImportLineItemStateAction template) {
      OrderImportLineItemStateActionBuilder builder = new OrderImportLineItemStateActionBuilder();
      builder.lineItemId = template.getLineItemId();
      builder.state = template.getState();
      return builder;
   }
   
}