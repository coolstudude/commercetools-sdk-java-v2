
package com.commercetools.api.models.order;

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
 * OrderSetParcelTrackingDataAction
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class OrderSetParcelTrackingDataActionImpl implements OrderSetParcelTrackingDataAction, ModelBase {

    private String action;

    private String parcelId;

    private String parcelKey;

    private com.commercetools.api.models.order.TrackingData trackingData;

    /**
     * create instance with all properties
     */
    @JsonCreator
    OrderSetParcelTrackingDataActionImpl(@JsonProperty("parcelId") final String parcelId,
            @JsonProperty("parcelKey") final String parcelKey,
            @JsonProperty("trackingData") final com.commercetools.api.models.order.TrackingData trackingData) {
        this.parcelId = parcelId;
        this.parcelKey = parcelKey;
        this.trackingData = trackingData;
        this.action = SET_PARCEL_TRACKING_DATA;
    }

    /**
     * create empty instance
     */
    public OrderSetParcelTrackingDataActionImpl() {
        this.action = SET_PARCEL_TRACKING_DATA;
    }

    /**
     *
     */

    public String getAction() {
        return this.action;
    }

    /**
     *  <p>Either <code>parcelId</code> or <code>parcelKey</code> is required for this update action.</p>
     */

    public String getParcelId() {
        return this.parcelId;
    }

    /**
     *  <p>Either <code>parcelId</code> or <code>parcelKey</code> is required for this update action.</p>
     */

    public String getParcelKey() {
        return this.parcelKey;
    }

    /**
     *
     */

    public com.commercetools.api.models.order.TrackingData getTrackingData() {
        return this.trackingData;
    }

    public void setParcelId(final String parcelId) {
        this.parcelId = parcelId;
    }

    public void setParcelKey(final String parcelKey) {
        this.parcelKey = parcelKey;
    }

    public void setTrackingData(final com.commercetools.api.models.order.TrackingData trackingData) {
        this.trackingData = trackingData;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        OrderSetParcelTrackingDataActionImpl that = (OrderSetParcelTrackingDataActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(parcelId, that.parcelId)
                .append(parcelKey, that.parcelKey)
                .append(trackingData, that.trackingData)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action)
                .append(parcelId)
                .append(parcelKey)
                .append(trackingData)
                .toHashCode();
    }

}
