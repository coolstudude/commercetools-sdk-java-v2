
package com.commercetools.api.models.order;

import java.time.*;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.annotation.Nullable;
import javax.validation.Valid;

import com.commercetools.api.models.common.Image;
import com.commercetools.api.models.common.PriceDraft;
import com.commercetools.api.models.product.Attribute;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductVariantImportDraft
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductVariantImportDraft productVariantImportDraft = ProductVariantImportDraft.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductVariantImportDraftImpl.class)
public interface ProductVariantImportDraft extends io.vrap.rmf.base.client.Draft<ProductVariantImportDraft> {

    /**
     *  <p>The sequential ID of the variant within the product. The variant with provided ID should exist in some existing product, so you also need to specify the productId if this property is set, or alternatively you can just specify SKU of the product variant.</p>
     * @return id
     */

    @JsonProperty("id")
    public Long getId();

    /**
     *  <p>The SKU of the existing variant.</p>
     * @return sku
     */

    @JsonProperty("sku")
    public String getSku();

    /**
     *  <p>The Embedded Prices of the variant. The prices should not contain two prices for the same price scope (same currency, country, customer group, channel, valid from and valid until). If this property is defined, then it will override the <code>prices</code> property from the original product variant, otherwise <code>prices</code> property from the original product variant would be copied in the resulting order.</p>
     * @return prices
     */
    @Valid
    @JsonProperty("prices")
    public List<PriceDraft> getPrices();

    /**
     *  <p>If this property is defined, then it will override the <code>attributes</code> property from the original product variant, otherwise <code>attributes</code> property from the original product variant would be copied in the resulting order.</p>
     * @return attributes
     */
    @Valid
    @JsonProperty("attributes")
    public List<Attribute> getAttributes();

    /**
     *  <p>If this property is defined, then it will override the <code>images</code> property from the original product variant, otherwise <code>images</code> property from the original product variant would be copied in the resulting order.</p>
     * @return images
     */
    @Valid
    @JsonProperty("images")
    public List<Image> getImages();

    /**
     *  <p>The sequential ID of the variant within the product. The variant with provided ID should exist in some existing product, so you also need to specify the productId if this property is set, or alternatively you can just specify SKU of the product variant.</p>
     * @param id value to be set
     */

    public void setId(final Long id);

    /**
     *  <p>The SKU of the existing variant.</p>
     * @param sku value to be set
     */

    public void setSku(final String sku);

    /**
     *  <p>The Embedded Prices of the variant. The prices should not contain two prices for the same price scope (same currency, country, customer group, channel, valid from and valid until). If this property is defined, then it will override the <code>prices</code> property from the original product variant, otherwise <code>prices</code> property from the original product variant would be copied in the resulting order.</p>
     * @param prices values to be set
     */

    @JsonIgnore
    public void setPrices(final PriceDraft... prices);

    /**
     *  <p>The Embedded Prices of the variant. The prices should not contain two prices for the same price scope (same currency, country, customer group, channel, valid from and valid until). If this property is defined, then it will override the <code>prices</code> property from the original product variant, otherwise <code>prices</code> property from the original product variant would be copied in the resulting order.</p>
     * @param prices values to be set
     */

    public void setPrices(final List<PriceDraft> prices);

    /**
     *  <p>If this property is defined, then it will override the <code>attributes</code> property from the original product variant, otherwise <code>attributes</code> property from the original product variant would be copied in the resulting order.</p>
     * @param attributes values to be set
     */

    @JsonIgnore
    public void setAttributes(final Attribute... attributes);

    /**
     *  <p>If this property is defined, then it will override the <code>attributes</code> property from the original product variant, otherwise <code>attributes</code> property from the original product variant would be copied in the resulting order.</p>
     * @param attributes values to be set
     */

    public void setAttributes(final List<Attribute> attributes);

    /**
     *  <p>If this property is defined, then it will override the <code>images</code> property from the original product variant, otherwise <code>images</code> property from the original product variant would be copied in the resulting order.</p>
     * @param images values to be set
     */

    @JsonIgnore
    public void setImages(final Image... images);

    /**
     *  <p>If this property is defined, then it will override the <code>images</code> property from the original product variant, otherwise <code>images</code> property from the original product variant would be copied in the resulting order.</p>
     * @param images values to be set
     */

    public void setImages(final List<Image> images);

    /**
     * factory method
     * @return instance of ProductVariantImportDraft
     */
    public static ProductVariantImportDraft of() {
        return new ProductVariantImportDraftImpl();
    }

    /**
     * factory method to create a shallow copy ProductVariantImportDraft
     * @param template instance to be copied
     * @return copy instance
     */
    public static ProductVariantImportDraft of(final ProductVariantImportDraft template) {
        ProductVariantImportDraftImpl instance = new ProductVariantImportDraftImpl();
        instance.setId(template.getId());
        instance.setSku(template.getSku());
        instance.setPrices(template.getPrices());
        instance.setAttributes(template.getAttributes());
        instance.setImages(template.getImages());
        return instance;
    }

    /**
     * factory method to create a deep copy of ProductVariantImportDraft
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ProductVariantImportDraft deepCopy(@Nullable final ProductVariantImportDraft template) {
        if (template == null) {
            return null;
        }
        ProductVariantImportDraftImpl instance = new ProductVariantImportDraftImpl();
        instance.setId(template.getId());
        instance.setSku(template.getSku());
        instance.setPrices(Optional.ofNullable(template.getPrices())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.common.PriceDraft::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        instance.setAttributes(Optional.ofNullable(template.getAttributes())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.product.Attribute::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        instance.setImages(Optional.ofNullable(template.getImages())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.common.Image::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for ProductVariantImportDraft
     * @return builder
     */
    public static ProductVariantImportDraftBuilder builder() {
        return ProductVariantImportDraftBuilder.of();
    }

    /**
     * create builder for ProductVariantImportDraft instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductVariantImportDraftBuilder builder(final ProductVariantImportDraft template) {
        return ProductVariantImportDraftBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProductVariantImportDraft(Function<ProductVariantImportDraft, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ProductVariantImportDraft> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductVariantImportDraft>() {
            @Override
            public String toString() {
                return "TypeReference<ProductVariantImportDraft>";
            }
        };
    }
}
