
package com.commercetools.api.models.me;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * MyShoppingListRemoveLineItemAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MyShoppingListRemoveLineItemAction myShoppingListRemoveLineItemAction = MyShoppingListRemoveLineItemAction.builder()
 *             .lineItemId("{lineItemId}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = MyShoppingListRemoveLineItemActionImpl.class)
public interface MyShoppingListRemoveLineItemAction extends MyShoppingListUpdateAction {

    /**
     * discriminator value for MyShoppingListRemoveLineItemAction
     */
    String REMOVE_LINE_ITEM = "removeLineItem";

    /**
     *  <p>The <code>id</code> of the ShoppingListLineItem to update.</p>
     * @return lineItemId
     */
    @NotNull
    @JsonProperty("lineItemId")
    public String getLineItemId();

    /**
     *  <p>Amount to remove from the <code>quantity</code> of the ShoppingListLineItem. If not set, the ShoppingListLineItem is removed from the ShoppingList. If this value matches or exceeds the current <code>quantity</code> of the ShoppingListLineItem, the ShoppingListLineItem is removed from the ShoppingList.</p>
     * @return quantity
     */

    @JsonProperty("quantity")
    public Long getQuantity();

    /**
     *  <p>The <code>id</code> of the ShoppingListLineItem to update.</p>
     * @param lineItemId value to be set
     */

    public void setLineItemId(final String lineItemId);

    /**
     *  <p>Amount to remove from the <code>quantity</code> of the ShoppingListLineItem. If not set, the ShoppingListLineItem is removed from the ShoppingList. If this value matches or exceeds the current <code>quantity</code> of the ShoppingListLineItem, the ShoppingListLineItem is removed from the ShoppingList.</p>
     * @param quantity value to be set
     */

    public void setQuantity(final Long quantity);

    /**
     * factory method
     * @return instance of MyShoppingListRemoveLineItemAction
     */
    public static MyShoppingListRemoveLineItemAction of() {
        return new MyShoppingListRemoveLineItemActionImpl();
    }

    /**
     * factory method to copy an instance of MyShoppingListRemoveLineItemAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static MyShoppingListRemoveLineItemAction of(final MyShoppingListRemoveLineItemAction template) {
        MyShoppingListRemoveLineItemActionImpl instance = new MyShoppingListRemoveLineItemActionImpl();
        instance.setLineItemId(template.getLineItemId());
        instance.setQuantity(template.getQuantity());
        return instance;
    }

    /**
     * builder factory method for MyShoppingListRemoveLineItemAction
     * @return builder
     */
    public static MyShoppingListRemoveLineItemActionBuilder builder() {
        return MyShoppingListRemoveLineItemActionBuilder.of();
    }

    /**
     * create builder for MyShoppingListRemoveLineItemAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static MyShoppingListRemoveLineItemActionBuilder builder(final MyShoppingListRemoveLineItemAction template) {
        return MyShoppingListRemoveLineItemActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withMyShoppingListRemoveLineItemAction(Function<MyShoppingListRemoveLineItemAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<MyShoppingListRemoveLineItemAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<MyShoppingListRemoveLineItemAction>() {
            @Override
            public String toString() {
                return "TypeReference<MyShoppingListRemoveLineItemAction>";
            }
        };
    }
}
