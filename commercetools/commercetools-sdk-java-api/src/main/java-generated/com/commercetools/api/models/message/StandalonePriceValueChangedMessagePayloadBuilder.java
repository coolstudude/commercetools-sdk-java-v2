
package com.commercetools.api.models.message;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * StandalonePriceValueChangedMessagePayloadBuilder
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
public class StandalonePriceValueChangedMessagePayloadBuilder
        implements Builder<StandalonePriceValueChangedMessagePayload> {

    private com.commercetools.api.models.common.Money value;

    private Boolean staged;

    @Nullable
    private com.commercetools.api.models.common.Money oldValue;

    /**
     *  <p>The new value of the updated StandalonePrice.</p>
     * @return Builder
     */

    public StandalonePriceValueChangedMessagePayloadBuilder value(
            Function<com.commercetools.api.models.common.MoneyBuilder, com.commercetools.api.models.common.MoneyBuilder> builder) {
        this.value = builder.apply(com.commercetools.api.models.common.MoneyBuilder.of()).build();
        return this;
    }

    /**
     *  <p>The new value of the updated StandalonePrice.</p>
     * @param value
     * @return Builder
     */

    public StandalonePriceValueChangedMessagePayloadBuilder value(
            final com.commercetools.api.models.common.Money value) {
        this.value = value;
        return this;
    }

    /**
     *  <p>Whether the new value was applied to the current or the staged representation of the StandalonePrice. Staged changes are stored on the StagedStandalonePrice.</p>
     * @param staged
     * @return Builder
     */

    public StandalonePriceValueChangedMessagePayloadBuilder staged(final Boolean staged) {
        this.staged = staged;
        return this;
    }

    /**
     *  <p>The old value of the updated StandalonePrice. Present on Messages created after 3 February 2023. Optional for backwards compatibility.</p>
     * @return Builder
     */

    public StandalonePriceValueChangedMessagePayloadBuilder oldValue(
            Function<com.commercetools.api.models.common.MoneyBuilder, com.commercetools.api.models.common.MoneyBuilder> builder) {
        this.oldValue = builder.apply(com.commercetools.api.models.common.MoneyBuilder.of()).build();
        return this;
    }

    /**
     *  <p>The old value of the updated StandalonePrice. Present on Messages created after 3 February 2023. Optional for backwards compatibility.</p>
     * @param oldValue
     * @return Builder
     */

    public StandalonePriceValueChangedMessagePayloadBuilder oldValue(
            @Nullable final com.commercetools.api.models.common.Money oldValue) {
        this.oldValue = oldValue;
        return this;
    }

    public com.commercetools.api.models.common.Money getValue() {
        return this.value;
    }

    public Boolean getStaged() {
        return this.staged;
    }

    @Nullable
    public com.commercetools.api.models.common.Money getOldValue() {
        return this.oldValue;
    }

    public StandalonePriceValueChangedMessagePayload build() {
        Objects.requireNonNull(value, StandalonePriceValueChangedMessagePayload.class + ": value is missing");
        Objects.requireNonNull(staged, StandalonePriceValueChangedMessagePayload.class + ": staged is missing");
        return new StandalonePriceValueChangedMessagePayloadImpl(value, staged, oldValue);
    }

    /**
     * builds StandalonePriceValueChangedMessagePayload without checking for non null required values
     */
    public StandalonePriceValueChangedMessagePayload buildUnchecked() {
        return new StandalonePriceValueChangedMessagePayloadImpl(value, staged, oldValue);
    }

    public static StandalonePriceValueChangedMessagePayloadBuilder of() {
        return new StandalonePriceValueChangedMessagePayloadBuilder();
    }

    public static StandalonePriceValueChangedMessagePayloadBuilder of(
            final StandalonePriceValueChangedMessagePayload template) {
        StandalonePriceValueChangedMessagePayloadBuilder builder = new StandalonePriceValueChangedMessagePayloadBuilder();
        builder.value = template.getValue();
        builder.staged = template.getStaged();
        builder.oldValue = template.getOldValue();
        return builder;
    }

}
