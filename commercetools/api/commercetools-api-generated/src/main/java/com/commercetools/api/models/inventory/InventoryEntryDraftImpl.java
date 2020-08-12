package com.commercetools.api.models.inventory;

import com.commercetools.api.models.channel.ChannelResourceIdentifier;
import com.commercetools.api.models.type.CustomFieldsDraft;
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
public final class InventoryEntryDraftImpl implements InventoryEntryDraft {

   private String sku;
   
   private com.commercetools.api.models.channel.ChannelResourceIdentifier supplyChannel;
   
   private Long quantityOnStock;
   
   private Long restockableInDays;
   
   private java.time.ZonedDateTime expectedDelivery;
   
   private com.commercetools.api.models.type.CustomFieldsDraft custom;

   @JsonCreator
   InventoryEntryDraftImpl(@JsonProperty("sku") final String sku, @JsonProperty("supplyChannel") final com.commercetools.api.models.channel.ChannelResourceIdentifier supplyChannel, @JsonProperty("quantityOnStock") final Long quantityOnStock, @JsonProperty("restockableInDays") final Long restockableInDays, @JsonProperty("expectedDelivery") final java.time.ZonedDateTime expectedDelivery, @JsonProperty("custom") final com.commercetools.api.models.type.CustomFieldsDraft custom) {
      this.sku = sku;
      this.supplyChannel = supplyChannel;
      this.quantityOnStock = quantityOnStock;
      this.restockableInDays = restockableInDays;
      this.expectedDelivery = expectedDelivery;
      this.custom = custom;
   }
   public InventoryEntryDraftImpl() {
      
   }
   
   
   public String getSku(){
      return this.sku;
   }
   
   
   public com.commercetools.api.models.channel.ChannelResourceIdentifier getSupplyChannel(){
      return this.supplyChannel;
   }
   
   
   public Long getQuantityOnStock(){
      return this.quantityOnStock;
   }
   
   
   public Long getRestockableInDays(){
      return this.restockableInDays;
   }
   
   
   public java.time.ZonedDateTime getExpectedDelivery(){
      return this.expectedDelivery;
   }
   
   /**
   *  <p>The custom fields.</p>
   */
   public com.commercetools.api.models.type.CustomFieldsDraft getCustom(){
      return this.custom;
   }

   public void setSku(final String sku){
      this.sku = sku;
   }
   
   public void setSupplyChannel(final com.commercetools.api.models.channel.ChannelResourceIdentifier supplyChannel){
      this.supplyChannel = supplyChannel;
   }
   
   public void setQuantityOnStock(final Long quantityOnStock){
      this.quantityOnStock = quantityOnStock;
   }
   
   public void setRestockableInDays(final Long restockableInDays){
      this.restockableInDays = restockableInDays;
   }
   
   public void setExpectedDelivery(final java.time.ZonedDateTime expectedDelivery){
      this.expectedDelivery = expectedDelivery;
   }
   
   public void setCustom(final com.commercetools.api.models.type.CustomFieldsDraft custom){
      this.custom = custom;
   }

}
