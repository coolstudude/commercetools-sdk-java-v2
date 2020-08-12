package com.commercetools.api.models.customer;

import com.commercetools.api.models.customer.CustomerUpdateAction;
import com.commercetools.api.models.customer.CustomerAddBillingAddressIdActionImpl;

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
@JsonDeserialize(as = CustomerAddBillingAddressIdActionImpl.class)
public interface CustomerAddBillingAddressIdAction extends CustomerUpdateAction {

   
   
   @JsonProperty("addressId")
   public String getAddressId();
   
   
   @JsonProperty("addressKey")
   public String getAddressKey();

   public void setAddressId(final String addressId);
   
   public void setAddressKey(final String addressKey);
   
   public static CustomerAddBillingAddressIdActionImpl of(){
      return new CustomerAddBillingAddressIdActionImpl();
   }
   

   public static CustomerAddBillingAddressIdActionImpl of(final CustomerAddBillingAddressIdAction template) {
      CustomerAddBillingAddressIdActionImpl instance = new CustomerAddBillingAddressIdActionImpl();
      instance.setAddressId(template.getAddressId());
      instance.setAddressKey(template.getAddressKey());
      return instance;
   }

}
