
package com.commercetools.api.models.order_edit;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * StagedOrderSetLineItemShippingDetailsActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StagedOrderSetLineItemShippingDetailsAction stagedOrderSetLineItemShippingDetailsAction = StagedOrderSetLineItemShippingDetailsAction.builder()
 *             .lineItemId("{lineItemId}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StagedOrderSetLineItemShippingDetailsActionBuilder
        implements Builder<StagedOrderSetLineItemShippingDetailsAction> {

    private String lineItemId;

    @Nullable
    private com.commercetools.api.models.cart.ItemShippingDetailsDraft shippingDetails;

    /**
     * set the value to the lineItemId
     * @param lineItemId value to be set
     * @return Builder
     */

    public StagedOrderSetLineItemShippingDetailsActionBuilder lineItemId(final String lineItemId) {
        this.lineItemId = lineItemId;
        return this;
    }

    /**
     *  <p>For order creation and updates, the sum of the <code>targets</code> must match the quantity of the Line Items or Custom Line Items.</p>
     * @param builder function to build the shippingDetails value
     * @return Builder
     */

    public StagedOrderSetLineItemShippingDetailsActionBuilder shippingDetails(
            Function<com.commercetools.api.models.cart.ItemShippingDetailsDraftBuilder, com.commercetools.api.models.cart.ItemShippingDetailsDraftBuilder> builder) {
        this.shippingDetails = builder.apply(com.commercetools.api.models.cart.ItemShippingDetailsDraftBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>For order creation and updates, the sum of the <code>targets</code> must match the quantity of the Line Items or Custom Line Items.</p>
     * @param builder function to build the shippingDetails value
     * @return Builder
     */

    public StagedOrderSetLineItemShippingDetailsActionBuilder withShippingDetails(
            Function<com.commercetools.api.models.cart.ItemShippingDetailsDraftBuilder, com.commercetools.api.models.cart.ItemShippingDetailsDraft> builder) {
        this.shippingDetails = builder.apply(com.commercetools.api.models.cart.ItemShippingDetailsDraftBuilder.of());
        return this;
    }

    /**
     *  <p>For order creation and updates, the sum of the <code>targets</code> must match the quantity of the Line Items or Custom Line Items.</p>
     * @param shippingDetails value to be set
     * @return Builder
     */

    public StagedOrderSetLineItemShippingDetailsActionBuilder shippingDetails(
            @Nullable final com.commercetools.api.models.cart.ItemShippingDetailsDraft shippingDetails) {
        this.shippingDetails = shippingDetails;
        return this;
    }

    /**
     * value of lineItemId}
     * @return lineItemId
     */

    public String getLineItemId() {
        return this.lineItemId;
    }

    /**
     *  <p>For order creation and updates, the sum of the <code>targets</code> must match the quantity of the Line Items or Custom Line Items.</p>
     * @return shippingDetails
     */

    @Nullable
    public com.commercetools.api.models.cart.ItemShippingDetailsDraft getShippingDetails() {
        return this.shippingDetails;
    }

    /**
     * builds StagedOrderSetLineItemShippingDetailsAction with checking for non-null required values
     * @return StagedOrderSetLineItemShippingDetailsAction
     */
    public StagedOrderSetLineItemShippingDetailsAction build() {
        Objects.requireNonNull(lineItemId,
            StagedOrderSetLineItemShippingDetailsAction.class + ": lineItemId is missing");
        return new StagedOrderSetLineItemShippingDetailsActionImpl(lineItemId, shippingDetails);
    }

    /**
     * builds StagedOrderSetLineItemShippingDetailsAction without checking for non-null required values
     * @return StagedOrderSetLineItemShippingDetailsAction
     */
    public StagedOrderSetLineItemShippingDetailsAction buildUnchecked() {
        return new StagedOrderSetLineItemShippingDetailsActionImpl(lineItemId, shippingDetails);
    }

    /**
     * factory method for an instance of StagedOrderSetLineItemShippingDetailsActionBuilder
     * @return builder
     */
    public static StagedOrderSetLineItemShippingDetailsActionBuilder of() {
        return new StagedOrderSetLineItemShippingDetailsActionBuilder();
    }

    /**
     * create builder for StagedOrderSetLineItemShippingDetailsAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StagedOrderSetLineItemShippingDetailsActionBuilder of(
            final StagedOrderSetLineItemShippingDetailsAction template) {
        StagedOrderSetLineItemShippingDetailsActionBuilder builder = new StagedOrderSetLineItemShippingDetailsActionBuilder();
        builder.lineItemId = template.getLineItemId();
        builder.shippingDetails = template.getShippingDetails();
        return builder;
    }

}
