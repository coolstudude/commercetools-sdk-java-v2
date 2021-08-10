
package com.commercetools.history.models.change;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ChangeAttributeOrderByNameChangeBuilder implements Builder<ChangeAttributeOrderByNameChange> {

    private String change;

    private java.util.List<String> previousValue;

    private java.util.List<String> nextValue;

    public ChangeAttributeOrderByNameChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    public ChangeAttributeOrderByNameChangeBuilder previousValue(final String... previousValue) {
        this.previousValue = new ArrayList<>(Arrays.asList(previousValue));
        return this;
    }

    public ChangeAttributeOrderByNameChangeBuilder previousValue(final java.util.List<String> previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    public ChangeAttributeOrderByNameChangeBuilder nextValue(final String... nextValue) {
        this.nextValue = new ArrayList<>(Arrays.asList(nextValue));
        return this;
    }

    public ChangeAttributeOrderByNameChangeBuilder nextValue(final java.util.List<String> nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    public String getChange() {
        return this.change;
    }

    public java.util.List<String> getPreviousValue() {
        return this.previousValue;
    }

    public java.util.List<String> getNextValue() {
        return this.nextValue;
    }

    public ChangeAttributeOrderByNameChange build() {
        Objects.requireNonNull(change);
        Objects.requireNonNull(previousValue);
        Objects.requireNonNull(nextValue);
        return new ChangeAttributeOrderByNameChangeImpl(change, previousValue, nextValue);
    }

    /**
     * builds ChangeAttributeOrderByNameChange without checking for non null required values
     */
    public ChangeAttributeOrderByNameChange buildUnchecked() {
        return new ChangeAttributeOrderByNameChangeImpl(change, previousValue, nextValue);
    }

    public static ChangeAttributeOrderByNameChangeBuilder of() {
        return new ChangeAttributeOrderByNameChangeBuilder();
    }

    public static ChangeAttributeOrderByNameChangeBuilder of(final ChangeAttributeOrderByNameChange template) {
        ChangeAttributeOrderByNameChangeBuilder builder = new ChangeAttributeOrderByNameChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
