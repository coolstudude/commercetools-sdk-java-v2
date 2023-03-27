
package com.commercetools.api.models.message;

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
 *  <p>Generated after a successful Remove From Category update action.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductRemovedFromCategoryMessagePayloadImpl
        implements ProductRemovedFromCategoryMessagePayload, ModelBase {

    private String type;

    private com.commercetools.api.models.category.CategoryReference category;

    private Boolean staged;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ProductRemovedFromCategoryMessagePayloadImpl(
            @JsonProperty("category") final com.commercetools.api.models.category.CategoryReference category,
            @JsonProperty("staged") final Boolean staged) {
        this.category = category;
        this.staged = staged;
        this.type = PRODUCT_REMOVED_FROM_CATEGORY;
    }

    /**
     * create empty instance
     */
    public ProductRemovedFromCategoryMessagePayloadImpl() {
        this.type = PRODUCT_REMOVED_FROM_CATEGORY;
    }

    /**
     *
     */

    public String getType() {
        return this.type;
    }

    /**
     *  <p>Category the Product was removed from.</p>
     */

    public com.commercetools.api.models.category.CategoryReference getCategory() {
        return this.category;
    }

    /**
     *  <p>Whether the update was only applied to the staged Product Projection.</p>
     */

    public Boolean getStaged() {
        return this.staged;
    }

    public void setCategory(final com.commercetools.api.models.category.CategoryReference category) {
        this.category = category;
    }

    public void setStaged(final Boolean staged) {
        this.staged = staged;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ProductRemovedFromCategoryMessagePayloadImpl that = (ProductRemovedFromCategoryMessagePayloadImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(category, that.category)
                .append(staged, that.staged)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type).append(category).append(staged).toHashCode();
    }

}
