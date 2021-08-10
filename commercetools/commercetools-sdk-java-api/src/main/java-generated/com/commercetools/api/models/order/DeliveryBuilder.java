
package com.commercetools.api.models.order;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class DeliveryBuilder implements Builder<Delivery> {

    private String id;

    private java.time.ZonedDateTime createdAt;

    private java.util.List<com.commercetools.api.models.order.DeliveryItem> items;

    private java.util.List<com.commercetools.api.models.order.Parcel> parcels;

    @Nullable
    private com.commercetools.api.models.common.Address address;

    public DeliveryBuilder id(final String id) {
        this.id = id;
        return this;
    }

    public DeliveryBuilder createdAt(final java.time.ZonedDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    public DeliveryBuilder items(final com.commercetools.api.models.order.DeliveryItem... items) {
        this.items = new ArrayList<>(Arrays.asList(items));
        return this;
    }

    public DeliveryBuilder items(final java.util.List<com.commercetools.api.models.order.DeliveryItem> items) {
        this.items = items;
        return this;
    }

    public DeliveryBuilder parcels(final com.commercetools.api.models.order.Parcel... parcels) {
        this.parcels = new ArrayList<>(Arrays.asList(parcels));
        return this;
    }

    public DeliveryBuilder parcels(final java.util.List<com.commercetools.api.models.order.Parcel> parcels) {
        this.parcels = parcels;
        return this;
    }

    public DeliveryBuilder address(@Nullable final com.commercetools.api.models.common.Address address) {
        this.address = address;
        return this;
    }

    public String getId() {
        return this.id;
    }

    public java.time.ZonedDateTime getCreatedAt() {
        return this.createdAt;
    }

    public java.util.List<com.commercetools.api.models.order.DeliveryItem> getItems() {
        return this.items;
    }

    public java.util.List<com.commercetools.api.models.order.Parcel> getParcels() {
        return this.parcels;
    }

    @Nullable
    public com.commercetools.api.models.common.Address getAddress() {
        return this.address;
    }

    public Delivery build() {
        Objects.requireNonNull(id);
        Objects.requireNonNull(createdAt);
        Objects.requireNonNull(items);
        Objects.requireNonNull(parcels);
        return new DeliveryImpl(id, createdAt, items, parcels, address);
    }

    /**
     * builds Delivery without checking for non null required values
     */
    public Delivery buildUnchecked() {
        return new DeliveryImpl(id, createdAt, items, parcels, address);
    }

    public static DeliveryBuilder of() {
        return new DeliveryBuilder();
    }

    public static DeliveryBuilder of(final Delivery template) {
        DeliveryBuilder builder = new DeliveryBuilder();
        builder.id = template.getId();
        builder.createdAt = template.getCreatedAt();
        builder.items = template.getItems();
        builder.parcels = template.getParcels();
        builder.address = template.getAddress();
        return builder;
    }

}
