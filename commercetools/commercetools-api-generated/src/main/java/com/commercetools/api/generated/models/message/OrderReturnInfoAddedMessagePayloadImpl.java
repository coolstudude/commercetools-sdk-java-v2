package com.commercetools.api.generated.models.message;

import com.commercetools.api.generated.models.message.MessagePayload;
import com.commercetools.api.generated.models.order.ReturnInfo;
import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class OrderReturnInfoAddedMessagePayloadImpl implements OrderReturnInfoAddedMessagePayload {

   private String type;
   
   private com.commercetools.api.generated.models.order.ReturnInfo returnInfo;

   @JsonCreator
   OrderReturnInfoAddedMessagePayloadImpl(@JsonProperty("returnInfo") final com.commercetools.api.generated.models.order.ReturnInfo returnInfo) {
      this.returnInfo = returnInfo;
      this.type = "ReturnInfoAdded";
   }
   public OrderReturnInfoAddedMessagePayloadImpl() {
      
   }
   
   
   public String getType(){
      return this.type;
   }
   
   
   public com.commercetools.api.generated.models.order.ReturnInfo getReturnInfo(){
      return this.returnInfo;
   }

   public void setReturnInfo(final com.commercetools.api.generated.models.order.ReturnInfo returnInfo){
      this.returnInfo = returnInfo;
   }

}