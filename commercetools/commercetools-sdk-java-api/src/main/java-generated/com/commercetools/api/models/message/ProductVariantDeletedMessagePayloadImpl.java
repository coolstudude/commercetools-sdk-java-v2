
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
 *  <p>Generated after a successful Remove Product Variant update action.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductVariantDeletedMessagePayloadImpl implements ProductVariantDeletedMessagePayload, ModelBase {

    private String type;

    private com.commercetools.api.models.product.ProductVariant variant;

    private java.util.List<String> removedImageUrls;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ProductVariantDeletedMessagePayloadImpl(
            @JsonProperty("variant") final com.commercetools.api.models.product.ProductVariant variant,
            @JsonProperty("removedImageUrls") final java.util.List<String> removedImageUrls) {
        this.variant = variant;
        this.removedImageUrls = removedImageUrls;
        this.type = PRODUCT_VARIANT_DELETED;
    }

    /**
     * create empty instance
     */
    public ProductVariantDeletedMessagePayloadImpl() {
        this.type = PRODUCT_VARIANT_DELETED;
    }

    /**
     *
     */

    public String getType() {
        return this.type;
    }

    /**
     *  <p>Unique identifier of the Product Variant that was added.</p>
     */

    public com.commercetools.api.models.product.ProductVariant getVariant() {
        return this.variant;
    }

    /**
     *  <p>List of image URLs that were removed with the Remove Product Variant update action.</p>
     */

    public java.util.List<String> getRemovedImageUrls() {
        return this.removedImageUrls;
    }

    public void setVariant(final com.commercetools.api.models.product.ProductVariant variant) {
        this.variant = variant;
    }

    public void setRemovedImageUrls(final String... removedImageUrls) {
        this.removedImageUrls = new ArrayList<>(Arrays.asList(removedImageUrls));
    }

    public void setRemovedImageUrls(final java.util.List<String> removedImageUrls) {
        this.removedImageUrls = removedImageUrls;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ProductVariantDeletedMessagePayloadImpl that = (ProductVariantDeletedMessagePayloadImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(variant, that.variant)
                .append(removedImageUrls, that.removedImageUrls)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type).append(variant).append(removedImageUrls).toHashCode();
    }

}
