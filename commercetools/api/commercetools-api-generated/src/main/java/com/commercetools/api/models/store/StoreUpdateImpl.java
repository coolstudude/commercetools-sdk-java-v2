package com.commercetools.api.models.store;

import com.commercetools.api.models.store.StoreUpdateAction;
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
public final class StoreUpdateImpl implements StoreUpdate {

   private Long version;
   
   private java.util.List<com.commercetools.api.models.store.StoreUpdateAction> actions;

   @JsonCreator
   StoreUpdateImpl(@JsonProperty("version") final Long version, @JsonProperty("actions") final java.util.List<com.commercetools.api.models.store.StoreUpdateAction> actions) {
      this.version = version;
      this.actions = actions;
   }
   public StoreUpdateImpl() {
      
   }
   
   
   public Long getVersion(){
      return this.version;
   }
   
   
   public java.util.List<com.commercetools.api.models.store.StoreUpdateAction> getActions(){
      return this.actions;
   }

   public void setVersion(final Long version){
      this.version = version;
   }
   
   public void setActions(final java.util.List<com.commercetools.api.models.store.StoreUpdateAction> actions){
      this.actions = actions;
   }

}
