
package com.commercetools.importapi.models.order_patches;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.ModelBase;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
 * DeliveryParcelDraft
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class DeliveryParcelDraftImpl implements DeliveryParcelDraft, ModelBase {

    private com.commercetools.importapi.models.orders.ParcelMeasurements measurements;

    private com.commercetools.importapi.models.orders.TrackingData trackingData;

    private java.util.List<com.commercetools.importapi.models.orders.DeliveryItem> items;

    /**
     * create instance with all properties
     */
    @JsonCreator
    DeliveryParcelDraftImpl(
            @JsonProperty("measurements") final com.commercetools.importapi.models.orders.ParcelMeasurements measurements,
            @JsonProperty("trackingData") final com.commercetools.importapi.models.orders.TrackingData trackingData,
            @JsonProperty("items") final java.util.List<com.commercetools.importapi.models.orders.DeliveryItem> items) {
        this.measurements = measurements;
        this.trackingData = trackingData;
        this.items = items;
    }

    /**
     * create empty instance
     */
    public DeliveryParcelDraftImpl() {
    }

    /**
     *
     */

    public com.commercetools.importapi.models.orders.ParcelMeasurements getMeasurements() {
        return this.measurements;
    }

    /**
     *
     */

    public com.commercetools.importapi.models.orders.TrackingData getTrackingData() {
        return this.trackingData;
    }

    /**
     *
     */

    public java.util.List<com.commercetools.importapi.models.orders.DeliveryItem> getItems() {
        return this.items;
    }

    public void setMeasurements(final com.commercetools.importapi.models.orders.ParcelMeasurements measurements) {
        this.measurements = measurements;
    }

    public void setTrackingData(final com.commercetools.importapi.models.orders.TrackingData trackingData) {
        this.trackingData = trackingData;
    }

    public void setItems(final com.commercetools.importapi.models.orders.DeliveryItem... items) {
        this.items = new ArrayList<>(Arrays.asList(items));
    }

    public void setItems(final java.util.List<com.commercetools.importapi.models.orders.DeliveryItem> items) {
        this.items = items;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        DeliveryParcelDraftImpl that = (DeliveryParcelDraftImpl) o;

        return new EqualsBuilder().append(measurements, that.measurements)
                .append(trackingData, that.trackingData)
                .append(items, that.items)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(measurements).append(trackingData).append(items).toHashCode();
    }

}
