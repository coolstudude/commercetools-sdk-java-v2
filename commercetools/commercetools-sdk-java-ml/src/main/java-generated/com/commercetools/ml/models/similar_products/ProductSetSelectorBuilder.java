
package com.commercetools.ml.models.similar_products;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductSetSelectorBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductSetSelector productSetSelector = ProductSetSelector.builder()
 *             .projectKey("{projectKey}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductSetSelectorBuilder implements Builder<ProductSetSelector> {

    private String projectKey;

    @Nullable
    private java.util.List<String> productIds;

    @Nullable
    private java.util.List<String> productTypeIds;

    @Nullable
    private Boolean staged;

    @Nullable
    private Boolean includeVariants;

    @Nullable
    private Long productSetLimit;

    /**
     *  <p>The project containing the project set.</p>
     * @param projectKey value to be set
     * @return Builder
     */

    public ProductSetSelectorBuilder projectKey(final String projectKey) {
        this.projectKey = projectKey;
        return this;
    }

    /**
     *  <p>An array of Product IDs to compare. If unspecified, no Product ID filter is applied.</p>
     * @param productIds value to be set
     * @return Builder
     */

    public ProductSetSelectorBuilder productIds(@Nullable final String... productIds) {
        this.productIds = new ArrayList<>(Arrays.asList(productIds));
        return this;
    }

    /**
     *  <p>An array of Product IDs to compare. If unspecified, no Product ID filter is applied.</p>
     * @param productIds value to be set
     * @return Builder
     */

    public ProductSetSelectorBuilder productIds(@Nullable final java.util.List<String> productIds) {
        this.productIds = productIds;
        return this;
    }

    /**
     *  <p>An array of Product IDs to compare. If unspecified, no Product ID filter is applied.</p>
     * @param productIds value to be set
     * @return Builder
     */

    public ProductSetSelectorBuilder plusProductIds(@Nullable final String... productIds) {
        if (this.productIds == null) {
            this.productIds = new ArrayList<>();
        }
        this.productIds.addAll(Arrays.asList(productIds));
        return this;
    }

    /**
     *  <p>An array of product type IDs. Only products with product types in this array are compared. If unspecified, no product type filter is applied.</p>
     * @param productTypeIds value to be set
     * @return Builder
     */

    public ProductSetSelectorBuilder productTypeIds(@Nullable final String... productTypeIds) {
        this.productTypeIds = new ArrayList<>(Arrays.asList(productTypeIds));
        return this;
    }

    /**
     *  <p>An array of product type IDs. Only products with product types in this array are compared. If unspecified, no product type filter is applied.</p>
     * @param productTypeIds value to be set
     * @return Builder
     */

    public ProductSetSelectorBuilder productTypeIds(@Nullable final java.util.List<String> productTypeIds) {
        this.productTypeIds = productTypeIds;
        return this;
    }

    /**
     *  <p>An array of product type IDs. Only products with product types in this array are compared. If unspecified, no product type filter is applied.</p>
     * @param productTypeIds value to be set
     * @return Builder
     */

    public ProductSetSelectorBuilder plusProductTypeIds(@Nullable final String... productTypeIds) {
        if (this.productTypeIds == null) {
            this.productTypeIds = new ArrayList<>();
        }
        this.productTypeIds.addAll(Arrays.asList(productTypeIds));
        return this;
    }

    /**
     *  <p>Specifies use of staged or current product data.</p>
     * @param staged value to be set
     * @return Builder
     */

    public ProductSetSelectorBuilder staged(@Nullable final Boolean staged) {
        this.staged = staged;
        return this;
    }

    /**
     *  <p>Specifies use of product variants. If set to <code>true</code>, all product variants are compared, not just the master variant.</p>
     * @param includeVariants value to be set
     * @return Builder
     */

    public ProductSetSelectorBuilder includeVariants(@Nullable final Boolean includeVariants) {
        this.includeVariants = includeVariants;
        return this;
    }

    /**
     *  <p>Maximum number of products to check (if unspecified, all products are considered). Note that the maximum number of product comparisons between two productSets is 20,000,000. This limit cannot be exceeded. If you need a higher limit, contact https://support.commercetools.com</p>
     * @param productSetLimit value to be set
     * @return Builder
     */

    public ProductSetSelectorBuilder productSetLimit(@Nullable final Long productSetLimit) {
        this.productSetLimit = productSetLimit;
        return this;
    }

    /**
     *  <p>The project containing the project set.</p>
     * @return projectKey
     */

    public String getProjectKey() {
        return this.projectKey;
    }

    /**
     *  <p>An array of Product IDs to compare. If unspecified, no Product ID filter is applied.</p>
     * @return productIds
     */

    @Nullable
    public java.util.List<String> getProductIds() {
        return this.productIds;
    }

    /**
     *  <p>An array of product type IDs. Only products with product types in this array are compared. If unspecified, no product type filter is applied.</p>
     * @return productTypeIds
     */

    @Nullable
    public java.util.List<String> getProductTypeIds() {
        return this.productTypeIds;
    }

    /**
     *  <p>Specifies use of staged or current product data.</p>
     * @return staged
     */

    @Nullable
    public Boolean getStaged() {
        return this.staged;
    }

    /**
     *  <p>Specifies use of product variants. If set to <code>true</code>, all product variants are compared, not just the master variant.</p>
     * @return includeVariants
     */

    @Nullable
    public Boolean getIncludeVariants() {
        return this.includeVariants;
    }

    /**
     *  <p>Maximum number of products to check (if unspecified, all products are considered). Note that the maximum number of product comparisons between two productSets is 20,000,000. This limit cannot be exceeded. If you need a higher limit, contact https://support.commercetools.com</p>
     * @return productSetLimit
     */

    @Nullable
    public Long getProductSetLimit() {
        return this.productSetLimit;
    }

    /**
     * builds ProductSetSelector with checking for non-null required values
     * @return ProductSetSelector
     */
    public ProductSetSelector build() {
        Objects.requireNonNull(projectKey, ProductSetSelector.class + ": projectKey is missing");
        return new ProductSetSelectorImpl(projectKey, productIds, productTypeIds, staged, includeVariants,
            productSetLimit);
    }

    /**
     * builds ProductSetSelector without checking for non-null required values
     * @return ProductSetSelector
     */
    public ProductSetSelector buildUnchecked() {
        return new ProductSetSelectorImpl(projectKey, productIds, productTypeIds, staged, includeVariants,
            productSetLimit);
    }

    /**
     * factory method for an instance of ProductSetSelectorBuilder
     * @return builder
     */
    public static ProductSetSelectorBuilder of() {
        return new ProductSetSelectorBuilder();
    }

    /**
     * create builder for ProductSetSelector instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductSetSelectorBuilder of(final ProductSetSelector template) {
        ProductSetSelectorBuilder builder = new ProductSetSelectorBuilder();
        builder.projectKey = template.getProjectKey();
        builder.productIds = template.getProductIds();
        builder.productTypeIds = template.getProductTypeIds();
        builder.staged = template.getStaged();
        builder.includeVariants = template.getIncludeVariants();
        builder.productSetLimit = template.getProductSetLimit();
        return builder;
    }

}
