
package com.commercetools.api.models.product;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductAddExternalImageActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductAddExternalImageAction productAddExternalImageAction = ProductAddExternalImageAction.builder()
 *             .image(imageBuilder -> imageBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductAddExternalImageActionBuilder implements Builder<ProductAddExternalImageAction> {

    @Nullable
    private Long variantId;

    @Nullable
    private String sku;

    private com.commercetools.api.models.common.Image image;

    @Nullable
    private Boolean staged;

    /**
     *  <p>The <code>id</code> of the ProductVariant to update.</p>
     * @param variantId value to be set
     * @return Builder
     */

    public ProductAddExternalImageActionBuilder variantId(@Nullable final Long variantId) {
        this.variantId = variantId;
        return this;
    }

    /**
     *  <p>The <code>sku</code> of the ProductVariant to update.</p>
     * @param sku value to be set
     * @return Builder
     */

    public ProductAddExternalImageActionBuilder sku(@Nullable final String sku) {
        this.sku = sku;
        return this;
    }

    /**
     *  <p>Value to add to <code>images</code>.</p>
     * @param builder function to build the image value
     * @return Builder
     */

    public ProductAddExternalImageActionBuilder image(
            Function<com.commercetools.api.models.common.ImageBuilder, com.commercetools.api.models.common.ImageBuilder> builder) {
        this.image = builder.apply(com.commercetools.api.models.common.ImageBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Value to add to <code>images</code>.</p>
     * @param builder function to build the image value
     * @return Builder
     */

    public ProductAddExternalImageActionBuilder withImage(
            Function<com.commercetools.api.models.common.ImageBuilder, com.commercetools.api.models.common.Image> builder) {
        this.image = builder.apply(com.commercetools.api.models.common.ImageBuilder.of());
        return this;
    }

    /**
     *  <p>Value to add to <code>images</code>.</p>
     * @param image value to be set
     * @return Builder
     */

    public ProductAddExternalImageActionBuilder image(final com.commercetools.api.models.common.Image image) {
        this.image = image;
        return this;
    }

    /**
     *  <p>If <code>true</code>, only the staged <code>images</code> is updated. If <code>false</code>, both the current and staged <code>images</code> is updated.</p>
     * @param staged value to be set
     * @return Builder
     */

    public ProductAddExternalImageActionBuilder staged(@Nullable final Boolean staged) {
        this.staged = staged;
        return this;
    }

    /**
     *  <p>The <code>id</code> of the ProductVariant to update.</p>
     * @return variantId
     */

    @Nullable
    public Long getVariantId() {
        return this.variantId;
    }

    /**
     *  <p>The <code>sku</code> of the ProductVariant to update.</p>
     * @return sku
     */

    @Nullable
    public String getSku() {
        return this.sku;
    }

    /**
     *  <p>Value to add to <code>images</code>.</p>
     * @return image
     */

    public com.commercetools.api.models.common.Image getImage() {
        return this.image;
    }

    /**
     *  <p>If <code>true</code>, only the staged <code>images</code> is updated. If <code>false</code>, both the current and staged <code>images</code> is updated.</p>
     * @return staged
     */

    @Nullable
    public Boolean getStaged() {
        return this.staged;
    }

    /**
     * builds ProductAddExternalImageAction with checking for non-null required values
     * @return ProductAddExternalImageAction
     */
    public ProductAddExternalImageAction build() {
        Objects.requireNonNull(image, ProductAddExternalImageAction.class + ": image is missing");
        return new ProductAddExternalImageActionImpl(variantId, sku, image, staged);
    }

    /**
     * builds ProductAddExternalImageAction without checking for non-null required values
     * @return ProductAddExternalImageAction
     */
    public ProductAddExternalImageAction buildUnchecked() {
        return new ProductAddExternalImageActionImpl(variantId, sku, image, staged);
    }

    /**
     * factory method for an instance of ProductAddExternalImageActionBuilder
     * @return builder
     */
    public static ProductAddExternalImageActionBuilder of() {
        return new ProductAddExternalImageActionBuilder();
    }

    /**
     * create builder for ProductAddExternalImageAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductAddExternalImageActionBuilder of(final ProductAddExternalImageAction template) {
        ProductAddExternalImageActionBuilder builder = new ProductAddExternalImageActionBuilder();
        builder.variantId = template.getVariantId();
        builder.sku = template.getSku();
        builder.image = template.getImage();
        builder.staged = template.getStaged();
        return builder;
    }

}
