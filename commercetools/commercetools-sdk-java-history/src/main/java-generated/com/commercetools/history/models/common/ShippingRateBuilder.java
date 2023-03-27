
package com.commercetools.history.models.common;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ShippingRateBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ShippingRate shippingRate = ShippingRate.builder()
 *             .price(priceBuilder -> priceBuilder)
 *             .freeAbove(freeAboveBuilder -> freeAboveBuilder)
 *             .isMatching(true)
 *             .plusTiers(tiersBuilder -> tiersBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ShippingRateBuilder implements Builder<ShippingRate> {

    private com.commercetools.history.models.common.Money price;

    private com.commercetools.history.models.common.Money freeAbove;

    private Boolean isMatching;

    private java.util.List<com.commercetools.history.models.common.ShippingRatePriceTier> tiers;

    /**
     * set the value to the price using the builder function
     * @param builder function to build the price value
     * @return Builder
     */

    public ShippingRateBuilder price(
            Function<com.commercetools.history.models.common.MoneyBuilder, com.commercetools.history.models.common.MoneyBuilder> builder) {
        this.price = builder.apply(com.commercetools.history.models.common.MoneyBuilder.of()).build();
        return this;
    }

    /**
     * set the value to the price
     * @param price value to be set
     * @return Builder
     */

    public ShippingRateBuilder price(final com.commercetools.history.models.common.Money price) {
        this.price = price;
        return this;
    }

    /**
     * set the value to the freeAbove using the builder function
     * @param builder function to build the freeAbove value
     * @return Builder
     */

    public ShippingRateBuilder freeAbove(
            Function<com.commercetools.history.models.common.MoneyBuilder, com.commercetools.history.models.common.MoneyBuilder> builder) {
        this.freeAbove = builder.apply(com.commercetools.history.models.common.MoneyBuilder.of()).build();
        return this;
    }

    /**
     * set the value to the freeAbove
     * @param freeAbove value to be set
     * @return Builder
     */

    public ShippingRateBuilder freeAbove(final com.commercetools.history.models.common.Money freeAbove) {
        this.freeAbove = freeAbove;
        return this;
    }

    /**
     *  <p>Only appears in response to requests for ShippingMethods by Cart or location to mark this shipping rate as one that matches the Cart or location.</p>
     * @param isMatching value to be set
     * @return Builder
     */

    public ShippingRateBuilder isMatching(final Boolean isMatching) {
        this.isMatching = isMatching;
        return this;
    }

    /**
     * set values to the tiers
     * @param tiers value to be set
     * @return Builder
     */

    public ShippingRateBuilder tiers(final com.commercetools.history.models.common.ShippingRatePriceTier... tiers) {
        this.tiers = new ArrayList<>(Arrays.asList(tiers));
        return this;
    }

    /**
     * set value to the tiers
     * @param tiers value to be set
     * @return Builder
     */

    public ShippingRateBuilder tiers(
            final java.util.List<com.commercetools.history.models.common.ShippingRatePriceTier> tiers) {
        this.tiers = tiers;
        return this;
    }

    /**
     * add values to the tiers
     * @param tiers value to be set
     * @return Builder
     */

    public ShippingRateBuilder plusTiers(final com.commercetools.history.models.common.ShippingRatePriceTier... tiers) {
        if (this.tiers == null) {
            this.tiers = new ArrayList<>();
        }
        this.tiers.addAll(Arrays.asList(tiers));
        return this;
    }

    /**
     * add the value to the tiers using the builder function
     * @param builder function to build the tiers value
     * @return Builder
     */

    public ShippingRateBuilder plusTiers(
            Function<com.commercetools.history.models.common.ShippingRatePriceTierBuilder, com.commercetools.history.models.common.ShippingRatePriceTierBuilder> builder) {
        if (this.tiers == null) {
            this.tiers = new ArrayList<>();
        }
        this.tiers
                .add(builder.apply(com.commercetools.history.models.common.ShippingRatePriceTierBuilder.of()).build());
        return this;
    }

    /**
     * set the value to the tiers using the builder function
     * @param builder function to build the tiers value
     * @return Builder
     */

    public ShippingRateBuilder withTiers(
            Function<com.commercetools.history.models.common.ShippingRatePriceTierBuilder, com.commercetools.history.models.common.ShippingRatePriceTierBuilder> builder) {
        this.tiers = new ArrayList<>();
        this.tiers
                .add(builder.apply(com.commercetools.history.models.common.ShippingRatePriceTierBuilder.of()).build());
        return this;
    }

    /**
     * value of price}
     * @return price
     */

    public com.commercetools.history.models.common.Money getPrice() {
        return this.price;
    }

    /**
     * value of freeAbove}
     * @return freeAbove
     */

    public com.commercetools.history.models.common.Money getFreeAbove() {
        return this.freeAbove;
    }

    /**
     *  <p>Only appears in response to requests for ShippingMethods by Cart or location to mark this shipping rate as one that matches the Cart or location.</p>
     * @return isMatching
     */

    public Boolean getIsMatching() {
        return this.isMatching;
    }

    /**
     * value of tiers}
     * @return tiers
     */

    public java.util.List<com.commercetools.history.models.common.ShippingRatePriceTier> getTiers() {
        return this.tiers;
    }

    /**
     * builds ShippingRate with checking for non-null required values
     * @return ShippingRate
     */
    public ShippingRate build() {
        Objects.requireNonNull(price, ShippingRate.class + ": price is missing");
        Objects.requireNonNull(freeAbove, ShippingRate.class + ": freeAbove is missing");
        Objects.requireNonNull(isMatching, ShippingRate.class + ": isMatching is missing");
        Objects.requireNonNull(tiers, ShippingRate.class + ": tiers is missing");
        return new ShippingRateImpl(price, freeAbove, isMatching, tiers);
    }

    /**
     * builds ShippingRate without checking for non-null required values
     * @return ShippingRate
     */
    public ShippingRate buildUnchecked() {
        return new ShippingRateImpl(price, freeAbove, isMatching, tiers);
    }

    /**
     * factory method for an instance of ShippingRateBuilder
     * @return builder
     */
    public static ShippingRateBuilder of() {
        return new ShippingRateBuilder();
    }

    /**
     * create builder for ShippingRate instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ShippingRateBuilder of(final ShippingRate template) {
        ShippingRateBuilder builder = new ShippingRateBuilder();
        builder.price = template.getPrice();
        builder.freeAbove = template.getFreeAbove();
        builder.isMatching = template.getIsMatching();
        builder.tiers = template.getTiers();
        return builder;
    }

}
