package com.commercetools.api.models.order_edit;

import com.commercetools.api.models.order.DeliveryItem;
import com.commercetools.api.models.order.StagedOrderUpdateAction;
import com.commercetools.api.models.order_edit.StagedOrderSetParcelItemsAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class StagedOrderSetParcelItemsActionBuilder {
   
   
   private String parcelId;
   
   
   private java.util.List<com.commercetools.api.models.order.DeliveryItem> items;
   
   public StagedOrderSetParcelItemsActionBuilder parcelId( final String parcelId) {
      this.parcelId = parcelId;
      return this;
   }
   
   public StagedOrderSetParcelItemsActionBuilder items( final java.util.List<com.commercetools.api.models.order.DeliveryItem> items) {
      this.items = items;
      return this;
   }
   
   
   public String getParcelId(){
      return this.parcelId;
   }
   
   
   public java.util.List<com.commercetools.api.models.order.DeliveryItem> getItems(){
      return this.items;
   }

   public StagedOrderSetParcelItemsAction build() {
       return new StagedOrderSetParcelItemsActionImpl(parcelId, items);
   }
   
   public static StagedOrderSetParcelItemsActionBuilder of() {
      return new StagedOrderSetParcelItemsActionBuilder();
   }
   
   public static StagedOrderSetParcelItemsActionBuilder of(final StagedOrderSetParcelItemsAction template) {
      StagedOrderSetParcelItemsActionBuilder builder = new StagedOrderSetParcelItemsActionBuilder();
      builder.parcelId = template.getParcelId();
      builder.items = template.getItems();
      return builder;
   }
   
}
