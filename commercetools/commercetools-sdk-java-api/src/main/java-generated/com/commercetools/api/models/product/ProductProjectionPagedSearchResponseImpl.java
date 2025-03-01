
package com.commercetools.api.models.product;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.ModelBase;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
 * ProductProjectionPagedSearchResponse
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductProjectionPagedSearchResponseImpl implements ProductProjectionPagedSearchResponse, ModelBase {

    private Long limit;

    private Long count;

    private Long total;

    private Long offset;

    private java.util.List<com.commercetools.api.models.product.ProductProjection> results;

    private com.commercetools.api.models.product.FacetResults facets;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ProductProjectionPagedSearchResponseImpl(@JsonProperty("limit") final Long limit,
            @JsonProperty("count") final Long count, @JsonProperty("total") final Long total,
            @JsonProperty("offset") final Long offset,
            @JsonProperty("results") final java.util.List<com.commercetools.api.models.product.ProductProjection> results,
            @JsonProperty("facets") final com.commercetools.api.models.product.FacetResults facets) {
        this.limit = limit;
        this.count = count;
        this.total = total;
        this.offset = offset;
        this.results = results;
        this.facets = facets;
    }

    /**
     * create empty instance
     */
    public ProductProjectionPagedSearchResponseImpl() {
    }

    /**
     *  <p>Number of results requested.</p>
     */

    public Long getLimit() {
        return this.limit;
    }

    /**
     *
     */

    public Long getCount() {
        return this.count;
    }

    /**
     *
     */

    public Long getTotal() {
        return this.total;
    }

    /**
     *  <p>Number of elements skipped.</p>
     */

    public Long getOffset() {
        return this.offset;
    }

    /**
     *
     */

    public java.util.List<com.commercetools.api.models.product.ProductProjection> getResults() {
        return this.results;
    }

    /**
     *
     */

    public com.commercetools.api.models.product.FacetResults getFacets() {
        return this.facets;
    }

    public void setLimit(final Long limit) {
        this.limit = limit;
    }

    public void setCount(final Long count) {
        this.count = count;
    }

    public void setTotal(final Long total) {
        this.total = total;
    }

    public void setOffset(final Long offset) {
        this.offset = offset;
    }

    public void setResults(final com.commercetools.api.models.product.ProductProjection... results) {
        this.results = new ArrayList<>(Arrays.asList(results));
    }

    public void setResults(final java.util.List<com.commercetools.api.models.product.ProductProjection> results) {
        this.results = results;
    }

    public void setFacets(final com.commercetools.api.models.product.FacetResults facets) {
        this.facets = facets;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ProductProjectionPagedSearchResponseImpl that = (ProductProjectionPagedSearchResponseImpl) o;

        return new EqualsBuilder().append(limit, that.limit)
                .append(count, that.count)
                .append(total, that.total)
                .append(offset, that.offset)
                .append(results, that.results)
                .append(facets, that.facets)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(limit)
                .append(count)
                .append(total)
                .append(offset)
                .append(results)
                .append(facets)
                .toHashCode();
    }

}
