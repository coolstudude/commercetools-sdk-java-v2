
package com.commercetools.api.models.attribute_group;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * AttributeReference
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     AttributeReference attributeReference = AttributeReference.builder()
 *             .key("{key}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = AttributeReferenceImpl.class)
public interface AttributeReference extends com.commercetools.api.models.WithKey {

    /**
     *  <p>Key of the attribute.</p>
     * @return key
     */
    @NotNull
    @JsonProperty("key")
    public String getKey();

    /**
     *  <p>Key of the attribute.</p>
     * @param key value to be set
     */

    public void setKey(final String key);

    /**
     * factory method
     * @return instance of AttributeReference
     */
    public static AttributeReference of() {
        return new AttributeReferenceImpl();
    }

    /**
     * factory method to copy an instance of AttributeReference
     * @param template instance to be copied
     * @return copy instance
     */
    public static AttributeReference of(final AttributeReference template) {
        AttributeReferenceImpl instance = new AttributeReferenceImpl();
        instance.setKey(template.getKey());
        return instance;
    }

    /**
     * builder factory method for AttributeReference
     * @return builder
     */
    public static AttributeReferenceBuilder builder() {
        return AttributeReferenceBuilder.of();
    }

    /**
     * create builder for AttributeReference instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static AttributeReferenceBuilder builder(final AttributeReference template) {
        return AttributeReferenceBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withAttributeReference(Function<AttributeReference, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<AttributeReference> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<AttributeReference>() {
            @Override
            public String toString() {
                return "TypeReference<AttributeReference>";
            }
        };
    }
}
