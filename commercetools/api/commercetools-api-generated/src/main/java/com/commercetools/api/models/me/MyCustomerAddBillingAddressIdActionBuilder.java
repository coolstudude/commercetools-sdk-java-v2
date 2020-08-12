package com.commercetools.api.models.me;

import com.commercetools.api.models.me.MyCustomerUpdateAction;
import com.commercetools.api.models.me.MyCustomerAddBillingAddressIdAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class MyCustomerAddBillingAddressIdActionBuilder {
   
   
   private String addressId;
   
   public MyCustomerAddBillingAddressIdActionBuilder addressId( final String addressId) {
      this.addressId = addressId;
      return this;
   }
   
   
   public String getAddressId(){
      return this.addressId;
   }

   public MyCustomerAddBillingAddressIdAction build() {
       return new MyCustomerAddBillingAddressIdActionImpl(addressId);
   }
   
   public static MyCustomerAddBillingAddressIdActionBuilder of() {
      return new MyCustomerAddBillingAddressIdActionBuilder();
   }
   
   public static MyCustomerAddBillingAddressIdActionBuilder of(final MyCustomerAddBillingAddressIdAction template) {
      MyCustomerAddBillingAddressIdActionBuilder builder = new MyCustomerAddBillingAddressIdActionBuilder();
      builder.addressId = template.getAddressId();
      return builder;
   }
   
}
