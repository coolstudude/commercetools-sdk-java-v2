
package com.commercetools.api.models.product_selection;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductSelectionAddProductActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductSelectionAddProductAction productSelectionAddProductAction = ProductSelectionAddProductAction.builder()
 *             .product(productBuilder -> productBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductSelectionAddProductActionBuilder implements Builder<ProductSelectionAddProductAction> {

    private com.commercetools.api.models.product.ProductResourceIdentifier product;

    /**
     *  <p>ResourceIdentifier to Product</p>
     */

    public ProductSelectionAddProductActionBuilder product(
            Function<com.commercetools.api.models.product.ProductResourceIdentifierBuilder, com.commercetools.api.models.product.ProductResourceIdentifierBuilder> builder) {
        this.product = builder.apply(com.commercetools.api.models.product.ProductResourceIdentifierBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>ResourceIdentifier to Product</p>
     */

    public ProductSelectionAddProductActionBuilder product(
            final com.commercetools.api.models.product.ProductResourceIdentifier product) {
        this.product = product;
        return this;
    }

    public com.commercetools.api.models.product.ProductResourceIdentifier getProduct() {
        return this.product;
    }

    public ProductSelectionAddProductAction build() {
        Objects.requireNonNull(product, ProductSelectionAddProductAction.class + ": product is missing");
        return new ProductSelectionAddProductActionImpl(product);
    }

    /**
     * builds ProductSelectionAddProductAction without checking for non null required values
     */
    public ProductSelectionAddProductAction buildUnchecked() {
        return new ProductSelectionAddProductActionImpl(product);
    }

    public static ProductSelectionAddProductActionBuilder of() {
        return new ProductSelectionAddProductActionBuilder();
    }

    public static ProductSelectionAddProductActionBuilder of(final ProductSelectionAddProductAction template) {
        ProductSelectionAddProductActionBuilder builder = new ProductSelectionAddProductActionBuilder();
        builder.product = template.getProduct();
        return builder;
    }

}
