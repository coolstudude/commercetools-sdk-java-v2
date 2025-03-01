
package com.commercetools.ml.models.image_search;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ResultItemBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ResultItem resultItem = ResultItem.builder()
 *             .imageUrl("{imageUrl}")
 *             .plusProductVariants(productVariantsBuilder -> productVariantsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ResultItemBuilder implements Builder<ResultItem> {

    private String imageUrl;

    private java.util.List<com.commercetools.ml.models.common.ProductVariant> productVariants;

    /**
     *  <p>The URL of the image.</p>
     * @param imageUrl value to be set
     * @return Builder
     */

    public ResultItemBuilder imageUrl(final String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }

    /**
     *  <p>An array of product variants containing the image URL.</p>
     * @param productVariants value to be set
     * @return Builder
     */

    public ResultItemBuilder productVariants(
            final com.commercetools.ml.models.common.ProductVariant... productVariants) {
        this.productVariants = new ArrayList<>(Arrays.asList(productVariants));
        return this;
    }

    /**
     *  <p>An array of product variants containing the image URL.</p>
     * @param productVariants value to be set
     * @return Builder
     */

    public ResultItemBuilder productVariants(
            final java.util.List<com.commercetools.ml.models.common.ProductVariant> productVariants) {
        this.productVariants = productVariants;
        return this;
    }

    /**
     *  <p>An array of product variants containing the image URL.</p>
     * @param productVariants value to be set
     * @return Builder
     */

    public ResultItemBuilder plusProductVariants(
            final com.commercetools.ml.models.common.ProductVariant... productVariants) {
        if (this.productVariants == null) {
            this.productVariants = new ArrayList<>();
        }
        this.productVariants.addAll(Arrays.asList(productVariants));
        return this;
    }

    /**
     *  <p>An array of product variants containing the image URL.</p>
     * @param builder function to build the productVariants value
     * @return Builder
     */

    public ResultItemBuilder plusProductVariants(
            Function<com.commercetools.ml.models.common.ProductVariantBuilder, com.commercetools.ml.models.common.ProductVariantBuilder> builder) {
        if (this.productVariants == null) {
            this.productVariants = new ArrayList<>();
        }
        this.productVariants.add(builder.apply(com.commercetools.ml.models.common.ProductVariantBuilder.of()).build());
        return this;
    }

    /**
     *  <p>An array of product variants containing the image URL.</p>
     * @param builder function to build the productVariants value
     * @return Builder
     */

    public ResultItemBuilder withProductVariants(
            Function<com.commercetools.ml.models.common.ProductVariantBuilder, com.commercetools.ml.models.common.ProductVariantBuilder> builder) {
        this.productVariants = new ArrayList<>();
        this.productVariants.add(builder.apply(com.commercetools.ml.models.common.ProductVariantBuilder.of()).build());
        return this;
    }

    /**
     *  <p>An array of product variants containing the image URL.</p>
     * @param builder function to build the productVariants value
     * @return Builder
     */

    public ResultItemBuilder addProductVariants(
            Function<com.commercetools.ml.models.common.ProductVariantBuilder, com.commercetools.ml.models.common.ProductVariant> builder) {
        return plusProductVariants(builder.apply(com.commercetools.ml.models.common.ProductVariantBuilder.of()));
    }

    /**
     *  <p>An array of product variants containing the image URL.</p>
     * @param builder function to build the productVariants value
     * @return Builder
     */

    public ResultItemBuilder setProductVariants(
            Function<com.commercetools.ml.models.common.ProductVariantBuilder, com.commercetools.ml.models.common.ProductVariant> builder) {
        return productVariants(builder.apply(com.commercetools.ml.models.common.ProductVariantBuilder.of()));
    }

    /**
     *  <p>The URL of the image.</p>
     * @return imageUrl
     */

    public String getImageUrl() {
        return this.imageUrl;
    }

    /**
     *  <p>An array of product variants containing the image URL.</p>
     * @return productVariants
     */

    public java.util.List<com.commercetools.ml.models.common.ProductVariant> getProductVariants() {
        return this.productVariants;
    }

    /**
     * builds ResultItem with checking for non-null required values
     * @return ResultItem
     */
    public ResultItem build() {
        Objects.requireNonNull(imageUrl, ResultItem.class + ": imageUrl is missing");
        Objects.requireNonNull(productVariants, ResultItem.class + ": productVariants is missing");
        return new ResultItemImpl(imageUrl, productVariants);
    }

    /**
     * builds ResultItem without checking for non-null required values
     * @return ResultItem
     */
    public ResultItem buildUnchecked() {
        return new ResultItemImpl(imageUrl, productVariants);
    }

    /**
     * factory method for an instance of ResultItemBuilder
     * @return builder
     */
    public static ResultItemBuilder of() {
        return new ResultItemBuilder();
    }

    /**
     * create builder for ResultItem instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ResultItemBuilder of(final ResultItem template) {
        ResultItemBuilder builder = new ResultItemBuilder();
        builder.imageUrl = template.getImageUrl();
        builder.productVariants = template.getProductVariants();
        return builder;
    }

}
