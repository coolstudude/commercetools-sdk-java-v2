
package com.commercetools.api.models.order;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * OrderRemoveParcelFromDeliveryAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderRemoveParcelFromDeliveryAction orderRemoveParcelFromDeliveryAction = OrderRemoveParcelFromDeliveryAction.builder()
 *             .parcelId("{parcelId}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = OrderRemoveParcelFromDeliveryActionImpl.class)
public interface OrderRemoveParcelFromDeliveryAction extends OrderUpdateAction {

    /**
     * discriminator value for OrderRemoveParcelFromDeliveryAction
     */
    String REMOVE_PARCEL_FROM_DELIVERY = "removeParcelFromDelivery";

    /**
     *
     * @return parcelId
     */
    @NotNull
    @JsonProperty("parcelId")
    public String getParcelId();

    /**
     * set parcelId
     * @param parcelId value to be set
     */

    public void setParcelId(final String parcelId);

    /**
     * factory method
     * @return instance of OrderRemoveParcelFromDeliveryAction
     */
    public static OrderRemoveParcelFromDeliveryAction of() {
        return new OrderRemoveParcelFromDeliveryActionImpl();
    }

    /**
     * factory method to copy an instance of OrderRemoveParcelFromDeliveryAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static OrderRemoveParcelFromDeliveryAction of(final OrderRemoveParcelFromDeliveryAction template) {
        OrderRemoveParcelFromDeliveryActionImpl instance = new OrderRemoveParcelFromDeliveryActionImpl();
        instance.setParcelId(template.getParcelId());
        return instance;
    }

    /**
     * builder factory method for OrderRemoveParcelFromDeliveryAction
     * @return builder
     */
    public static OrderRemoveParcelFromDeliveryActionBuilder builder() {
        return OrderRemoveParcelFromDeliveryActionBuilder.of();
    }

    /**
     * create builder for OrderRemoveParcelFromDeliveryAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static OrderRemoveParcelFromDeliveryActionBuilder builder(
            final OrderRemoveParcelFromDeliveryAction template) {
        return OrderRemoveParcelFromDeliveryActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withOrderRemoveParcelFromDeliveryAction(Function<OrderRemoveParcelFromDeliveryAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<OrderRemoveParcelFromDeliveryAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<OrderRemoveParcelFromDeliveryAction>() {
            @Override
            public String toString() {
                return "TypeReference<OrderRemoveParcelFromDeliveryAction>";
            }
        };
    }
}
