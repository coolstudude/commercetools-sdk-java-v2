
package com.commercetools.ml.models.similar_products;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * SimilarProductsPagedQueryResultBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SimilarProductsPagedQueryResult similarProductsPagedQueryResult = SimilarProductsPagedQueryResult.builder()
 *             .count(0.3)
 *             .total(0.3)
 *             .offset(0.3)
 *             .plusResults(resultsBuilder -> resultsBuilder)
 *             .meta(metaBuilder -> metaBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SimilarProductsPagedQueryResultBuilder implements Builder<SimilarProductsPagedQueryResult> {

    private Long count;

    private Long total;

    private Long offset;

    private java.util.List<com.commercetools.ml.models.similar_products.SimilarProductPair> results;

    private com.commercetools.ml.models.similar_products.SimilarProductSearchRequestMeta meta;

    /**
     * set the value to the count
     * @param count value to be set
     * @return Builder
     */

    public SimilarProductsPagedQueryResultBuilder count(final Long count) {
        this.count = count;
        return this;
    }

    /**
     * set the value to the total
     * @param total value to be set
     * @return Builder
     */

    public SimilarProductsPagedQueryResultBuilder total(final Long total) {
        this.total = total;
        return this;
    }

    /**
     *  <p>Number of elements skipped.</p>
     * @param offset value to be set
     * @return Builder
     */

    public SimilarProductsPagedQueryResultBuilder offset(final Long offset) {
        this.offset = offset;
        return this;
    }

    /**
     * set values to the results
     * @param results value to be set
     * @return Builder
     */

    public SimilarProductsPagedQueryResultBuilder results(
            final com.commercetools.ml.models.similar_products.SimilarProductPair... results) {
        this.results = new ArrayList<>(Arrays.asList(results));
        return this;
    }

    /**
     * set value to the results
     * @param results value to be set
     * @return Builder
     */

    public SimilarProductsPagedQueryResultBuilder results(
            final java.util.List<com.commercetools.ml.models.similar_products.SimilarProductPair> results) {
        this.results = results;
        return this;
    }

    /**
     * add values to the results
     * @param results value to be set
     * @return Builder
     */

    public SimilarProductsPagedQueryResultBuilder plusResults(
            final com.commercetools.ml.models.similar_products.SimilarProductPair... results) {
        if (this.results == null) {
            this.results = new ArrayList<>();
        }
        this.results.addAll(Arrays.asList(results));
        return this;
    }

    /**
     * add the value to the results using the builder function
     * @param builder function to build the results value
     * @return Builder
     */

    public SimilarProductsPagedQueryResultBuilder plusResults(
            Function<com.commercetools.ml.models.similar_products.SimilarProductPairBuilder, com.commercetools.ml.models.similar_products.SimilarProductPairBuilder> builder) {
        if (this.results == null) {
            this.results = new ArrayList<>();
        }
        this.results.add(
            builder.apply(com.commercetools.ml.models.similar_products.SimilarProductPairBuilder.of()).build());
        return this;
    }

    /**
     * set the value to the results using the builder function
     * @param builder function to build the results value
     * @return Builder
     */

    public SimilarProductsPagedQueryResultBuilder withResults(
            Function<com.commercetools.ml.models.similar_products.SimilarProductPairBuilder, com.commercetools.ml.models.similar_products.SimilarProductPairBuilder> builder) {
        this.results = new ArrayList<>();
        this.results.add(
            builder.apply(com.commercetools.ml.models.similar_products.SimilarProductPairBuilder.of()).build());
        return this;
    }

    /**
     * add the value to the results using the builder function
     * @param builder function to build the results value
     * @return Builder
     */

    public SimilarProductsPagedQueryResultBuilder addResults(
            Function<com.commercetools.ml.models.similar_products.SimilarProductPairBuilder, com.commercetools.ml.models.similar_products.SimilarProductPair> builder) {
        return plusResults(builder.apply(com.commercetools.ml.models.similar_products.SimilarProductPairBuilder.of()));
    }

    /**
     * set the value to the results using the builder function
     * @param builder function to build the results value
     * @return Builder
     */

    public SimilarProductsPagedQueryResultBuilder setResults(
            Function<com.commercetools.ml.models.similar_products.SimilarProductPairBuilder, com.commercetools.ml.models.similar_products.SimilarProductPair> builder) {
        return results(builder.apply(com.commercetools.ml.models.similar_products.SimilarProductPairBuilder.of()));
    }

    /**
     * set the value to the meta using the builder function
     * @param builder function to build the meta value
     * @return Builder
     */

    public SimilarProductsPagedQueryResultBuilder meta(
            Function<com.commercetools.ml.models.similar_products.SimilarProductSearchRequestMetaBuilder, com.commercetools.ml.models.similar_products.SimilarProductSearchRequestMetaBuilder> builder) {
        this.meta = builder
                .apply(com.commercetools.ml.models.similar_products.SimilarProductSearchRequestMetaBuilder.of())
                .build();
        return this;
    }

    /**
     * set the value to the meta using the builder function
     * @param builder function to build the meta value
     * @return Builder
     */

    public SimilarProductsPagedQueryResultBuilder withMeta(
            Function<com.commercetools.ml.models.similar_products.SimilarProductSearchRequestMetaBuilder, com.commercetools.ml.models.similar_products.SimilarProductSearchRequestMeta> builder) {
        this.meta = builder
                .apply(com.commercetools.ml.models.similar_products.SimilarProductSearchRequestMetaBuilder.of());
        return this;
    }

    /**
     * set the value to the meta
     * @param meta value to be set
     * @return Builder
     */

    public SimilarProductsPagedQueryResultBuilder meta(
            final com.commercetools.ml.models.similar_products.SimilarProductSearchRequestMeta meta) {
        this.meta = meta;
        return this;
    }

    /**
     * value of count}
     * @return count
     */

    public Long getCount() {
        return this.count;
    }

    /**
     * value of total}
     * @return total
     */

    public Long getTotal() {
        return this.total;
    }

    /**
     *  <p>Number of elements skipped.</p>
     * @return offset
     */

    public Long getOffset() {
        return this.offset;
    }

    /**
     * value of results}
     * @return results
     */

    public java.util.List<com.commercetools.ml.models.similar_products.SimilarProductPair> getResults() {
        return this.results;
    }

    /**
     * value of meta}
     * @return meta
     */

    public com.commercetools.ml.models.similar_products.SimilarProductSearchRequestMeta getMeta() {
        return this.meta;
    }

    /**
     * builds SimilarProductsPagedQueryResult with checking for non-null required values
     * @return SimilarProductsPagedQueryResult
     */
    public SimilarProductsPagedQueryResult build() {
        Objects.requireNonNull(count, SimilarProductsPagedQueryResult.class + ": count is missing");
        Objects.requireNonNull(total, SimilarProductsPagedQueryResult.class + ": total is missing");
        Objects.requireNonNull(offset, SimilarProductsPagedQueryResult.class + ": offset is missing");
        Objects.requireNonNull(results, SimilarProductsPagedQueryResult.class + ": results is missing");
        Objects.requireNonNull(meta, SimilarProductsPagedQueryResult.class + ": meta is missing");
        return new SimilarProductsPagedQueryResultImpl(count, total, offset, results, meta);
    }

    /**
     * builds SimilarProductsPagedQueryResult without checking for non-null required values
     * @return SimilarProductsPagedQueryResult
     */
    public SimilarProductsPagedQueryResult buildUnchecked() {
        return new SimilarProductsPagedQueryResultImpl(count, total, offset, results, meta);
    }

    /**
     * factory method for an instance of SimilarProductsPagedQueryResultBuilder
     * @return builder
     */
    public static SimilarProductsPagedQueryResultBuilder of() {
        return new SimilarProductsPagedQueryResultBuilder();
    }

    /**
     * create builder for SimilarProductsPagedQueryResult instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SimilarProductsPagedQueryResultBuilder of(final SimilarProductsPagedQueryResult template) {
        SimilarProductsPagedQueryResultBuilder builder = new SimilarProductsPagedQueryResultBuilder();
        builder.count = template.getCount();
        builder.total = template.getTotal();
        builder.offset = template.getOffset();
        builder.results = template.getResults();
        builder.meta = template.getMeta();
        return builder;
    }

}
