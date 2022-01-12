
package com.commercetools.api.models.payment;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class PaymentSetTransactionCustomTypeActionBuilder implements Builder<PaymentSetTransactionCustomTypeAction> {

    @Nullable
    private com.commercetools.api.models.type.TypeResourceIdentifier type;

    @Nullable
    private com.commercetools.api.models.type.FieldContainer fields;

    public PaymentSetTransactionCustomTypeActionBuilder type(
            @Nullable final com.commercetools.api.models.type.TypeResourceIdentifier type) {
        this.type = type;
        return this;
    }

    public PaymentSetTransactionCustomTypeActionBuilder fields(
            Function<com.commercetools.api.models.type.FieldContainerBuilder, com.commercetools.api.models.type.FieldContainerBuilder> builder) {
        this.fields = builder.apply(com.commercetools.api.models.type.FieldContainerBuilder.of()).build();
        return this;
    }

    public PaymentSetTransactionCustomTypeActionBuilder fields(
            @Nullable final com.commercetools.api.models.type.FieldContainer fields) {
        this.fields = fields;
        return this;
    }

    @Nullable
    public com.commercetools.api.models.type.TypeResourceIdentifier getType() {
        return this.type;
    }

    @Nullable
    public com.commercetools.api.models.type.FieldContainer getFields() {
        return this.fields;
    }

    public PaymentSetTransactionCustomTypeAction build() {
        return new PaymentSetTransactionCustomTypeActionImpl(type, fields);
    }

    /**
     * builds PaymentSetTransactionCustomTypeAction without checking for non null required values
     */
    public PaymentSetTransactionCustomTypeAction buildUnchecked() {
        return new PaymentSetTransactionCustomTypeActionImpl(type, fields);
    }

    public static PaymentSetTransactionCustomTypeActionBuilder of() {
        return new PaymentSetTransactionCustomTypeActionBuilder();
    }

    public static PaymentSetTransactionCustomTypeActionBuilder of(
            final PaymentSetTransactionCustomTypeAction template) {
        PaymentSetTransactionCustomTypeActionBuilder builder = new PaymentSetTransactionCustomTypeActionBuilder();
        builder.type = template.getType();
        builder.fields = template.getFields();
        return builder;
    }

}
