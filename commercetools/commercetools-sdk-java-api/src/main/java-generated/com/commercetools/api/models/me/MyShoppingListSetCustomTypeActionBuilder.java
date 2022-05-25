
package com.commercetools.api.models.me;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * MyShoppingListSetCustomTypeActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MyShoppingListSetCustomTypeAction myShoppingListSetCustomTypeAction = MyShoppingListSetCustomTypeAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class MyShoppingListSetCustomTypeActionBuilder implements Builder<MyShoppingListSetCustomTypeAction> {

    @Nullable
    private com.commercetools.api.models.type.TypeResourceIdentifier type;

    @Nullable
    private com.commercetools.api.models.type.FieldContainer fields;

    /**
     *  <p>Defines the Type that extends the MyShoppingList with Custom Fields. If absent, any existing Type and Custom Fields are removed from the MyShoppingList.</p>
     */

    public MyShoppingListSetCustomTypeActionBuilder type(
            Function<com.commercetools.api.models.type.TypeResourceIdentifierBuilder, com.commercetools.api.models.type.TypeResourceIdentifierBuilder> builder) {
        this.type = builder.apply(com.commercetools.api.models.type.TypeResourceIdentifierBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Defines the Type that extends the MyShoppingList with Custom Fields. If absent, any existing Type and Custom Fields are removed from the MyShoppingList.</p>
     */

    public MyShoppingListSetCustomTypeActionBuilder type(
            @Nullable final com.commercetools.api.models.type.TypeResourceIdentifier type) {
        this.type = type;
        return this;
    }

    /**
     *  <p>Sets the Custom Fields fields for the MyShoppingList.</p>
     */

    public MyShoppingListSetCustomTypeActionBuilder fields(
            Function<com.commercetools.api.models.type.FieldContainerBuilder, com.commercetools.api.models.type.FieldContainerBuilder> builder) {
        this.fields = builder.apply(com.commercetools.api.models.type.FieldContainerBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Sets the Custom Fields fields for the MyShoppingList.</p>
     */

    public MyShoppingListSetCustomTypeActionBuilder fields(
            @Nullable final com.commercetools.api.models.type.FieldContainer fields) {
        this.fields = fields;
        return this;
    }

    @Nullable
    public com.commercetools.api.models.type.TypeResourceIdentifier getType() {
        return this.type;
    }

    @Nullable
    public com.commercetools.api.models.type.FieldContainer getFields() {
        return this.fields;
    }

    public MyShoppingListSetCustomTypeAction build() {
        return new MyShoppingListSetCustomTypeActionImpl(type, fields);
    }

    /**
     * builds MyShoppingListSetCustomTypeAction without checking for non null required values
     */
    public MyShoppingListSetCustomTypeAction buildUnchecked() {
        return new MyShoppingListSetCustomTypeActionImpl(type, fields);
    }

    public static MyShoppingListSetCustomTypeActionBuilder of() {
        return new MyShoppingListSetCustomTypeActionBuilder();
    }

    public static MyShoppingListSetCustomTypeActionBuilder of(final MyShoppingListSetCustomTypeAction template) {
        MyShoppingListSetCustomTypeActionBuilder builder = new MyShoppingListSetCustomTypeActionBuilder();
        builder.type = template.getType();
        builder.fields = template.getFields();
        return builder;
    }

}
