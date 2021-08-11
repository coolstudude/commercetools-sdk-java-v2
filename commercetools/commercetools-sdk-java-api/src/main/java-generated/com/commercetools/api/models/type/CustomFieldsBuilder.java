
package com.commercetools.api.models.type;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class CustomFieldsBuilder implements Builder<CustomFields> {

    private com.commercetools.api.models.type.TypeReference type;

    private com.commercetools.api.models.type.FieldContainer fields;

    public CustomFieldsBuilder type(final com.commercetools.api.models.type.TypeReference type) {
        this.type = type;
        return this;
    }

    public CustomFieldsBuilder fields(final com.commercetools.api.models.type.FieldContainer fields) {
        this.fields = fields;
        return this;
    }

    public com.commercetools.api.models.type.TypeReference getType() {
        return this.type;
    }

    public com.commercetools.api.models.type.FieldContainer getFields() {
        return this.fields;
    }

    public CustomFields build() {
        Objects.requireNonNull(type, CustomFields.class + ": type is missing");
        Objects.requireNonNull(fields, CustomFields.class + ": fields is missing");
        return new CustomFieldsImpl(type, fields);
    }

    /**
     * builds CustomFields without checking for non null required values
     */
    public CustomFields buildUnchecked() {
        return new CustomFieldsImpl(type, fields);
    }

    public static CustomFieldsBuilder of() {
        return new CustomFieldsBuilder();
    }

    public static CustomFieldsBuilder of(final CustomFields template) {
        CustomFieldsBuilder builder = new CustomFieldsBuilder();
        builder.type = template.getType();
        builder.fields = template.getFields();
        return builder;
    }

}
