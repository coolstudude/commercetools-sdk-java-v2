
package com.commercetools.api.models.order;

import java.time.*;
import java.util.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.common.Address;
import com.commercetools.api.models.order.DeliveryItem;
import com.commercetools.api.models.order.OrderUpdateAction;
import com.commercetools.api.models.order.ParcelDraft;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class OrderAddDeliveryActionImpl implements OrderAddDeliveryAction {

    private String action;

    private java.util.List<com.commercetools.api.models.order.DeliveryItem> items;

    private com.commercetools.api.models.common.Address address;

    private java.util.List<com.commercetools.api.models.order.ParcelDraft> parcels;

    @JsonCreator
    OrderAddDeliveryActionImpl(
            @JsonProperty("items") final java.util.List<com.commercetools.api.models.order.DeliveryItem> items,
            @JsonProperty("address") final com.commercetools.api.models.common.Address address,
            @JsonProperty("parcels") final java.util.List<com.commercetools.api.models.order.ParcelDraft> parcels) {
        this.items = items;
        this.address = address;
        this.parcels = parcels;
        this.action = OrderAddDeliveryAction.ADD_DELIVERY;
    }

    public OrderAddDeliveryActionImpl() {
        this.action = OrderAddDeliveryAction.ADD_DELIVERY;
    }

    public String getAction() {
        return this.action;
    }

    public java.util.List<com.commercetools.api.models.order.DeliveryItem> getItems() {
        return this.items;
    }

    public com.commercetools.api.models.common.Address getAddress() {
        return this.address;
    }

    public java.util.List<com.commercetools.api.models.order.ParcelDraft> getParcels() {
        return this.parcels;
    }

    public void setItems(final com.commercetools.api.models.order.DeliveryItem... items) {
        this.items = new ArrayList<>(Arrays.asList(items));
    }

    public void setItems(final java.util.List<com.commercetools.api.models.order.DeliveryItem> items) {
        this.items = items;
    }

    public void setAddress(final com.commercetools.api.models.common.Address address) {
        this.address = address;
    }

    public void setParcels(final com.commercetools.api.models.order.ParcelDraft... parcels) {
        this.parcels = new ArrayList<>(Arrays.asList(parcels));
    }

    public void setParcels(final java.util.List<com.commercetools.api.models.order.ParcelDraft> parcels) {
        this.parcels = parcels;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        OrderAddDeliveryActionImpl that = (OrderAddDeliveryActionImpl) o;

        return new EqualsBuilder().append(action, that.action).append(items, that.items).append(address,
            that.address).append(parcels, that.parcels).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(items).append(address).append(parcels).toHashCode();
    }

}
