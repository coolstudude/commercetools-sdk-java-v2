
package com.commercetools.api.models.shopping_list;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * ShoppingListSetTextLineItemCustomFieldAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ShoppingListSetTextLineItemCustomFieldAction shoppingListSetTextLineItemCustomFieldAction = ShoppingListSetTextLineItemCustomFieldAction.builder()
 *             .textLineItemId("{textLineItemId}")
 *             .name("{name}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ShoppingListSetTextLineItemCustomFieldActionImpl.class)
public interface ShoppingListSetTextLineItemCustomFieldAction extends ShoppingListUpdateAction {

    /**
     * discriminator value for ShoppingListSetTextLineItemCustomFieldAction
     */
    String SET_TEXT_LINE_ITEM_CUSTOM_FIELD = "setTextLineItemCustomField";

    /**
     *  <p>The <code>id</code> of the TextLineItem to update.</p>
     * @return textLineItemId
     */
    @NotNull
    @JsonProperty("textLineItemId")
    public String getTextLineItemId();

    /**
     *  <p>Name of the Custom Field.</p>
     * @return name
     */
    @NotNull
    @JsonProperty("name")
    public String getName();

    /**
     *  <p>If <code>value</code> is absent or <code>null</code>, this field will be removed if it exists. Removing a field that does not exist returns an InvalidOperation error. If <code>value</code> is provided, it is set for the field defined by <code>name</code>.</p>
     * @return value
     */

    @JsonProperty("value")
    public Object getValue();

    /**
     *  <p>The <code>id</code> of the TextLineItem to update.</p>
     * @param textLineItemId value to be set
     */

    public void setTextLineItemId(final String textLineItemId);

    /**
     *  <p>Name of the Custom Field.</p>
     * @param name value to be set
     */

    public void setName(final String name);

    /**
     *  <p>If <code>value</code> is absent or <code>null</code>, this field will be removed if it exists. Removing a field that does not exist returns an InvalidOperation error. If <code>value</code> is provided, it is set for the field defined by <code>name</code>.</p>
     * @param value value to be set
     */

    public void setValue(final Object value);

    /**
     * factory method
     * @return instance of ShoppingListSetTextLineItemCustomFieldAction
     */
    public static ShoppingListSetTextLineItemCustomFieldAction of() {
        return new ShoppingListSetTextLineItemCustomFieldActionImpl();
    }

    /**
     * factory method to create a shallow copy ShoppingListSetTextLineItemCustomFieldAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static ShoppingListSetTextLineItemCustomFieldAction of(
            final ShoppingListSetTextLineItemCustomFieldAction template) {
        ShoppingListSetTextLineItemCustomFieldActionImpl instance = new ShoppingListSetTextLineItemCustomFieldActionImpl();
        instance.setTextLineItemId(template.getTextLineItemId());
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        return instance;
    }

    /**
     * factory method to create a deep copy of ShoppingListSetTextLineItemCustomFieldAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ShoppingListSetTextLineItemCustomFieldAction deepCopy(
            @Nullable final ShoppingListSetTextLineItemCustomFieldAction template) {
        if (template == null) {
            return null;
        }
        ShoppingListSetTextLineItemCustomFieldActionImpl instance = new ShoppingListSetTextLineItemCustomFieldActionImpl();
        instance.setTextLineItemId(template.getTextLineItemId());
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        return instance;
    }

    /**
     * builder factory method for ShoppingListSetTextLineItemCustomFieldAction
     * @return builder
     */
    public static ShoppingListSetTextLineItemCustomFieldActionBuilder builder() {
        return ShoppingListSetTextLineItemCustomFieldActionBuilder.of();
    }

    /**
     * create builder for ShoppingListSetTextLineItemCustomFieldAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ShoppingListSetTextLineItemCustomFieldActionBuilder builder(
            final ShoppingListSetTextLineItemCustomFieldAction template) {
        return ShoppingListSetTextLineItemCustomFieldActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withShoppingListSetTextLineItemCustomFieldAction(
            Function<ShoppingListSetTextLineItemCustomFieldAction, T> helper) {
        return helper.apply(this);
    }

    public static ShoppingListSetTextLineItemCustomFieldAction ofUnset(final String name, final String textLineItemId) {
        return ShoppingListSetTextLineItemCustomFieldActionBuilder.of()
                .name(name)
                .textLineItemId(textLineItemId)
                .build();
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ShoppingListSetTextLineItemCustomFieldAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ShoppingListSetTextLineItemCustomFieldAction>() {
            @Override
            public String toString() {
                return "TypeReference<ShoppingListSetTextLineItemCustomFieldAction>";
            }
        };
    }
}
