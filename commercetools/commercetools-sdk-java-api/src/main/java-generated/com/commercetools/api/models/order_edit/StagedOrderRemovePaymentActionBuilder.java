
package com.commercetools.api.models.order_edit;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class StagedOrderRemovePaymentActionBuilder implements Builder<StagedOrderRemovePaymentAction> {

    private com.commercetools.api.models.payment.PaymentResourceIdentifier payment;

    public StagedOrderRemovePaymentActionBuilder payment(
            final com.commercetools.api.models.payment.PaymentResourceIdentifier payment) {
        this.payment = payment;
        return this;
    }

    public com.commercetools.api.models.payment.PaymentResourceIdentifier getPayment() {
        return this.payment;
    }

    public StagedOrderRemovePaymentAction build() {
        Objects.requireNonNull(payment);
        return new StagedOrderRemovePaymentActionImpl(payment);
    }

    /**
     * builds StagedOrderRemovePaymentAction without checking for non null required values
     */
    public StagedOrderRemovePaymentAction buildUnchecked() {
        return new StagedOrderRemovePaymentActionImpl(payment);
    }

    public static StagedOrderRemovePaymentActionBuilder of() {
        return new StagedOrderRemovePaymentActionBuilder();
    }

    public static StagedOrderRemovePaymentActionBuilder of(final StagedOrderRemovePaymentAction template) {
        StagedOrderRemovePaymentActionBuilder builder = new StagedOrderRemovePaymentActionBuilder();
        builder.payment = template.getPayment();
        return builder;
    }

}
