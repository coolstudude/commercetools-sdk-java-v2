
package com.commercetools.history.models.change;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * RemoveChannelRolesChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     RemoveChannelRolesChange removeChannelRolesChange = RemoveChannelRolesChange.builder()
 *             .change("{change}")
 *             .plusPreviousValue(previousValueBuilder -> previousValueBuilder)
 *             .plusNextValue(nextValueBuilder -> nextValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class RemoveChannelRolesChangeBuilder implements Builder<RemoveChannelRolesChange> {

    private String change;

    private java.util.List<com.commercetools.history.models.common.ChannelRole> previousValue;

    private java.util.List<com.commercetools.history.models.common.ChannelRole> nextValue;

    /**
     * set the value to the change
     * @param change value to be set
     * @return Builder
     */

    public RemoveChannelRolesChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     * @return Builder
     */

    public RemoveChannelRolesChangeBuilder previousValue(
            final com.commercetools.history.models.common.ChannelRole... previousValue) {
        this.previousValue = new ArrayList<>(Arrays.asList(previousValue));
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     * @return Builder
     */

    public RemoveChannelRolesChangeBuilder previousValue(
            final java.util.List<com.commercetools.history.models.common.ChannelRole> previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     * @return Builder
     */

    public RemoveChannelRolesChangeBuilder plusPreviousValue(
            final com.commercetools.history.models.common.ChannelRole... previousValue) {
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

    public RemoveChannelRolesChangeBuilder nextValue(
            final com.commercetools.history.models.common.ChannelRole... nextValue) {
        this.nextValue = new ArrayList<>(Arrays.asList(nextValue));
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     * @return Builder
     */

    public RemoveChannelRolesChangeBuilder nextValue(
            final java.util.List<com.commercetools.history.models.common.ChannelRole> nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     * @return Builder
     */

    public RemoveChannelRolesChangeBuilder plusNextValue(
            final com.commercetools.history.models.common.ChannelRole... nextValue) {
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

    public java.util.List<com.commercetools.history.models.common.ChannelRole> getPreviousValue() {
        return this.previousValue;
    }

    /**
     *  <p>Value after the change.</p>
     * @return nextValue
     */

    public java.util.List<com.commercetools.history.models.common.ChannelRole> getNextValue() {
        return this.nextValue;
    }

    /**
     * builds RemoveChannelRolesChange with checking for non-null required values
     * @return RemoveChannelRolesChange
     */
    public RemoveChannelRolesChange build() {
        Objects.requireNonNull(change, RemoveChannelRolesChange.class + ": change is missing");
        Objects.requireNonNull(previousValue, RemoveChannelRolesChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, RemoveChannelRolesChange.class + ": nextValue is missing");
        return new RemoveChannelRolesChangeImpl(change, previousValue, nextValue);
    }

    /**
     * builds RemoveChannelRolesChange without checking for non-null required values
     * @return RemoveChannelRolesChange
     */
    public RemoveChannelRolesChange buildUnchecked() {
        return new RemoveChannelRolesChangeImpl(change, previousValue, nextValue);
    }

    /**
     * factory method for an instance of RemoveChannelRolesChangeBuilder
     * @return builder
     */
    public static RemoveChannelRolesChangeBuilder of() {
        return new RemoveChannelRolesChangeBuilder();
    }

    /**
     * create builder for RemoveChannelRolesChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static RemoveChannelRolesChangeBuilder of(final RemoveChannelRolesChange template) {
        RemoveChannelRolesChangeBuilder builder = new RemoveChannelRolesChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
