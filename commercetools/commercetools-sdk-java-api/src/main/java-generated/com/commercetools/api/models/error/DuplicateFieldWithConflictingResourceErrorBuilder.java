
package com.commercetools.api.models.error;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class DuplicateFieldWithConflictingResourceErrorBuilder
        implements Builder<DuplicateFieldWithConflictingResourceError> {

    private String message;

    private String field;

    private java.lang.Object duplicateValue;

    private com.commercetools.api.models.common.Reference conflictingResource;

    public DuplicateFieldWithConflictingResourceErrorBuilder message(final String message) {
        this.message = message;
        return this;
    }

    public DuplicateFieldWithConflictingResourceErrorBuilder field(final String field) {
        this.field = field;
        return this;
    }

    public DuplicateFieldWithConflictingResourceErrorBuilder duplicateValue(final java.lang.Object duplicateValue) {
        this.duplicateValue = duplicateValue;
        return this;
    }

    public DuplicateFieldWithConflictingResourceErrorBuilder conflictingResource(
            final com.commercetools.api.models.common.Reference conflictingResource) {
        this.conflictingResource = conflictingResource;
        return this;
    }

    public String getMessage() {
        return this.message;
    }

    public String getField() {
        return this.field;
    }

    public java.lang.Object getDuplicateValue() {
        return this.duplicateValue;
    }

    public com.commercetools.api.models.common.Reference getConflictingResource() {
        return this.conflictingResource;
    }

    public DuplicateFieldWithConflictingResourceError build() {
        Objects.requireNonNull(message);
        Objects.requireNonNull(field);
        Objects.requireNonNull(duplicateValue);
        Objects.requireNonNull(conflictingResource);
        return new DuplicateFieldWithConflictingResourceErrorImpl(message, field, duplicateValue, conflictingResource);
    }

    /**
     * builds DuplicateFieldWithConflictingResourceError without checking for non null required values
     */
    public DuplicateFieldWithConflictingResourceError buildUnchecked() {
        return new DuplicateFieldWithConflictingResourceErrorImpl(message, field, duplicateValue, conflictingResource);
    }

    public static DuplicateFieldWithConflictingResourceErrorBuilder of() {
        return new DuplicateFieldWithConflictingResourceErrorBuilder();
    }

    public static DuplicateFieldWithConflictingResourceErrorBuilder of(
            final DuplicateFieldWithConflictingResourceError template) {
        DuplicateFieldWithConflictingResourceErrorBuilder builder = new DuplicateFieldWithConflictingResourceErrorBuilder();
        builder.message = template.getMessage();
        builder.field = template.getField();
        builder.duplicateValue = template.getDuplicateValue();
        builder.conflictingResource = template.getConflictingResource();
        return builder;
    }

}
