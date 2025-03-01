
package com.commercetools.api.models.me;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * MyShoppingListSetTextLineItemCustomFieldActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MyShoppingListSetTextLineItemCustomFieldAction myShoppingListSetTextLineItemCustomFieldAction = MyShoppingListSetTextLineItemCustomFieldAction.builder()
 *             .textLineItemId("{textLineItemId}")
 *             .name("{name}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class MyShoppingListSetTextLineItemCustomFieldActionBuilder
        implements Builder<MyShoppingListSetTextLineItemCustomFieldAction> {

    private String textLineItemId;

    private String name;

    @Nullable
    private java.lang.Object value;

    /**
     *  <p>The <code>id</code> of the TextLineItem to update.</p>
     * @param textLineItemId value to be set
     * @return Builder
     */

    public MyShoppingListSetTextLineItemCustomFieldActionBuilder textLineItemId(final String textLineItemId) {
        this.textLineItemId = textLineItemId;
        return this;
    }

    /**
     *  <p>Name of the Custom Field.</p>
     * @param name value to be set
     * @return Builder
     */

    public MyShoppingListSetTextLineItemCustomFieldActionBuilder name(final String name) {
        this.name = name;
        return this;
    }

    /**
     *  <p>If <code>value</code> is absent or <code>null</code>, this field will be removed if it exists. Removing a field that does not exist returns an InvalidOperation error. If <code>value</code> is provided, it is set for the field defined by <code>name</code>.</p>
     * @param value value to be set
     * @return Builder
     */

    public MyShoppingListSetTextLineItemCustomFieldActionBuilder value(@Nullable final java.lang.Object value) {
        this.value = value;
        return this;
    }

    /**
     *  <p>The <code>id</code> of the TextLineItem to update.</p>
     * @return textLineItemId
     */

    public String getTextLineItemId() {
        return this.textLineItemId;
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
     * builds MyShoppingListSetTextLineItemCustomFieldAction with checking for non-null required values
     * @return MyShoppingListSetTextLineItemCustomFieldAction
     */
    public MyShoppingListSetTextLineItemCustomFieldAction build() {
        Objects.requireNonNull(textLineItemId,
            MyShoppingListSetTextLineItemCustomFieldAction.class + ": textLineItemId is missing");
        Objects.requireNonNull(name, MyShoppingListSetTextLineItemCustomFieldAction.class + ": name is missing");
        return new MyShoppingListSetTextLineItemCustomFieldActionImpl(textLineItemId, name, value);
    }

    /**
     * builds MyShoppingListSetTextLineItemCustomFieldAction without checking for non-null required values
     * @return MyShoppingListSetTextLineItemCustomFieldAction
     */
    public MyShoppingListSetTextLineItemCustomFieldAction buildUnchecked() {
        return new MyShoppingListSetTextLineItemCustomFieldActionImpl(textLineItemId, name, value);
    }

    /**
     * factory method for an instance of MyShoppingListSetTextLineItemCustomFieldActionBuilder
     * @return builder
     */
    public static MyShoppingListSetTextLineItemCustomFieldActionBuilder of() {
        return new MyShoppingListSetTextLineItemCustomFieldActionBuilder();
    }

    /**
     * create builder for MyShoppingListSetTextLineItemCustomFieldAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static MyShoppingListSetTextLineItemCustomFieldActionBuilder of(
            final MyShoppingListSetTextLineItemCustomFieldAction template) {
        MyShoppingListSetTextLineItemCustomFieldActionBuilder builder = new MyShoppingListSetTextLineItemCustomFieldActionBuilder();
        builder.textLineItemId = template.getTextLineItemId();
        builder.name = template.getName();
        builder.value = template.getValue();
        return builder;
    }

}
