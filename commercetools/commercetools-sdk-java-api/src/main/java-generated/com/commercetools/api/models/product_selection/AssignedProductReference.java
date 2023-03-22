
package com.commercetools.api.models.product_selection;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.product.ProductReference;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * AssignedProductReference
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     AssignedProductReference assignedProductReference = AssignedProductReference.builder()
 *             .product(productBuilder -> productBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = AssignedProductReferenceImpl.class)
public interface AssignedProductReference {

    /**
     *  <p>Reference to a Product that is assigned to the Product Selection.</p>
     * @return product
     */
    @NotNull
    @Valid
    @JsonProperty("product")
    public ProductReference getProduct();

    /**
     *  <p>The Variants of the Product that are included from the Product Selection.</p>
     *  <p>This field may exist only for the IndividualProductSelectionType. In absence of this field, all Variants are deemed to be included.</p>
     * @return variantSelection
     */
    @Valid
    @JsonProperty("variantSelection")
    public ProductVariantSelection getVariantSelection();

    /**
     *  <p>The Variants of the Product that are excluded from the Product Selection.</p>
     *  <p>This field may exist only for the IndividualExclusionProductSelectionType. In absence of this field, all Variants are deemed to be excluded.</p>
     * @return variantExclusion
     */
    @Valid
    @JsonProperty("variantExclusion")
    public ProductVariantExclusion getVariantExclusion();

    public void setProduct(final ProductReference product);

    public void setVariantSelection(final ProductVariantSelection variantSelection);

    public void setVariantExclusion(final ProductVariantExclusion variantExclusion);

    public static AssignedProductReference of() {
        return new AssignedProductReferenceImpl();
    }

    public static AssignedProductReference of(final AssignedProductReference template) {
        AssignedProductReferenceImpl instance = new AssignedProductReferenceImpl();
        instance.setProduct(template.getProduct());
        instance.setVariantSelection(template.getVariantSelection());
        instance.setVariantExclusion(template.getVariantExclusion());
        return instance;
    }

    public static AssignedProductReferenceBuilder builder() {
        return AssignedProductReferenceBuilder.of();
    }

    public static AssignedProductReferenceBuilder builder(final AssignedProductReference template) {
        return AssignedProductReferenceBuilder.of(template);
    }

    default <T> T withAssignedProductReference(Function<AssignedProductReference, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<AssignedProductReference> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<AssignedProductReference>() {
            @Override
            public String toString() {
                return "TypeReference<AssignedProductReference>";
            }
        };
    }
}
