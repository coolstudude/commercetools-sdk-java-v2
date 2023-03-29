
package com.commercetools.api.models.order;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.cart.ItemShippingDetailsDraft;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * OrderSetCustomLineItemShippingDetailsAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderSetCustomLineItemShippingDetailsAction orderSetCustomLineItemShippingDetailsAction = OrderSetCustomLineItemShippingDetailsAction.builder()
 *             .customLineItemId("{customLineItemId}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = OrderSetCustomLineItemShippingDetailsActionImpl.class)
public interface OrderSetCustomLineItemShippingDetailsAction extends OrderUpdateAction {

    /**
     * discriminator value for OrderSetCustomLineItemShippingDetailsAction
     */
    String SET_CUSTOM_LINE_ITEM_SHIPPING_DETAILS = "setCustomLineItemShippingDetails";

    /**
     *
     * @return customLineItemId
     */
    @NotNull
    @JsonProperty("customLineItemId")
    public String getCustomLineItemId();

    /**
     *  <p>For order creation and updates, the sum of the <code>targets</code> must match the quantity of the Line Items or Custom Line Items.</p>
     * @return shippingDetails
     */
    @Valid
    @JsonProperty("shippingDetails")
    public ItemShippingDetailsDraft getShippingDetails();

    /**
     * set customLineItemId
     * @param customLineItemId value to be set
     */

    public void setCustomLineItemId(final String customLineItemId);

    /**
     *  <p>For order creation and updates, the sum of the <code>targets</code> must match the quantity of the Line Items or Custom Line Items.</p>
     * @param shippingDetails value to be set
     */

    public void setShippingDetails(final ItemShippingDetailsDraft shippingDetails);

    /**
     * factory method
     * @return instance of OrderSetCustomLineItemShippingDetailsAction
     */
    public static OrderSetCustomLineItemShippingDetailsAction of() {
        return new OrderSetCustomLineItemShippingDetailsActionImpl();
    }

    /**
     * factory method to create a shallow copy OrderSetCustomLineItemShippingDetailsAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static OrderSetCustomLineItemShippingDetailsAction of(
            final OrderSetCustomLineItemShippingDetailsAction template) {
        OrderSetCustomLineItemShippingDetailsActionImpl instance = new OrderSetCustomLineItemShippingDetailsActionImpl();
        instance.setCustomLineItemId(template.getCustomLineItemId());
        instance.setShippingDetails(template.getShippingDetails());
        return instance;
    }

    /**
     * factory method to create a deep copy of OrderSetCustomLineItemShippingDetailsAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static OrderSetCustomLineItemShippingDetailsAction deepCopy(
            @Nullable final OrderSetCustomLineItemShippingDetailsAction template) {
        if (template == null) {
            return null;
        }
        OrderSetCustomLineItemShippingDetailsActionImpl instance = new OrderSetCustomLineItemShippingDetailsActionImpl();
        instance.setCustomLineItemId(template.getCustomLineItemId());
        instance.setShippingDetails(Optional.ofNullable(template.getShippingDetails())
                .map(com.commercetools.api.models.cart.ItemShippingDetailsDraft::deepCopy)
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for OrderSetCustomLineItemShippingDetailsAction
     * @return builder
     */
    public static OrderSetCustomLineItemShippingDetailsActionBuilder builder() {
        return OrderSetCustomLineItemShippingDetailsActionBuilder.of();
    }

    /**
     * create builder for OrderSetCustomLineItemShippingDetailsAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static OrderSetCustomLineItemShippingDetailsActionBuilder builder(
            final OrderSetCustomLineItemShippingDetailsAction template) {
        return OrderSetCustomLineItemShippingDetailsActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withOrderSetCustomLineItemShippingDetailsAction(
            Function<OrderSetCustomLineItemShippingDetailsAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<OrderSetCustomLineItemShippingDetailsAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<OrderSetCustomLineItemShippingDetailsAction>() {
            @Override
            public String toString() {
                return "TypeReference<OrderSetCustomLineItemShippingDetailsAction>";
            }
        };
    }
}
