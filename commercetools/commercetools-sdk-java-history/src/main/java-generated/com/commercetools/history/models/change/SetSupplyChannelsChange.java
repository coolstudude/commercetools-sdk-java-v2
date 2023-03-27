
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.history.models.common.Reference;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * SetSupplyChannelsChange
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetSupplyChannelsChange setSupplyChannelsChange = SetSupplyChannelsChange.builder()
 *             .change("{change}")
 *             .plusPreviousValue(previousValueBuilder -> previousValueBuilder)
 *             .plusNextValue(nextValueBuilder -> nextValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = SetSupplyChannelsChangeImpl.class)
public interface SetSupplyChannelsChange extends Change {

    /**
     * discriminator value for SetSupplyChannelsChange
     */
    String SET_SUPPLY_CHANNELS_CHANGE = "SetSupplyChannelsChange";

    /**
     *
     * @return type
     */
    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
     *  <p>Shape of the action for <code>setSupplyChannels</code></p>
     * @return change
     */
    @NotNull
    @JsonProperty("change")
    public String getChange();

    /**
     *
     * @return previousValue
     */
    @NotNull
    @Valid
    @JsonProperty("previousValue")
    public List<Reference> getPreviousValue();

    /**
     *
     * @return nextValue
     */
    @NotNull
    @Valid
    @JsonProperty("nextValue")
    public List<Reference> getNextValue();

    /**
     *  <p>Shape of the action for <code>setSupplyChannels</code></p>
     * @param change value to be set
     */

    public void setChange(final String change);

    /**
     * set previousValue
     * @param previousValue values to be set
     */

    @JsonIgnore
    public void setPreviousValue(final Reference... previousValue);

    /**
     * set previousValue
     * @param previousValue values to be set
     */

    public void setPreviousValue(final List<Reference> previousValue);

    /**
     * set nextValue
     * @param nextValue values to be set
     */

    @JsonIgnore
    public void setNextValue(final Reference... nextValue);

    /**
     * set nextValue
     * @param nextValue values to be set
     */

    public void setNextValue(final List<Reference> nextValue);

    /**
     * factory method
     * @return instance of SetSupplyChannelsChange
     */
    public static SetSupplyChannelsChange of() {
        return new SetSupplyChannelsChangeImpl();
    }

    /**
     * factory method to copy an instance of SetSupplyChannelsChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static SetSupplyChannelsChange of(final SetSupplyChannelsChange template) {
        SetSupplyChannelsChangeImpl instance = new SetSupplyChannelsChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    /**
     * builder factory method for SetSupplyChannelsChange
     * @return builder
     */
    public static SetSupplyChannelsChangeBuilder builder() {
        return SetSupplyChannelsChangeBuilder.of();
    }

    /**
     * create builder for SetSupplyChannelsChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetSupplyChannelsChangeBuilder builder(final SetSupplyChannelsChange template) {
        return SetSupplyChannelsChangeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withSetSupplyChannelsChange(Function<SetSupplyChannelsChange, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<SetSupplyChannelsChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SetSupplyChannelsChange>() {
            @Override
            public String toString() {
                return "TypeReference<SetSupplyChannelsChange>";
            }
        };
    }
}
