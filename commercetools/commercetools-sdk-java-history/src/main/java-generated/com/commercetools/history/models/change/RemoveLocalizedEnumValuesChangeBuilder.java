
package com.commercetools.history.models.change;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class RemoveLocalizedEnumValuesChangeBuilder implements Builder<RemoveLocalizedEnumValuesChange> {

    private String change;

    private String attributeName;

    private com.commercetools.history.models.change_value.LocalizedEnumValue previousValue;

    public RemoveLocalizedEnumValuesChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    public RemoveLocalizedEnumValuesChangeBuilder attributeName(final String attributeName) {
        this.attributeName = attributeName;
        return this;
    }

    public RemoveLocalizedEnumValuesChangeBuilder previousValue(
            final com.commercetools.history.models.change_value.LocalizedEnumValue previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    public String getChange() {
        return this.change;
    }

    public String getAttributeName() {
        return this.attributeName;
    }

    public com.commercetools.history.models.change_value.LocalizedEnumValue getPreviousValue() {
        return this.previousValue;
    }

    public RemoveLocalizedEnumValuesChange build() {
        Objects.requireNonNull(change);
        Objects.requireNonNull(attributeName);
        Objects.requireNonNull(previousValue);
        return new RemoveLocalizedEnumValuesChangeImpl(change, attributeName, previousValue);
    }

    /**
     * builds RemoveLocalizedEnumValuesChange without checking for non null required values
     */
    public RemoveLocalizedEnumValuesChange buildUnchecked() {
        return new RemoveLocalizedEnumValuesChangeImpl(change, attributeName, previousValue);
    }

    public static RemoveLocalizedEnumValuesChangeBuilder of() {
        return new RemoveLocalizedEnumValuesChangeBuilder();
    }

    public static RemoveLocalizedEnumValuesChangeBuilder of(final RemoveLocalizedEnumValuesChange template) {
        RemoveLocalizedEnumValuesChangeBuilder builder = new RemoveLocalizedEnumValuesChangeBuilder();
        builder.change = template.getChange();
        builder.attributeName = template.getAttributeName();
        builder.previousValue = template.getPreviousValue();
        return builder;
    }

}
