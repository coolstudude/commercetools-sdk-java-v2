
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
 * StagedOrderAddDeliveryAction
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StagedOrderAddDeliveryActionImpl implements StagedOrderAddDeliveryAction, ModelBase {

    private String action;

    private String deliveryKey;

    private java.util.List<com.commercetools.api.models.order.DeliveryItem> items;

    private com.commercetools.api.models.common.BaseAddress address;

    private java.util.List<com.commercetools.api.models.order.ParcelDraft> parcels;

    private com.commercetools.api.models.type.CustomFieldsDraft custom;

    /**
     * create instance with all properties
     */
    @JsonCreator
    StagedOrderAddDeliveryActionImpl(@JsonProperty("deliveryKey") final String deliveryKey,
            @JsonProperty("items") final java.util.List<com.commercetools.api.models.order.DeliveryItem> items,
            @JsonProperty("address") final com.commercetools.api.models.common.BaseAddress address,
            @JsonProperty("parcels") final java.util.List<com.commercetools.api.models.order.ParcelDraft> parcels,
            @JsonProperty("custom") final com.commercetools.api.models.type.CustomFieldsDraft custom) {
        this.deliveryKey = deliveryKey;
        this.items = items;
        this.address = address;
        this.parcels = parcels;
        this.custom = custom;
        this.action = ADD_DELIVERY;
    }

    /**
     * create empty instance
     */
    public StagedOrderAddDeliveryActionImpl() {
        this.action = ADD_DELIVERY;
    }

    /**
     *
     */

    public String getAction() {
        return this.action;
    }

    /**
     *  <p>User-defined unique identifier of a Delivery.</p>
     */

    public String getDeliveryKey() {
        return this.deliveryKey;
    }

    /**
     *
     */

    public java.util.List<com.commercetools.api.models.order.DeliveryItem> getItems() {
        return this.items;
    }

    /**
     *  <p>Polymorphic base type that represents a postal address and contact details. Depending on the read or write action, it can be either Address or AddressDraft that only differ in the data type for the optional <code>custom</code> field.</p>
     */

    public com.commercetools.api.models.common.BaseAddress getAddress() {
        return this.address;
    }

    /**
     *
     */

    public java.util.List<com.commercetools.api.models.order.ParcelDraft> getParcels() {
        return this.parcels;
    }

    /**
     *  <p>Custom Fields for the Transaction.</p>
     */

    public com.commercetools.api.models.type.CustomFieldsDraft getCustom() {
        return this.custom;
    }

    public void setDeliveryKey(final String deliveryKey) {
        this.deliveryKey = deliveryKey;
    }

    public void setItems(final com.commercetools.api.models.order.DeliveryItem... items) {
        this.items = new ArrayList<>(Arrays.asList(items));
    }

    public void setItems(final java.util.List<com.commercetools.api.models.order.DeliveryItem> items) {
        this.items = items;
    }

    public void setAddress(final com.commercetools.api.models.common.BaseAddress address) {
        this.address = address;
    }

    public void setParcels(final com.commercetools.api.models.order.ParcelDraft... parcels) {
        this.parcels = new ArrayList<>(Arrays.asList(parcels));
    }

    public void setParcels(final java.util.List<com.commercetools.api.models.order.ParcelDraft> parcels) {
        this.parcels = parcels;
    }

    public void setCustom(final com.commercetools.api.models.type.CustomFieldsDraft custom) {
        this.custom = custom;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        StagedOrderAddDeliveryActionImpl that = (StagedOrderAddDeliveryActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(deliveryKey, that.deliveryKey)
                .append(items, that.items)
                .append(address, that.address)
                .append(parcels, that.parcels)
                .append(custom, that.custom)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action)
                .append(deliveryKey)
                .append(items)
                .append(address)
                .append(parcels)
                .append(custom)
                .toHashCode();
    }

}
