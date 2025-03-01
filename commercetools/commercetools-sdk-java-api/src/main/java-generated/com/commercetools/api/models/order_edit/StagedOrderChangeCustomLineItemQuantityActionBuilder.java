
package com.commercetools.api.models.order_edit;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * StagedOrderChangeCustomLineItemQuantityActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StagedOrderChangeCustomLineItemQuantityAction stagedOrderChangeCustomLineItemQuantityAction = StagedOrderChangeCustomLineItemQuantityAction.builder()
 *             .customLineItemId("{customLineItemId}")
 *             .quantity(0.3)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StagedOrderChangeCustomLineItemQuantityActionBuilder
        implements Builder<StagedOrderChangeCustomLineItemQuantityAction> {

    private String customLineItemId;

    private Long quantity;

    /**
     * set the value to the customLineItemId
     * @param customLineItemId value to be set
     * @return Builder
     */

    public StagedOrderChangeCustomLineItemQuantityActionBuilder customLineItemId(final String customLineItemId) {
        this.customLineItemId = customLineItemId;
        return this;
    }

    /**
     * set the value to the quantity
     * @param quantity value to be set
     * @return Builder
     */

    public StagedOrderChangeCustomLineItemQuantityActionBuilder quantity(final Long quantity) {
        this.quantity = quantity;
        return this;
    }

    /**
     * value of customLineItemId}
     * @return customLineItemId
     */

    public String getCustomLineItemId() {
        return this.customLineItemId;
    }

    /**
     * value of quantity}
     * @return quantity
     */

    public Long getQuantity() {
        return this.quantity;
    }

    /**
     * builds StagedOrderChangeCustomLineItemQuantityAction with checking for non-null required values
     * @return StagedOrderChangeCustomLineItemQuantityAction
     */
    public StagedOrderChangeCustomLineItemQuantityAction build() {
        Objects.requireNonNull(customLineItemId,
            StagedOrderChangeCustomLineItemQuantityAction.class + ": customLineItemId is missing");
        Objects.requireNonNull(quantity, StagedOrderChangeCustomLineItemQuantityAction.class + ": quantity is missing");
        return new StagedOrderChangeCustomLineItemQuantityActionImpl(customLineItemId, quantity);
    }

    /**
     * builds StagedOrderChangeCustomLineItemQuantityAction without checking for non-null required values
     * @return StagedOrderChangeCustomLineItemQuantityAction
     */
    public StagedOrderChangeCustomLineItemQuantityAction buildUnchecked() {
        return new StagedOrderChangeCustomLineItemQuantityActionImpl(customLineItemId, quantity);
    }

    /**
     * factory method for an instance of StagedOrderChangeCustomLineItemQuantityActionBuilder
     * @return builder
     */
    public static StagedOrderChangeCustomLineItemQuantityActionBuilder of() {
        return new StagedOrderChangeCustomLineItemQuantityActionBuilder();
    }

    /**
     * create builder for StagedOrderChangeCustomLineItemQuantityAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StagedOrderChangeCustomLineItemQuantityActionBuilder of(
            final StagedOrderChangeCustomLineItemQuantityAction template) {
        StagedOrderChangeCustomLineItemQuantityActionBuilder builder = new StagedOrderChangeCustomLineItemQuantityActionBuilder();
        builder.customLineItemId = template.getCustomLineItemId();
        builder.quantity = template.getQuantity();
        return builder;
    }

}
