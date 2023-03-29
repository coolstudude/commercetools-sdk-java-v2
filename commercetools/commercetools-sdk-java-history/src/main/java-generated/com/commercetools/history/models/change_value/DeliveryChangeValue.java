
package com.commercetools.history.models.change_value;

import java.time.*;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.annotation.Nullable;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.history.models.common.Address;
import com.commercetools.history.models.common.DeliveryItem;
import com.commercetools.history.models.common.Parcel;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * DeliveryChangeValue
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     DeliveryChangeValue deliveryChangeValue = DeliveryChangeValue.builder()
 *             .plusItems(itemsBuilder -> itemsBuilder)
 *             .address(addressBuilder -> addressBuilder)
 *             .plusParcels(parcelsBuilder -> parcelsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = DeliveryChangeValueImpl.class)
public interface DeliveryChangeValue {

    /**
     *
     * @return items
     */
    @NotNull
    @Valid
    @JsonProperty("items")
    public List<DeliveryItem> getItems();

    /**
     *
     * @return address
     */
    @NotNull
    @Valid
    @JsonProperty("address")
    public Address getAddress();

    /**
     *
     * @return parcels
     */
    @NotNull
    @Valid
    @JsonProperty("parcels")
    public List<Parcel> getParcels();

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
     * set address
     * @param address value to be set
     */

    public void setAddress(final Address address);

    /**
     * set parcels
     * @param parcels values to be set
     */

    @JsonIgnore
    public void setParcels(final Parcel... parcels);

    /**
     * set parcels
     * @param parcels values to be set
     */

    public void setParcels(final List<Parcel> parcels);

    /**
     * factory method
     * @return instance of DeliveryChangeValue
     */
    public static DeliveryChangeValue of() {
        return new DeliveryChangeValueImpl();
    }

    /**
     * factory method to create a shallow copy DeliveryChangeValue
     * @param template instance to be copied
     * @return copy instance
     */
    public static DeliveryChangeValue of(final DeliveryChangeValue template) {
        DeliveryChangeValueImpl instance = new DeliveryChangeValueImpl();
        instance.setItems(template.getItems());
        instance.setAddress(template.getAddress());
        instance.setParcels(template.getParcels());
        return instance;
    }

    /**
     * factory method to create a deep copy of DeliveryChangeValue
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static DeliveryChangeValue deepCopy(@Nullable final DeliveryChangeValue template) {
        if (template == null) {
            return null;
        }
        DeliveryChangeValueImpl instance = new DeliveryChangeValueImpl();
        instance.setItems(Optional.ofNullable(template.getItems())
                .map(t -> t.stream()
                        .map(com.commercetools.history.models.common.DeliveryItem::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        instance.setAddress(Optional.ofNullable(template.getAddress())
                .map(com.commercetools.history.models.common.Address::deepCopy)
                .orElse(null));
        instance.setParcels(Optional.ofNullable(template.getParcels())
                .map(t -> t.stream()
                        .map(com.commercetools.history.models.common.Parcel::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for DeliveryChangeValue
     * @return builder
     */
    public static DeliveryChangeValueBuilder builder() {
        return DeliveryChangeValueBuilder.of();
    }

    /**
     * create builder for DeliveryChangeValue instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static DeliveryChangeValueBuilder builder(final DeliveryChangeValue template) {
        return DeliveryChangeValueBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withDeliveryChangeValue(Function<DeliveryChangeValue, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<DeliveryChangeValue> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<DeliveryChangeValue>() {
            @Override
            public String toString() {
                return "TypeReference<DeliveryChangeValue>";
            }
        };
    }
}
