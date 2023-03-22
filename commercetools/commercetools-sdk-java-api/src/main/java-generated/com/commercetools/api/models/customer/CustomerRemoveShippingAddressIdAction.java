
package com.commercetools.api.models.customer;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Removes a shipping address from <code>shippingAddressesIds</code>. If the shipping address is the default shipping address, the <code>defaultShippingAddressId</code> is unset. Either <code>addressId</code> or <code>addressKey</code> is required.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomerRemoveShippingAddressIdAction customerRemoveShippingAddressIdAction = CustomerRemoveShippingAddressIdAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CustomerRemoveShippingAddressIdActionImpl.class)
public interface CustomerRemoveShippingAddressIdAction extends CustomerUpdateAction {

    String REMOVE_SHIPPING_ADDRESS_ID = "removeShippingAddressId";

    /**
     *  <p><code>id</code> of the Address to remove from <code>shippingAddressesIds</code>.</p>
     * @return addressId
     */

    @JsonProperty("addressId")
    public String getAddressId();

    /**
     *  <p><code>key</code> of the Address to remove from <code>shippingAddressesIds</code>.</p>
     * @return addressKey
     */

    @JsonProperty("addressKey")
    public String getAddressKey();

    public void setAddressId(final String addressId);

    public void setAddressKey(final String addressKey);

    public static CustomerRemoveShippingAddressIdAction of() {
        return new CustomerRemoveShippingAddressIdActionImpl();
    }

    public static CustomerRemoveShippingAddressIdAction of(final CustomerRemoveShippingAddressIdAction template) {
        CustomerRemoveShippingAddressIdActionImpl instance = new CustomerRemoveShippingAddressIdActionImpl();
        instance.setAddressId(template.getAddressId());
        instance.setAddressKey(template.getAddressKey());
        return instance;
    }

    public static CustomerRemoveShippingAddressIdActionBuilder builder() {
        return CustomerRemoveShippingAddressIdActionBuilder.of();
    }

    public static CustomerRemoveShippingAddressIdActionBuilder builder(
            final CustomerRemoveShippingAddressIdAction template) {
        return CustomerRemoveShippingAddressIdActionBuilder.of(template);
    }

    default <T> T withCustomerRemoveShippingAddressIdAction(Function<CustomerRemoveShippingAddressIdAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<CustomerRemoveShippingAddressIdAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CustomerRemoveShippingAddressIdAction>() {
            @Override
            public String toString() {
                return "TypeReference<CustomerRemoveShippingAddressIdAction>";
            }
        };
    }
}
