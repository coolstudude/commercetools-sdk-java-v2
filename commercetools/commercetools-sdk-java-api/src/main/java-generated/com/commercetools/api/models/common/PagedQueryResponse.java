
package com.commercetools.api.models.common;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * PagedQueryResponse
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     PagedQueryResponse pagedQueryResponse = PagedQueryResponse.builder()
 *             .limit(0.3)
 *             .offset(0.3)
 *             .count(0.3)
 *             .plusResults(resultsBuilder -> resultsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = PagedQueryResponseImpl.class)
public interface PagedQueryResponse extends com.commercetools.api.models.ResourcePagedQueryResponse<BaseResource> {

    /**
     *  <p>Number of results requested.</p>
     * @return limit
     */
    @NotNull
    @JsonProperty("limit")
    public Long getLimit();

    /**
     *  <p>Number of elements skipped.</p>
     * @return offset
     */
    @NotNull
    @JsonProperty("offset")
    public Long getOffset();

    /**
     *  <p>Actual number of results returned.</p>
     * @return count
     */
    @NotNull
    @JsonProperty("count")
    public Long getCount();

    /**
     *  <p>Total number of results matching the query. This number is an estimation that is not strongly consistent. This field is returned by default. For improved performance, calculating this field can be deactivated by using the query parameter <code>withTotal=false</code>. When the results are filtered with a Query Predicate, <code>total</code> is subject to a limit.</p>
     * @return total
     */

    @JsonProperty("total")
    public Long getTotal();

    /**
     *
     * @return results
     */
    @NotNull
    @Valid
    @JsonProperty("results")
    public List<BaseResource> getResults();

    /**
     *
     * @return meta
     */
    @Valid
    @JsonProperty("meta")
    public Object getMeta();

    /**
     *  <p>Number of results requested.</p>
     * @param limit value to be set
     */

    public void setLimit(final Long limit);

    /**
     *  <p>Number of elements skipped.</p>
     * @param offset value to be set
     */

    public void setOffset(final Long offset);

    /**
     *  <p>Actual number of results returned.</p>
     * @param count value to be set
     */

    public void setCount(final Long count);

    /**
     *  <p>Total number of results matching the query. This number is an estimation that is not strongly consistent. This field is returned by default. For improved performance, calculating this field can be deactivated by using the query parameter <code>withTotal=false</code>. When the results are filtered with a Query Predicate, <code>total</code> is subject to a limit.</p>
     * @param total value to be set
     */

    public void setTotal(final Long total);

    /**
     * set results
     * @param results values to be set
     */

    @JsonIgnore
    public void setResults(final BaseResource... results);

    /**
     * set results
     * @param results values to be set
     */

    public void setResults(final List<BaseResource> results);

    /**
     * set meta
     * @param meta value to be set
     */

    public void setMeta(final Object meta);

    /**
     * factory method
     * @return instance of PagedQueryResponse
     */
    public static PagedQueryResponse of() {
        return new PagedQueryResponseImpl();
    }

    /**
     * factory method to copy an instance of PagedQueryResponse
     * @param template instance to be copied
     * @return copy instance
     */
    public static PagedQueryResponse of(final PagedQueryResponse template) {
        PagedQueryResponseImpl instance = new PagedQueryResponseImpl();
        instance.setLimit(template.getLimit());
        instance.setOffset(template.getOffset());
        instance.setCount(template.getCount());
        instance.setTotal(template.getTotal());
        instance.setResults(template.getResults());
        instance.setMeta(template.getMeta());
        return instance;
    }

    /**
     * builder factory method for PagedQueryResponse
     * @return builder
     */
    public static PagedQueryResponseBuilder builder() {
        return PagedQueryResponseBuilder.of();
    }

    /**
     * create builder for PagedQueryResponse instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static PagedQueryResponseBuilder builder(final PagedQueryResponse template) {
        return PagedQueryResponseBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withPagedQueryResponse(Function<PagedQueryResponse, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<PagedQueryResponse> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<PagedQueryResponse>() {
            @Override
            public String toString() {
                return "TypeReference<PagedQueryResponse>";
            }
        };
    }
}
