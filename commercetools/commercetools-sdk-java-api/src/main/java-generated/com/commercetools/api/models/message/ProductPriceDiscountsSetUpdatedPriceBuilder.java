
package com.commercetools.api.models.message;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductPriceDiscountsSetUpdatedPriceBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductPriceDiscountsSetUpdatedPrice productPriceDiscountsSetUpdatedPrice = ProductPriceDiscountsSetUpdatedPrice.builder()
 *             .variantId(1)
 *             .priceId("{priceId}")
 *             .staged(true)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductPriceDiscountsSetUpdatedPriceBuilder implements Builder<ProductPriceDiscountsSetUpdatedPrice> {

    private Integer variantId;

    @Nullable
    private String variantKey;

    @Nullable
    private String sku;

    private String priceId;

    @Nullable
    private com.commercetools.api.models.common.DiscountedPrice discounted;

    private Boolean staged;

    /**
     *  <p>Unique identifier of the ProductVariant for which the Discount was set.</p>
     * @param variantId
     * @return Builder
     */

    public ProductPriceDiscountsSetUpdatedPriceBuilder variantId(final Integer variantId) {
        this.variantId = variantId;
        return this;
    }

    /**
     *  <p>Key of the ProductVariant for which Discount was set.</p>
     * @param variantKey
     * @return Builder
     */

    public ProductPriceDiscountsSetUpdatedPriceBuilder variantKey(@Nullable final String variantKey) {
        this.variantKey = variantKey;
        return this;
    }

    /**
     *  <p>SKU of the ProductVariant for which Discount was set.</p>
     * @param sku
     * @return Builder
     */

    public ProductPriceDiscountsSetUpdatedPriceBuilder sku(@Nullable final String sku) {
        this.sku = sku;
        return this;
    }

    /**
     *  <p>Unique identifier of the Price.</p>
     * @param priceId
     * @return Builder
     */

    public ProductPriceDiscountsSetUpdatedPriceBuilder priceId(final String priceId) {
        this.priceId = priceId;
        return this;
    }

    /**
     *  <p>Discounted Price for the ProductVariant for which Discount was set.</p>
     * @return Builder
     */

    public ProductPriceDiscountsSetUpdatedPriceBuilder discounted(
            Function<com.commercetools.api.models.common.DiscountedPriceBuilder, com.commercetools.api.models.common.DiscountedPriceBuilder> builder) {
        this.discounted = builder.apply(com.commercetools.api.models.common.DiscountedPriceBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Discounted Price for the ProductVariant for which Discount was set.</p>
     * @param discounted
     * @return Builder
     */

    public ProductPriceDiscountsSetUpdatedPriceBuilder discounted(
            @Nullable final com.commercetools.api.models.common.DiscountedPrice discounted) {
        this.discounted = discounted;
        return this;
    }

    /**
     *  <p>Whether the update was only applied to the staged ProductProjection.</p>
     * @param staged
     * @return Builder
     */

    public ProductPriceDiscountsSetUpdatedPriceBuilder staged(final Boolean staged) {
        this.staged = staged;
        return this;
    }

    public Integer getVariantId() {
        return this.variantId;
    }

    @Nullable
    public String getVariantKey() {
        return this.variantKey;
    }

    @Nullable
    public String getSku() {
        return this.sku;
    }

    public String getPriceId() {
        return this.priceId;
    }

    @Nullable
    public com.commercetools.api.models.common.DiscountedPrice getDiscounted() {
        return this.discounted;
    }

    public Boolean getStaged() {
        return this.staged;
    }

    public ProductPriceDiscountsSetUpdatedPrice build() {
        Objects.requireNonNull(variantId, ProductPriceDiscountsSetUpdatedPrice.class + ": variantId is missing");
        Objects.requireNonNull(priceId, ProductPriceDiscountsSetUpdatedPrice.class + ": priceId is missing");
        Objects.requireNonNull(staged, ProductPriceDiscountsSetUpdatedPrice.class + ": staged is missing");
        return new ProductPriceDiscountsSetUpdatedPriceImpl(variantId, variantKey, sku, priceId, discounted, staged);
    }

    /**
     * builds ProductPriceDiscountsSetUpdatedPrice without checking for non null required values
     */
    public ProductPriceDiscountsSetUpdatedPrice buildUnchecked() {
        return new ProductPriceDiscountsSetUpdatedPriceImpl(variantId, variantKey, sku, priceId, discounted, staged);
    }

    public static ProductPriceDiscountsSetUpdatedPriceBuilder of() {
        return new ProductPriceDiscountsSetUpdatedPriceBuilder();
    }

    public static ProductPriceDiscountsSetUpdatedPriceBuilder of(final ProductPriceDiscountsSetUpdatedPrice template) {
        ProductPriceDiscountsSetUpdatedPriceBuilder builder = new ProductPriceDiscountsSetUpdatedPriceBuilder();
        builder.variantId = template.getVariantId();
        builder.variantKey = template.getVariantKey();
        builder.sku = template.getSku();
        builder.priceId = template.getPriceId();
        builder.discounted = template.getDiscounted();
        builder.staged = template.getStaged();
        return builder;
    }

}
