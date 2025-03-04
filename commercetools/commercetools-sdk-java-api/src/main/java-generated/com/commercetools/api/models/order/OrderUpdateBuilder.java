
package com.commercetools.api.models.order;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * OrderUpdateBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderUpdate orderUpdate = OrderUpdate.builder()
 *             .version(0.3)
 *             .plusActions(actionsBuilder -> actionsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class OrderUpdateBuilder implements Builder<OrderUpdate> {

    private Long version;

    private java.util.List<com.commercetools.api.models.order.OrderUpdateAction> actions;

    /**
     *  <p>Expected version of the Order on which the changes should be applied. If the expected version does not match the actual version, a 409 Conflict error will be returned.</p>
     * @param version value to be set
     * @return Builder
     */

    public OrderUpdateBuilder version(final Long version) {
        this.version = version;
        return this;
    }

    /**
     *  <p>Update actions to be performed on the Order.</p>
     * @param actions value to be set
     * @return Builder
     */

    public OrderUpdateBuilder actions(final com.commercetools.api.models.order.OrderUpdateAction... actions) {
        this.actions = new ArrayList<>(Arrays.asList(actions));
        return this;
    }

    /**
     *  <p>Update actions to be performed on the Order.</p>
     * @param actions value to be set
     * @return Builder
     */

    public OrderUpdateBuilder actions(
            final java.util.List<com.commercetools.api.models.order.OrderUpdateAction> actions) {
        this.actions = actions;
        return this;
    }

    /**
     *  <p>Update actions to be performed on the Order.</p>
     * @param actions value to be set
     * @return Builder
     */

    public OrderUpdateBuilder plusActions(final com.commercetools.api.models.order.OrderUpdateAction... actions) {
        if (this.actions == null) {
            this.actions = new ArrayList<>();
        }
        this.actions.addAll(Arrays.asList(actions));
        return this;
    }

    /**
     *  <p>Update actions to be performed on the Order.</p>
     * @param builder function to build the actions value
     * @return Builder
     */

    public OrderUpdateBuilder plusActions(
            Function<com.commercetools.api.models.order.OrderUpdateActionBuilder, Builder<? extends com.commercetools.api.models.order.OrderUpdateAction>> builder) {
        if (this.actions == null) {
            this.actions = new ArrayList<>();
        }
        this.actions.add(builder.apply(com.commercetools.api.models.order.OrderUpdateActionBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Update actions to be performed on the Order.</p>
     * @param builder function to build the actions value
     * @return Builder
     */

    public OrderUpdateBuilder withActions(
            Function<com.commercetools.api.models.order.OrderUpdateActionBuilder, Builder<? extends com.commercetools.api.models.order.OrderUpdateAction>> builder) {
        this.actions = new ArrayList<>();
        this.actions.add(builder.apply(com.commercetools.api.models.order.OrderUpdateActionBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Expected version of the Order on which the changes should be applied. If the expected version does not match the actual version, a 409 Conflict error will be returned.</p>
     * @return version
     */

    public Long getVersion() {
        return this.version;
    }

    /**
     *  <p>Update actions to be performed on the Order.</p>
     * @return actions
     */

    public java.util.List<com.commercetools.api.models.order.OrderUpdateAction> getActions() {
        return this.actions;
    }

    /**
     * builds OrderUpdate with checking for non-null required values
     * @return OrderUpdate
     */
    public OrderUpdate build() {
        Objects.requireNonNull(version, OrderUpdate.class + ": version is missing");
        Objects.requireNonNull(actions, OrderUpdate.class + ": actions is missing");
        return new OrderUpdateImpl(version, actions);
    }

    /**
     * builds OrderUpdate without checking for non-null required values
     * @return OrderUpdate
     */
    public OrderUpdate buildUnchecked() {
        return new OrderUpdateImpl(version, actions);
    }

    /**
     * factory method for an instance of OrderUpdateBuilder
     * @return builder
     */
    public static OrderUpdateBuilder of() {
        return new OrderUpdateBuilder();
    }

    /**
     * create builder for OrderUpdate instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static OrderUpdateBuilder of(final OrderUpdate template) {
        OrderUpdateBuilder builder = new OrderUpdateBuilder();
        builder.version = template.getVersion();
        builder.actions = template.getActions();
        return builder;
    }

}
