
package com.commercetools.api.models.order_edit;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.cart.ItemShippingDetailsDraft;
import com.commercetools.api.models.order.StagedOrderUpdateAction;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * StagedOrderSetCustomLineItemShippingDetailsAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StagedOrderSetCustomLineItemShippingDetailsAction stagedOrderSetCustomLineItemShippingDetailsAction = StagedOrderSetCustomLineItemShippingDetailsAction.builder()
 *             .customLineItemId("{customLineItemId}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = StagedOrderSetCustomLineItemShippingDetailsActionImpl.class)
public interface StagedOrderSetCustomLineItemShippingDetailsAction extends StagedOrderUpdateAction {

    /**
     * discriminator value for StagedOrderSetCustomLineItemShippingDetailsAction
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
     * @return instance of StagedOrderSetCustomLineItemShippingDetailsAction
     */
    public static StagedOrderSetCustomLineItemShippingDetailsAction of() {
        return new StagedOrderSetCustomLineItemShippingDetailsActionImpl();
    }

    /**
     * factory method to create a shallow copy StagedOrderSetCustomLineItemShippingDetailsAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static StagedOrderSetCustomLineItemShippingDetailsAction of(
            final StagedOrderSetCustomLineItemShippingDetailsAction template) {
        StagedOrderSetCustomLineItemShippingDetailsActionImpl instance = new StagedOrderSetCustomLineItemShippingDetailsActionImpl();
        instance.setCustomLineItemId(template.getCustomLineItemId());
        instance.setShippingDetails(template.getShippingDetails());
        return instance;
    }

    /**
     * factory method to create a deep copy of StagedOrderSetCustomLineItemShippingDetailsAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static StagedOrderSetCustomLineItemShippingDetailsAction deepCopy(
            @Nullable final StagedOrderSetCustomLineItemShippingDetailsAction template) {
        if (template == null) {
            return null;
        }
        StagedOrderSetCustomLineItemShippingDetailsActionImpl instance = new StagedOrderSetCustomLineItemShippingDetailsActionImpl();
        instance.setCustomLineItemId(template.getCustomLineItemId());
        instance.setShippingDetails(
            com.commercetools.api.models.cart.ItemShippingDetailsDraft.deepCopy(template.getShippingDetails()));
        return instance;
    }

    /**
     * builder factory method for StagedOrderSetCustomLineItemShippingDetailsAction
     * @return builder
     */
    public static StagedOrderSetCustomLineItemShippingDetailsActionBuilder builder() {
        return StagedOrderSetCustomLineItemShippingDetailsActionBuilder.of();
    }

    /**
     * create builder for StagedOrderSetCustomLineItemShippingDetailsAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StagedOrderSetCustomLineItemShippingDetailsActionBuilder builder(
            final StagedOrderSetCustomLineItemShippingDetailsAction template) {
        return StagedOrderSetCustomLineItemShippingDetailsActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withStagedOrderSetCustomLineItemShippingDetailsAction(
            Function<StagedOrderSetCustomLineItemShippingDetailsAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<StagedOrderSetCustomLineItemShippingDetailsAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StagedOrderSetCustomLineItemShippingDetailsAction>() {
            @Override
            public String toString() {
                return "TypeReference<StagedOrderSetCustomLineItemShippingDetailsAction>";
            }
        };
    }
}
