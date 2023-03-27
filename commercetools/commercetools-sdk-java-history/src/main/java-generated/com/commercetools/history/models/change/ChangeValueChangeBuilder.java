
package com.commercetools.history.models.change;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ChangeValueChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ChangeValueChange changeValueChange = ChangeValueChange.builder()
 *             .change("{change}")
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .previousValue(previousValueBuilder -> previousValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ChangeValueChangeBuilder implements Builder<ChangeValueChange> {

    private String change;

    private com.commercetools.history.models.change_value.ChangeValueChangeValue nextValue;

    private com.commercetools.history.models.change_value.ChangeValueChangeValue previousValue;

    /**
     *  <p>Update action for <code>changeValue</code> on cart discounts and product discounts</p>
     * @param change value to be set
     * @return Builder
     */

    public ChangeValueChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     * set the value to the nextValue
     * @param nextValue value to be set
     * @return Builder
     */

    public ChangeValueChangeBuilder nextValue(
            final com.commercetools.history.models.change_value.ChangeValueChangeValue nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    /**
     * set the value to the nextValue using the builder function
     * @param builder function to build the nextValue value
     * @return Builder
     */

    public ChangeValueChangeBuilder nextValue(
            Function<com.commercetools.history.models.change_value.ChangeValueChangeValueBuilder, Builder<? extends com.commercetools.history.models.change_value.ChangeValueChangeValue>> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.change_value.ChangeValueChangeValueBuilder.of())
                .build();
        return this;
    }

    /**
     * set the value to the previousValue
     * @param previousValue value to be set
     * @return Builder
     */

    public ChangeValueChangeBuilder previousValue(
            final com.commercetools.history.models.change_value.ChangeValueChangeValue previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    /**
     * set the value to the previousValue using the builder function
     * @param builder function to build the previousValue value
     * @return Builder
     */

    public ChangeValueChangeBuilder previousValue(
            Function<com.commercetools.history.models.change_value.ChangeValueChangeValueBuilder, Builder<? extends com.commercetools.history.models.change_value.ChangeValueChangeValue>> builder) {
        this.previousValue = builder
                .apply(com.commercetools.history.models.change_value.ChangeValueChangeValueBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Update action for <code>changeValue</code> on cart discounts and product discounts</p>
     * @return change
     */

    public String getChange() {
        return this.change;
    }

    /**
     * value of nextValue}
     * @return nextValue
     */

    public com.commercetools.history.models.change_value.ChangeValueChangeValue getNextValue() {
        return this.nextValue;
    }

    /**
     * value of previousValue}
     * @return previousValue
     */

    public com.commercetools.history.models.change_value.ChangeValueChangeValue getPreviousValue() {
        return this.previousValue;
    }

    /**
     * builds ChangeValueChange with checking for non-null required values
     * @return ChangeValueChange
     */
    public ChangeValueChange build() {
        Objects.requireNonNull(change, ChangeValueChange.class + ": change is missing");
        Objects.requireNonNull(nextValue, ChangeValueChange.class + ": nextValue is missing");
        Objects.requireNonNull(previousValue, ChangeValueChange.class + ": previousValue is missing");
        return new ChangeValueChangeImpl(change, nextValue, previousValue);
    }

    /**
     * builds ChangeValueChange without checking for non-null required values
     * @return ChangeValueChange
     */
    public ChangeValueChange buildUnchecked() {
        return new ChangeValueChangeImpl(change, nextValue, previousValue);
    }

    /**
     * factory method for an instance of ChangeValueChangeBuilder
     * @return builder
     */
    public static ChangeValueChangeBuilder of() {
        return new ChangeValueChangeBuilder();
    }

    /**
     * create builder for ChangeValueChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ChangeValueChangeBuilder of(final ChangeValueChange template) {
        ChangeValueChangeBuilder builder = new ChangeValueChangeBuilder();
        builder.change = template.getChange();
        builder.nextValue = template.getNextValue();
        builder.previousValue = template.getPreviousValue();
        return builder;
    }

}
