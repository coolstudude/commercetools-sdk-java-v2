
package com.commercetools.api.models.order_edit;

import java.time.*;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.annotation.Nullable;
import javax.validation.Valid;

import com.commercetools.api.models.order.DeliveryItem;
import com.commercetools.api.models.order.ParcelMeasurements;
import com.commercetools.api.models.order.StagedOrderUpdateAction;
import com.commercetools.api.models.order.TrackingData;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * StagedOrderAddParcelToDeliveryAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StagedOrderAddParcelToDeliveryAction stagedOrderAddParcelToDeliveryAction = StagedOrderAddParcelToDeliveryAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = StagedOrderAddParcelToDeliveryActionImpl.class)
public interface StagedOrderAddParcelToDeliveryAction extends StagedOrderUpdateAction {

    /**
     * discriminator value for StagedOrderAddParcelToDeliveryAction
     */
    String ADD_PARCEL_TO_DELIVERY = "addParcelToDelivery";

    /**
     *  <p>Either <code>deliveryId</code> or <code>deliveryKey</code> is required for this update action.</p>
     * @return deliveryId
     */

    @JsonProperty("deliveryId")
    public String getDeliveryId();

    /**
     *  <p>Either <code>deliveryId</code> or <code>deliveryKey</code> is required for this update action.</p>
     * @return deliveryKey
     */

    @JsonProperty("deliveryKey")
    public String getDeliveryKey();

    /**
     *
     * @return parcelKey
     */

    @JsonProperty("parcelKey")
    public String getParcelKey();

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
     *  <p>Either <code>deliveryId</code> or <code>deliveryKey</code> is required for this update action.</p>
     * @param deliveryId value to be set
     */

    public void setDeliveryId(final String deliveryId);

    /**
     *  <p>Either <code>deliveryId</code> or <code>deliveryKey</code> is required for this update action.</p>
     * @param deliveryKey value to be set
     */

    public void setDeliveryKey(final String deliveryKey);

    /**
     * set parcelKey
     * @param parcelKey value to be set
     */

    public void setParcelKey(final String parcelKey);

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
     * @return instance of StagedOrderAddParcelToDeliveryAction
     */
    public static StagedOrderAddParcelToDeliveryAction of() {
        return new StagedOrderAddParcelToDeliveryActionImpl();
    }

    /**
     * factory method to create a shallow copy StagedOrderAddParcelToDeliveryAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static StagedOrderAddParcelToDeliveryAction of(final StagedOrderAddParcelToDeliveryAction template) {
        StagedOrderAddParcelToDeliveryActionImpl instance = new StagedOrderAddParcelToDeliveryActionImpl();
        instance.setDeliveryId(template.getDeliveryId());
        instance.setDeliveryKey(template.getDeliveryKey());
        instance.setParcelKey(template.getParcelKey());
        instance.setMeasurements(template.getMeasurements());
        instance.setTrackingData(template.getTrackingData());
        instance.setItems(template.getItems());
        return instance;
    }

    /**
     * factory method to create a deep copy of StagedOrderAddParcelToDeliveryAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static StagedOrderAddParcelToDeliveryAction deepCopy(
            @Nullable final StagedOrderAddParcelToDeliveryAction template) {
        if (template == null) {
            return null;
        }
        StagedOrderAddParcelToDeliveryActionImpl instance = new StagedOrderAddParcelToDeliveryActionImpl();
        instance.setDeliveryId(template.getDeliveryId());
        instance.setDeliveryKey(template.getDeliveryKey());
        instance.setParcelKey(template.getParcelKey());
        instance.setMeasurements(
            com.commercetools.api.models.order.ParcelMeasurements.deepCopy(template.getMeasurements()));
        instance.setTrackingData(com.commercetools.api.models.order.TrackingData.deepCopy(template.getTrackingData()));
        instance.setItems(Optional.ofNullable(template.getItems())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.order.DeliveryItem::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for StagedOrderAddParcelToDeliveryAction
     * @return builder
     */
    public static StagedOrderAddParcelToDeliveryActionBuilder builder() {
        return StagedOrderAddParcelToDeliveryActionBuilder.of();
    }

    /**
     * create builder for StagedOrderAddParcelToDeliveryAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StagedOrderAddParcelToDeliveryActionBuilder builder(
            final StagedOrderAddParcelToDeliveryAction template) {
        return StagedOrderAddParcelToDeliveryActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withStagedOrderAddParcelToDeliveryAction(Function<StagedOrderAddParcelToDeliveryAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<StagedOrderAddParcelToDeliveryAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StagedOrderAddParcelToDeliveryAction>() {
            @Override
            public String toString() {
                return "TypeReference<StagedOrderAddParcelToDeliveryAction>";
            }
        };
    }
}
