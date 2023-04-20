
package com.commercetools.history.models.change;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ChangeQuantityChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ChangeQuantityChange changeQuantityChange = ChangeQuantityChange.builder()
 *             .change("{change}")
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .previousValue(previousValueBuilder -> previousValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ChangeQuantityChangeBuilder implements Builder<ChangeQuantityChange> {

    private String change;

    private com.commercetools.history.models.change_value.InventoryQuantityValue nextValue;

    private com.commercetools.history.models.change_value.InventoryQuantityValue previousValue;

    /**
     * set the value to the change
     * @param change value to be set
     * @return Builder
     */

    public ChangeQuantityChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     * set the value to the nextValue using the builder function
     * @param builder function to build the nextValue value
     * @return Builder
     */

    public ChangeQuantityChangeBuilder nextValue(
            Function<com.commercetools.history.models.change_value.InventoryQuantityValueBuilder, com.commercetools.history.models.change_value.InventoryQuantityValueBuilder> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.change_value.InventoryQuantityValueBuilder.of())
                .build();
        return this;
    }

    /**
     * set the value to the nextValue using the builder function
     * @param builder function to build the nextValue value
     * @return Builder
     */

    public ChangeQuantityChangeBuilder withNextValue(
            Function<com.commercetools.history.models.change_value.InventoryQuantityValueBuilder, com.commercetools.history.models.change_value.InventoryQuantityValue> builder) {
        this.nextValue = builder
                .apply(com.commercetools.history.models.change_value.InventoryQuantityValueBuilder.of());
        return this;
    }

    /**
     * set the value to the nextValue
     * @param nextValue value to be set
     * @return Builder
     */

    public ChangeQuantityChangeBuilder nextValue(
            final com.commercetools.history.models.change_value.InventoryQuantityValue nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    /**
     * set the value to the previousValue using the builder function
     * @param builder function to build the previousValue value
     * @return Builder
     */

    public ChangeQuantityChangeBuilder previousValue(
            Function<com.commercetools.history.models.change_value.InventoryQuantityValueBuilder, com.commercetools.history.models.change_value.InventoryQuantityValueBuilder> builder) {
        this.previousValue = builder
                .apply(com.commercetools.history.models.change_value.InventoryQuantityValueBuilder.of())
                .build();
        return this;
    }

    /**
     * set the value to the previousValue using the builder function
     * @param builder function to build the previousValue value
     * @return Builder
     */

    public ChangeQuantityChangeBuilder withPreviousValue(
            Function<com.commercetools.history.models.change_value.InventoryQuantityValueBuilder, com.commercetools.history.models.change_value.InventoryQuantityValue> builder) {
        this.previousValue = builder
                .apply(com.commercetools.history.models.change_value.InventoryQuantityValueBuilder.of());
        return this;
    }

    /**
     * set the value to the previousValue
     * @param previousValue value to be set
     * @return Builder
     */

    public ChangeQuantityChangeBuilder previousValue(
            final com.commercetools.history.models.change_value.InventoryQuantityValue previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    /**
     * value of change}
     * @return change
     */

    public String getChange() {
        return this.change;
    }

    /**
     * value of nextValue}
     * @return nextValue
     */

    public com.commercetools.history.models.change_value.InventoryQuantityValue getNextValue() {
        return this.nextValue;
    }

    /**
     * value of previousValue}
     * @return previousValue
     */

    public com.commercetools.history.models.change_value.InventoryQuantityValue getPreviousValue() {
        return this.previousValue;
    }

    /**
     * builds ChangeQuantityChange with checking for non-null required values
     * @return ChangeQuantityChange
     */
    public ChangeQuantityChange build() {
        Objects.requireNonNull(change, ChangeQuantityChange.class + ": change is missing");
        Objects.requireNonNull(nextValue, ChangeQuantityChange.class + ": nextValue is missing");
        Objects.requireNonNull(previousValue, ChangeQuantityChange.class + ": previousValue is missing");
        return new ChangeQuantityChangeImpl(change, nextValue, previousValue);
    }

    /**
     * builds ChangeQuantityChange without checking for non-null required values
     * @return ChangeQuantityChange
     */
    public ChangeQuantityChange buildUnchecked() {
        return new ChangeQuantityChangeImpl(change, nextValue, previousValue);
    }

    /**
     * factory method for an instance of ChangeQuantityChangeBuilder
     * @return builder
     */
    public static ChangeQuantityChangeBuilder of() {
        return new ChangeQuantityChangeBuilder();
    }

    /**
     * create builder for ChangeQuantityChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ChangeQuantityChangeBuilder of(final ChangeQuantityChange template) {
        ChangeQuantityChangeBuilder builder = new ChangeQuantityChangeBuilder();
        builder.change = template.getChange();
        builder.nextValue = template.getNextValue();
        builder.previousValue = template.getPreviousValue();
        return builder;
    }

}
