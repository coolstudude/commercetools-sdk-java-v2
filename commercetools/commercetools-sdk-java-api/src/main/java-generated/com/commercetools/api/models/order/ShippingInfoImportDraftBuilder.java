
package com.commercetools.api.models.order;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ShippingInfoImportDraftBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ShippingInfoImportDraft shippingInfoImportDraft = ShippingInfoImportDraft.builder()
 *             .shippingMethodName("{shippingMethodName}")
 *             .price(priceBuilder -> priceBuilder)
 *             .shippingRate(shippingRateBuilder -> shippingRateBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ShippingInfoImportDraftBuilder implements Builder<ShippingInfoImportDraft> {

    private String shippingMethodName;

    private com.commercetools.api.models.common.Money price;

    private com.commercetools.api.models.shipping_method.ShippingRateDraft shippingRate;

    @Nullable
    private com.commercetools.api.models.tax_category.TaxRate taxRate;

    @Nullable
    private com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifier taxCategory;

    @Nullable
    private com.commercetools.api.models.shipping_method.ShippingMethodResourceIdentifier shippingMethod;

    @Nullable
    private java.util.List<com.commercetools.api.models.order.DeliveryDraft> deliveries;

    @Nullable
    private com.commercetools.api.models.order.DiscountedLineItemPriceDraft discountedPrice;

    @Nullable
    private com.commercetools.api.models.cart.ShippingMethodState shippingMethodState;

    /**
     * set the value to the shippingMethodName
     * @param shippingMethodName value to be set
     * @return Builder
     */

    public ShippingInfoImportDraftBuilder shippingMethodName(final String shippingMethodName) {
        this.shippingMethodName = shippingMethodName;
        return this;
    }

    /**
     * set the value to the price using the builder function
     * @param builder function to build the price value
     * @return Builder
     */

    public ShippingInfoImportDraftBuilder price(
            Function<com.commercetools.api.models.common.MoneyBuilder, com.commercetools.api.models.common.MoneyBuilder> builder) {
        this.price = builder.apply(com.commercetools.api.models.common.MoneyBuilder.of()).build();
        return this;
    }

    /**
     * set the value to the price using the builder function
     * @param builder function to build the price value
     * @return Builder
     */

    public ShippingInfoImportDraftBuilder withPrice(
            Function<com.commercetools.api.models.common.MoneyBuilder, com.commercetools.api.models.common.Money> builder) {
        this.price = builder.apply(com.commercetools.api.models.common.MoneyBuilder.of());
        return this;
    }

    /**
     * set the value to the price
     * @param price value to be set
     * @return Builder
     */

    public ShippingInfoImportDraftBuilder price(final com.commercetools.api.models.common.Money price) {
        this.price = price;
        return this;
    }

    /**
     *  <p>The shipping rate used to determine the price.</p>
     * @param builder function to build the shippingRate value
     * @return Builder
     */

    public ShippingInfoImportDraftBuilder shippingRate(
            Function<com.commercetools.api.models.shipping_method.ShippingRateDraftBuilder, com.commercetools.api.models.shipping_method.ShippingRateDraftBuilder> builder) {
        this.shippingRate = builder.apply(com.commercetools.api.models.shipping_method.ShippingRateDraftBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>The shipping rate used to determine the price.</p>
     * @param builder function to build the shippingRate value
     * @return Builder
     */

    public ShippingInfoImportDraftBuilder withShippingRate(
            Function<com.commercetools.api.models.shipping_method.ShippingRateDraftBuilder, com.commercetools.api.models.shipping_method.ShippingRateDraft> builder) {
        this.shippingRate = builder.apply(com.commercetools.api.models.shipping_method.ShippingRateDraftBuilder.of());
        return this;
    }

    /**
     *  <p>The shipping rate used to determine the price.</p>
     * @param shippingRate value to be set
     * @return Builder
     */

    public ShippingInfoImportDraftBuilder shippingRate(
            final com.commercetools.api.models.shipping_method.ShippingRateDraft shippingRate) {
        this.shippingRate = shippingRate;
        return this;
    }

    /**
     * set the value to the taxRate using the builder function
     * @param builder function to build the taxRate value
     * @return Builder
     */

    public ShippingInfoImportDraftBuilder taxRate(
            Function<com.commercetools.api.models.tax_category.TaxRateBuilder, com.commercetools.api.models.tax_category.TaxRateBuilder> builder) {
        this.taxRate = builder.apply(com.commercetools.api.models.tax_category.TaxRateBuilder.of()).build();
        return this;
    }

    /**
     * set the value to the taxRate using the builder function
     * @param builder function to build the taxRate value
     * @return Builder
     */

    public ShippingInfoImportDraftBuilder withTaxRate(
            Function<com.commercetools.api.models.tax_category.TaxRateBuilder, com.commercetools.api.models.tax_category.TaxRate> builder) {
        this.taxRate = builder.apply(com.commercetools.api.models.tax_category.TaxRateBuilder.of());
        return this;
    }

    /**
     * set the value to the taxRate
     * @param taxRate value to be set
     * @return Builder
     */

    public ShippingInfoImportDraftBuilder taxRate(
            @Nullable final com.commercetools.api.models.tax_category.TaxRate taxRate) {
        this.taxRate = taxRate;
        return this;
    }

    /**
     * set the value to the taxCategory using the builder function
     * @param builder function to build the taxCategory value
     * @return Builder
     */

    public ShippingInfoImportDraftBuilder taxCategory(
            Function<com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifierBuilder, com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifierBuilder> builder) {
        this.taxCategory = builder
                .apply(com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifierBuilder.of())
                .build();
        return this;
    }

    /**
     * set the value to the taxCategory using the builder function
     * @param builder function to build the taxCategory value
     * @return Builder
     */

    public ShippingInfoImportDraftBuilder withTaxCategory(
            Function<com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifierBuilder, com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifier> builder) {
        this.taxCategory = builder
                .apply(com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifierBuilder.of());
        return this;
    }

    /**
     * set the value to the taxCategory
     * @param taxCategory value to be set
     * @return Builder
     */

    public ShippingInfoImportDraftBuilder taxCategory(
            @Nullable final com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifier taxCategory) {
        this.taxCategory = taxCategory;
        return this;
    }

    /**
     *  <p>Not set if custom shipping method is used.</p>
     * @param builder function to build the shippingMethod value
     * @return Builder
     */

    public ShippingInfoImportDraftBuilder shippingMethod(
            Function<com.commercetools.api.models.shipping_method.ShippingMethodResourceIdentifierBuilder, com.commercetools.api.models.shipping_method.ShippingMethodResourceIdentifierBuilder> builder) {
        this.shippingMethod = builder
                .apply(com.commercetools.api.models.shipping_method.ShippingMethodResourceIdentifierBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Not set if custom shipping method is used.</p>
     * @param builder function to build the shippingMethod value
     * @return Builder
     */

    public ShippingInfoImportDraftBuilder withShippingMethod(
            Function<com.commercetools.api.models.shipping_method.ShippingMethodResourceIdentifierBuilder, com.commercetools.api.models.shipping_method.ShippingMethodResourceIdentifier> builder) {
        this.shippingMethod = builder
                .apply(com.commercetools.api.models.shipping_method.ShippingMethodResourceIdentifierBuilder.of());
        return this;
    }

    /**
     *  <p>Not set if custom shipping method is used.</p>
     * @param shippingMethod value to be set
     * @return Builder
     */

    public ShippingInfoImportDraftBuilder shippingMethod(
            @Nullable final com.commercetools.api.models.shipping_method.ShippingMethodResourceIdentifier shippingMethod) {
        this.shippingMethod = shippingMethod;
        return this;
    }

    /**
     *  <p>Deliveries are compilations of information on how the articles are being delivered to the customers.</p>
     * @param deliveries value to be set
     * @return Builder
     */

    public ShippingInfoImportDraftBuilder deliveries(
            @Nullable final com.commercetools.api.models.order.DeliveryDraft... deliveries) {
        this.deliveries = new ArrayList<>(Arrays.asList(deliveries));
        return this;
    }

    /**
     *  <p>Deliveries are compilations of information on how the articles are being delivered to the customers.</p>
     * @param deliveries value to be set
     * @return Builder
     */

    public ShippingInfoImportDraftBuilder deliveries(
            @Nullable final java.util.List<com.commercetools.api.models.order.DeliveryDraft> deliveries) {
        this.deliveries = deliveries;
        return this;
    }

    /**
     *  <p>Deliveries are compilations of information on how the articles are being delivered to the customers.</p>
     * @param deliveries value to be set
     * @return Builder
     */

    public ShippingInfoImportDraftBuilder plusDeliveries(
            @Nullable final com.commercetools.api.models.order.DeliveryDraft... deliveries) {
        if (this.deliveries == null) {
            this.deliveries = new ArrayList<>();
        }
        this.deliveries.addAll(Arrays.asList(deliveries));
        return this;
    }

    /**
     *  <p>Deliveries are compilations of information on how the articles are being delivered to the customers.</p>
     * @param builder function to build the deliveries value
     * @return Builder
     */

    public ShippingInfoImportDraftBuilder plusDeliveries(
            Function<com.commercetools.api.models.order.DeliveryDraftBuilder, com.commercetools.api.models.order.DeliveryDraftBuilder> builder) {
        if (this.deliveries == null) {
            this.deliveries = new ArrayList<>();
        }
        this.deliveries.add(builder.apply(com.commercetools.api.models.order.DeliveryDraftBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Deliveries are compilations of information on how the articles are being delivered to the customers.</p>
     * @param builder function to build the deliveries value
     * @return Builder
     */

    public ShippingInfoImportDraftBuilder withDeliveries(
            Function<com.commercetools.api.models.order.DeliveryDraftBuilder, com.commercetools.api.models.order.DeliveryDraftBuilder> builder) {
        this.deliveries = new ArrayList<>();
        this.deliveries.add(builder.apply(com.commercetools.api.models.order.DeliveryDraftBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Deliveries are compilations of information on how the articles are being delivered to the customers.</p>
     * @param builder function to build the deliveries value
     * @return Builder
     */

    public ShippingInfoImportDraftBuilder addDeliveries(
            Function<com.commercetools.api.models.order.DeliveryDraftBuilder, com.commercetools.api.models.order.DeliveryDraft> builder) {
        return plusDeliveries(builder.apply(com.commercetools.api.models.order.DeliveryDraftBuilder.of()));
    }

    /**
     *  <p>Deliveries are compilations of information on how the articles are being delivered to the customers.</p>
     * @param builder function to build the deliveries value
     * @return Builder
     */

    public ShippingInfoImportDraftBuilder setDeliveries(
            Function<com.commercetools.api.models.order.DeliveryDraftBuilder, com.commercetools.api.models.order.DeliveryDraft> builder) {
        return deliveries(builder.apply(com.commercetools.api.models.order.DeliveryDraftBuilder.of()));
    }

    /**
     * set the value to the discountedPrice using the builder function
     * @param builder function to build the discountedPrice value
     * @return Builder
     */

    public ShippingInfoImportDraftBuilder discountedPrice(
            Function<com.commercetools.api.models.order.DiscountedLineItemPriceDraftBuilder, com.commercetools.api.models.order.DiscountedLineItemPriceDraftBuilder> builder) {
        this.discountedPrice = builder
                .apply(com.commercetools.api.models.order.DiscountedLineItemPriceDraftBuilder.of())
                .build();
        return this;
    }

    /**
     * set the value to the discountedPrice using the builder function
     * @param builder function to build the discountedPrice value
     * @return Builder
     */

    public ShippingInfoImportDraftBuilder withDiscountedPrice(
            Function<com.commercetools.api.models.order.DiscountedLineItemPriceDraftBuilder, com.commercetools.api.models.order.DiscountedLineItemPriceDraft> builder) {
        this.discountedPrice = builder
                .apply(com.commercetools.api.models.order.DiscountedLineItemPriceDraftBuilder.of());
        return this;
    }

    /**
     * set the value to the discountedPrice
     * @param discountedPrice value to be set
     * @return Builder
     */

    public ShippingInfoImportDraftBuilder discountedPrice(
            @Nullable final com.commercetools.api.models.order.DiscountedLineItemPriceDraft discountedPrice) {
        this.discountedPrice = discountedPrice;
        return this;
    }

    /**
     *  <p>Indicates whether the ShippingMethod referenced is allowed for the cart or not.</p>
     * @param shippingMethodState value to be set
     * @return Builder
     */

    public ShippingInfoImportDraftBuilder shippingMethodState(
            @Nullable final com.commercetools.api.models.cart.ShippingMethodState shippingMethodState) {
        this.shippingMethodState = shippingMethodState;
        return this;
    }

    /**
     * value of shippingMethodName}
     * @return shippingMethodName
     */

    public String getShippingMethodName() {
        return this.shippingMethodName;
    }

    /**
     * value of price}
     * @return price
     */

    public com.commercetools.api.models.common.Money getPrice() {
        return this.price;
    }

    /**
     *  <p>The shipping rate used to determine the price.</p>
     * @return shippingRate
     */

    public com.commercetools.api.models.shipping_method.ShippingRateDraft getShippingRate() {
        return this.shippingRate;
    }

    /**
     * value of taxRate}
     * @return taxRate
     */

    @Nullable
    public com.commercetools.api.models.tax_category.TaxRate getTaxRate() {
        return this.taxRate;
    }

    /**
     * value of taxCategory}
     * @return taxCategory
     */

    @Nullable
    public com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifier getTaxCategory() {
        return this.taxCategory;
    }

    /**
     *  <p>Not set if custom shipping method is used.</p>
     * @return shippingMethod
     */

    @Nullable
    public com.commercetools.api.models.shipping_method.ShippingMethodResourceIdentifier getShippingMethod() {
        return this.shippingMethod;
    }

    /**
     *  <p>Deliveries are compilations of information on how the articles are being delivered to the customers.</p>
     * @return deliveries
     */

    @Nullable
    public java.util.List<com.commercetools.api.models.order.DeliveryDraft> getDeliveries() {
        return this.deliveries;
    }

    /**
     * value of discountedPrice}
     * @return discountedPrice
     */

    @Nullable
    public com.commercetools.api.models.order.DiscountedLineItemPriceDraft getDiscountedPrice() {
        return this.discountedPrice;
    }

    /**
     *  <p>Indicates whether the ShippingMethod referenced is allowed for the cart or not.</p>
     * @return shippingMethodState
     */

    @Nullable
    public com.commercetools.api.models.cart.ShippingMethodState getShippingMethodState() {
        return this.shippingMethodState;
    }

    /**
     * builds ShippingInfoImportDraft with checking for non-null required values
     * @return ShippingInfoImportDraft
     */
    public ShippingInfoImportDraft build() {
        Objects.requireNonNull(shippingMethodName, ShippingInfoImportDraft.class + ": shippingMethodName is missing");
        Objects.requireNonNull(price, ShippingInfoImportDraft.class + ": price is missing");
        Objects.requireNonNull(shippingRate, ShippingInfoImportDraft.class + ": shippingRate is missing");
        return new ShippingInfoImportDraftImpl(shippingMethodName, price, shippingRate, taxRate, taxCategory,
            shippingMethod, deliveries, discountedPrice, shippingMethodState);
    }

    /**
     * builds ShippingInfoImportDraft without checking for non-null required values
     * @return ShippingInfoImportDraft
     */
    public ShippingInfoImportDraft buildUnchecked() {
        return new ShippingInfoImportDraftImpl(shippingMethodName, price, shippingRate, taxRate, taxCategory,
            shippingMethod, deliveries, discountedPrice, shippingMethodState);
    }

    /**
     * factory method for an instance of ShippingInfoImportDraftBuilder
     * @return builder
     */
    public static ShippingInfoImportDraftBuilder of() {
        return new ShippingInfoImportDraftBuilder();
    }

    /**
     * create builder for ShippingInfoImportDraft instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ShippingInfoImportDraftBuilder of(final ShippingInfoImportDraft template) {
        ShippingInfoImportDraftBuilder builder = new ShippingInfoImportDraftBuilder();
        builder.shippingMethodName = template.getShippingMethodName();
        builder.price = template.getPrice();
        builder.shippingRate = template.getShippingRate();
        builder.taxRate = template.getTaxRate();
        builder.taxCategory = template.getTaxCategory();
        builder.shippingMethod = template.getShippingMethod();
        builder.deliveries = template.getDeliveries();
        builder.discountedPrice = template.getDiscountedPrice();
        builder.shippingMethodState = template.getShippingMethodState();
        return builder;
    }

}
