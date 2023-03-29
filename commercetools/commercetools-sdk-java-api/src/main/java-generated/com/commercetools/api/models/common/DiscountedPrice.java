
package com.commercetools.api.models.common;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.product_discount.ProductDiscountReference;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * DiscountedPrice
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     DiscountedPrice discountedPrice = DiscountedPrice.builder()
 *             .value(valueBuilder -> valueBuilder)
 *             .discount(discountBuilder -> discountBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = DiscountedPriceImpl.class)
public interface DiscountedPrice {

    /**
     *  <p>Money value of the discounted price.</p>
     * @return value
     */
    @NotNull
    @Valid
    @JsonProperty("value")
    public TypedMoney getValue();

    /**
     *  <p>ProductDiscount related to the discounted price.</p>
     * @return discount
     */
    @NotNull
    @Valid
    @JsonProperty("discount")
    public ProductDiscountReference getDiscount();

    /**
     *  <p>Money value of the discounted price.</p>
     * @param value value to be set
     */

    public void setValue(final TypedMoney value);

    /**
     *  <p>ProductDiscount related to the discounted price.</p>
     * @param discount value to be set
     */

    public void setDiscount(final ProductDiscountReference discount);

    /**
     * factory method
     * @return instance of DiscountedPrice
     */
    public static DiscountedPrice of() {
        return new DiscountedPriceImpl();
    }

    /**
     * factory method to create a shallow copy DiscountedPrice
     * @param template instance to be copied
     * @return copy instance
     */
    public static DiscountedPrice of(final DiscountedPrice template) {
        DiscountedPriceImpl instance = new DiscountedPriceImpl();
        instance.setValue(template.getValue());
        instance.setDiscount(template.getDiscount());
        return instance;
    }

    /**
     * factory method to create a deep copy of DiscountedPrice
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static DiscountedPrice deepCopy(@Nullable final DiscountedPrice template) {
        if (template == null) {
            return null;
        }
        DiscountedPriceImpl instance = new DiscountedPriceImpl();
        instance.setValue(Optional.ofNullable(template.getValue())
                .map(com.commercetools.api.models.common.TypedMoney::deepCopy)
                .orElse(null));
        instance.setDiscount(Optional.ofNullable(template.getDiscount())
                .map(com.commercetools.api.models.product_discount.ProductDiscountReference::deepCopy)
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for DiscountedPrice
     * @return builder
     */
    public static DiscountedPriceBuilder builder() {
        return DiscountedPriceBuilder.of();
    }

    /**
     * create builder for DiscountedPrice instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static DiscountedPriceBuilder builder(final DiscountedPrice template) {
        return DiscountedPriceBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withDiscountedPrice(Function<DiscountedPrice, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<DiscountedPrice> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<DiscountedPrice>() {
            @Override
            public String toString() {
                return "TypeReference<DiscountedPrice>";
            }
        };
    }
}
