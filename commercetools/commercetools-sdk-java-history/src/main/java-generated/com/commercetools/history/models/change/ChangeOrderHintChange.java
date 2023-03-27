
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * ChangeOrderHintChange
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ChangeOrderHintChange changeOrderHintChange = ChangeOrderHintChange.builder()
 *             .change("{change}")
 *             .previousValue("{previousValue}")
 *             .nextValue("{nextValue}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ChangeOrderHintChangeImpl.class)
public interface ChangeOrderHintChange extends Change {

    /**
     * discriminator value for ChangeOrderHintChange
     */
    String CHANGE_ORDER_HINT_CHANGE = "ChangeOrderHintChange";

    /**
     *
     * @return type
     */
    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
     *  <p>Shape of the action for <code>changeOrderHint</code></p>
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
    public String getPreviousValue();

    /**
     *
     * @return nextValue
     */
    @NotNull
    @JsonProperty("nextValue")
    public String getNextValue();

    /**
     *  <p>Shape of the action for <code>changeOrderHint</code></p>
     * @param change value to be set
     */

    public void setChange(final String change);

    /**
     * set previousValue
     * @param previousValue value to be set
     */

    public void setPreviousValue(final String previousValue);

    /**
     * set nextValue
     * @param nextValue value to be set
     */

    public void setNextValue(final String nextValue);

    /**
     * factory method
     * @return instance of ChangeOrderHintChange
     */
    public static ChangeOrderHintChange of() {
        return new ChangeOrderHintChangeImpl();
    }

    /**
     * factory method to copy an instance of ChangeOrderHintChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static ChangeOrderHintChange of(final ChangeOrderHintChange template) {
        ChangeOrderHintChangeImpl instance = new ChangeOrderHintChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    /**
     * builder factory method for ChangeOrderHintChange
     * @return builder
     */
    public static ChangeOrderHintChangeBuilder builder() {
        return ChangeOrderHintChangeBuilder.of();
    }

    /**
     * create builder for ChangeOrderHintChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ChangeOrderHintChangeBuilder builder(final ChangeOrderHintChange template) {
        return ChangeOrderHintChangeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withChangeOrderHintChange(Function<ChangeOrderHintChange, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ChangeOrderHintChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ChangeOrderHintChange>() {
            @Override
            public String toString() {
                return "TypeReference<ChangeOrderHintChange>";
            }
        };
    }
}
