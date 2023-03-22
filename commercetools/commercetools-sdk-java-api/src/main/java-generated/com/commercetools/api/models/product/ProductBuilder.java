
package com.commercetools.api.models.product;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     Product product = Product.builder()
 *             .id("{id}")
 *             .version(0.3)
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .productType(productTypeBuilder -> productTypeBuilder)
 *             .masterData(masterDataBuilder -> masterDataBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductBuilder implements Builder<Product> {

    private String id;

    private Long version;

    private java.time.ZonedDateTime createdAt;

    private java.time.ZonedDateTime lastModifiedAt;

    @Nullable
    private com.commercetools.api.models.common.LastModifiedBy lastModifiedBy;

    @Nullable
    private com.commercetools.api.models.common.CreatedBy createdBy;

    @Nullable
    private String key;

    private com.commercetools.api.models.product_type.ProductTypeReference productType;

    private com.commercetools.api.models.product.ProductCatalogData masterData;

    @Nullable
    private com.commercetools.api.models.tax_category.TaxCategoryReference taxCategory;

    @Nullable
    private com.commercetools.api.models.state.StateReference state;

    @Nullable
    private com.commercetools.api.models.review.ReviewRatingStatistics reviewRatingStatistics;

    @Nullable
    private com.commercetools.api.models.product.ProductPriceModeEnum priceMode;

    /**
     *  <p>Unique identifier of the Product.</p>
     * @param id
     * @return Builder
     */

    public ProductBuilder id(final String id) {
        this.id = id;
        return this;
    }

    /**
     *  <p>Current version of the Product.</p>
     * @param version
     * @return Builder
     */

    public ProductBuilder version(final Long version) {
        this.version = version;
        return this;
    }

    /**
     *  <p>Date and time (UTC) the Product was initially created.</p>
     * @param createdAt
     * @return Builder
     */

    public ProductBuilder createdAt(final java.time.ZonedDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     *  <p>Date and time (UTC) the Product was last updated.</p>
     * @param lastModifiedAt
     * @return Builder
     */

    public ProductBuilder lastModifiedAt(final java.time.ZonedDateTime lastModifiedAt) {
        this.lastModifiedAt = lastModifiedAt;
        return this;
    }

    /**
     *  <p>Present on resources created after 1 February 2019 except for events not tracked.</p>
     * @return Builder
     */

    public ProductBuilder lastModifiedBy(
            Function<com.commercetools.api.models.common.LastModifiedByBuilder, com.commercetools.api.models.common.LastModifiedByBuilder> builder) {
        this.lastModifiedBy = builder.apply(com.commercetools.api.models.common.LastModifiedByBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Present on resources created after 1 February 2019 except for events not tracked.</p>
     * @param lastModifiedBy
     * @return Builder
     */

    public ProductBuilder lastModifiedBy(
            @Nullable final com.commercetools.api.models.common.LastModifiedBy lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
        return this;
    }

    /**
     *  <p>Present on resources created after 1 February 2019 except for events not tracked.</p>
     * @return Builder
     */

    public ProductBuilder createdBy(
            Function<com.commercetools.api.models.common.CreatedByBuilder, com.commercetools.api.models.common.CreatedByBuilder> builder) {
        this.createdBy = builder.apply(com.commercetools.api.models.common.CreatedByBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Present on resources created after 1 February 2019 except for events not tracked.</p>
     * @param createdBy
     * @return Builder
     */

    public ProductBuilder createdBy(@Nullable final com.commercetools.api.models.common.CreatedBy createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    /**
     *  <p>User-defined unique identifier of the Product.</p>
     *  <p>This is different from the <code>key</code> of a ProductVariant.</p>
     * @param key
     * @return Builder
     */

    public ProductBuilder key(@Nullable final String key) {
        this.key = key;
        return this;
    }

    /**
     *  <p>The Product Type defining the Attributes of the Product. Cannot be changed.</p>
     * @return Builder
     */

    public ProductBuilder productType(
            Function<com.commercetools.api.models.product_type.ProductTypeReferenceBuilder, com.commercetools.api.models.product_type.ProductTypeReferenceBuilder> builder) {
        this.productType = builder.apply(com.commercetools.api.models.product_type.ProductTypeReferenceBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>The Product Type defining the Attributes of the Product. Cannot be changed.</p>
     * @param productType
     * @return Builder
     */

    public ProductBuilder productType(
            final com.commercetools.api.models.product_type.ProductTypeReference productType) {
        this.productType = productType;
        return this;
    }

    /**
     *  <p>Contains the current and the staged representation of the product information.</p>
     * @return Builder
     */

    public ProductBuilder masterData(
            Function<com.commercetools.api.models.product.ProductCatalogDataBuilder, com.commercetools.api.models.product.ProductCatalogDataBuilder> builder) {
        this.masterData = builder.apply(com.commercetools.api.models.product.ProductCatalogDataBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Contains the current and the staged representation of the product information.</p>
     * @param masterData
     * @return Builder
     */

    public ProductBuilder masterData(final com.commercetools.api.models.product.ProductCatalogData masterData) {
        this.masterData = masterData;
        return this;
    }

    /**
     *  <p>The TaxCategory of the Product.</p>
     * @return Builder
     */

    public ProductBuilder taxCategory(
            Function<com.commercetools.api.models.tax_category.TaxCategoryReferenceBuilder, com.commercetools.api.models.tax_category.TaxCategoryReferenceBuilder> builder) {
        this.taxCategory = builder.apply(com.commercetools.api.models.tax_category.TaxCategoryReferenceBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>The TaxCategory of the Product.</p>
     * @param taxCategory
     * @return Builder
     */

    public ProductBuilder taxCategory(
            @Nullable final com.commercetools.api.models.tax_category.TaxCategoryReference taxCategory) {
        this.taxCategory = taxCategory;
        return this;
    }

    /**
     *  <p>State of the Product.</p>
     * @return Builder
     */

    public ProductBuilder state(
            Function<com.commercetools.api.models.state.StateReferenceBuilder, com.commercetools.api.models.state.StateReferenceBuilder> builder) {
        this.state = builder.apply(com.commercetools.api.models.state.StateReferenceBuilder.of()).build();
        return this;
    }

    /**
     *  <p>State of the Product.</p>
     * @param state
     * @return Builder
     */

    public ProductBuilder state(@Nullable final com.commercetools.api.models.state.StateReference state) {
        this.state = state;
        return this;
    }

    /**
     *  <p>Review statistics of the Product.</p>
     * @return Builder
     */

    public ProductBuilder reviewRatingStatistics(
            Function<com.commercetools.api.models.review.ReviewRatingStatisticsBuilder, com.commercetools.api.models.review.ReviewRatingStatisticsBuilder> builder) {
        this.reviewRatingStatistics = builder
                .apply(com.commercetools.api.models.review.ReviewRatingStatisticsBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Review statistics of the Product.</p>
     * @param reviewRatingStatistics
     * @return Builder
     */

    public ProductBuilder reviewRatingStatistics(
            @Nullable final com.commercetools.api.models.review.ReviewRatingStatistics reviewRatingStatistics) {
        this.reviewRatingStatistics = reviewRatingStatistics;
        return this;
    }

    /**
     *  <p>Type of Price to be used when looking up a price for the Product.</p>
     * @param priceMode
     * @return Builder
     */

    public ProductBuilder priceMode(
            @Nullable final com.commercetools.api.models.product.ProductPriceModeEnum priceMode) {
        this.priceMode = priceMode;
        return this;
    }

    public String getId() {
        return this.id;
    }

    public Long getVersion() {
        return this.version;
    }

    public java.time.ZonedDateTime getCreatedAt() {
        return this.createdAt;
    }

    public java.time.ZonedDateTime getLastModifiedAt() {
        return this.lastModifiedAt;
    }

    @Nullable
    public com.commercetools.api.models.common.LastModifiedBy getLastModifiedBy() {
        return this.lastModifiedBy;
    }

    @Nullable
    public com.commercetools.api.models.common.CreatedBy getCreatedBy() {
        return this.createdBy;
    }

    @Nullable
    public String getKey() {
        return this.key;
    }

    public com.commercetools.api.models.product_type.ProductTypeReference getProductType() {
        return this.productType;
    }

    public com.commercetools.api.models.product.ProductCatalogData getMasterData() {
        return this.masterData;
    }

    @Nullable
    public com.commercetools.api.models.tax_category.TaxCategoryReference getTaxCategory() {
        return this.taxCategory;
    }

    @Nullable
    public com.commercetools.api.models.state.StateReference getState() {
        return this.state;
    }

    @Nullable
    public com.commercetools.api.models.review.ReviewRatingStatistics getReviewRatingStatistics() {
        return this.reviewRatingStatistics;
    }

    @Nullable
    public com.commercetools.api.models.product.ProductPriceModeEnum getPriceMode() {
        return this.priceMode;
    }

    public Product build() {
        Objects.requireNonNull(id, Product.class + ": id is missing");
        Objects.requireNonNull(version, Product.class + ": version is missing");
        Objects.requireNonNull(createdAt, Product.class + ": createdAt is missing");
        Objects.requireNonNull(lastModifiedAt, Product.class + ": lastModifiedAt is missing");
        Objects.requireNonNull(productType, Product.class + ": productType is missing");
        Objects.requireNonNull(masterData, Product.class + ": masterData is missing");
        return new ProductImpl(id, version, createdAt, lastModifiedAt, lastModifiedBy, createdBy, key, productType,
            masterData, taxCategory, state, reviewRatingStatistics, priceMode);
    }

    /**
     * builds Product without checking for non null required values
     */
    public Product buildUnchecked() {
        return new ProductImpl(id, version, createdAt, lastModifiedAt, lastModifiedBy, createdBy, key, productType,
            masterData, taxCategory, state, reviewRatingStatistics, priceMode);
    }

    public static ProductBuilder of() {
        return new ProductBuilder();
    }

    public static ProductBuilder of(final Product template) {
        ProductBuilder builder = new ProductBuilder();
        builder.id = template.getId();
        builder.version = template.getVersion();
        builder.createdAt = template.getCreatedAt();
        builder.lastModifiedAt = template.getLastModifiedAt();
        builder.lastModifiedBy = template.getLastModifiedBy();
        builder.createdBy = template.getCreatedBy();
        builder.key = template.getKey();
        builder.productType = template.getProductType();
        builder.masterData = template.getMasterData();
        builder.taxCategory = template.getTaxCategory();
        builder.state = template.getState();
        builder.reviewRatingStatistics = template.getReviewRatingStatistics();
        builder.priceMode = template.getPriceMode();
        return builder;
    }

}
