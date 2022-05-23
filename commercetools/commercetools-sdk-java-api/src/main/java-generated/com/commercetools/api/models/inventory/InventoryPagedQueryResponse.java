
package com.commercetools.api.models.inventory;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * InventoryPagedQueryResponse
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     InventoryPagedQueryResponse inventoryPagedQueryResponse = InventoryPagedQueryResponse.builder()
 *             .limit(0.3)
 *             .count(0.3)
 *             .offset(0.3)
 *             .plusResults(resultsBuilder -> resultsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = InventoryPagedQueryResponseImpl.class)
public interface InventoryPagedQueryResponse
        extends com.commercetools.api.models.ResourcePagedQueryResponse<InventoryEntry> {

    /**
     <*  <p>Number of results requested.</p>>
     */
    @NotNull
    @JsonProperty("limit")
    public Long getLimit();

    /**
     <>
     */
    @NotNull
    @JsonProperty("count")
    public Long getCount();

    /**
     <>
     */

    @JsonProperty("total")
    public Long getTotal();

    /**
     <*  <p>Number of elements skipped.</p>>
     */
    @NotNull
    @JsonProperty("offset")
    public Long getOffset();

    /**
     <>
     */
    @NotNull
    @Valid
    @JsonProperty("results")
    public List<InventoryEntry> getResults();

    public void setLimit(final Long limit);

    public void setCount(final Long count);

    public void setTotal(final Long total);

    public void setOffset(final Long offset);

    @JsonIgnore
    public void setResults(final InventoryEntry... results);

    public void setResults(final List<InventoryEntry> results);

    public static InventoryPagedQueryResponse of() {
        return new InventoryPagedQueryResponseImpl();
    }

    public static InventoryPagedQueryResponse of(final InventoryPagedQueryResponse template) {
        InventoryPagedQueryResponseImpl instance = new InventoryPagedQueryResponseImpl();
        instance.setLimit(template.getLimit());
        instance.setCount(template.getCount());
        instance.setTotal(template.getTotal());
        instance.setOffset(template.getOffset());
        instance.setResults(template.getResults());
        return instance;
    }

    public static InventoryPagedQueryResponseBuilder builder() {
        return InventoryPagedQueryResponseBuilder.of();
    }

    public static InventoryPagedQueryResponseBuilder builder(final InventoryPagedQueryResponse template) {
        return InventoryPagedQueryResponseBuilder.of(template);
    }

    default <T> T withInventoryPagedQueryResponse(Function<InventoryPagedQueryResponse, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<InventoryPagedQueryResponse> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<InventoryPagedQueryResponse>() {
            @Override
            public String toString() {
                return "TypeReference<InventoryPagedQueryResponse>";
            }
        };
    }
}
