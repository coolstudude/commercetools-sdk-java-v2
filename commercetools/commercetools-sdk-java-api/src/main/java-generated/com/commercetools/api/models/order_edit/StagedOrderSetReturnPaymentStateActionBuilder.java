
package com.commercetools.api.models.order_edit;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * StagedOrderSetReturnPaymentStateActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StagedOrderSetReturnPaymentStateAction stagedOrderSetReturnPaymentStateAction = StagedOrderSetReturnPaymentStateAction.builder()
 *             .returnItemId("{returnItemId}")
 *             .paymentState(ReturnPaymentState.NON_REFUNDABLE)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StagedOrderSetReturnPaymentStateActionBuilder implements Builder<StagedOrderSetReturnPaymentStateAction> {

    private String returnItemId;

    private com.commercetools.api.models.order.ReturnPaymentState paymentState;

    /**
     * set the value to the returnItemId
     * @param returnItemId value to be set
     * @return Builder
     */

    public StagedOrderSetReturnPaymentStateActionBuilder returnItemId(final String returnItemId) {
        this.returnItemId = returnItemId;
        return this;
    }

    /**
     * set the value to the paymentState
     * @param paymentState value to be set
     * @return Builder
     */

    public StagedOrderSetReturnPaymentStateActionBuilder paymentState(
            final com.commercetools.api.models.order.ReturnPaymentState paymentState) {
        this.paymentState = paymentState;
        return this;
    }

    /**
     * value of returnItemId}
     * @return returnItemId
     */

    public String getReturnItemId() {
        return this.returnItemId;
    }

    /**
     * value of paymentState}
     * @return paymentState
     */

    public com.commercetools.api.models.order.ReturnPaymentState getPaymentState() {
        return this.paymentState;
    }

    /**
     * builds StagedOrderSetReturnPaymentStateAction with checking for non-null required values
     * @return StagedOrderSetReturnPaymentStateAction
     */
    public StagedOrderSetReturnPaymentStateAction build() {
        Objects.requireNonNull(returnItemId,
            StagedOrderSetReturnPaymentStateAction.class + ": returnItemId is missing");
        Objects.requireNonNull(paymentState,
            StagedOrderSetReturnPaymentStateAction.class + ": paymentState is missing");
        return new StagedOrderSetReturnPaymentStateActionImpl(returnItemId, paymentState);
    }

    /**
     * builds StagedOrderSetReturnPaymentStateAction without checking for non-null required values
     * @return StagedOrderSetReturnPaymentStateAction
     */
    public StagedOrderSetReturnPaymentStateAction buildUnchecked() {
        return new StagedOrderSetReturnPaymentStateActionImpl(returnItemId, paymentState);
    }

    /**
     * factory method for an instance of StagedOrderSetReturnPaymentStateActionBuilder
     * @return builder
     */
    public static StagedOrderSetReturnPaymentStateActionBuilder of() {
        return new StagedOrderSetReturnPaymentStateActionBuilder();
    }

    /**
     * create builder for StagedOrderSetReturnPaymentStateAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StagedOrderSetReturnPaymentStateActionBuilder of(
            final StagedOrderSetReturnPaymentStateAction template) {
        StagedOrderSetReturnPaymentStateActionBuilder builder = new StagedOrderSetReturnPaymentStateActionBuilder();
        builder.returnItemId = template.getReturnItemId();
        builder.paymentState = template.getPaymentState();
        return builder;
    }

}
