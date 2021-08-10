
package com.commercetools.api.models.payment;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class PaymentChangeAmountPlannedActionBuilder implements Builder<PaymentChangeAmountPlannedAction> {

    private com.commercetools.api.models.common.Money amount;

    public PaymentChangeAmountPlannedActionBuilder amount(final com.commercetools.api.models.common.Money amount) {
        this.amount = amount;
        return this;
    }

    public com.commercetools.api.models.common.Money getAmount() {
        return this.amount;
    }

    public PaymentChangeAmountPlannedAction build() {
        Objects.requireNonNull(amount);
        return new PaymentChangeAmountPlannedActionImpl(amount);
    }

    /**
     * builds PaymentChangeAmountPlannedAction without checking for non null required values
     */
    public PaymentChangeAmountPlannedAction buildUnchecked() {
        return new PaymentChangeAmountPlannedActionImpl(amount);
    }

    public static PaymentChangeAmountPlannedActionBuilder of() {
        return new PaymentChangeAmountPlannedActionBuilder();
    }

    public static PaymentChangeAmountPlannedActionBuilder of(final PaymentChangeAmountPlannedAction template) {
        PaymentChangeAmountPlannedActionBuilder builder = new PaymentChangeAmountPlannedActionBuilder();
        builder.amount = template.getAmount();
        return builder;
    }

}
