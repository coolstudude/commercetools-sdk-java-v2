
package com.commercetools.api.models.me;

import java.io.IOException;
import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.common.Address;
import com.commercetools.api.models.me.MyCartUpdateAction;
import com.commercetools.api.models.me.MyCartUpdateItemShippingAddressActionImpl;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.Accessor;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = MyCartUpdateItemShippingAddressActionImpl.class)
public interface MyCartUpdateItemShippingAddressAction extends MyCartUpdateAction {

    String UPDATE_ITEM_SHIPPING_ADDRESS = "updateItemShippingAddress";

    @NotNull
    @Valid
    @JsonProperty("address")
    public Address getAddress();

    public void setAddress(final Address address);

    public static MyCartUpdateItemShippingAddressAction of() {
        return new MyCartUpdateItemShippingAddressActionImpl();
    }

    public static MyCartUpdateItemShippingAddressAction of(final MyCartUpdateItemShippingAddressAction template) {
        MyCartUpdateItemShippingAddressActionImpl instance = new MyCartUpdateItemShippingAddressActionImpl();
        instance.setAddress(template.getAddress());
        return instance;
    }

    public static MyCartUpdateItemShippingAddressActionBuilder builder() {
        return MyCartUpdateItemShippingAddressActionBuilder.of();
    }

    public static MyCartUpdateItemShippingAddressActionBuilder builder(
            final MyCartUpdateItemShippingAddressAction template) {
        return MyCartUpdateItemShippingAddressActionBuilder.of(template);
    }

    default <T> T withMyCartUpdateItemShippingAddressAction(Function<MyCartUpdateItemShippingAddressAction, T> helper) {
        return helper.apply(this);
    }
}
