
package com.commercetools.api.models.cart;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * CartSetCustomLineItemShippingDetailsAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartSetCustomLineItemShippingDetailsAction cartSetCustomLineItemShippingDetailsAction = CartSetCustomLineItemShippingDetailsAction.builder()
 *             .customLineItemId("{customLineItemId}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CartSetCustomLineItemShippingDetailsActionImpl.class)
public interface CartSetCustomLineItemShippingDetailsAction extends CartUpdateAction {

    /**
     * discriminator value for CartSetCustomLineItemShippingDetailsAction
     */
    String SET_CUSTOM_LINE_ITEM_SHIPPING_DETAILS = "setCustomLineItemShippingDetails";

    /**
     *  <p><code>id</code> of the CustomLineItem to update.</p>
     * @return customLineItemId
     */
    @NotNull
    @JsonProperty("customLineItemId")
    public String getCustomLineItemId();

    /**
     *  <p>Value to set. If empty, any existing value is removed.</p>
     * @return shippingDetails
     */
    @Valid
    @JsonProperty("shippingDetails")
    public ItemShippingDetailsDraft getShippingDetails();

    /**
     *  <p><code>id</code> of the CustomLineItem to update.</p>
     * @param customLineItemId value to be set
     */

    public void setCustomLineItemId(final String customLineItemId);

    /**
     *  <p>Value to set. If empty, any existing value is removed.</p>
     * @param shippingDetails value to be set
     */

    public void setShippingDetails(final ItemShippingDetailsDraft shippingDetails);

    /**
     * factory method
     * @return instance of CartSetCustomLineItemShippingDetailsAction
     */
    public static CartSetCustomLineItemShippingDetailsAction of() {
        return new CartSetCustomLineItemShippingDetailsActionImpl();
    }

    /**
     * factory method to create a shallow copy CartSetCustomLineItemShippingDetailsAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static CartSetCustomLineItemShippingDetailsAction of(
            final CartSetCustomLineItemShippingDetailsAction template) {
        CartSetCustomLineItemShippingDetailsActionImpl instance = new CartSetCustomLineItemShippingDetailsActionImpl();
        instance.setCustomLineItemId(template.getCustomLineItemId());
        instance.setShippingDetails(template.getShippingDetails());
        return instance;
    }

    /**
     * factory method to create a deep copy of CartSetCustomLineItemShippingDetailsAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CartSetCustomLineItemShippingDetailsAction deepCopy(
            @Nullable final CartSetCustomLineItemShippingDetailsAction template) {
        if (template == null) {
            return null;
        }
        CartSetCustomLineItemShippingDetailsActionImpl instance = new CartSetCustomLineItemShippingDetailsActionImpl();
        instance.setCustomLineItemId(template.getCustomLineItemId());
        instance.setShippingDetails(
            com.commercetools.api.models.cart.ItemShippingDetailsDraft.deepCopy(template.getShippingDetails()));
        return instance;
    }

    /**
     * builder factory method for CartSetCustomLineItemShippingDetailsAction
     * @return builder
     */
    public static CartSetCustomLineItemShippingDetailsActionBuilder builder() {
        return CartSetCustomLineItemShippingDetailsActionBuilder.of();
    }

    /**
     * create builder for CartSetCustomLineItemShippingDetailsAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CartSetCustomLineItemShippingDetailsActionBuilder builder(
            final CartSetCustomLineItemShippingDetailsAction template) {
        return CartSetCustomLineItemShippingDetailsActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCartSetCustomLineItemShippingDetailsAction(
            Function<CartSetCustomLineItemShippingDetailsAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CartSetCustomLineItemShippingDetailsAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CartSetCustomLineItemShippingDetailsAction>() {
            @Override
            public String toString() {
                return "TypeReference<CartSetCustomLineItemShippingDetailsAction>";
            }
        };
    }
}
