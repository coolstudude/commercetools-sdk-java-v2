
package com.commercetools.history.models.change;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * RemoveStateRolesChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     RemoveStateRolesChange removeStateRolesChange = RemoveStateRolesChange.builder()
 *             .change("{change}")
 *             .plusPreviousValue(previousValueBuilder -> previousValueBuilder)
 *             .plusNextValue(nextValueBuilder -> nextValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class RemoveStateRolesChangeBuilder implements Builder<RemoveStateRolesChange> {

    private String change;

    private java.util.List<com.commercetools.history.models.common.StateRole> previousValue;

    private java.util.List<com.commercetools.history.models.common.StateRole> nextValue;

    /**
     * set the value to the change
     * @param change value to be set
     * @return Builder
     */

    public RemoveStateRolesChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     * @return Builder
     */

    public RemoveStateRolesChangeBuilder previousValue(
            final com.commercetools.history.models.common.StateRole... previousValue) {
        this.previousValue = new ArrayList<>(Arrays.asList(previousValue));
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     * @return Builder
     */

    public RemoveStateRolesChangeBuilder previousValue(
            final java.util.List<com.commercetools.history.models.common.StateRole> previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     * @return Builder
     */

    public RemoveStateRolesChangeBuilder plusPreviousValue(
            final com.commercetools.history.models.common.StateRole... previousValue) {
        if (this.previousValue == null) {
            this.previousValue = new ArrayList<>();
        }
        this.previousValue.addAll(Arrays.asList(previousValue));
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     * @return Builder
     */

    public RemoveStateRolesChangeBuilder nextValue(
            final com.commercetools.history.models.common.StateRole... nextValue) {
        this.nextValue = new ArrayList<>(Arrays.asList(nextValue));
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     * @return Builder
     */

    public RemoveStateRolesChangeBuilder nextValue(
            final java.util.List<com.commercetools.history.models.common.StateRole> nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     * @return Builder
     */

    public RemoveStateRolesChangeBuilder plusNextValue(
            final com.commercetools.history.models.common.StateRole... nextValue) {
        if (this.nextValue == null) {
            this.nextValue = new ArrayList<>();
        }
        this.nextValue.addAll(Arrays.asList(nextValue));
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
     *  <p>Value before the change.</p>
     * @return previousValue
     */

    public java.util.List<com.commercetools.history.models.common.StateRole> getPreviousValue() {
        return this.previousValue;
    }

    /**
     *  <p>Value after the change.</p>
     * @return nextValue
     */

    public java.util.List<com.commercetools.history.models.common.StateRole> getNextValue() {
        return this.nextValue;
    }

    /**
     * builds RemoveStateRolesChange with checking for non-null required values
     * @return RemoveStateRolesChange
     */
    public RemoveStateRolesChange build() {
        Objects.requireNonNull(change, RemoveStateRolesChange.class + ": change is missing");
        Objects.requireNonNull(previousValue, RemoveStateRolesChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, RemoveStateRolesChange.class + ": nextValue is missing");
        return new RemoveStateRolesChangeImpl(change, previousValue, nextValue);
    }

    /**
     * builds RemoveStateRolesChange without checking for non-null required values
     * @return RemoveStateRolesChange
     */
    public RemoveStateRolesChange buildUnchecked() {
        return new RemoveStateRolesChangeImpl(change, previousValue, nextValue);
    }

    /**
     * factory method for an instance of RemoveStateRolesChangeBuilder
     * @return builder
     */
    public static RemoveStateRolesChangeBuilder of() {
        return new RemoveStateRolesChangeBuilder();
    }

    /**
     * create builder for RemoveStateRolesChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static RemoveStateRolesChangeBuilder of(final RemoveStateRolesChange template) {
        RemoveStateRolesChangeBuilder builder = new RemoveStateRolesChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
