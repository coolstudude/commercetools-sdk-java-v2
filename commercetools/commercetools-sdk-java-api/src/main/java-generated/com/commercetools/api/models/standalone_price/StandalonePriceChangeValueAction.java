
package com.commercetools.api.models.standalone_price;

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
 *  <p>Updating the value of a StandalonePrice produces the StandalonePriceValueChangedMessage.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StandalonePriceChangeValueAction standalonePriceChangeValueAction = StandalonePriceChangeValueAction.builder()
 *             .value(valueBuilder -> valueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = StandalonePriceChangeValueActionImpl.class)
public interface StandalonePriceChangeValueAction extends StandalonePriceUpdateAction {

    String CHANGE_VALUE = "changeValue";

    /**
     *  <p>New value to set. Must not be empty.</p>
     * @return value
     */
    @NotNull
    @Valid
    @JsonProperty("value")
    public Money getValue();

    /**
     *  <p>If set to <code>true</code> the update action applies to the StagedStandalonePrice. If set to <code>false</code>, the update action applies to the current StandalonePrice.</p>
     * @return staged
     */

    @JsonProperty("staged")
    public Boolean getStaged();

    public void setValue(final Money value);

    public void setStaged(final Boolean staged);

    public static StandalonePriceChangeValueAction of() {
        return new StandalonePriceChangeValueActionImpl();
    }

    public static StandalonePriceChangeValueAction of(final StandalonePriceChangeValueAction template) {
        StandalonePriceChangeValueActionImpl instance = new StandalonePriceChangeValueActionImpl();
        instance.setValue(template.getValue());
        instance.setStaged(template.getStaged());
        return instance;
    }

    public static StandalonePriceChangeValueActionBuilder builder() {
        return StandalonePriceChangeValueActionBuilder.of();
    }

    public static StandalonePriceChangeValueActionBuilder builder(final StandalonePriceChangeValueAction template) {
        return StandalonePriceChangeValueActionBuilder.of(template);
    }

    default <T> T withStandalonePriceChangeValueAction(Function<StandalonePriceChangeValueAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<StandalonePriceChangeValueAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StandalonePriceChangeValueAction>() {
            @Override
            public String toString() {
                return "TypeReference<StandalonePriceChangeValueAction>";
            }
        };
    }
}
