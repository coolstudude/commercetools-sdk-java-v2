
package com.commercetools.history.models.change;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * AddProductChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     AddProductChange addProductChange = AddProductChange.builder()
 *             .change("{change}")
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class AddProductChangeBuilder implements Builder<AddProductChange> {

    private String change;

    private com.commercetools.history.models.common.Reference nextValue;

    /**
     * set the value to the change
     * @param change value to be set
     * @return Builder
     */

    public AddProductChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param builder function to build the nextValue value
     * @return Builder
     */

    public AddProductChangeBuilder nextValue(
            Function<com.commercetools.history.models.common.ReferenceBuilder, com.commercetools.history.models.common.ReferenceBuilder> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.common.ReferenceBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param builder function to build the nextValue value
     * @return Builder
     */

    public AddProductChangeBuilder withNextValue(
            Function<com.commercetools.history.models.common.ReferenceBuilder, com.commercetools.history.models.common.Reference> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.common.ReferenceBuilder.of());
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     * @return Builder
     */

    public AddProductChangeBuilder nextValue(final com.commercetools.history.models.common.Reference nextValue) {
        this.nextValue = nextValue;
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
     *  <p>Value after the change.</p>
     * @return nextValue
     */

    public com.commercetools.history.models.common.Reference getNextValue() {
        return this.nextValue;
    }

    /**
     * builds AddProductChange with checking for non-null required values
     * @return AddProductChange
     */
    public AddProductChange build() {
        Objects.requireNonNull(change, AddProductChange.class + ": change is missing");
        Objects.requireNonNull(nextValue, AddProductChange.class + ": nextValue is missing");
        return new AddProductChangeImpl(change, nextValue);
    }

    /**
     * builds AddProductChange without checking for non-null required values
     * @return AddProductChange
     */
    public AddProductChange buildUnchecked() {
        return new AddProductChangeImpl(change, nextValue);
    }

    /**
     * factory method for an instance of AddProductChangeBuilder
     * @return builder
     */
    public static AddProductChangeBuilder of() {
        return new AddProductChangeBuilder();
    }

    /**
     * create builder for AddProductChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static AddProductChangeBuilder of(final AddProductChange template) {
        AddProductChangeBuilder builder = new AddProductChangeBuilder();
        builder.change = template.getChange();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
