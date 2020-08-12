package com.commercetools.api.models.message;

import com.commercetools.api.models.message.MessagePayload;
import com.commercetools.api.models.message.InventoryEntryQuantitySetMessagePayloadImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;

import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = InventoryEntryQuantitySetMessagePayloadImpl.class)
public interface InventoryEntryQuantitySetMessagePayload extends MessagePayload {

   
   @NotNull
   @JsonProperty("oldQuantityOnStock")
   public Long getOldQuantityOnStock();
   
   @NotNull
   @JsonProperty("newQuantityOnStock")
   public Long getNewQuantityOnStock();
   
   @NotNull
   @JsonProperty("oldAvailableQuantity")
   public Long getOldAvailableQuantity();
   
   @NotNull
   @JsonProperty("newAvailableQuantity")
   public Long getNewAvailableQuantity();

   public void setOldQuantityOnStock(final Long oldQuantityOnStock);
   
   public void setNewQuantityOnStock(final Long newQuantityOnStock);
   
   public void setOldAvailableQuantity(final Long oldAvailableQuantity);
   
   public void setNewAvailableQuantity(final Long newAvailableQuantity);
   
   public static InventoryEntryQuantitySetMessagePayloadImpl of(){
      return new InventoryEntryQuantitySetMessagePayloadImpl();
   }
   

   public static InventoryEntryQuantitySetMessagePayloadImpl of(final InventoryEntryQuantitySetMessagePayload template) {
      InventoryEntryQuantitySetMessagePayloadImpl instance = new InventoryEntryQuantitySetMessagePayloadImpl();
      instance.setOldQuantityOnStock(template.getOldQuantityOnStock());
      instance.setNewQuantityOnStock(template.getNewQuantityOnStock());
      instance.setOldAvailableQuantity(template.getOldAvailableQuantity());
      instance.setNewAvailableQuantity(template.getNewAvailableQuantity());
      return instance;
   }

}
