
package com.commercetools.importapi.models.orders;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * LineItemPriceBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     LineItemPrice lineItemPrice = LineItemPrice.builder()
 *             .value(valueBuilder -> valueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class LineItemPriceBuilder implements Builder<LineItemPrice> {

    private com.commercetools.importapi.models.common.TypedMoney value;

    @Nullable
    private String country;

    @Nullable
    private java.time.ZonedDateTime validFrom;

    @Nullable
    private java.time.ZonedDateTime validUntil;

    @Nullable
    private com.commercetools.importapi.models.common.CustomerGroupKeyReference customerGroup;

    @Nullable
    private com.commercetools.importapi.models.common.ChannelKeyReference channel;

    @Nullable
    private com.commercetools.importapi.models.common.DiscountedPrice discounted;

    @Nullable
    private java.util.List<com.commercetools.importapi.models.common.PriceTier> tiers;

    @Nullable
    private com.commercetools.importapi.models.customfields.Custom custom;

    /**
     *  <p>Maps to <code>Price.value</code>.</p>
     * @param value
     * @return Builder
     */

    public LineItemPriceBuilder value(final com.commercetools.importapi.models.common.TypedMoney value) {
        this.value = value;
        return this;
    }

    /**
     *  <p>Maps to <code>Price.value</code>.</p>
     * @return Builder
     */

    public LineItemPriceBuilder value(
            Function<com.commercetools.importapi.models.common.TypedMoneyBuilder, Builder<? extends com.commercetools.importapi.models.common.TypedMoney>> builder) {
        this.value = builder.apply(com.commercetools.importapi.models.common.TypedMoneyBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Maps to <code>Price.county</code>.</p>
     * @param country
     * @return Builder
     */

    public LineItemPriceBuilder country(@Nullable final String country) {
        this.country = country;
        return this;
    }

    /**
     *  <p>Maps to <code>Price.validFrom</code>.</p>
     * @param validFrom
     * @return Builder
     */

    public LineItemPriceBuilder validFrom(@Nullable final java.time.ZonedDateTime validFrom) {
        this.validFrom = validFrom;
        return this;
    }

    /**
     *  <p>Maps to <code>Price.validUntil</code>.</p>
     * @param validUntil
     * @return Builder
     */

    public LineItemPriceBuilder validUntil(@Nullable final java.time.ZonedDateTime validUntil) {
        this.validUntil = validUntil;
        return this;
    }

    /**
     *  <p>References a customer group by key.</p>
     * @return Builder
     */

    public LineItemPriceBuilder customerGroup(
            Function<com.commercetools.importapi.models.common.CustomerGroupKeyReferenceBuilder, com.commercetools.importapi.models.common.CustomerGroupKeyReferenceBuilder> builder) {
        this.customerGroup = builder
                .apply(com.commercetools.importapi.models.common.CustomerGroupKeyReferenceBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>References a customer group by key.</p>
     * @param customerGroup
     * @return Builder
     */

    public LineItemPriceBuilder customerGroup(
            @Nullable final com.commercetools.importapi.models.common.CustomerGroupKeyReference customerGroup) {
        this.customerGroup = customerGroup;
        return this;
    }

    /**
     *  <p>References a channel by key.</p>
     * @return Builder
     */

    public LineItemPriceBuilder channel(
            Function<com.commercetools.importapi.models.common.ChannelKeyReferenceBuilder, com.commercetools.importapi.models.common.ChannelKeyReferenceBuilder> builder) {
        this.channel = builder.apply(com.commercetools.importapi.models.common.ChannelKeyReferenceBuilder.of()).build();
        return this;
    }

    /**
     *  <p>References a channel by key.</p>
     * @param channel
     * @return Builder
     */

    public LineItemPriceBuilder channel(
            @Nullable final com.commercetools.importapi.models.common.ChannelKeyReference channel) {
        this.channel = channel;
        return this;
    }

    /**
     *  <p>Sets a discounted price from an external service.</p>
     * @return Builder
     */

    public LineItemPriceBuilder discounted(
            Function<com.commercetools.importapi.models.common.DiscountedPriceBuilder, com.commercetools.importapi.models.common.DiscountedPriceBuilder> builder) {
        this.discounted = builder.apply(com.commercetools.importapi.models.common.DiscountedPriceBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Sets a discounted price from an external service.</p>
     * @param discounted
     * @return Builder
     */

    public LineItemPriceBuilder discounted(
            @Nullable final com.commercetools.importapi.models.common.DiscountedPrice discounted) {
        this.discounted = discounted;
        return this;
    }

    /**
     *  <p>The tiered prices for this price.</p>
     * @param tiers
     * @return Builder
     */

    public LineItemPriceBuilder tiers(@Nullable final com.commercetools.importapi.models.common.PriceTier... tiers) {
        this.tiers = new ArrayList<>(Arrays.asList(tiers));
        return this;
    }

    /**
     *  <p>The tiered prices for this price.</p>
     * @param tiers
     * @return Builder
     */

    public LineItemPriceBuilder tiers(
            @Nullable final java.util.List<com.commercetools.importapi.models.common.PriceTier> tiers) {
        this.tiers = tiers;
        return this;
    }

    /**
     *  <p>The tiered prices for this price.</p>
     * @param tiers
     * @return Builder
     */

    public LineItemPriceBuilder plusTiers(
            @Nullable final com.commercetools.importapi.models.common.PriceTier... tiers) {
        if (this.tiers == null) {
            this.tiers = new ArrayList<>();
        }
        this.tiers.addAll(Arrays.asList(tiers));
        return this;
    }

    /**
     *  <p>The tiered prices for this price.</p>
     * @return Builder
     */

    public LineItemPriceBuilder plusTiers(
            Function<com.commercetools.importapi.models.common.PriceTierBuilder, com.commercetools.importapi.models.common.PriceTierBuilder> builder) {
        if (this.tiers == null) {
            this.tiers = new ArrayList<>();
        }
        this.tiers.add(builder.apply(com.commercetools.importapi.models.common.PriceTierBuilder.of()).build());
        return this;
    }

    /**
     *  <p>The tiered prices for this price.</p>
     * @return Builder
     */

    public LineItemPriceBuilder withTiers(
            Function<com.commercetools.importapi.models.common.PriceTierBuilder, com.commercetools.importapi.models.common.PriceTierBuilder> builder) {
        this.tiers = new ArrayList<>();
        this.tiers.add(builder.apply(com.commercetools.importapi.models.common.PriceTierBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Maps to <code>Price.custom</code>.</p>
     * @return Builder
     */

    public LineItemPriceBuilder custom(
            Function<com.commercetools.importapi.models.customfields.CustomBuilder, com.commercetools.importapi.models.customfields.CustomBuilder> builder) {
        this.custom = builder.apply(com.commercetools.importapi.models.customfields.CustomBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Maps to <code>Price.custom</code>.</p>
     * @param custom
     * @return Builder
     */

    public LineItemPriceBuilder custom(@Nullable final com.commercetools.importapi.models.customfields.Custom custom) {
        this.custom = custom;
        return this;
    }

    public com.commercetools.importapi.models.common.TypedMoney getValue() {
        return this.value;
    }

    @Nullable
    public String getCountry() {
        return this.country;
    }

    @Nullable
    public java.time.ZonedDateTime getValidFrom() {
        return this.validFrom;
    }

    @Nullable
    public java.time.ZonedDateTime getValidUntil() {
        return this.validUntil;
    }

    @Nullable
    public com.commercetools.importapi.models.common.CustomerGroupKeyReference getCustomerGroup() {
        return this.customerGroup;
    }

    @Nullable
    public com.commercetools.importapi.models.common.ChannelKeyReference getChannel() {
        return this.channel;
    }

    @Nullable
    public com.commercetools.importapi.models.common.DiscountedPrice getDiscounted() {
        return this.discounted;
    }

    @Nullable
    public java.util.List<com.commercetools.importapi.models.common.PriceTier> getTiers() {
        return this.tiers;
    }

    @Nullable
    public com.commercetools.importapi.models.customfields.Custom getCustom() {
        return this.custom;
    }

    public LineItemPrice build() {
        Objects.requireNonNull(value, LineItemPrice.class + ": value is missing");
        return new LineItemPriceImpl(value, country, validFrom, validUntil, customerGroup, channel, discounted, tiers,
            custom);
    }

    /**
     * builds LineItemPrice without checking for non null required values
     */
    public LineItemPrice buildUnchecked() {
        return new LineItemPriceImpl(value, country, validFrom, validUntil, customerGroup, channel, discounted, tiers,
            custom);
    }

    public static LineItemPriceBuilder of() {
        return new LineItemPriceBuilder();
    }

    public static LineItemPriceBuilder of(final LineItemPrice template) {
        LineItemPriceBuilder builder = new LineItemPriceBuilder();
        builder.value = template.getValue();
        builder.country = template.getCountry();
        builder.validFrom = template.getValidFrom();
        builder.validUntil = template.getValidUntil();
        builder.customerGroup = template.getCustomerGroup();
        builder.channel = template.getChannel();
        builder.discounted = template.getDiscounted();
        builder.tiers = template.getTiers();
        builder.custom = template.getCustom();
        return builder;
    }

}
