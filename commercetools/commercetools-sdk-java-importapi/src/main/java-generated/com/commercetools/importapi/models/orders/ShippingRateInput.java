
package com.commercetools.importapi.models.orders;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * ShippingRateInput
 *
 * <hr>
 * Example to create a subtype instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ShippingRateInput shippingRateInput = ShippingRateInput.classificationBuilder()
 *             key("{key}")
 *             label(labelBuilder -> labelBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@JsonSubTypes({
        @JsonSubTypes.Type(value = com.commercetools.importapi.models.orders.ClassificationShippingRateInputImpl.class, name = ClassificationShippingRateInput.CLASSIFICATION),
        @JsonSubTypes.Type(value = com.commercetools.importapi.models.orders.ScoreShippingRateInputImpl.class, name = ScoreShippingRateInput.SCORE) })
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "type", defaultImpl = ShippingRateInputImpl.class, visible = true)
@JsonDeserialize(as = ShippingRateInputImpl.class)
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public interface ShippingRateInput {

    /**
     *
     * @return type
     */
    @NotNull
    @JsonProperty("type")
    public ShippingRateInputType getType();

    /**
     * builder for classification subtype
     * @return builder
     */
    public static com.commercetools.importapi.models.orders.ClassificationShippingRateInputBuilder classificationBuilder() {
        return com.commercetools.importapi.models.orders.ClassificationShippingRateInputBuilder.of();
    }

    /**
     * builder for score subtype
     * @return builder
     */
    public static com.commercetools.importapi.models.orders.ScoreShippingRateInputBuilder scoreBuilder() {
        return com.commercetools.importapi.models.orders.ScoreShippingRateInputBuilder.of();
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withShippingRateInput(Function<ShippingRateInput, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ShippingRateInput> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ShippingRateInput>() {
            @Override
            public String toString() {
                return "TypeReference<ShippingRateInput>";
            }
        };
    }
}
