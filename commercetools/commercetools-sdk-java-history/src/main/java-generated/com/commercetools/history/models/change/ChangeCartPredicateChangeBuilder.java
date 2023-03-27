
package com.commercetools.history.models.change;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ChangeCartPredicateChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ChangeCartPredicateChange changeCartPredicateChange = ChangeCartPredicateChange.builder()
 *             .change("{change}")
 *             .previousValue("{previousValue}")
 *             .nextValue("{nextValue}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ChangeCartPredicateChangeBuilder implements Builder<ChangeCartPredicateChange> {

    private String change;

    private String previousValue;

    private String nextValue;

    /**
     *  <p>Shape of the action for <code>changeCartPredicate</code></p>
     * @param change value to be set
     * @return Builder
     */

    public ChangeCartPredicateChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     * set the value to the previousValue
     * @param previousValue value to be set
     * @return Builder
     */

    public ChangeCartPredicateChangeBuilder previousValue(final String previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    /**
     * set the value to the nextValue
     * @param nextValue value to be set
     * @return Builder
     */

    public ChangeCartPredicateChangeBuilder nextValue(final String nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    /**
     *  <p>Shape of the action for <code>changeCartPredicate</code></p>
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
     * builds ChangeCartPredicateChange with checking for non-null required values
     * @return ChangeCartPredicateChange
     */
    public ChangeCartPredicateChange build() {
        Objects.requireNonNull(change, ChangeCartPredicateChange.class + ": change is missing");
        Objects.requireNonNull(previousValue, ChangeCartPredicateChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, ChangeCartPredicateChange.class + ": nextValue is missing");
        return new ChangeCartPredicateChangeImpl(change, previousValue, nextValue);
    }

    /**
     * builds ChangeCartPredicateChange without checking for non-null required values
     * @return ChangeCartPredicateChange
     */
    public ChangeCartPredicateChange buildUnchecked() {
        return new ChangeCartPredicateChangeImpl(change, previousValue, nextValue);
    }

    /**
     * factory method for an instance of ChangeCartPredicateChangeBuilder
     * @return builder
     */
    public static ChangeCartPredicateChangeBuilder of() {
        return new ChangeCartPredicateChangeBuilder();
    }

    /**
     * create builder for ChangeCartPredicateChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ChangeCartPredicateChangeBuilder of(final ChangeCartPredicateChange template) {
        ChangeCartPredicateChangeBuilder builder = new ChangeCartPredicateChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
