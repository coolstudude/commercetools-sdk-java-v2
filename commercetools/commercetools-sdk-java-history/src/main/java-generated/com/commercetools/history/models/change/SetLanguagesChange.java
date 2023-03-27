
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * SetLanguagesChange
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetLanguagesChange setLanguagesChange = SetLanguagesChange.builder()
 *             .change("{change}")
 *             .plusPreviousValue(previousValueBuilder -> previousValueBuilder)
 *             .plusNextValue(nextValueBuilder -> nextValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = SetLanguagesChangeImpl.class)
public interface SetLanguagesChange extends Change {

    /**
     * discriminator value for SetLanguagesChange
     */
    String SET_LANGUAGES_CHANGE = "SetLanguagesChange";

    /**
     *
     * @return type
     */
    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
     *  <p>Update action for <code>setLanguages</code> on stores</p>
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
    @JsonProperty("previousValue")
    public List<String> getPreviousValue();

    /**
     *
     * @return nextValue
     */
    @NotNull
    @JsonProperty("nextValue")
    public List<String> getNextValue();

    /**
     *  <p>Update action for <code>setLanguages</code> on stores</p>
     * @param change value to be set
     */

    public void setChange(final String change);

    /**
     * set previousValue
     * @param previousValue values to be set
     */

    @JsonIgnore
    public void setPreviousValue(final String... previousValue);

    /**
     * set previousValue
     * @param previousValue values to be set
     */

    public void setPreviousValue(final List<String> previousValue);

    /**
     * set nextValue
     * @param nextValue values to be set
     */

    @JsonIgnore
    public void setNextValue(final String... nextValue);

    /**
     * set nextValue
     * @param nextValue values to be set
     */

    public void setNextValue(final List<String> nextValue);

    /**
     * factory method
     * @return instance of SetLanguagesChange
     */
    public static SetLanguagesChange of() {
        return new SetLanguagesChangeImpl();
    }

    /**
     * factory method to copy an instance of SetLanguagesChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static SetLanguagesChange of(final SetLanguagesChange template) {
        SetLanguagesChangeImpl instance = new SetLanguagesChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    /**
     * builder factory method for SetLanguagesChange
     * @return builder
     */
    public static SetLanguagesChangeBuilder builder() {
        return SetLanguagesChangeBuilder.of();
    }

    /**
     * create builder for SetLanguagesChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetLanguagesChangeBuilder builder(final SetLanguagesChange template) {
        return SetLanguagesChangeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withSetLanguagesChange(Function<SetLanguagesChange, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<SetLanguagesChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SetLanguagesChange>() {
            @Override
            public String toString() {
                return "TypeReference<SetLanguagesChange>";
            }
        };
    }
}
