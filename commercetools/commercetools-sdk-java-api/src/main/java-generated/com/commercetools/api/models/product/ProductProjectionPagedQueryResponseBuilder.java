
package com.commercetools.api.models.product;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductProjectionPagedQueryResponseBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductProjectionPagedQueryResponse productProjectionPagedQueryResponse = ProductProjectionPagedQueryResponse.builder()
 *             .limit(0.3)
 *             .count(0.3)
 *             .offset(0.3)
 *             .plusResults(resultsBuilder -> resultsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductProjectionPagedQueryResponseBuilder implements Builder<ProductProjectionPagedQueryResponse> {

    private Long limit;

    private Long count;

    @Nullable
    private Long total;

    private Long offset;

    private java.util.List<com.commercetools.api.models.product.ProductProjection> results;

    /**
     *  <p>Number of results requested.</p>
     * @param limit
     * @return Builder
     */

    public ProductProjectionPagedQueryResponseBuilder limit(final Long limit) {
        this.limit = limit;
        return this;
    }

    /**
     *  <p>Actual number of results returned.</p>
     * @param count
     * @return Builder
     */

    public ProductProjectionPagedQueryResponseBuilder count(final Long count) {
        this.count = count;
        return this;
    }

    /**
     *  <p>Total number of results matching the query. This number is an estimation that is not strongly consistent. This field is returned by default. For improved performance, calculating this field can be deactivated by using the query parameter <code>withTotal=false</code>. When the results are filtered with a Query Predicate, <code>total</code> is subject to a limit.</p>
     * @param total
     * @return Builder
     */

    public ProductProjectionPagedQueryResponseBuilder total(@Nullable final Long total) {
        this.total = total;
        return this;
    }

    /**
     *  <p>Number of elements skipped.</p>
     * @param offset
     * @return Builder
     */

    public ProductProjectionPagedQueryResponseBuilder offset(final Long offset) {
        this.offset = offset;
        return this;
    }

    /**
     *  <p>ProductProjections matching the query.</p>
     * @param results
     * @return Builder
     */

    public ProductProjectionPagedQueryResponseBuilder results(
            final com.commercetools.api.models.product.ProductProjection... results) {
        this.results = new ArrayList<>(Arrays.asList(results));
        return this;
    }

    /**
     *  <p>ProductProjections matching the query.</p>
     * @param results
     * @return Builder
     */

    public ProductProjectionPagedQueryResponseBuilder results(
            final java.util.List<com.commercetools.api.models.product.ProductProjection> results) {
        this.results = results;
        return this;
    }

    /**
     *  <p>ProductProjections matching the query.</p>
     * @param results
     * @return Builder
     */

    public ProductProjectionPagedQueryResponseBuilder plusResults(
            final com.commercetools.api.models.product.ProductProjection... results) {
        if (this.results == null) {
            this.results = new ArrayList<>();
        }
        this.results.addAll(Arrays.asList(results));
        return this;
    }

    /**
     *  <p>ProductProjections matching the query.</p>
     * @return Builder
     */

    public ProductProjectionPagedQueryResponseBuilder plusResults(
            Function<com.commercetools.api.models.product.ProductProjectionBuilder, com.commercetools.api.models.product.ProductProjectionBuilder> builder) {
        if (this.results == null) {
            this.results = new ArrayList<>();
        }
        this.results.add(builder.apply(com.commercetools.api.models.product.ProductProjectionBuilder.of()).build());
        return this;
    }

    /**
     *  <p>ProductProjections matching the query.</p>
     * @return Builder
     */

    public ProductProjectionPagedQueryResponseBuilder withResults(
            Function<com.commercetools.api.models.product.ProductProjectionBuilder, com.commercetools.api.models.product.ProductProjectionBuilder> builder) {
        this.results = new ArrayList<>();
        this.results.add(builder.apply(com.commercetools.api.models.product.ProductProjectionBuilder.of()).build());
        return this;
    }

    public Long getLimit() {
        return this.limit;
    }

    public Long getCount() {
        return this.count;
    }

    @Nullable
    public Long getTotal() {
        return this.total;
    }

    public Long getOffset() {
        return this.offset;
    }

    public java.util.List<com.commercetools.api.models.product.ProductProjection> getResults() {
        return this.results;
    }

    public ProductProjectionPagedQueryResponse build() {
        Objects.requireNonNull(limit, ProductProjectionPagedQueryResponse.class + ": limit is missing");
        Objects.requireNonNull(count, ProductProjectionPagedQueryResponse.class + ": count is missing");
        Objects.requireNonNull(offset, ProductProjectionPagedQueryResponse.class + ": offset is missing");
        Objects.requireNonNull(results, ProductProjectionPagedQueryResponse.class + ": results is missing");
        return new ProductProjectionPagedQueryResponseImpl(limit, count, total, offset, results);
    }

    /**
     * builds ProductProjectionPagedQueryResponse without checking for non null required values
     */
    public ProductProjectionPagedQueryResponse buildUnchecked() {
        return new ProductProjectionPagedQueryResponseImpl(limit, count, total, offset, results);
    }

    public static ProductProjectionPagedQueryResponseBuilder of() {
        return new ProductProjectionPagedQueryResponseBuilder();
    }

    public static ProductProjectionPagedQueryResponseBuilder of(final ProductProjectionPagedQueryResponse template) {
        ProductProjectionPagedQueryResponseBuilder builder = new ProductProjectionPagedQueryResponseBuilder();
        builder.limit = template.getLimit();
        builder.count = template.getCount();
        builder.total = template.getTotal();
        builder.offset = template.getOffset();
        builder.results = template.getResults();
        return builder;
    }

}
