
package com.commercetools.api.models.message;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductSelectionProductAddedMessagePayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductSelectionProductAddedMessagePayload productSelectionProductAddedMessagePayload = ProductSelectionProductAddedMessagePayload.builder()
 *             .product(productBuilder -> productBuilder)
 *             .variantSelection(variantSelectionBuilder -> variantSelectionBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductSelectionProductAddedMessagePayloadBuilder
        implements Builder<ProductSelectionProductAddedMessagePayload> {

    private com.commercetools.api.models.product.ProductReference product;

    private com.commercetools.api.models.product_selection.ProductVariantSelection variantSelection;

    /**
     *  <p>Product that was added to the Product Selection.</p>
     * @return Builder
     */

    public ProductSelectionProductAddedMessagePayloadBuilder product(
            Function<com.commercetools.api.models.product.ProductReferenceBuilder, com.commercetools.api.models.product.ProductReferenceBuilder> builder) {
        this.product = builder.apply(com.commercetools.api.models.product.ProductReferenceBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Product that was added to the Product Selection.</p>
     * @param product
     * @return Builder
     */

    public ProductSelectionProductAddedMessagePayloadBuilder product(
            final com.commercetools.api.models.product.ProductReference product) {
        this.product = product;
        return this;
    }

    /**
     *  <p>Product Variant Selection after the Add Product update action.</p>
     * @param variantSelection
     * @return Builder
     */

    public ProductSelectionProductAddedMessagePayloadBuilder variantSelection(
            final com.commercetools.api.models.product_selection.ProductVariantSelection variantSelection) {
        this.variantSelection = variantSelection;
        return this;
    }

    /**
     *  <p>Product Variant Selection after the Add Product update action.</p>
     * @return Builder
     */

    public ProductSelectionProductAddedMessagePayloadBuilder variantSelection(
            Function<com.commercetools.api.models.product_selection.ProductVariantSelectionBuilder, Builder<? extends com.commercetools.api.models.product_selection.ProductVariantSelection>> builder) {
        this.variantSelection = builder
                .apply(com.commercetools.api.models.product_selection.ProductVariantSelectionBuilder.of())
                .build();
        return this;
    }

    public com.commercetools.api.models.product.ProductReference getProduct() {
        return this.product;
    }

    public com.commercetools.api.models.product_selection.ProductVariantSelection getVariantSelection() {
        return this.variantSelection;
    }

    public ProductSelectionProductAddedMessagePayload build() {
        Objects.requireNonNull(product, ProductSelectionProductAddedMessagePayload.class + ": product is missing");
        Objects.requireNonNull(variantSelection,
            ProductSelectionProductAddedMessagePayload.class + ": variantSelection is missing");
        return new ProductSelectionProductAddedMessagePayloadImpl(product, variantSelection);
    }

    /**
     * builds ProductSelectionProductAddedMessagePayload without checking for non null required values
     */
    public ProductSelectionProductAddedMessagePayload buildUnchecked() {
        return new ProductSelectionProductAddedMessagePayloadImpl(product, variantSelection);
    }

    public static ProductSelectionProductAddedMessagePayloadBuilder of() {
        return new ProductSelectionProductAddedMessagePayloadBuilder();
    }

    public static ProductSelectionProductAddedMessagePayloadBuilder of(
            final ProductSelectionProductAddedMessagePayload template) {
        ProductSelectionProductAddedMessagePayloadBuilder builder = new ProductSelectionProductAddedMessagePayloadBuilder();
        builder.product = template.getProduct();
        builder.variantSelection = template.getVariantSelection();
        return builder;
    }

}
