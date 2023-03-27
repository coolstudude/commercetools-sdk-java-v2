
package com.commercetools.history.models.change;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * SetValidFromChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetValidFromChange setValidFromChange = SetValidFromChange.builder()
 *             .change("{change}")
 *             .previousValue("{previousValue}")
 *             .nextValue("{nextValue}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SetValidFromChangeBuilder implements Builder<SetValidFromChange> {

    private String change;

    private String previousValue;

    private String nextValue;

    /**
     *  <p>Shape of the action for <code>setValidFrom</code></p>
     * @param change value to be set
     * @return Builder
     */

    public SetValidFromChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     * set the value to the previousValue
     * @param previousValue value to be set
     * @return Builder
     */

    public SetValidFromChangeBuilder previousValue(final String previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    /**
     * set the value to the nextValue
     * @param nextValue value to be set
     * @return Builder
     */

    public SetValidFromChangeBuilder nextValue(final String nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    /**
     *  <p>Shape of the action for <code>setValidFrom</code></p>
     * @return change
     */

    public String getChange() {
        return this.change;
    }

    /**
     * value of previousValue}
     * @return previousValue
     */

    public String getPreviousValue() {
        return this.previousValue;
    }

    /**
     * value of nextValue}
     * @return nextValue
     */

    public String getNextValue() {
        return this.nextValue;
    }

    /**
     * builds SetValidFromChange with checking for non-null required values
     * @return SetValidFromChange
     */
    public SetValidFromChange build() {
        Objects.requireNonNull(change, SetValidFromChange.class + ": change is missing");
        Objects.requireNonNull(previousValue, SetValidFromChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, SetValidFromChange.class + ": nextValue is missing");
        return new SetValidFromChangeImpl(change, previousValue, nextValue);
    }

    /**
     * builds SetValidFromChange without checking for non-null required values
     * @return SetValidFromChange
     */
    public SetValidFromChange buildUnchecked() {
        return new SetValidFromChangeImpl(change, previousValue, nextValue);
    }

    /**
     * factory method for an instance of SetValidFromChangeBuilder
     * @return builder
     */
    public static SetValidFromChangeBuilder of() {
        return new SetValidFromChangeBuilder();
    }

    /**
     * create builder for SetValidFromChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetValidFromChangeBuilder of(final SetValidFromChange template) {
        SetValidFromChangeBuilder builder = new SetValidFromChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
