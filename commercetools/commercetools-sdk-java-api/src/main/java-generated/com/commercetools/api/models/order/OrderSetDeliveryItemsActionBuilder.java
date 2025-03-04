
package com.commercetools.api.models.order;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * OrderSetDeliveryItemsActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderSetDeliveryItemsAction orderSetDeliveryItemsAction = OrderSetDeliveryItemsAction.builder()
 *             .plusItems(itemsBuilder -> itemsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class OrderSetDeliveryItemsActionBuilder implements Builder<OrderSetDeliveryItemsAction> {

    @Nullable
    private String deliveryId;

    @Nullable
    private String deliveryKey;

    private java.util.List<com.commercetools.api.models.order.DeliveryItem> items;

    /**
     *  <p>Either <code>deliveryId</code> or <code>deliveryKey</code> is required for this update action.</p>
     * @param deliveryId value to be set
     * @return Builder
     */

    public OrderSetDeliveryItemsActionBuilder deliveryId(@Nullable final String deliveryId) {
        this.deliveryId = deliveryId;
        return this;
    }

    /**
     *  <p>Either <code>deliveryId</code> or <code>deliveryKey</code> is required for this update action.</p>
     * @param deliveryKey value to be set
     * @return Builder
     */

    public OrderSetDeliveryItemsActionBuilder deliveryKey(@Nullable final String deliveryKey) {
        this.deliveryKey = deliveryKey;
        return this;
    }

    /**
     * set values to the items
     * @param items value to be set
     * @return Builder
     */

    public OrderSetDeliveryItemsActionBuilder items(final com.commercetools.api.models.order.DeliveryItem... items) {
        this.items = new ArrayList<>(Arrays.asList(items));
        return this;
    }

    /**
     * set value to the items
     * @param items value to be set
     * @return Builder
     */

    public OrderSetDeliveryItemsActionBuilder items(
            final java.util.List<com.commercetools.api.models.order.DeliveryItem> items) {
        this.items = items;
        return this;
    }

    /**
     * add values to the items
     * @param items value to be set
     * @return Builder
     */

    public OrderSetDeliveryItemsActionBuilder plusItems(
            final com.commercetools.api.models.order.DeliveryItem... items) {
        if (this.items == null) {
            this.items = new ArrayList<>();
        }
        this.items.addAll(Arrays.asList(items));
        return this;
    }

    /**
     * add the value to the items using the builder function
     * @param builder function to build the items value
     * @return Builder
     */

    public OrderSetDeliveryItemsActionBuilder plusItems(
            Function<com.commercetools.api.models.order.DeliveryItemBuilder, com.commercetools.api.models.order.DeliveryItemBuilder> builder) {
        if (this.items == null) {
            this.items = new ArrayList<>();
        }
        this.items.add(builder.apply(com.commercetools.api.models.order.DeliveryItemBuilder.of()).build());
        return this;
    }

    /**
     * set the value to the items using the builder function
     * @param builder function to build the items value
     * @return Builder
     */

    public OrderSetDeliveryItemsActionBuilder withItems(
            Function<com.commercetools.api.models.order.DeliveryItemBuilder, com.commercetools.api.models.order.DeliveryItemBuilder> builder) {
        this.items = new ArrayList<>();
        this.items.add(builder.apply(com.commercetools.api.models.order.DeliveryItemBuilder.of()).build());
        return this;
    }

    /**
     * add the value to the items using the builder function
     * @param builder function to build the items value
     * @return Builder
     */

    public OrderSetDeliveryItemsActionBuilder addItems(
            Function<com.commercetools.api.models.order.DeliveryItemBuilder, com.commercetools.api.models.order.DeliveryItem> builder) {
        return plusItems(builder.apply(com.commercetools.api.models.order.DeliveryItemBuilder.of()));
    }

    /**
     * set the value to the items using the builder function
     * @param builder function to build the items value
     * @return Builder
     */

    public OrderSetDeliveryItemsActionBuilder setItems(
            Function<com.commercetools.api.models.order.DeliveryItemBuilder, com.commercetools.api.models.order.DeliveryItem> builder) {
        return items(builder.apply(com.commercetools.api.models.order.DeliveryItemBuilder.of()));
    }

    /**
     *  <p>Either <code>deliveryId</code> or <code>deliveryKey</code> is required for this update action.</p>
     * @return deliveryId
     */

    @Nullable
    public String getDeliveryId() {
        return this.deliveryId;
    }

    /**
     *  <p>Either <code>deliveryId</code> or <code>deliveryKey</code> is required for this update action.</p>
     * @return deliveryKey
     */

    @Nullable
    public String getDeliveryKey() {
        return this.deliveryKey;
    }

    /**
     * value of items}
     * @return items
     */

    public java.util.List<com.commercetools.api.models.order.DeliveryItem> getItems() {
        return this.items;
    }

    /**
     * builds OrderSetDeliveryItemsAction with checking for non-null required values
     * @return OrderSetDeliveryItemsAction
     */
    public OrderSetDeliveryItemsAction build() {
        Objects.requireNonNull(items, OrderSetDeliveryItemsAction.class + ": items is missing");
        return new OrderSetDeliveryItemsActionImpl(deliveryId, deliveryKey, items);
    }

    /**
     * builds OrderSetDeliveryItemsAction without checking for non-null required values
     * @return OrderSetDeliveryItemsAction
     */
    public OrderSetDeliveryItemsAction buildUnchecked() {
        return new OrderSetDeliveryItemsActionImpl(deliveryId, deliveryKey, items);
    }

    /**
     * factory method for an instance of OrderSetDeliveryItemsActionBuilder
     * @return builder
     */
    public static OrderSetDeliveryItemsActionBuilder of() {
        return new OrderSetDeliveryItemsActionBuilder();
    }

    /**
     * create builder for OrderSetDeliveryItemsAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static OrderSetDeliveryItemsActionBuilder of(final OrderSetDeliveryItemsAction template) {
        OrderSetDeliveryItemsActionBuilder builder = new OrderSetDeliveryItemsActionBuilder();
        builder.deliveryId = template.getDeliveryId();
        builder.deliveryKey = template.getDeliveryKey();
        builder.items = template.getItems();
        return builder;
    }

}
