
package com.commercetools.history.models.change;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class AddTransactionChangeBuilder implements Builder<AddTransactionChange> {

    private String change;

    private com.commercetools.history.models.common.Transaction nextValue;

    public AddTransactionChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    public AddTransactionChangeBuilder nextValue(final com.commercetools.history.models.common.Transaction nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    public String getChange() {
        return this.change;
    }

    public com.commercetools.history.models.common.Transaction getNextValue() {
        return this.nextValue;
    }

    public AddTransactionChange build() {
        Objects.requireNonNull(change);
        Objects.requireNonNull(nextValue);
        return new AddTransactionChangeImpl(change, nextValue);
    }

    /**
     * builds AddTransactionChange without checking for non null required values
     */
    public AddTransactionChange buildUnchecked() {
        return new AddTransactionChangeImpl(change, nextValue);
    }

    public static AddTransactionChangeBuilder of() {
        return new AddTransactionChangeBuilder();
    }

    public static AddTransactionChangeBuilder of(final AddTransactionChange template) {
        AddTransactionChangeBuilder builder = new AddTransactionChangeBuilder();
        builder.change = template.getChange();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
