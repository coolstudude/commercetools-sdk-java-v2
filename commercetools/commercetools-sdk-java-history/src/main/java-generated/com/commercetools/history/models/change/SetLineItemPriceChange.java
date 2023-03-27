
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.history.models.common.LocalizedString;
import com.commercetools.history.models.common.Price;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * SetLineItemPriceChange
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetLineItemPriceChange setLineItemPriceChange = SetLineItemPriceChange.builder()
 *             .change("{change}")
 *             .lineItem(lineItemBuilder -> lineItemBuilder)
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .previousValue(previousValueBuilder -> previousValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = SetLineItemPriceChangeImpl.class)
public interface SetLineItemPriceChange extends Change {

    /**
     * discriminator value for SetLineItemPriceChange
     */
    String SET_LINE_ITEM_PRICE_CHANGE = "SetLineItemPriceChange";

    /**
     *
     * @return type
     */
    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
     *  <p>Update action for <code>setLineItemPrice</code></p>
     * @return change
     */
    @NotNull
    @JsonProperty("change")
    public String getChange();

    /**
     *
     * @return lineItem
     */
    @NotNull
    @Valid
    @JsonProperty("lineItem")
    public LocalizedString getLineItem();

    /**
     *
     * @return nextValue
     */
    @NotNull
    @Valid
    @JsonProperty("nextValue")
    public Price getNextValue();

    /**
     *
     * @return previousValue
     */
    @NotNull
    @Valid
    @JsonProperty("previousValue")
    public Price getPreviousValue();

    /**
     *  <p>Update action for <code>setLineItemPrice</code></p>
     * @param change value to be set
     */

    public void setChange(final String change);

    /**
     * set lineItem
     * @param lineItem value to be set
     */

    public void setLineItem(final LocalizedString lineItem);

    /**
     * set nextValue
     * @param nextValue value to be set
     */

    public void setNextValue(final Price nextValue);

    /**
     * set previousValue
     * @param previousValue value to be set
     */

    public void setPreviousValue(final Price previousValue);

    /**
     * factory method
     * @return instance of SetLineItemPriceChange
     */
    public static SetLineItemPriceChange of() {
        return new SetLineItemPriceChangeImpl();
    }

    /**
     * factory method to copy an instance of SetLineItemPriceChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static SetLineItemPriceChange of(final SetLineItemPriceChange template) {
        SetLineItemPriceChangeImpl instance = new SetLineItemPriceChangeImpl();
        instance.setChange(template.getChange());
        instance.setLineItem(template.getLineItem());
        instance.setNextValue(template.getNextValue());
        instance.setPreviousValue(template.getPreviousValue());
        return instance;
    }

    /**
     * builder factory method for SetLineItemPriceChange
     * @return builder
     */
    public static SetLineItemPriceChangeBuilder builder() {
        return SetLineItemPriceChangeBuilder.of();
    }

    /**
     * create builder for SetLineItemPriceChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetLineItemPriceChangeBuilder builder(final SetLineItemPriceChange template) {
        return SetLineItemPriceChangeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withSetLineItemPriceChange(Function<SetLineItemPriceChange, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<SetLineItemPriceChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SetLineItemPriceChange>() {
            @Override
            public String toString() {
                return "TypeReference<SetLineItemPriceChange>";
            }
        };
    }
}
