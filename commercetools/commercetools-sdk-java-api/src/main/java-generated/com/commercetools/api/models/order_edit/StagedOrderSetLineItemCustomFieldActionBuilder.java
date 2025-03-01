
package com.commercetools.api.models.order_edit;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * StagedOrderSetLineItemCustomFieldActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StagedOrderSetLineItemCustomFieldAction stagedOrderSetLineItemCustomFieldAction = StagedOrderSetLineItemCustomFieldAction.builder()
 *             .lineItemId("{lineItemId}")
 *             .name("{name}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StagedOrderSetLineItemCustomFieldActionBuilder
        implements Builder<StagedOrderSetLineItemCustomFieldAction> {

    private String lineItemId;

    private String name;

    @Nullable
    private java.lang.Object value;

    /**
     * set the value to the lineItemId
     * @param lineItemId value to be set
     * @return Builder
     */

    public StagedOrderSetLineItemCustomFieldActionBuilder lineItemId(final String lineItemId) {
        this.lineItemId = lineItemId;
        return this;
    }

    /**
     *  <p>Name of the Custom Field.</p>
     * @param name value to be set
     * @return Builder
     */

    public StagedOrderSetLineItemCustomFieldActionBuilder name(final String name) {
        this.name = name;
        return this;
    }

    /**
     *  <p>If <code>value</code> is absent or <code>null</code>, this field will be removed if it exists. Removing a field that does not exist returns an InvalidOperation error. If <code>value</code> is provided, it is set for the field defined by <code>name</code>.</p>
     * @param value value to be set
     * @return Builder
     */

    public StagedOrderSetLineItemCustomFieldActionBuilder value(@Nullable final java.lang.Object value) {
        this.value = value;
        return this;
    }

    /**
     * value of lineItemId}
     * @return lineItemId
     */

    public String getLineItemId() {
        return this.lineItemId;
    }

    /**
     *  <p>Name of the Custom Field.</p>
     * @return name
     */

    public String getName() {
        return this.name;
    }

    /**
     *  <p>If <code>value</code> is absent or <code>null</code>, this field will be removed if it exists. Removing a field that does not exist returns an InvalidOperation error. If <code>value</code> is provided, it is set for the field defined by <code>name</code>.</p>
     * @return value
     */

    @Nullable
    public java.lang.Object getValue() {
        return this.value;
    }

    /**
     * builds StagedOrderSetLineItemCustomFieldAction with checking for non-null required values
     * @return StagedOrderSetLineItemCustomFieldAction
     */
    public StagedOrderSetLineItemCustomFieldAction build() {
        Objects.requireNonNull(lineItemId, StagedOrderSetLineItemCustomFieldAction.class + ": lineItemId is missing");
        Objects.requireNonNull(name, StagedOrderSetLineItemCustomFieldAction.class + ": name is missing");
        return new StagedOrderSetLineItemCustomFieldActionImpl(lineItemId, name, value);
    }

    /**
     * builds StagedOrderSetLineItemCustomFieldAction without checking for non-null required values
     * @return StagedOrderSetLineItemCustomFieldAction
     */
    public StagedOrderSetLineItemCustomFieldAction buildUnchecked() {
        return new StagedOrderSetLineItemCustomFieldActionImpl(lineItemId, name, value);
    }

    /**
     * factory method for an instance of StagedOrderSetLineItemCustomFieldActionBuilder
     * @return builder
     */
    public static StagedOrderSetLineItemCustomFieldActionBuilder of() {
        return new StagedOrderSetLineItemCustomFieldActionBuilder();
    }

    /**
     * create builder for StagedOrderSetLineItemCustomFieldAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StagedOrderSetLineItemCustomFieldActionBuilder of(
            final StagedOrderSetLineItemCustomFieldAction template) {
        StagedOrderSetLineItemCustomFieldActionBuilder builder = new StagedOrderSetLineItemCustomFieldActionBuilder();
        builder.lineItemId = template.getLineItemId();
        builder.name = template.getName();
        builder.value = template.getValue();
        return builder;
    }

}
