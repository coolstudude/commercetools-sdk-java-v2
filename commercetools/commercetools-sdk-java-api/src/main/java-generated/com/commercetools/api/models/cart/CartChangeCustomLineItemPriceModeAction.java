
package com.commercetools.api.models.cart;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * CartChangeCustomLineItemPriceModeAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartChangeCustomLineItemPriceModeAction cartChangeCustomLineItemPriceModeAction = CartChangeCustomLineItemPriceModeAction.builder()
 *             .customLineItemId("{customLineItemId}")
 *             .mode(CustomLineItemPriceMode.STANDARD)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CartChangeCustomLineItemPriceModeActionImpl.class)
public interface CartChangeCustomLineItemPriceModeAction extends CartUpdateAction {

    /**
     * discriminator value for CartChangeCustomLineItemPriceModeAction
     */
    String CHANGE_CUSTOM_LINE_ITEM_PRICE_MODE = "changeCustomLineItemPriceMode";

    /**
     *  <p><code>id</code> of the CustomLineItem to update.</p>
     * @return customLineItemId
     */
    @NotNull
    @JsonProperty("customLineItemId")
    public String getCustomLineItemId();

    /**
     *  <p>New value to set. Must not be empty.</p>
     * @return mode
     */
    @NotNull
    @JsonProperty("mode")
    public CustomLineItemPriceMode getMode();

    /**
     *  <p><code>id</code> of the CustomLineItem to update.</p>
     * @param customLineItemId value to be set
     */

    public void setCustomLineItemId(final String customLineItemId);

    /**
     *  <p>New value to set. Must not be empty.</p>
     * @param mode value to be set
     */

    public void setMode(final CustomLineItemPriceMode mode);

    /**
     * factory method
     * @return instance of CartChangeCustomLineItemPriceModeAction
     */
    public static CartChangeCustomLineItemPriceModeAction of() {
        return new CartChangeCustomLineItemPriceModeActionImpl();
    }

    /**
     * factory method to copy an instance of CartChangeCustomLineItemPriceModeAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static CartChangeCustomLineItemPriceModeAction of(final CartChangeCustomLineItemPriceModeAction template) {
        CartChangeCustomLineItemPriceModeActionImpl instance = new CartChangeCustomLineItemPriceModeActionImpl();
        instance.setCustomLineItemId(template.getCustomLineItemId());
        instance.setMode(template.getMode());
        return instance;
    }

    /**
     * builder factory method for CartChangeCustomLineItemPriceModeAction
     * @return builder
     */
    public static CartChangeCustomLineItemPriceModeActionBuilder builder() {
        return CartChangeCustomLineItemPriceModeActionBuilder.of();
    }

    /**
     * create builder for CartChangeCustomLineItemPriceModeAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CartChangeCustomLineItemPriceModeActionBuilder builder(
            final CartChangeCustomLineItemPriceModeAction template) {
        return CartChangeCustomLineItemPriceModeActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCartChangeCustomLineItemPriceModeAction(
            Function<CartChangeCustomLineItemPriceModeAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CartChangeCustomLineItemPriceModeAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CartChangeCustomLineItemPriceModeAction>() {
            @Override
            public String toString() {
                return "TypeReference<CartChangeCustomLineItemPriceModeAction>";
            }
        };
    }
}
