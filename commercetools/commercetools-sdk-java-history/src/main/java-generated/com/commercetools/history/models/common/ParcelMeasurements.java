
package com.commercetools.history.models.common;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * ParcelMeasurements
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ParcelMeasurements parcelMeasurements = ParcelMeasurements.builder()
 *             .heightInMillimeter(1)
 *             .lengthInMillimeter(1)
 *             .widthInMillimeter(1)
 *             .weightInGram(1)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ParcelMeasurementsImpl.class)
public interface ParcelMeasurements {

    /**
     *
     * @return heightInMillimeter
     */
    @NotNull
    @JsonProperty("heightInMillimeter")
    public Integer getHeightInMillimeter();

    /**
     *
     * @return lengthInMillimeter
     */
    @NotNull
    @JsonProperty("lengthInMillimeter")
    public Integer getLengthInMillimeter();

    /**
     *
     * @return widthInMillimeter
     */
    @NotNull
    @JsonProperty("widthInMillimeter")
    public Integer getWidthInMillimeter();

    /**
     *
     * @return weightInGram
     */
    @NotNull
    @JsonProperty("weightInGram")
    public Integer getWeightInGram();

    /**
     * set heightInMillimeter
     * @param heightInMillimeter value to be set
     */

    public void setHeightInMillimeter(final Integer heightInMillimeter);

    /**
     * set lengthInMillimeter
     * @param lengthInMillimeter value to be set
     */

    public void setLengthInMillimeter(final Integer lengthInMillimeter);

    /**
     * set widthInMillimeter
     * @param widthInMillimeter value to be set
     */

    public void setWidthInMillimeter(final Integer widthInMillimeter);

    /**
     * set weightInGram
     * @param weightInGram value to be set
     */

    public void setWeightInGram(final Integer weightInGram);

    /**
     * factory method
     * @return instance of ParcelMeasurements
     */
    public static ParcelMeasurements of() {
        return new ParcelMeasurementsImpl();
    }

    /**
     * factory method to copy an instance of ParcelMeasurements
     * @param template instance to be copied
     * @return copy instance
     */
    public static ParcelMeasurements of(final ParcelMeasurements template) {
        ParcelMeasurementsImpl instance = new ParcelMeasurementsImpl();
        instance.setHeightInMillimeter(template.getHeightInMillimeter());
        instance.setLengthInMillimeter(template.getLengthInMillimeter());
        instance.setWidthInMillimeter(template.getWidthInMillimeter());
        instance.setWeightInGram(template.getWeightInGram());
        return instance;
    }

    /**
     * builder factory method for ParcelMeasurements
     * @return builder
     */
    public static ParcelMeasurementsBuilder builder() {
        return ParcelMeasurementsBuilder.of();
    }

    /**
     * create builder for ParcelMeasurements instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ParcelMeasurementsBuilder builder(final ParcelMeasurements template) {
        return ParcelMeasurementsBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withParcelMeasurements(Function<ParcelMeasurements, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ParcelMeasurements> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ParcelMeasurements>() {
            @Override
            public String toString() {
                return "TypeReference<ParcelMeasurements>";
            }
        };
    }
}
