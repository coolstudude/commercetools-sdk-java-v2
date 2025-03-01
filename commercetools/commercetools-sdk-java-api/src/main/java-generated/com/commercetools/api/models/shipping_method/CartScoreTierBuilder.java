
package com.commercetools.api.models.shipping_method;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CartScoreTierBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartScoreTier cartScoreTier = CartScoreTier.builder()
 *             .score(0.3)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CartScoreTierBuilder implements Builder<CartScoreTier> {

    private Integer score;

    @Nullable
    private com.commercetools.api.models.common.Money price;

    @Nullable
    private com.commercetools.api.models.shipping_method.PriceFunction priceFunction;

    @Nullable
    private Boolean isMatching;

    /**
     *  <p>Abstract value for categorizing a Cart. The range starts at <code>0</code>. The default price covers <code>0</code>, tiers start at <code>1</code>. See Using Tiered Shipping Rates for details and examples.</p>
     * @param score value to be set
     * @return Builder
     */

    public CartScoreTierBuilder score(final Integer score) {
        this.score = score;
        return this;
    }

    /**
     *  <p>Defines a fixed price for the <code>score</code>.</p>
     * @param builder function to build the price value
     * @return Builder
     */

    public CartScoreTierBuilder price(
            Function<com.commercetools.api.models.common.MoneyBuilder, com.commercetools.api.models.common.MoneyBuilder> builder) {
        this.price = builder.apply(com.commercetools.api.models.common.MoneyBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Defines a fixed price for the <code>score</code>.</p>
     * @param builder function to build the price value
     * @return Builder
     */

    public CartScoreTierBuilder withPrice(
            Function<com.commercetools.api.models.common.MoneyBuilder, com.commercetools.api.models.common.Money> builder) {
        this.price = builder.apply(com.commercetools.api.models.common.MoneyBuilder.of());
        return this;
    }

    /**
     *  <p>Defines a fixed price for the <code>score</code>.</p>
     * @param price value to be set
     * @return Builder
     */

    public CartScoreTierBuilder price(@Nullable final com.commercetools.api.models.common.Money price) {
        this.price = price;
        return this;
    }

    /**
     *  <p>Dynamically calculates a Price for a range of scores.</p>
     * @param builder function to build the priceFunction value
     * @return Builder
     */

    public CartScoreTierBuilder priceFunction(
            Function<com.commercetools.api.models.shipping_method.PriceFunctionBuilder, com.commercetools.api.models.shipping_method.PriceFunctionBuilder> builder) {
        this.priceFunction = builder.apply(com.commercetools.api.models.shipping_method.PriceFunctionBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Dynamically calculates a Price for a range of scores.</p>
     * @param builder function to build the priceFunction value
     * @return Builder
     */

    public CartScoreTierBuilder withPriceFunction(
            Function<com.commercetools.api.models.shipping_method.PriceFunctionBuilder, com.commercetools.api.models.shipping_method.PriceFunction> builder) {
        this.priceFunction = builder.apply(com.commercetools.api.models.shipping_method.PriceFunctionBuilder.of());
        return this;
    }

    /**
     *  <p>Dynamically calculates a Price for a range of scores.</p>
     * @param priceFunction value to be set
     * @return Builder
     */

    public CartScoreTierBuilder priceFunction(
            @Nullable final com.commercetools.api.models.shipping_method.PriceFunction priceFunction) {
        this.priceFunction = priceFunction;
        return this;
    }

    /**
     *  <p>Appears in response to Get ShippingMethods for a Cart if the shipping rate matches the search query.</p>
     * @param isMatching value to be set
     * @return Builder
     */

    public CartScoreTierBuilder isMatching(@Nullable final Boolean isMatching) {
        this.isMatching = isMatching;
        return this;
    }

    /**
     *  <p>Abstract value for categorizing a Cart. The range starts at <code>0</code>. The default price covers <code>0</code>, tiers start at <code>1</code>. See Using Tiered Shipping Rates for details and examples.</p>
     * @return score
     */

    public Integer getScore() {
        return this.score;
    }

    /**
     *  <p>Defines a fixed price for the <code>score</code>.</p>
     * @return price
     */

    @Nullable
    public com.commercetools.api.models.common.Money getPrice() {
        return this.price;
    }

    /**
     *  <p>Dynamically calculates a Price for a range of scores.</p>
     * @return priceFunction
     */

    @Nullable
    public com.commercetools.api.models.shipping_method.PriceFunction getPriceFunction() {
        return this.priceFunction;
    }

    /**
     *  <p>Appears in response to Get ShippingMethods for a Cart if the shipping rate matches the search query.</p>
     * @return isMatching
     */

    @Nullable
    public Boolean getIsMatching() {
        return this.isMatching;
    }

    /**
     * builds CartScoreTier with checking for non-null required values
     * @return CartScoreTier
     */
    public CartScoreTier build() {
        Objects.requireNonNull(score, CartScoreTier.class + ": score is missing");
        return new CartScoreTierImpl(score, price, priceFunction, isMatching);
    }

    /**
     * builds CartScoreTier without checking for non-null required values
     * @return CartScoreTier
     */
    public CartScoreTier buildUnchecked() {
        return new CartScoreTierImpl(score, price, priceFunction, isMatching);
    }

    /**
     * factory method for an instance of CartScoreTierBuilder
     * @return builder
     */
    public static CartScoreTierBuilder of() {
        return new CartScoreTierBuilder();
    }

    /**
     * create builder for CartScoreTier instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CartScoreTierBuilder of(final CartScoreTier template) {
        CartScoreTierBuilder builder = new CartScoreTierBuilder();
        builder.score = template.getScore();
        builder.price = template.getPrice();
        builder.priceFunction = template.getPriceFunction();
        builder.isMatching = template.getIsMatching();
        return builder;
    }

}
