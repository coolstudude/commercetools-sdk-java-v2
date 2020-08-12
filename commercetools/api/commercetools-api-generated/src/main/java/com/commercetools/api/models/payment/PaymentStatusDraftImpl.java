package com.commercetools.api.models.payment;

import com.commercetools.api.models.state.StateResourceIdentifier;
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
public final class PaymentStatusDraftImpl implements PaymentStatusDraft {

   private String interfaceCode;
   
   private String interfaceText;
   
   private com.commercetools.api.models.state.StateResourceIdentifier state;

   @JsonCreator
   PaymentStatusDraftImpl(@JsonProperty("interfaceCode") final String interfaceCode, @JsonProperty("interfaceText") final String interfaceText, @JsonProperty("state") final com.commercetools.api.models.state.StateResourceIdentifier state) {
      this.interfaceCode = interfaceCode;
      this.interfaceText = interfaceText;
      this.state = state;
   }
   public PaymentStatusDraftImpl() {
      
   }
   
   
   public String getInterfaceCode(){
      return this.interfaceCode;
   }
   
   
   public String getInterfaceText(){
      return this.interfaceText;
   }
   
   
   public com.commercetools.api.models.state.StateResourceIdentifier getState(){
      return this.state;
   }

   public void setInterfaceCode(final String interfaceCode){
      this.interfaceCode = interfaceCode;
   }
   
   public void setInterfaceText(final String interfaceText){
      this.interfaceText = interfaceText;
   }
   
   public void setState(final com.commercetools.api.models.state.StateResourceIdentifier state){
      this.state = state;
   }

}
