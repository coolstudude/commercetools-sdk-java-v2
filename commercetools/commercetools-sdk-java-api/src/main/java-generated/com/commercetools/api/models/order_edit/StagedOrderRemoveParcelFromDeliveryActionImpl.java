
package com.commercetools.api.models.order_edit;

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
 * StagedOrderRemoveParcelFromDeliveryAction
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StagedOrderRemoveParcelFromDeliveryActionImpl
        implements StagedOrderRemoveParcelFromDeliveryAction, ModelBase {

    private String action;

    private String parcelId;

    private String parcelKey;

    /**
     * create instance with all properties
     */
    @JsonCreator
    StagedOrderRemoveParcelFromDeliveryActionImpl(@JsonProperty("parcelId") final String parcelId,
            @JsonProperty("parcelKey") final String parcelKey) {
        this.parcelId = parcelId;
        this.parcelKey = parcelKey;
        this.action = REMOVE_PARCEL_FROM_DELIVERY;
    }

    /**
     * create empty instance
     */
    public StagedOrderRemoveParcelFromDeliveryActionImpl() {
        this.action = REMOVE_PARCEL_FROM_DELIVERY;
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

    public void setParcelId(final String parcelId) {
        this.parcelId = parcelId;
    }

    public void setParcelKey(final String parcelKey) {
        this.parcelKey = parcelKey;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        StagedOrderRemoveParcelFromDeliveryActionImpl that = (StagedOrderRemoveParcelFromDeliveryActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(parcelId, that.parcelId)
                .append(parcelKey, that.parcelKey)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(parcelId).append(parcelKey).toHashCode();
    }

}
