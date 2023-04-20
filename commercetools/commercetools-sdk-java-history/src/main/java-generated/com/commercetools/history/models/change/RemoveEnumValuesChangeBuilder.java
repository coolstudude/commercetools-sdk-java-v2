
package com.commercetools.history.models.change;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * RemoveEnumValuesChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     RemoveEnumValuesChange removeEnumValuesChange = RemoveEnumValuesChange.builder()
 *             .change("{change}")
 *             .attributeName("{attributeName}")
 *             .previousValue(previousValueBuilder -> previousValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class RemoveEnumValuesChangeBuilder implements Builder<RemoveEnumValuesChange> {

    private String change;

    private String attributeName;

    private com.commercetools.history.models.change_value.EnumValue previousValue;

    /**
     *  <p>Update action for <code>removeEnumValues</code> on product types</p>
     * @param change value to be set
     * @return Builder
     */

    public RemoveEnumValuesChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     *  <p>The name of the attribute updated.</p>
     * @param attributeName value to be set
     * @return Builder
     */

    public RemoveEnumValuesChangeBuilder attributeName(final String attributeName) {
        this.attributeName = attributeName;
        return this;
    }

    /**
     * set the value to the previousValue using the builder function
     * @param builder function to build the previousValue value
     * @return Builder
     */

    public RemoveEnumValuesChangeBuilder previousValue(
            Function<com.commercetools.history.models.change_value.EnumValueBuilder, com.commercetools.history.models.change_value.EnumValueBuilder> builder) {
        this.previousValue = builder.apply(com.commercetools.history.models.change_value.EnumValueBuilder.of()).build();
        return this;
    }

    /**
     * set the value to the previousValue using the builder function
     * @param builder function to build the previousValue value
     * @return Builder
     */

    public RemoveEnumValuesChangeBuilder withPreviousValue(
            Function<com.commercetools.history.models.change_value.EnumValueBuilder, com.commercetools.history.models.change_value.EnumValue> builder) {
        this.previousValue = builder.apply(com.commercetools.history.models.change_value.EnumValueBuilder.of());
        return this;
    }

    /**
     * set the value to the previousValue
     * @param previousValue value to be set
     * @return Builder
     */

    public RemoveEnumValuesChangeBuilder previousValue(
            final com.commercetools.history.models.change_value.EnumValue previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    /**
     *  <p>Update action for <code>removeEnumValues</code> on product types</p>
     * @return change
     */

    public String getChange() {
        return this.change;
    }

    /**
     *  <p>The name of the attribute updated.</p>
     * @return attributeName
     */

    public String getAttributeName() {
        return this.attributeName;
    }

    /**
     * value of previousValue}
     * @return previousValue
     */

    public com.commercetools.history.models.change_value.EnumValue getPreviousValue() {
        return this.previousValue;
    }

    /**
     * builds RemoveEnumValuesChange with checking for non-null required values
     * @return RemoveEnumValuesChange
     */
    public RemoveEnumValuesChange build() {
        Objects.requireNonNull(change, RemoveEnumValuesChange.class + ": change is missing");
        Objects.requireNonNull(attributeName, RemoveEnumValuesChange.class + ": attributeName is missing");
        Objects.requireNonNull(previousValue, RemoveEnumValuesChange.class + ": previousValue is missing");
        return new RemoveEnumValuesChangeImpl(change, attributeName, previousValue);
    }

    /**
     * builds RemoveEnumValuesChange without checking for non-null required values
     * @return RemoveEnumValuesChange
     */
    public RemoveEnumValuesChange buildUnchecked() {
        return new RemoveEnumValuesChangeImpl(change, attributeName, previousValue);
    }

    /**
     * factory method for an instance of RemoveEnumValuesChangeBuilder
     * @return builder
     */
    public static RemoveEnumValuesChangeBuilder of() {
        return new RemoveEnumValuesChangeBuilder();
    }

    /**
     * create builder for RemoveEnumValuesChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static RemoveEnumValuesChangeBuilder of(final RemoveEnumValuesChange template) {
        RemoveEnumValuesChangeBuilder builder = new RemoveEnumValuesChangeBuilder();
        builder.change = template.getChange();
        builder.attributeName = template.getAttributeName();
        builder.previousValue = template.getPreviousValue();
        return builder;
    }

}
