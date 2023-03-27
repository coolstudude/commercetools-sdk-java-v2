
package com.commercetools.api.models.cart_discount;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * CartDiscountChangeValueAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartDiscountChangeValueAction cartDiscountChangeValueAction = CartDiscountChangeValueAction.builder()
 *             .value(valueBuilder -> valueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CartDiscountChangeValueActionImpl.class)
public interface CartDiscountChangeValueAction extends CartDiscountUpdateAction {

    /**
     * discriminator value for CartDiscountChangeValueAction
     */
    String CHANGE_VALUE = "changeValue";

    /**
     *  <p>New value to set.</p>
     * @return value
     */
    @NotNull
    @Valid
    @JsonProperty("value")
    public CartDiscountValueDraft getValue();

    /**
     *  <p>New value to set.</p>
     * @param value value to be set
     */

    public void setValue(final CartDiscountValueDraft value);

    /**
     * factory method
     * @return instance of CartDiscountChangeValueAction
     */
    public static CartDiscountChangeValueAction of() {
        return new CartDiscountChangeValueActionImpl();
    }

    /**
     * factory method to copy an instance of CartDiscountChangeValueAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static CartDiscountChangeValueAction of(final CartDiscountChangeValueAction template) {
        CartDiscountChangeValueActionImpl instance = new CartDiscountChangeValueActionImpl();
        instance.setValue(template.getValue());
        return instance;
    }

    /**
     * builder factory method for CartDiscountChangeValueAction
     * @return builder
     */
    public static CartDiscountChangeValueActionBuilder builder() {
        return CartDiscountChangeValueActionBuilder.of();
    }

    /**
     * create builder for CartDiscountChangeValueAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CartDiscountChangeValueActionBuilder builder(final CartDiscountChangeValueAction template) {
        return CartDiscountChangeValueActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCartDiscountChangeValueAction(Function<CartDiscountChangeValueAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CartDiscountChangeValueAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CartDiscountChangeValueAction>() {
            @Override
            public String toString() {
                return "TypeReference<CartDiscountChangeValueAction>";
            }
        };
    }
}
