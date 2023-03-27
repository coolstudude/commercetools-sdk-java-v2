
package com.commercetools.history.models.change;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ChangeShoppingListLineItemsOrderChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ChangeShoppingListLineItemsOrderChange changeShoppingListLineItemsOrderChange = ChangeShoppingListLineItemsOrderChange.builder()
 *             .change("{change}")
 *             .plusPreviousValue(previousValueBuilder -> previousValueBuilder)
 *             .plusNextValue(nextValueBuilder -> nextValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ChangeShoppingListLineItemsOrderChangeBuilder implements Builder<ChangeShoppingListLineItemsOrderChange> {

    private String change;

    private java.util.List<com.commercetools.history.models.change_value.ShoppingListLineItemValue> previousValue;

    private java.util.List<com.commercetools.history.models.change_value.ShoppingListLineItemValue> nextValue;

    /**
     * set the value to the change
     * @param change value to be set
     * @return Builder
     */

    public ChangeShoppingListLineItemsOrderChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     * set values to the previousValue
     * @param previousValue value to be set
     * @return Builder
     */

    public ChangeShoppingListLineItemsOrderChangeBuilder previousValue(
            final com.commercetools.history.models.change_value.ShoppingListLineItemValue... previousValue) {
        this.previousValue = new ArrayList<>(Arrays.asList(previousValue));
        return this;
    }

    /**
     * set value to the previousValue
     * @param previousValue value to be set
     * @return Builder
     */

    public ChangeShoppingListLineItemsOrderChangeBuilder previousValue(
            final java.util.List<com.commercetools.history.models.change_value.ShoppingListLineItemValue> previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    /**
     * add values to the previousValue
     * @param previousValue value to be set
     * @return Builder
     */

    public ChangeShoppingListLineItemsOrderChangeBuilder plusPreviousValue(
            final com.commercetools.history.models.change_value.ShoppingListLineItemValue... previousValue) {
        if (this.previousValue == null) {
            this.previousValue = new ArrayList<>();
        }
        this.previousValue.addAll(Arrays.asList(previousValue));
        return this;
    }

    /**
     * add the value to the previousValue using the builder function
     * @param builder function to build the previousValue value
     * @return Builder
     */

    public ChangeShoppingListLineItemsOrderChangeBuilder plusPreviousValue(
            Function<com.commercetools.history.models.change_value.ShoppingListLineItemValueBuilder, com.commercetools.history.models.change_value.ShoppingListLineItemValueBuilder> builder) {
        if (this.previousValue == null) {
            this.previousValue = new ArrayList<>();
        }
        this.previousValue.add(
            builder.apply(com.commercetools.history.models.change_value.ShoppingListLineItemValueBuilder.of()).build());
        return this;
    }

    /**
     * set the value to the previousValue using the builder function
     * @param builder function to build the previousValue value
     * @return Builder
     */

    public ChangeShoppingListLineItemsOrderChangeBuilder withPreviousValue(
            Function<com.commercetools.history.models.change_value.ShoppingListLineItemValueBuilder, com.commercetools.history.models.change_value.ShoppingListLineItemValueBuilder> builder) {
        this.previousValue = new ArrayList<>();
        this.previousValue.add(
            builder.apply(com.commercetools.history.models.change_value.ShoppingListLineItemValueBuilder.of()).build());
        return this;
    }

    /**
     * set values to the nextValue
     * @param nextValue value to be set
     * @return Builder
     */

    public ChangeShoppingListLineItemsOrderChangeBuilder nextValue(
            final com.commercetools.history.models.change_value.ShoppingListLineItemValue... nextValue) {
        this.nextValue = new ArrayList<>(Arrays.asList(nextValue));
        return this;
    }

    /**
     * set value to the nextValue
     * @param nextValue value to be set
     * @return Builder
     */

    public ChangeShoppingListLineItemsOrderChangeBuilder nextValue(
            final java.util.List<com.commercetools.history.models.change_value.ShoppingListLineItemValue> nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    /**
     * add values to the nextValue
     * @param nextValue value to be set
     * @return Builder
     */

    public ChangeShoppingListLineItemsOrderChangeBuilder plusNextValue(
            final com.commercetools.history.models.change_value.ShoppingListLineItemValue... nextValue) {
        if (this.nextValue == null) {
            this.nextValue = new ArrayList<>();
        }
        this.nextValue.addAll(Arrays.asList(nextValue));
        return this;
    }

    /**
     * add the value to the nextValue using the builder function
     * @param builder function to build the nextValue value
     * @return Builder
     */

    public ChangeShoppingListLineItemsOrderChangeBuilder plusNextValue(
            Function<com.commercetools.history.models.change_value.ShoppingListLineItemValueBuilder, com.commercetools.history.models.change_value.ShoppingListLineItemValueBuilder> builder) {
        if (this.nextValue == null) {
            this.nextValue = new ArrayList<>();
        }
        this.nextValue.add(
            builder.apply(com.commercetools.history.models.change_value.ShoppingListLineItemValueBuilder.of()).build());
        return this;
    }

    /**
     * set the value to the nextValue using the builder function
     * @param builder function to build the nextValue value
     * @return Builder
     */

    public ChangeShoppingListLineItemsOrderChangeBuilder withNextValue(
            Function<com.commercetools.history.models.change_value.ShoppingListLineItemValueBuilder, com.commercetools.history.models.change_value.ShoppingListLineItemValueBuilder> builder) {
        this.nextValue = new ArrayList<>();
        this.nextValue.add(
            builder.apply(com.commercetools.history.models.change_value.ShoppingListLineItemValueBuilder.of()).build());
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
     * value of previousValue}
     * @return previousValue
     */

    public java.util.List<com.commercetools.history.models.change_value.ShoppingListLineItemValue> getPreviousValue() {
        return this.previousValue;
    }

    /**
     * value of nextValue}
     * @return nextValue
     */

    public java.util.List<com.commercetools.history.models.change_value.ShoppingListLineItemValue> getNextValue() {
        return this.nextValue;
    }

    /**
     * builds ChangeShoppingListLineItemsOrderChange with checking for non-null required values
     * @return ChangeShoppingListLineItemsOrderChange
     */
    public ChangeShoppingListLineItemsOrderChange build() {
        Objects.requireNonNull(change, ChangeShoppingListLineItemsOrderChange.class + ": change is missing");
        Objects.requireNonNull(previousValue,
            ChangeShoppingListLineItemsOrderChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, ChangeShoppingListLineItemsOrderChange.class + ": nextValue is missing");
        return new ChangeShoppingListLineItemsOrderChangeImpl(change, previousValue, nextValue);
    }

    /**
     * builds ChangeShoppingListLineItemsOrderChange without checking for non-null required values
     * @return ChangeShoppingListLineItemsOrderChange
     */
    public ChangeShoppingListLineItemsOrderChange buildUnchecked() {
        return new ChangeShoppingListLineItemsOrderChangeImpl(change, previousValue, nextValue);
    }

    /**
     * factory method for an instance of ChangeShoppingListLineItemsOrderChangeBuilder
     * @return builder
     */
    public static ChangeShoppingListLineItemsOrderChangeBuilder of() {
        return new ChangeShoppingListLineItemsOrderChangeBuilder();
    }

    /**
     * create builder for ChangeShoppingListLineItemsOrderChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ChangeShoppingListLineItemsOrderChangeBuilder of(
            final ChangeShoppingListLineItemsOrderChange template) {
        ChangeShoppingListLineItemsOrderChangeBuilder builder = new ChangeShoppingListLineItemsOrderChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
