
package com.commercetools.api.models.payment;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class PaymentSetAnonymousIdActionBuilder implements Builder<PaymentSetAnonymousIdAction> {

    @Nullable
    private String anonymousId;

    /**
    *  <p>Anonymous ID of the anonymous customer that this payment belongs to. If this field is not set any existing <code>anonymousId</code> is removed.</p>
    */

    public PaymentSetAnonymousIdActionBuilder anonymousId(@Nullable final String anonymousId) {
        this.anonymousId = anonymousId;
        return this;
    }

    @Nullable
    public String getAnonymousId() {
        return this.anonymousId;
    }

    public PaymentSetAnonymousIdAction build() {
        return new PaymentSetAnonymousIdActionImpl(anonymousId);
    }

    /**
     * builds PaymentSetAnonymousIdAction without checking for non null required values
     */
    public PaymentSetAnonymousIdAction buildUnchecked() {
        return new PaymentSetAnonymousIdActionImpl(anonymousId);
    }

    public static PaymentSetAnonymousIdActionBuilder of() {
        return new PaymentSetAnonymousIdActionBuilder();
    }

    public static PaymentSetAnonymousIdActionBuilder of(final PaymentSetAnonymousIdAction template) {
        PaymentSetAnonymousIdActionBuilder builder = new PaymentSetAnonymousIdActionBuilder();
        builder.anonymousId = template.getAnonymousId();
        return builder;
    }

}
