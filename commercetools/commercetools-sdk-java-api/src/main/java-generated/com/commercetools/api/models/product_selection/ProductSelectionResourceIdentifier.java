
package com.commercetools.api.models.product_selection;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import com.commercetools.api.models.common.ResourceIdentifier;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>ResourceIdentifier to a ProductSelection.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductSelectionResourceIdentifier productSelectionResourceIdentifier = ProductSelectionResourceIdentifier.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductSelectionResourceIdentifierImpl.class)
public interface ProductSelectionResourceIdentifier
        extends ResourceIdentifier, com.commercetools.api.models.Identifiable<ProductSelection> {

    /**
     * discriminator value for ProductSelectionResourceIdentifier
     */
    String PRODUCT_SELECTION = "product-selection";

    /**
     *  <p>Unique identifier of the referenced ProductSelection. Either <code>id</code> or <code>key</code> is required.</p>
     * @return id
     */

    @JsonProperty("id")
    public String getId();

    /**
     *  <p>User-defined unique identifier of the referenced ProductSelection. Either <code>id</code> or <code>key</code> is required.</p>
     * @return key
     */

    @JsonProperty("key")
    public String getKey();

    /**
     *  <p>Unique identifier of the referenced ProductSelection. Either <code>id</code> or <code>key</code> is required.</p>
     * @param id value to be set
     */

    public void setId(final String id);

    /**
     *  <p>User-defined unique identifier of the referenced ProductSelection. Either <code>id</code> or <code>key</code> is required.</p>
     * @param key value to be set
     */

    public void setKey(final String key);

    /**
     * factory method
     * @return instance of ProductSelectionResourceIdentifier
     */
    public static ProductSelectionResourceIdentifier of() {
        return new ProductSelectionResourceIdentifierImpl();
    }

    /**
     * factory method to copy an instance of ProductSelectionResourceIdentifier
     * @param template instance to be copied
     * @return copy instance
     */
    public static ProductSelectionResourceIdentifier of(final ProductSelectionResourceIdentifier template) {
        ProductSelectionResourceIdentifierImpl instance = new ProductSelectionResourceIdentifierImpl();
        instance.setId(template.getId());
        instance.setKey(template.getKey());
        return instance;
    }

    /**
     * builder factory method for ProductSelectionResourceIdentifier
     * @return builder
     */
    public static ProductSelectionResourceIdentifierBuilder builder() {
        return ProductSelectionResourceIdentifierBuilder.of();
    }

    /**
     * create builder for ProductSelectionResourceIdentifier instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductSelectionResourceIdentifierBuilder builder(final ProductSelectionResourceIdentifier template) {
        return ProductSelectionResourceIdentifierBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProductSelectionResourceIdentifier(Function<ProductSelectionResourceIdentifier, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ProductSelectionResourceIdentifier> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductSelectionResourceIdentifier>() {
            @Override
            public String toString() {
                return "TypeReference<ProductSelectionResourceIdentifier>";
            }
        };
    }
}
