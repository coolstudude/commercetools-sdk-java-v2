package com.commercetools.api.models.customer;


import com.commercetools.api.models.customer.CustomerCreatePasswordResetTokenImpl;

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
@JsonDeserialize(as = CustomerCreatePasswordResetTokenImpl.class)
public interface CustomerCreatePasswordResetToken  {

   
   @NotNull
   @JsonProperty("email")
   public String getEmail();
   
   
   @JsonProperty("ttlMinutes")
   public Long getTtlMinutes();

   public void setEmail(final String email);
   
   public void setTtlMinutes(final Long ttlMinutes);
   
   public static CustomerCreatePasswordResetTokenImpl of(){
      return new CustomerCreatePasswordResetTokenImpl();
   }
   

   public static CustomerCreatePasswordResetTokenImpl of(final CustomerCreatePasswordResetToken template) {
      CustomerCreatePasswordResetTokenImpl instance = new CustomerCreatePasswordResetTokenImpl();
      instance.setEmail(template.getEmail());
      instance.setTtlMinutes(template.getTtlMinutes());
      return instance;
   }

}
