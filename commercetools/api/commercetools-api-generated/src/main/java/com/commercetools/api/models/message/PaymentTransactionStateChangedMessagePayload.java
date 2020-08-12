package com.commercetools.api.models.message;

import com.commercetools.api.models.message.MessagePayload;
import com.commercetools.api.models.payment.TransactionState;
import com.commercetools.api.models.message.PaymentTransactionStateChangedMessagePayloadImpl;

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
@JsonDeserialize(as = PaymentTransactionStateChangedMessagePayloadImpl.class)
public interface PaymentTransactionStateChangedMessagePayload extends MessagePayload {

   
   @NotNull
   @JsonProperty("transactionId")
   public String getTransactionId();
   
   @NotNull
   @JsonProperty("state")
   public TransactionState getState();

   public void setTransactionId(final String transactionId);
   
   public void setState(final TransactionState state);
   
   public static PaymentTransactionStateChangedMessagePayloadImpl of(){
      return new PaymentTransactionStateChangedMessagePayloadImpl();
   }
   

   public static PaymentTransactionStateChangedMessagePayloadImpl of(final PaymentTransactionStateChangedMessagePayload template) {
      PaymentTransactionStateChangedMessagePayloadImpl instance = new PaymentTransactionStateChangedMessagePayloadImpl();
      instance.setTransactionId(template.getTransactionId());
      instance.setState(template.getState());
      return instance;
   }

}
