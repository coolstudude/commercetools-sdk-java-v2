
package com.commercetools.api.models.order;

import java.io.IOException;
import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.order.DeliveryItem;
import com.commercetools.api.models.order.OrderAddParcelToDeliveryActionImpl;
import com.commercetools.api.models.order.OrderUpdateAction;
import com.commercetools.api.models.order.ParcelMeasurements;
import com.commercetools.api.models.order.TrackingData;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.Accessor;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = OrderAddParcelToDeliveryActionImpl.class)
public interface OrderAddParcelToDeliveryAction extends OrderUpdateAction {

    String ADD_PARCEL_TO_DELIVERY = "addParcelToDelivery";

    @NotNull
    @JsonProperty("deliveryId")
    public String getDeliveryId();

    @Valid
    @JsonProperty("measurements")
    public ParcelMeasurements getMeasurements();

    @Valid
    @JsonProperty("trackingData")
    public TrackingData getTrackingData();

    @Valid
    @JsonProperty("items")
    public List<DeliveryItem> getItems();

    public void setDeliveryId(final String deliveryId);

    public void setMeasurements(final ParcelMeasurements measurements);

    public void setTrackingData(final TrackingData trackingData);

    @JsonIgnore
    public void setItems(final DeliveryItem... items);

    public void setItems(final List<DeliveryItem> items);

    public static OrderAddParcelToDeliveryAction of() {
        return new OrderAddParcelToDeliveryActionImpl();
    }

    public static OrderAddParcelToDeliveryAction of(final OrderAddParcelToDeliveryAction template) {
        OrderAddParcelToDeliveryActionImpl instance = new OrderAddParcelToDeliveryActionImpl();
        instance.setDeliveryId(template.getDeliveryId());
        instance.setMeasurements(template.getMeasurements());
        instance.setTrackingData(template.getTrackingData());
        instance.setItems(template.getItems());
        return instance;
    }

    public static OrderAddParcelToDeliveryActionBuilder builder() {
        return OrderAddParcelToDeliveryActionBuilder.of();
    }

    public static OrderAddParcelToDeliveryActionBuilder builder(final OrderAddParcelToDeliveryAction template) {
        return OrderAddParcelToDeliveryActionBuilder.of(template);
    }

    default <T> T withOrderAddParcelToDeliveryAction(Function<OrderAddParcelToDeliveryAction, T> helper) {
        return helper.apply(this);
    }
}
