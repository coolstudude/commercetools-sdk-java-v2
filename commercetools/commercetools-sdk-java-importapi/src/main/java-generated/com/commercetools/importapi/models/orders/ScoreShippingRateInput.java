
package com.commercetools.importapi.models.orders;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * ScoreShippingRateInput
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ScoreShippingRateInput scoreShippingRateInput = ScoreShippingRateInput.builder()
 *             .score(0.3)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ScoreShippingRateInputImpl.class)
public interface ScoreShippingRateInput extends ShippingRateInput {

    /**
     * discriminator value for ScoreShippingRateInput
     */
    String SCORE = "Score";

    /**
     *
     * @return score
     */
    @NotNull
    @JsonProperty("score")
    public Double getScore();

    /**
     * set score
     * @param score value to be set
     */

    public void setScore(final Double score);

    /**
     * factory method
     * @return instance of ScoreShippingRateInput
     */
    public static ScoreShippingRateInput of() {
        return new ScoreShippingRateInputImpl();
    }

    /**
     * factory method to create a shallow copy ScoreShippingRateInput
     * @param template instance to be copied
     * @return copy instance
     */
    public static ScoreShippingRateInput of(final ScoreShippingRateInput template) {
        ScoreShippingRateInputImpl instance = new ScoreShippingRateInputImpl();
        instance.setScore(template.getScore());
        return instance;
    }

    /**
     * factory method to create a deep copy of ScoreShippingRateInput
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ScoreShippingRateInput deepCopy(@Nullable final ScoreShippingRateInput template) {
        if (template == null) {
            return null;
        }
        ScoreShippingRateInputImpl instance = new ScoreShippingRateInputImpl();
        instance.setScore(template.getScore());
        return instance;
    }

    /**
     * builder factory method for ScoreShippingRateInput
     * @return builder
     */
    public static ScoreShippingRateInputBuilder builder() {
        return ScoreShippingRateInputBuilder.of();
    }

    /**
     * create builder for ScoreShippingRateInput instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ScoreShippingRateInputBuilder builder(final ScoreShippingRateInput template) {
        return ScoreShippingRateInputBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withScoreShippingRateInput(Function<ScoreShippingRateInput, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ScoreShippingRateInput> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ScoreShippingRateInput>() {
            @Override
            public String toString() {
                return "TypeReference<ScoreShippingRateInput>";
            }
        };
    }
}
