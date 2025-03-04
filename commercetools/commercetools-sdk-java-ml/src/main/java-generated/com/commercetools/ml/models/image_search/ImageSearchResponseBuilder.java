
package com.commercetools.ml.models.image_search;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ImageSearchResponseBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ImageSearchResponse imageSearchResponse = ImageSearchResponse.builder()
 *             .count(0.3)
 *             .offset(0.3)
 *             .total(0.3)
 *             .plusResults(resultsBuilder -> resultsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ImageSearchResponseBuilder implements Builder<ImageSearchResponse> {

    private Integer count;

    private Double offset;

    private Integer total;

    private java.util.List<com.commercetools.ml.models.image_search.ResultItem> results;

    /**
     *  <p>The maximum number of results to return from a query.</p>
     * @param count value to be set
     * @return Builder
     */

    public ImageSearchResponseBuilder count(final Integer count) {
        this.count = count;
        return this;
    }

    /**
     *  <p>Number of elements skipped.</p>
     * @param offset value to be set
     * @return Builder
     */

    public ImageSearchResponseBuilder offset(final Double offset) {
        this.offset = offset;
        return this;
    }

    /**
     *  <p>The total number of product images that were have been analyzed.</p>
     * @param total value to be set
     * @return Builder
     */

    public ImageSearchResponseBuilder total(final Integer total) {
        this.total = total;
        return this;
    }

    /**
     *  <p>An array of image URLs of images that are similar to the query image. If no matching images are found, results is empty.</p>
     * @param results value to be set
     * @return Builder
     */

    public ImageSearchResponseBuilder results(final com.commercetools.ml.models.image_search.ResultItem... results) {
        this.results = new ArrayList<>(Arrays.asList(results));
        return this;
    }

    /**
     *  <p>An array of image URLs of images that are similar to the query image. If no matching images are found, results is empty.</p>
     * @param results value to be set
     * @return Builder
     */

    public ImageSearchResponseBuilder results(
            final java.util.List<com.commercetools.ml.models.image_search.ResultItem> results) {
        this.results = results;
        return this;
    }

    /**
     *  <p>An array of image URLs of images that are similar to the query image. If no matching images are found, results is empty.</p>
     * @param results value to be set
     * @return Builder
     */

    public ImageSearchResponseBuilder plusResults(
            final com.commercetools.ml.models.image_search.ResultItem... results) {
        if (this.results == null) {
            this.results = new ArrayList<>();
        }
        this.results.addAll(Arrays.asList(results));
        return this;
    }

    /**
     *  <p>An array of image URLs of images that are similar to the query image. If no matching images are found, results is empty.</p>
     * @param builder function to build the results value
     * @return Builder
     */

    public ImageSearchResponseBuilder plusResults(
            Function<com.commercetools.ml.models.image_search.ResultItemBuilder, com.commercetools.ml.models.image_search.ResultItemBuilder> builder) {
        if (this.results == null) {
            this.results = new ArrayList<>();
        }
        this.results.add(builder.apply(com.commercetools.ml.models.image_search.ResultItemBuilder.of()).build());
        return this;
    }

    /**
     *  <p>An array of image URLs of images that are similar to the query image. If no matching images are found, results is empty.</p>
     * @param builder function to build the results value
     * @return Builder
     */

    public ImageSearchResponseBuilder withResults(
            Function<com.commercetools.ml.models.image_search.ResultItemBuilder, com.commercetools.ml.models.image_search.ResultItemBuilder> builder) {
        this.results = new ArrayList<>();
        this.results.add(builder.apply(com.commercetools.ml.models.image_search.ResultItemBuilder.of()).build());
        return this;
    }

    /**
     *  <p>An array of image URLs of images that are similar to the query image. If no matching images are found, results is empty.</p>
     * @param builder function to build the results value
     * @return Builder
     */

    public ImageSearchResponseBuilder addResults(
            Function<com.commercetools.ml.models.image_search.ResultItemBuilder, com.commercetools.ml.models.image_search.ResultItem> builder) {
        return plusResults(builder.apply(com.commercetools.ml.models.image_search.ResultItemBuilder.of()));
    }

    /**
     *  <p>An array of image URLs of images that are similar to the query image. If no matching images are found, results is empty.</p>
     * @param builder function to build the results value
     * @return Builder
     */

    public ImageSearchResponseBuilder setResults(
            Function<com.commercetools.ml.models.image_search.ResultItemBuilder, com.commercetools.ml.models.image_search.ResultItem> builder) {
        return results(builder.apply(com.commercetools.ml.models.image_search.ResultItemBuilder.of()));
    }

    /**
     *  <p>The maximum number of results to return from a query.</p>
     * @return count
     */

    public Integer getCount() {
        return this.count;
    }

    /**
     *  <p>Number of elements skipped.</p>
     * @return offset
     */

    public Double getOffset() {
        return this.offset;
    }

    /**
     *  <p>The total number of product images that were have been analyzed.</p>
     * @return total
     */

    public Integer getTotal() {
        return this.total;
    }

    /**
     *  <p>An array of image URLs of images that are similar to the query image. If no matching images are found, results is empty.</p>
     * @return results
     */

    public java.util.List<com.commercetools.ml.models.image_search.ResultItem> getResults() {
        return this.results;
    }

    /**
     * builds ImageSearchResponse with checking for non-null required values
     * @return ImageSearchResponse
     */
    public ImageSearchResponse build() {
        Objects.requireNonNull(count, ImageSearchResponse.class + ": count is missing");
        Objects.requireNonNull(offset, ImageSearchResponse.class + ": offset is missing");
        Objects.requireNonNull(total, ImageSearchResponse.class + ": total is missing");
        Objects.requireNonNull(results, ImageSearchResponse.class + ": results is missing");
        return new ImageSearchResponseImpl(count, offset, total, results);
    }

    /**
     * builds ImageSearchResponse without checking for non-null required values
     * @return ImageSearchResponse
     */
    public ImageSearchResponse buildUnchecked() {
        return new ImageSearchResponseImpl(count, offset, total, results);
    }

    /**
     * factory method for an instance of ImageSearchResponseBuilder
     * @return builder
     */
    public static ImageSearchResponseBuilder of() {
        return new ImageSearchResponseBuilder();
    }

    /**
     * create builder for ImageSearchResponse instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ImageSearchResponseBuilder of(final ImageSearchResponse template) {
        ImageSearchResponseBuilder builder = new ImageSearchResponseBuilder();
        builder.count = template.getCount();
        builder.offset = template.getOffset();
        builder.total = template.getTotal();
        builder.results = template.getResults();
        return builder;
    }

}
