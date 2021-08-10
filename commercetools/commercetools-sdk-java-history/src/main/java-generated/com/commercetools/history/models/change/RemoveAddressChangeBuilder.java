
package com.commercetools.history.models.change;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class RemoveAddressChangeBuilder implements Builder<RemoveAddressChange> {

    private String change;

    private com.commercetools.history.models.common.Address previousValue;

    public RemoveAddressChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    public RemoveAddressChangeBuilder previousValue(
            final com.commercetools.history.models.common.Address previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    public String getChange() {
        return this.change;
    }

    public com.commercetools.history.models.common.Address getPreviousValue() {
        return this.previousValue;
    }

    public RemoveAddressChange build() {
        Objects.requireNonNull(change);
        Objects.requireNonNull(previousValue);
        return new RemoveAddressChangeImpl(change, previousValue);
    }

    /**
     * builds RemoveAddressChange without checking for non null required values
     */
    public RemoveAddressChange buildUnchecked() {
        return new RemoveAddressChangeImpl(change, previousValue);
    }

    public static RemoveAddressChangeBuilder of() {
        return new RemoveAddressChangeBuilder();
    }

    public static RemoveAddressChangeBuilder of(final RemoveAddressChange template) {
        RemoveAddressChangeBuilder builder = new RemoveAddressChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        return builder;
    }

}
