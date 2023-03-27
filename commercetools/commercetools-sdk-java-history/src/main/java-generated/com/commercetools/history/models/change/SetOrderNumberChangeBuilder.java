
package com.commercetools.history.models.change;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * SetOrderNumberChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetOrderNumberChange setOrderNumberChange = SetOrderNumberChange.builder()
 *             .change("{change}")
 *             .previousValue("{previousValue}")
 *             .nextValue("{nextValue}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SetOrderNumberChangeBuilder implements Builder<SetOrderNumberChange> {

    private String change;

    private String previousValue;

    private String nextValue;

    /**
     *  <p>Shape of the action for <code>setOrderNumber</code></p>
     * @param change value to be set
     * @return Builder
     */

    public SetOrderNumberChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     * set the value to the previousValue
     * @param previousValue value to be set
     * @return Builder
     */

    public SetOrderNumberChangeBuilder previousValue(final String previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    /**
     * set the value to the nextValue
     * @param nextValue value to be set
     * @return Builder
     */

    public SetOrderNumberChangeBuilder nextValue(final String nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    /**
     *  <p>Shape of the action for <code>setOrderNumber</code></p>
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
     * builds SetOrderNumberChange with checking for non-null required values
     * @return SetOrderNumberChange
     */
    public SetOrderNumberChange build() {
        Objects.requireNonNull(change, SetOrderNumberChange.class + ": change is missing");
        Objects.requireNonNull(previousValue, SetOrderNumberChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, SetOrderNumberChange.class + ": nextValue is missing");
        return new SetOrderNumberChangeImpl(change, previousValue, nextValue);
    }

    /**
     * builds SetOrderNumberChange without checking for non-null required values
     * @return SetOrderNumberChange
     */
    public SetOrderNumberChange buildUnchecked() {
        return new SetOrderNumberChangeImpl(change, previousValue, nextValue);
    }

    /**
     * factory method for an instance of SetOrderNumberChangeBuilder
     * @return builder
     */
    public static SetOrderNumberChangeBuilder of() {
        return new SetOrderNumberChangeBuilder();
    }

    /**
     * create builder for SetOrderNumberChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetOrderNumberChangeBuilder of(final SetOrderNumberChange template) {
        SetOrderNumberChangeBuilder builder = new SetOrderNumberChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
