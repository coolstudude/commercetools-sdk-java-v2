
package com.commercetools.api.models.product;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductSetAssetSourcesActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductSetAssetSourcesAction productSetAssetSourcesAction = ProductSetAssetSourcesAction.builder()
 *             .plusSources(sourcesBuilder -> sourcesBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductSetAssetSourcesActionBuilder implements Builder<ProductSetAssetSourcesAction> {

    @Nullable
    private Long variantId;

    @Nullable
    private String sku;

    @Nullable
    private Boolean staged;

    @Nullable
    private String assetId;

    @Nullable
    private String assetKey;

    private java.util.List<com.commercetools.api.models.common.AssetSource> sources;

    /**
     *  <p>The <code>id</code> of the ProductVariant to update.</p>
     * @param variantId value to be set
     * @return Builder
     */

    public ProductSetAssetSourcesActionBuilder variantId(@Nullable final Long variantId) {
        this.variantId = variantId;
        return this;
    }

    /**
     *  <p>The <code>sku</code> of the ProductVariant to update.</p>
     * @param sku value to be set
     * @return Builder
     */

    public ProductSetAssetSourcesActionBuilder sku(@Nullable final String sku) {
        this.sku = sku;
        return this;
    }

    /**
     *  <p>If <code>true</code>, only the staged Asset is updated. If <code>false</code> both the current and staged Asset is updated.</p>
     * @param staged value to be set
     * @return Builder
     */

    public ProductSetAssetSourcesActionBuilder staged(@Nullable final Boolean staged) {
        this.staged = staged;
        return this;
    }

    /**
     *  <p>The <code>id</code> of the Asset to update.</p>
     * @param assetId value to be set
     * @return Builder
     */

    public ProductSetAssetSourcesActionBuilder assetId(@Nullable final String assetId) {
        this.assetId = assetId;
        return this;
    }

    /**
     *  <p>The <code>key</code> of the Asset to update.</p>
     * @param assetKey value to be set
     * @return Builder
     */

    public ProductSetAssetSourcesActionBuilder assetKey(@Nullable final String assetKey) {
        this.assetKey = assetKey;
        return this;
    }

    /**
     *  <p>Value to set.</p>
     * @param sources value to be set
     * @return Builder
     */

    public ProductSetAssetSourcesActionBuilder sources(
            final com.commercetools.api.models.common.AssetSource... sources) {
        this.sources = new ArrayList<>(Arrays.asList(sources));
        return this;
    }

    /**
     *  <p>Value to set.</p>
     * @param sources value to be set
     * @return Builder
     */

    public ProductSetAssetSourcesActionBuilder sources(
            final java.util.List<com.commercetools.api.models.common.AssetSource> sources) {
        this.sources = sources;
        return this;
    }

    /**
     *  <p>Value to set.</p>
     * @param sources value to be set
     * @return Builder
     */

    public ProductSetAssetSourcesActionBuilder plusSources(
            final com.commercetools.api.models.common.AssetSource... sources) {
        if (this.sources == null) {
            this.sources = new ArrayList<>();
        }
        this.sources.addAll(Arrays.asList(sources));
        return this;
    }

    /**
     *  <p>Value to set.</p>
     * @param builder function to build the sources value
     * @return Builder
     */

    public ProductSetAssetSourcesActionBuilder plusSources(
            Function<com.commercetools.api.models.common.AssetSourceBuilder, com.commercetools.api.models.common.AssetSourceBuilder> builder) {
        if (this.sources == null) {
            this.sources = new ArrayList<>();
        }
        this.sources.add(builder.apply(com.commercetools.api.models.common.AssetSourceBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Value to set.</p>
     * @param builder function to build the sources value
     * @return Builder
     */

    public ProductSetAssetSourcesActionBuilder withSources(
            Function<com.commercetools.api.models.common.AssetSourceBuilder, com.commercetools.api.models.common.AssetSourceBuilder> builder) {
        this.sources = new ArrayList<>();
        this.sources.add(builder.apply(com.commercetools.api.models.common.AssetSourceBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Value to set.</p>
     * @param builder function to build the sources value
     * @return Builder
     */

    public ProductSetAssetSourcesActionBuilder addSources(
            Function<com.commercetools.api.models.common.AssetSourceBuilder, com.commercetools.api.models.common.AssetSource> builder) {
        return plusSources(builder.apply(com.commercetools.api.models.common.AssetSourceBuilder.of()));
    }

    /**
     *  <p>Value to set.</p>
     * @param builder function to build the sources value
     * @return Builder
     */

    public ProductSetAssetSourcesActionBuilder setSources(
            Function<com.commercetools.api.models.common.AssetSourceBuilder, com.commercetools.api.models.common.AssetSource> builder) {
        return sources(builder.apply(com.commercetools.api.models.common.AssetSourceBuilder.of()));
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
     *  <p>If <code>true</code>, only the staged Asset is updated. If <code>false</code> both the current and staged Asset is updated.</p>
     * @return staged
     */

    @Nullable
    public Boolean getStaged() {
        return this.staged;
    }

    /**
     *  <p>The <code>id</code> of the Asset to update.</p>
     * @return assetId
     */

    @Nullable
    public String getAssetId() {
        return this.assetId;
    }

    /**
     *  <p>The <code>key</code> of the Asset to update.</p>
     * @return assetKey
     */

    @Nullable
    public String getAssetKey() {
        return this.assetKey;
    }

    /**
     *  <p>Value to set.</p>
     * @return sources
     */

    public java.util.List<com.commercetools.api.models.common.AssetSource> getSources() {
        return this.sources;
    }

    /**
     * builds ProductSetAssetSourcesAction with checking for non-null required values
     * @return ProductSetAssetSourcesAction
     */
    public ProductSetAssetSourcesAction build() {
        Objects.requireNonNull(sources, ProductSetAssetSourcesAction.class + ": sources is missing");
        return new ProductSetAssetSourcesActionImpl(variantId, sku, staged, assetId, assetKey, sources);
    }

    /**
     * builds ProductSetAssetSourcesAction without checking for non-null required values
     * @return ProductSetAssetSourcesAction
     */
    public ProductSetAssetSourcesAction buildUnchecked() {
        return new ProductSetAssetSourcesActionImpl(variantId, sku, staged, assetId, assetKey, sources);
    }

    /**
     * factory method for an instance of ProductSetAssetSourcesActionBuilder
     * @return builder
     */
    public static ProductSetAssetSourcesActionBuilder of() {
        return new ProductSetAssetSourcesActionBuilder();
    }

    /**
     * create builder for ProductSetAssetSourcesAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductSetAssetSourcesActionBuilder of(final ProductSetAssetSourcesAction template) {
        ProductSetAssetSourcesActionBuilder builder = new ProductSetAssetSourcesActionBuilder();
        builder.variantId = template.getVariantId();
        builder.sku = template.getSku();
        builder.staged = template.getStaged();
        builder.assetId = template.getAssetId();
        builder.assetKey = template.getAssetKey();
        builder.sources = template.getSources();
        return builder;
    }

}
