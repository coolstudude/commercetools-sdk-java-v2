
package com.commercetools.history.models.change_history;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Response to a query request for Record.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     RecordPagedQueryResponse recordPagedQueryResponse = RecordPagedQueryResponse.builder()
 *             .limit(1)
 *             .count(1)
 *             .total(1)
 *             .offset(1)
 *             .plusResults(resultsBuilder -> resultsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = RecordPagedQueryResponseImpl.class)
public interface RecordPagedQueryResponse {

    /**
     *  <p>Number of results requested.</p>
     * @return limit
     */
    @NotNull
    @JsonProperty("limit")
    public Integer getLimit();

    /**
     *  <p>Actual number of results returned.</p>
     * @return count
     */
    @NotNull
    @JsonProperty("count")
    public Integer getCount();

    /**
     *  <p>Total number of results matching the query. This number is an estimation and not strongly consistent.</p>
     * @return total
     */
    @NotNull
    @JsonProperty("total")
    public Integer getTotal();

    /**
     *  <p>Number of elements skipped.</p>
     * @return offset
     */
    @NotNull
    @JsonProperty("offset")
    public Integer getOffset();

    /**
     *
     * @return results
     */
    @NotNull
    @Valid
    @JsonProperty("results")
    public List<Record> getResults();

    /**
     *  <p>Number of results requested.</p>
     * @param limit value to be set
     */

    public void setLimit(final Integer limit);

    /**
     *  <p>Actual number of results returned.</p>
     * @param count value to be set
     */

    public void setCount(final Integer count);

    /**
     *  <p>Total number of results matching the query. This number is an estimation and not strongly consistent.</p>
     * @param total value to be set
     */

    public void setTotal(final Integer total);

    /**
     *  <p>Number of elements skipped.</p>
     * @param offset value to be set
     */

    public void setOffset(final Integer offset);

    /**
     * set results
     * @param results values to be set
     */

    @JsonIgnore
    public void setResults(final Record... results);

    /**
     * set results
     * @param results values to be set
     */

    public void setResults(final List<Record> results);

    /**
     * factory method
     * @return instance of RecordPagedQueryResponse
     */
    public static RecordPagedQueryResponse of() {
        return new RecordPagedQueryResponseImpl();
    }

    /**
     * factory method to copy an instance of RecordPagedQueryResponse
     * @param template instance to be copied
     * @return copy instance
     */
    public static RecordPagedQueryResponse of(final RecordPagedQueryResponse template) {
        RecordPagedQueryResponseImpl instance = new RecordPagedQueryResponseImpl();
        instance.setLimit(template.getLimit());
        instance.setCount(template.getCount());
        instance.setTotal(template.getTotal());
        instance.setOffset(template.getOffset());
        instance.setResults(template.getResults());
        return instance;
    }

    /**
     * builder factory method for RecordPagedQueryResponse
     * @return builder
     */
    public static RecordPagedQueryResponseBuilder builder() {
        return RecordPagedQueryResponseBuilder.of();
    }

    /**
     * create builder for RecordPagedQueryResponse instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static RecordPagedQueryResponseBuilder builder(final RecordPagedQueryResponse template) {
        return RecordPagedQueryResponseBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withRecordPagedQueryResponse(Function<RecordPagedQueryResponse, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<RecordPagedQueryResponse> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<RecordPagedQueryResponse>() {
            @Override
            public String toString() {
                return "TypeReference<RecordPagedQueryResponse>";
            }
        };
    }
}
