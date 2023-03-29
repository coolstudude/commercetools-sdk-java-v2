
package com.commercetools.api.models.cart;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.common.BaseAddress;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Updates an address in <code>itemShippingAddresses</code> by keeping the Address <code>key</code>.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartUpdateItemShippingAddressAction cartUpdateItemShippingAddressAction = CartUpdateItemShippingAddressAction.builder()
 *             .address(addressBuilder -> addressBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CartUpdateItemShippingAddressActionImpl.class)
public interface CartUpdateItemShippingAddressAction extends CartUpdateAction {

    /**
     * discriminator value for CartUpdateItemShippingAddressAction
     */
    String UPDATE_ITEM_SHIPPING_ADDRESS = "updateItemShippingAddress";

    /**
     *  <p>The new Address with the same <code>key</code> as the Address it will replace.</p>
     * @return address
     */
    @NotNull
    @Valid
    @JsonProperty("address")
    public BaseAddress getAddress();

    /**
     *  <p>The new Address with the same <code>key</code> as the Address it will replace.</p>
     * @param address value to be set
     */

    public void setAddress(final BaseAddress address);

    /**
     * factory method
     * @return instance of CartUpdateItemShippingAddressAction
     */
    public static CartUpdateItemShippingAddressAction of() {
        return new CartUpdateItemShippingAddressActionImpl();
    }

    /**
     * factory method to create a shallow copy CartUpdateItemShippingAddressAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static CartUpdateItemShippingAddressAction of(final CartUpdateItemShippingAddressAction template) {
        CartUpdateItemShippingAddressActionImpl instance = new CartUpdateItemShippingAddressActionImpl();
        instance.setAddress(template.getAddress());
        return instance;
    }

    /**
     * factory method to create a deep copy of CartUpdateItemShippingAddressAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CartUpdateItemShippingAddressAction deepCopy(
            @Nullable final CartUpdateItemShippingAddressAction template) {
        if (template == null) {
            return null;
        }
        CartUpdateItemShippingAddressActionImpl instance = new CartUpdateItemShippingAddressActionImpl();
        instance.setAddress(Optional.ofNullable(template.getAddress())
                .map(com.commercetools.api.models.common.BaseAddress::deepCopy)
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for CartUpdateItemShippingAddressAction
     * @return builder
     */
    public static CartUpdateItemShippingAddressActionBuilder builder() {
        return CartUpdateItemShippingAddressActionBuilder.of();
    }

    /**
     * create builder for CartUpdateItemShippingAddressAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CartUpdateItemShippingAddressActionBuilder builder(
            final CartUpdateItemShippingAddressAction template) {
        return CartUpdateItemShippingAddressActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCartUpdateItemShippingAddressAction(Function<CartUpdateItemShippingAddressAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CartUpdateItemShippingAddressAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CartUpdateItemShippingAddressAction>() {
            @Override
            public String toString() {
                return "TypeReference<CartUpdateItemShippingAddressAction>";
            }
        };
    }
}
