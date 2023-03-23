
package com.commercetools.api.models.inventory;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * InventoryEntrySetCustomFieldActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     InventoryEntrySetCustomFieldAction inventoryEntrySetCustomFieldAction = InventoryEntrySetCustomFieldAction.builder()
 *             .name("{name}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class InventoryEntrySetCustomFieldActionBuilder implements Builder<InventoryEntrySetCustomFieldAction> {

    private String name;

    @Nullable
    private java.lang.Object value;

    /**
     *  <p>Name of the Custom Field.</p>
     * @param name
     * @return Builder
     */

    public InventoryEntrySetCustomFieldActionBuilder name(final String name) {
        this.name = name;
        return this;
    }

    /**
     *  <p>If <code>value</code> is absent or <code>null</code>, this field will be removed if it exists. Removing a field that does not exist returns an InvalidOperation error. If <code>value</code> is provided, it is set for the field defined by <code>name</code>.</p>
     * @param value
     * @return Builder
     */

    public InventoryEntrySetCustomFieldActionBuilder value(@Nullable final java.lang.Object value) {
        this.value = value;
        return this;
    }

    public String getName() {
        return this.name;
    }

    @Nullable
    public java.lang.Object getValue() {
        return this.value;
    }

    public InventoryEntrySetCustomFieldAction build() {
        Objects.requireNonNull(name, InventoryEntrySetCustomFieldAction.class + ": name is missing");
        return new InventoryEntrySetCustomFieldActionImpl(name, value);
    }

    /**
     * builds InventoryEntrySetCustomFieldAction without checking for non null required values
     */
    public InventoryEntrySetCustomFieldAction buildUnchecked() {
        return new InventoryEntrySetCustomFieldActionImpl(name, value);
    }

    public static InventoryEntrySetCustomFieldActionBuilder of() {
        return new InventoryEntrySetCustomFieldActionBuilder();
    }

    public static InventoryEntrySetCustomFieldActionBuilder of(final InventoryEntrySetCustomFieldAction template) {
        InventoryEntrySetCustomFieldActionBuilder builder = new InventoryEntrySetCustomFieldActionBuilder();
        builder.name = template.getName();
        builder.value = template.getValue();
        return builder;
    }

}
