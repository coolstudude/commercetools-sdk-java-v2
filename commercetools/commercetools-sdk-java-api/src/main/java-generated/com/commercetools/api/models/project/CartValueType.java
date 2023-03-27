
package com.commercetools.api.models.project;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Used when the ShippingRate maps to the sum of LineItem Prices. The value of the Cart is used to select a tier. If chosen, it is not possible to set a value for the <code>shippingRateInput</code> on the Cart.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartValueType cartValueType = CartValueType.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CartValueTypeImpl.class)
public interface CartValueType extends ShippingRateInputType {

    /**
     * discriminator value for CartValueType
     */
    String CART_VALUE = "CartValue";

    /**
     * factory method
     * @return instance of CartValueType
     */
    public static CartValueType of() {
        return new CartValueTypeImpl();
    }

    /**
     * factory method to copy an instance of CartValueType
     * @param template instance to be copied
     * @return copy instance
     */
    public static CartValueType of(final CartValueType template) {
        CartValueTypeImpl instance = new CartValueTypeImpl();
        return instance;
    }

    /**
     * builder factory method for CartValueType
     * @return builder
     */
    public static CartValueTypeBuilder builder() {
        return CartValueTypeBuilder.of();
    }

    /**
     * create builder for CartValueType instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CartValueTypeBuilder builder(final CartValueType template) {
        return CartValueTypeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCartValueType(Function<CartValueType, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CartValueType> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CartValueType>() {
            @Override
            public String toString() {
                return "TypeReference<CartValueType>";
            }
        };
    }
}
