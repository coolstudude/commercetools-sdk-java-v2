
package com.commercetools.api.models.me;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * MyShoppingListSetLineItemCustomTypeActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MyShoppingListSetLineItemCustomTypeAction myShoppingListSetLineItemCustomTypeAction = MyShoppingListSetLineItemCustomTypeAction.builder()
 *             .lineItemId("{lineItemId}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class MyShoppingListSetLineItemCustomTypeActionBuilder
        implements Builder<MyShoppingListSetLineItemCustomTypeAction> {

    private String lineItemId;

    @Nullable
    private com.commercetools.api.models.type.TypeResourceIdentifier type;

    @Nullable
    private com.commercetools.api.models.type.FieldContainer fields;

    /**
     *  <p>Unique identifier of an existing ShoppingListLineItem in the ShoppingList.</p>
     * @param lineItemId
     * @return Builder
     */

    public MyShoppingListSetLineItemCustomTypeActionBuilder lineItemId(final String lineItemId) {
        this.lineItemId = lineItemId;
        return this;
    }

    /**
     *  <p>Defines the Type that extends the ShoppingListLineItem with Custom Fields. If absent, any existing Type and Custom Fields are removed from the ShoppingListLineItem.</p>
     * @return Builder
     */

    public MyShoppingListSetLineItemCustomTypeActionBuilder type(
            Function<com.commercetools.api.models.type.TypeResourceIdentifierBuilder, com.commercetools.api.models.type.TypeResourceIdentifierBuilder> builder) {
        this.type = builder.apply(com.commercetools.api.models.type.TypeResourceIdentifierBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Defines the Type that extends the ShoppingListLineItem with Custom Fields. If absent, any existing Type and Custom Fields are removed from the ShoppingListLineItem.</p>
     * @param type
     * @return Builder
     */

    public MyShoppingListSetLineItemCustomTypeActionBuilder type(
            @Nullable final com.commercetools.api.models.type.TypeResourceIdentifier type) {
        this.type = type;
        return this;
    }

    /**
     *  <p>Sets the Custom Fields fields for the ShoppingListLineItem.</p>
     * @return Builder
     */

    public MyShoppingListSetLineItemCustomTypeActionBuilder fields(
            Function<com.commercetools.api.models.type.FieldContainerBuilder, com.commercetools.api.models.type.FieldContainerBuilder> builder) {
        this.fields = builder.apply(com.commercetools.api.models.type.FieldContainerBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Sets the Custom Fields fields for the ShoppingListLineItem.</p>
     * @param fields
     * @return Builder
     */

    public MyShoppingListSetLineItemCustomTypeActionBuilder fields(
            @Nullable final com.commercetools.api.models.type.FieldContainer fields) {
        this.fields = fields;
        return this;
    }

    public String getLineItemId() {
        return this.lineItemId;
    }

    @Nullable
    public com.commercetools.api.models.type.TypeResourceIdentifier getType() {
        return this.type;
    }

    @Nullable
    public com.commercetools.api.models.type.FieldContainer getFields() {
        return this.fields;
    }

    public MyShoppingListSetLineItemCustomTypeAction build() {
        Objects.requireNonNull(lineItemId, MyShoppingListSetLineItemCustomTypeAction.class + ": lineItemId is missing");
        return new MyShoppingListSetLineItemCustomTypeActionImpl(lineItemId, type, fields);
    }

    /**
     * builds MyShoppingListSetLineItemCustomTypeAction without checking for non null required values
     */
    public MyShoppingListSetLineItemCustomTypeAction buildUnchecked() {
        return new MyShoppingListSetLineItemCustomTypeActionImpl(lineItemId, type, fields);
    }

    public static MyShoppingListSetLineItemCustomTypeActionBuilder of() {
        return new MyShoppingListSetLineItemCustomTypeActionBuilder();
    }

    public static MyShoppingListSetLineItemCustomTypeActionBuilder of(
            final MyShoppingListSetLineItemCustomTypeAction template) {
        MyShoppingListSetLineItemCustomTypeActionBuilder builder = new MyShoppingListSetLineItemCustomTypeActionBuilder();
        builder.lineItemId = template.getLineItemId();
        builder.type = template.getType();
        builder.fields = template.getFields();
        return builder;
    }

}
