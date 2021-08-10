
package com.commercetools.api.models.type;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class CustomFieldLocalizedEnumValueBuilder implements Builder<CustomFieldLocalizedEnumValue> {

    private String key;

    private com.commercetools.api.models.common.LocalizedString label;

    public CustomFieldLocalizedEnumValueBuilder key(final String key) {
        this.key = key;
        return this;
    }

    public CustomFieldLocalizedEnumValueBuilder label(final com.commercetools.api.models.common.LocalizedString label) {
        this.label = label;
        return this;
    }

    public String getKey() {
        return this.key;
    }

    public com.commercetools.api.models.common.LocalizedString getLabel() {
        return this.label;
    }

    public CustomFieldLocalizedEnumValue build() {
        Objects.requireNonNull(key);
        Objects.requireNonNull(label);
        return new CustomFieldLocalizedEnumValueImpl(key, label);
    }

    /**
     * builds CustomFieldLocalizedEnumValue without checking for non null required values
     */
    public CustomFieldLocalizedEnumValue buildUnchecked() {
        return new CustomFieldLocalizedEnumValueImpl(key, label);
    }

    public static CustomFieldLocalizedEnumValueBuilder of() {
        return new CustomFieldLocalizedEnumValueBuilder();
    }

    public static CustomFieldLocalizedEnumValueBuilder of(final CustomFieldLocalizedEnumValue template) {
        CustomFieldLocalizedEnumValueBuilder builder = new CustomFieldLocalizedEnumValueBuilder();
        builder.key = template.getKey();
        builder.label = template.getLabel();
        return builder;
    }

}
