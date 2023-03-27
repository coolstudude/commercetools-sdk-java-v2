
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.commercetools.history.models.common.OrderState;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * ChangeOrderStateChange
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ChangeOrderStateChange changeOrderStateChange = ChangeOrderStateChange.builder()
 *             .change("{change}")
 *             .nextValue(OrderState.OPEN)
 *             .previousValue(OrderState.OPEN)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ChangeOrderStateChangeImpl.class)
public interface ChangeOrderStateChange extends Change {

    /**
     * discriminator value for ChangeOrderStateChange
     */
    String CHANGE_ORDER_STATE_CHANGE = "ChangeOrderStateChange";

    /**
     *
     * @return type
     */
    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
     *  <p>Update action for <code>changeOrderState</code></p>
     * @return change
     */
    @NotNull
    @JsonProperty("change")
    public String getChange();

    /**
     *
     * @return nextValue
     */
    @NotNull
    @JsonProperty("nextValue")
    public OrderState getNextValue();

    /**
     *
     * @return previousValue
     */
    @NotNull
    @JsonProperty("previousValue")
    public OrderState getPreviousValue();

    /**
     *  <p>Update action for <code>changeOrderState</code></p>
     * @param change value to be set
     */

    public void setChange(final String change);

    /**
     * set nextValue
     * @param nextValue value to be set
     */

    public void setNextValue(final OrderState nextValue);

    /**
     * set previousValue
     * @param previousValue value to be set
     */

    public void setPreviousValue(final OrderState previousValue);

    /**
     * factory method
     * @return instance of ChangeOrderStateChange
     */
    public static ChangeOrderStateChange of() {
        return new ChangeOrderStateChangeImpl();
    }

    /**
     * factory method to copy an instance of ChangeOrderStateChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static ChangeOrderStateChange of(final ChangeOrderStateChange template) {
        ChangeOrderStateChangeImpl instance = new ChangeOrderStateChangeImpl();
        instance.setChange(template.getChange());
        instance.setNextValue(template.getNextValue());
        instance.setPreviousValue(template.getPreviousValue());
        return instance;
    }

    /**
     * builder factory method for ChangeOrderStateChange
     * @return builder
     */
    public static ChangeOrderStateChangeBuilder builder() {
        return ChangeOrderStateChangeBuilder.of();
    }

    /**
     * create builder for ChangeOrderStateChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ChangeOrderStateChangeBuilder builder(final ChangeOrderStateChange template) {
        return ChangeOrderStateChangeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withChangeOrderStateChange(Function<ChangeOrderStateChange, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ChangeOrderStateChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ChangeOrderStateChange>() {
            @Override
            public String toString() {
                return "TypeReference<ChangeOrderStateChange>";
            }
        };
    }
}
