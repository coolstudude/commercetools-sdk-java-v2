
package com.commercetools.api.models.order_edit;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.Valid;

import com.commercetools.api.models.cart.ShippingRateInputDraft;
import com.commercetools.api.models.order.StagedOrderUpdateAction;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * StagedOrderSetShippingRateInputAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StagedOrderSetShippingRateInputAction stagedOrderSetShippingRateInputAction = StagedOrderSetShippingRateInputAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = StagedOrderSetShippingRateInputActionImpl.class)
public interface StagedOrderSetShippingRateInputAction extends StagedOrderUpdateAction {

    /**
     * discriminator value for StagedOrderSetShippingRateInputAction
     */
    String SET_SHIPPING_RATE_INPUT = "setShippingRateInput";

    /**
     *  <p>Generic type holding specifc ShippingRateInputDraft types.</p>
     * @return shippingRateInput
     */
    @Valid
    @JsonProperty("shippingRateInput")
    public ShippingRateInputDraft getShippingRateInput();

    /**
     *  <p>Generic type holding specifc ShippingRateInputDraft types.</p>
     * @param shippingRateInput value to be set
     */

    public void setShippingRateInput(final ShippingRateInputDraft shippingRateInput);

    /**
     * factory method
     * @return instance of StagedOrderSetShippingRateInputAction
     */
    public static StagedOrderSetShippingRateInputAction of() {
        return new StagedOrderSetShippingRateInputActionImpl();
    }

    /**
     * factory method to create a shallow copy StagedOrderSetShippingRateInputAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static StagedOrderSetShippingRateInputAction of(final StagedOrderSetShippingRateInputAction template) {
        StagedOrderSetShippingRateInputActionImpl instance = new StagedOrderSetShippingRateInputActionImpl();
        instance.setShippingRateInput(template.getShippingRateInput());
        return instance;
    }

    /**
     * factory method to create a deep copy of StagedOrderSetShippingRateInputAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static StagedOrderSetShippingRateInputAction deepCopy(
            @Nullable final StagedOrderSetShippingRateInputAction template) {
        if (template == null) {
            return null;
        }
        StagedOrderSetShippingRateInputActionImpl instance = new StagedOrderSetShippingRateInputActionImpl();
        instance.setShippingRateInput(
            com.commercetools.api.models.cart.ShippingRateInputDraft.deepCopy(template.getShippingRateInput()));
        return instance;
    }

    /**
     * builder factory method for StagedOrderSetShippingRateInputAction
     * @return builder
     */
    public static StagedOrderSetShippingRateInputActionBuilder builder() {
        return StagedOrderSetShippingRateInputActionBuilder.of();
    }

    /**
     * create builder for StagedOrderSetShippingRateInputAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StagedOrderSetShippingRateInputActionBuilder builder(
            final StagedOrderSetShippingRateInputAction template) {
        return StagedOrderSetShippingRateInputActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withStagedOrderSetShippingRateInputAction(Function<StagedOrderSetShippingRateInputAction, T> helper) {
        return helper.apply(this);
    }

    public static StagedOrderSetShippingRateInputAction ofUnset() {
        return StagedOrderSetShippingRateInputAction.of();
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<StagedOrderSetShippingRateInputAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StagedOrderSetShippingRateInputAction>() {
            @Override
            public String toString() {
                return "TypeReference<StagedOrderSetShippingRateInputAction>";
            }
        };
    }
}
