
package com.commercetools.api.models.cart;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CartApplyDeltaToLineItemShippingDetailsTargetsActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartApplyDeltaToLineItemShippingDetailsTargetsAction cartApplyDeltaToLineItemShippingDetailsTargetsAction = CartApplyDeltaToLineItemShippingDetailsTargetsAction.builder()
 *             .lineItemId("{lineItemId}")
 *             .plusTargetsDelta(targetsDeltaBuilder -> targetsDeltaBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CartApplyDeltaToLineItemShippingDetailsTargetsActionBuilder
        implements Builder<CartApplyDeltaToLineItemShippingDetailsTargetsAction> {

    private String lineItemId;

    private java.util.List<com.commercetools.api.models.cart.ItemShippingTarget> targetsDelta;

    /**
     *  <p><code>id</code> of the LineItem to update.</p>
     * @param lineItemId value to be set
     * @return Builder
     */

    public CartApplyDeltaToLineItemShippingDetailsTargetsActionBuilder lineItemId(final String lineItemId) {
        this.lineItemId = lineItemId;
        return this;
    }

    /**
     *  <p>Using positive or negative quantities increases or decreases the number of items shipped to an address.</p>
     * @param targetsDelta value to be set
     * @return Builder
     */

    public CartApplyDeltaToLineItemShippingDetailsTargetsActionBuilder targetsDelta(
            final com.commercetools.api.models.cart.ItemShippingTarget... targetsDelta) {
        this.targetsDelta = new ArrayList<>(Arrays.asList(targetsDelta));
        return this;
    }

    /**
     *  <p>Using positive or negative quantities increases or decreases the number of items shipped to an address.</p>
     * @param targetsDelta value to be set
     * @return Builder
     */

    public CartApplyDeltaToLineItemShippingDetailsTargetsActionBuilder targetsDelta(
            final java.util.List<com.commercetools.api.models.cart.ItemShippingTarget> targetsDelta) {
        this.targetsDelta = targetsDelta;
        return this;
    }

    /**
     *  <p>Using positive or negative quantities increases or decreases the number of items shipped to an address.</p>
     * @param targetsDelta value to be set
     * @return Builder
     */

    public CartApplyDeltaToLineItemShippingDetailsTargetsActionBuilder plusTargetsDelta(
            final com.commercetools.api.models.cart.ItemShippingTarget... targetsDelta) {
        if (this.targetsDelta == null) {
            this.targetsDelta = new ArrayList<>();
        }
        this.targetsDelta.addAll(Arrays.asList(targetsDelta));
        return this;
    }

    /**
     *  <p>Using positive or negative quantities increases or decreases the number of items shipped to an address.</p>
     * @param builder function to build the targetsDelta value
     * @return Builder
     */

    public CartApplyDeltaToLineItemShippingDetailsTargetsActionBuilder plusTargetsDelta(
            Function<com.commercetools.api.models.cart.ItemShippingTargetBuilder, com.commercetools.api.models.cart.ItemShippingTargetBuilder> builder) {
        if (this.targetsDelta == null) {
            this.targetsDelta = new ArrayList<>();
        }
        this.targetsDelta.add(builder.apply(com.commercetools.api.models.cart.ItemShippingTargetBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Using positive or negative quantities increases or decreases the number of items shipped to an address.</p>
     * @param builder function to build the targetsDelta value
     * @return Builder
     */

    public CartApplyDeltaToLineItemShippingDetailsTargetsActionBuilder withTargetsDelta(
            Function<com.commercetools.api.models.cart.ItemShippingTargetBuilder, com.commercetools.api.models.cart.ItemShippingTargetBuilder> builder) {
        this.targetsDelta = new ArrayList<>();
        this.targetsDelta.add(builder.apply(com.commercetools.api.models.cart.ItemShippingTargetBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Using positive or negative quantities increases or decreases the number of items shipped to an address.</p>
     * @param builder function to build the targetsDelta value
     * @return Builder
     */

    public CartApplyDeltaToLineItemShippingDetailsTargetsActionBuilder addTargetsDelta(
            Function<com.commercetools.api.models.cart.ItemShippingTargetBuilder, com.commercetools.api.models.cart.ItemShippingTarget> builder) {
        return plusTargetsDelta(builder.apply(com.commercetools.api.models.cart.ItemShippingTargetBuilder.of()));
    }

    /**
     *  <p>Using positive or negative quantities increases or decreases the number of items shipped to an address.</p>
     * @param builder function to build the targetsDelta value
     * @return Builder
     */

    public CartApplyDeltaToLineItemShippingDetailsTargetsActionBuilder setTargetsDelta(
            Function<com.commercetools.api.models.cart.ItemShippingTargetBuilder, com.commercetools.api.models.cart.ItemShippingTarget> builder) {
        return targetsDelta(builder.apply(com.commercetools.api.models.cart.ItemShippingTargetBuilder.of()));
    }

    /**
     *  <p><code>id</code> of the LineItem to update.</p>
     * @return lineItemId
     */

    public String getLineItemId() {
        return this.lineItemId;
    }

    /**
     *  <p>Using positive or negative quantities increases or decreases the number of items shipped to an address.</p>
     * @return targetsDelta
     */

    public java.util.List<com.commercetools.api.models.cart.ItemShippingTarget> getTargetsDelta() {
        return this.targetsDelta;
    }

    /**
     * builds CartApplyDeltaToLineItemShippingDetailsTargetsAction with checking for non-null required values
     * @return CartApplyDeltaToLineItemShippingDetailsTargetsAction
     */
    public CartApplyDeltaToLineItemShippingDetailsTargetsAction build() {
        Objects.requireNonNull(lineItemId,
            CartApplyDeltaToLineItemShippingDetailsTargetsAction.class + ": lineItemId is missing");
        Objects.requireNonNull(targetsDelta,
            CartApplyDeltaToLineItemShippingDetailsTargetsAction.class + ": targetsDelta is missing");
        return new CartApplyDeltaToLineItemShippingDetailsTargetsActionImpl(lineItemId, targetsDelta);
    }

    /**
     * builds CartApplyDeltaToLineItemShippingDetailsTargetsAction without checking for non-null required values
     * @return CartApplyDeltaToLineItemShippingDetailsTargetsAction
     */
    public CartApplyDeltaToLineItemShippingDetailsTargetsAction buildUnchecked() {
        return new CartApplyDeltaToLineItemShippingDetailsTargetsActionImpl(lineItemId, targetsDelta);
    }

    /**
     * factory method for an instance of CartApplyDeltaToLineItemShippingDetailsTargetsActionBuilder
     * @return builder
     */
    public static CartApplyDeltaToLineItemShippingDetailsTargetsActionBuilder of() {
        return new CartApplyDeltaToLineItemShippingDetailsTargetsActionBuilder();
    }

    /**
     * create builder for CartApplyDeltaToLineItemShippingDetailsTargetsAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CartApplyDeltaToLineItemShippingDetailsTargetsActionBuilder of(
            final CartApplyDeltaToLineItemShippingDetailsTargetsAction template) {
        CartApplyDeltaToLineItemShippingDetailsTargetsActionBuilder builder = new CartApplyDeltaToLineItemShippingDetailsTargetsActionBuilder();
        builder.lineItemId = template.getLineItemId();
        builder.targetsDelta = template.getTargetsDelta();
        return builder;
    }

}
