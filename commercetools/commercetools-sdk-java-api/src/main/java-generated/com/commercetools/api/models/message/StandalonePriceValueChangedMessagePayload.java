
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.common.Money;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Generated after a successful Change Value update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StandalonePriceValueChangedMessagePayload standalonePriceValueChangedMessagePayload = StandalonePriceValueChangedMessagePayload.builder()
 *             .value(valueBuilder -> valueBuilder)
 *             .staged(true)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = StandalonePriceValueChangedMessagePayloadImpl.class)
public interface StandalonePriceValueChangedMessagePayload extends MessagePayload {

    /**
     * discriminator value for StandalonePriceValueChangedMessagePayload
     */
    String STANDALONE_PRICE_VALUE_CHANGED = "StandalonePriceValueChanged";

    /**
     *  <p>The new value of the updated StandalonePrice.</p>
     * @return value
     */
    @NotNull
    @Valid
    @JsonProperty("value")
    public Money getValue();

    /**
     *  <p>Whether the new value was applied to the current or the staged representation of the StandalonePrice. Staged changes are stored on the StagedStandalonePrice.</p>
     * @return staged
     */
    @NotNull
    @JsonProperty("staged")
    public Boolean getStaged();

    /**
     *  <p>The old value of the updated StandalonePrice. Present on Messages created after 3 February 2023. Optional for backwards compatibility.</p>
     * @return oldValue
     */
    @Valid
    @JsonProperty("oldValue")
    public Money getOldValue();

    /**
     *  <p>The new value of the updated StandalonePrice.</p>
     * @param value value to be set
     */

    public void setValue(final Money value);

    /**
     *  <p>Whether the new value was applied to the current or the staged representation of the StandalonePrice. Staged changes are stored on the StagedStandalonePrice.</p>
     * @param staged value to be set
     */

    public void setStaged(final Boolean staged);

    /**
     *  <p>The old value of the updated StandalonePrice. Present on Messages created after 3 February 2023. Optional for backwards compatibility.</p>
     * @param oldValue value to be set
     */

    public void setOldValue(final Money oldValue);

    /**
     * factory method
     * @return instance of StandalonePriceValueChangedMessagePayload
     */
    public static StandalonePriceValueChangedMessagePayload of() {
        return new StandalonePriceValueChangedMessagePayloadImpl();
    }

    /**
     * factory method to copy an instance of StandalonePriceValueChangedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    public static StandalonePriceValueChangedMessagePayload of(
            final StandalonePriceValueChangedMessagePayload template) {
        StandalonePriceValueChangedMessagePayloadImpl instance = new StandalonePriceValueChangedMessagePayloadImpl();
        instance.setValue(template.getValue());
        instance.setStaged(template.getStaged());
        instance.setOldValue(template.getOldValue());
        return instance;
    }

    /**
     * builder factory method for StandalonePriceValueChangedMessagePayload
     * @return builder
     */
    public static StandalonePriceValueChangedMessagePayloadBuilder builder() {
        return StandalonePriceValueChangedMessagePayloadBuilder.of();
    }

    /**
     * create builder for StandalonePriceValueChangedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StandalonePriceValueChangedMessagePayloadBuilder builder(
            final StandalonePriceValueChangedMessagePayload template) {
        return StandalonePriceValueChangedMessagePayloadBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withStandalonePriceValueChangedMessagePayload(
            Function<StandalonePriceValueChangedMessagePayload, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<StandalonePriceValueChangedMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StandalonePriceValueChangedMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<StandalonePriceValueChangedMessagePayload>";
            }
        };
    }
}
