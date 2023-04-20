
package com.commercetools.api.models.channel;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ChannelPagedQueryResponseBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ChannelPagedQueryResponse channelPagedQueryResponse = ChannelPagedQueryResponse.builder()
 *             .limit(0.3)
 *             .offset(0.3)
 *             .count(0.3)
 *             .plusResults(resultsBuilder -> resultsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ChannelPagedQueryResponseBuilder implements Builder<ChannelPagedQueryResponse> {

    private Long limit;

    private Long offset;

    private Long count;

    @Nullable
    private Long total;

    private java.util.List<com.commercetools.api.models.channel.Channel> results;

    /**
     *  <p>Number of results requested.</p>
     * @param limit value to be set
     * @return Builder
     */

    public ChannelPagedQueryResponseBuilder limit(final Long limit) {
        this.limit = limit;
        return this;
    }

    /**
     *  <p>Number of elements skipped.</p>
     * @param offset value to be set
     * @return Builder
     */

    public ChannelPagedQueryResponseBuilder offset(final Long offset) {
        this.offset = offset;
        return this;
    }

    /**
     *  <p>Actual number of results returned.</p>
     * @param count value to be set
     * @return Builder
     */

    public ChannelPagedQueryResponseBuilder count(final Long count) {
        this.count = count;
        return this;
    }

    /**
     *  <p>Total number of results matching the query. This number is an estimation that is not strongly consistent. This field is returned by default. For improved performance, calculating this field can be deactivated by using the query parameter <code>withTotal=false</code>. When the results are filtered with a Query Predicate, <code>total</code> is subject to a limit.</p>
     * @param total value to be set
     * @return Builder
     */

    public ChannelPagedQueryResponseBuilder total(@Nullable final Long total) {
        this.total = total;
        return this;
    }

    /**
     *  <p>Channels matching the query.</p>
     * @param results value to be set
     * @return Builder
     */

    public ChannelPagedQueryResponseBuilder results(final com.commercetools.api.models.channel.Channel... results) {
        this.results = new ArrayList<>(Arrays.asList(results));
        return this;
    }

    /**
     *  <p>Channels matching the query.</p>
     * @param results value to be set
     * @return Builder
     */

    public ChannelPagedQueryResponseBuilder results(
            final java.util.List<com.commercetools.api.models.channel.Channel> results) {
        this.results = results;
        return this;
    }

    /**
     *  <p>Channels matching the query.</p>
     * @param results value to be set
     * @return Builder
     */

    public ChannelPagedQueryResponseBuilder plusResults(final com.commercetools.api.models.channel.Channel... results) {
        if (this.results == null) {
            this.results = new ArrayList<>();
        }
        this.results.addAll(Arrays.asList(results));
        return this;
    }

    /**
     *  <p>Channels matching the query.</p>
     * @param builder function to build the results value
     * @return Builder
     */

    public ChannelPagedQueryResponseBuilder plusResults(
            Function<com.commercetools.api.models.channel.ChannelBuilder, com.commercetools.api.models.channel.ChannelBuilder> builder) {
        if (this.results == null) {
            this.results = new ArrayList<>();
        }
        this.results.add(builder.apply(com.commercetools.api.models.channel.ChannelBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Channels matching the query.</p>
     * @param builder function to build the results value
     * @return Builder
     */

    public ChannelPagedQueryResponseBuilder withResults(
            Function<com.commercetools.api.models.channel.ChannelBuilder, com.commercetools.api.models.channel.ChannelBuilder> builder) {
        this.results = new ArrayList<>();
        this.results.add(builder.apply(com.commercetools.api.models.channel.ChannelBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Channels matching the query.</p>
     * @param builder function to build the results value
     * @return Builder
     */

    public ChannelPagedQueryResponseBuilder addResults(
            Function<com.commercetools.api.models.channel.ChannelBuilder, com.commercetools.api.models.channel.Channel> builder) {
        return plusResults(builder.apply(com.commercetools.api.models.channel.ChannelBuilder.of()));
    }

    /**
     *  <p>Channels matching the query.</p>
     * @param builder function to build the results value
     * @return Builder
     */

    public ChannelPagedQueryResponseBuilder setResults(
            Function<com.commercetools.api.models.channel.ChannelBuilder, com.commercetools.api.models.channel.Channel> builder) {
        return results(builder.apply(com.commercetools.api.models.channel.ChannelBuilder.of()));
    }

    /**
     *  <p>Number of results requested.</p>
     * @return limit
     */

    public Long getLimit() {
        return this.limit;
    }

    /**
     *  <p>Number of elements skipped.</p>
     * @return offset
     */

    public Long getOffset() {
        return this.offset;
    }

    /**
     *  <p>Actual number of results returned.</p>
     * @return count
     */

    public Long getCount() {
        return this.count;
    }

    /**
     *  <p>Total number of results matching the query. This number is an estimation that is not strongly consistent. This field is returned by default. For improved performance, calculating this field can be deactivated by using the query parameter <code>withTotal=false</code>. When the results are filtered with a Query Predicate, <code>total</code> is subject to a limit.</p>
     * @return total
     */

    @Nullable
    public Long getTotal() {
        return this.total;
    }

    /**
     *  <p>Channels matching the query.</p>
     * @return results
     */

    public java.util.List<com.commercetools.api.models.channel.Channel> getResults() {
        return this.results;
    }

    /**
     * builds ChannelPagedQueryResponse with checking for non-null required values
     * @return ChannelPagedQueryResponse
     */
    public ChannelPagedQueryResponse build() {
        Objects.requireNonNull(limit, ChannelPagedQueryResponse.class + ": limit is missing");
        Objects.requireNonNull(offset, ChannelPagedQueryResponse.class + ": offset is missing");
        Objects.requireNonNull(count, ChannelPagedQueryResponse.class + ": count is missing");
        Objects.requireNonNull(results, ChannelPagedQueryResponse.class + ": results is missing");
        return new ChannelPagedQueryResponseImpl(limit, offset, count, total, results);
    }

    /**
     * builds ChannelPagedQueryResponse without checking for non-null required values
     * @return ChannelPagedQueryResponse
     */
    public ChannelPagedQueryResponse buildUnchecked() {
        return new ChannelPagedQueryResponseImpl(limit, offset, count, total, results);
    }

    /**
     * factory method for an instance of ChannelPagedQueryResponseBuilder
     * @return builder
     */
    public static ChannelPagedQueryResponseBuilder of() {
        return new ChannelPagedQueryResponseBuilder();
    }

    /**
     * create builder for ChannelPagedQueryResponse instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ChannelPagedQueryResponseBuilder of(final ChannelPagedQueryResponse template) {
        ChannelPagedQueryResponseBuilder builder = new ChannelPagedQueryResponseBuilder();
        builder.limit = template.getLimit();
        builder.offset = template.getOffset();
        builder.count = template.getCount();
        builder.total = template.getTotal();
        builder.results = template.getResults();
        return builder;
    }

}
