
package com.commercetools.api.models.order;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * OrderAddParcelToDeliveryAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderAddParcelToDeliveryAction orderAddParcelToDeliveryAction = OrderAddParcelToDeliveryAction.builder()
 *             .deliveryId("{deliveryId}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = OrderAddParcelToDeliveryActionImpl.class)
public interface OrderAddParcelToDeliveryAction extends OrderUpdateAction {

    /**
     * discriminator value for OrderAddParcelToDeliveryAction
     */
    String ADD_PARCEL_TO_DELIVERY = "addParcelToDelivery";

    /**
     *
     * @return deliveryId
     */
    @NotNull
    @JsonProperty("deliveryId")
    public String getDeliveryId();

    /**
     *
     * @return measurements
     */
    @Valid
    @JsonProperty("measurements")
    public ParcelMeasurements getMeasurements();

    /**
     *
     * @return trackingData
     */
    @Valid
    @JsonProperty("trackingData")
    public TrackingData getTrackingData();

    /**
     *
     * @return items
     */
    @Valid
    @JsonProperty("items")
    public List<DeliveryItem> getItems();

    /**
     * set deliveryId
     * @param deliveryId value to be set
     */

    public void setDeliveryId(final String deliveryId);

    /**
     * set measurements
     * @param measurements value to be set
     */

    public void setMeasurements(final ParcelMeasurements measurements);

    /**
     * set trackingData
     * @param trackingData value to be set
     */

    public void setTrackingData(final TrackingData trackingData);

    /**
     * set items
     * @param items values to be set
     */

    @JsonIgnore
    public void setItems(final DeliveryItem... items);

    /**
     * set items
     * @param items values to be set
     */

    public void setItems(final List<DeliveryItem> items);

    /**
     * factory method
     * @return instance of OrderAddParcelToDeliveryAction
     */
    public static OrderAddParcelToDeliveryAction of() {
        return new OrderAddParcelToDeliveryActionImpl();
    }

    /**
     * factory method to copy an instance of OrderAddParcelToDeliveryAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static OrderAddParcelToDeliveryAction of(final OrderAddParcelToDeliveryAction template) {
        OrderAddParcelToDeliveryActionImpl instance = new OrderAddParcelToDeliveryActionImpl();
        instance.setDeliveryId(template.getDeliveryId());
        instance.setMeasurements(template.getMeasurements());
        instance.setTrackingData(template.getTrackingData());
        instance.setItems(template.getItems());
        return instance;
    }

    /**
     * builder factory method for OrderAddParcelToDeliveryAction
     * @return builder
     */
    public static OrderAddParcelToDeliveryActionBuilder builder() {
        return OrderAddParcelToDeliveryActionBuilder.of();
    }

    /**
     * create builder for OrderAddParcelToDeliveryAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static OrderAddParcelToDeliveryActionBuilder builder(final OrderAddParcelToDeliveryAction template) {
        return OrderAddParcelToDeliveryActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withOrderAddParcelToDeliveryAction(Function<OrderAddParcelToDeliveryAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<OrderAddParcelToDeliveryAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<OrderAddParcelToDeliveryAction>() {
            @Override
            public String toString() {
                return "TypeReference<OrderAddParcelToDeliveryAction>";
            }
        };
    }
}
