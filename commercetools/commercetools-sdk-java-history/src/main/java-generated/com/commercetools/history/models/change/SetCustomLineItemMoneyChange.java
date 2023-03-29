
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.history.models.common.LocalizedString;
import com.commercetools.history.models.common.Money;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * SetCustomLineItemMoneyChange
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetCustomLineItemMoneyChange setCustomLineItemMoneyChange = SetCustomLineItemMoneyChange.builder()
 *             .change("{change}")
 *             .customLineItem(customLineItemBuilder -> customLineItemBuilder)
 *             .customLineItemId("{customLineItemId}")
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .previousValue(previousValueBuilder -> previousValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = SetCustomLineItemMoneyChangeImpl.class)
public interface SetCustomLineItemMoneyChange extends Change {

    /**
     * discriminator value for SetCustomLineItemMoneyChange
     */
    String SET_CUSTOM_LINE_ITEM_MONEY_CHANGE = "SetCustomLineItemMoneyChange";

    /**
     *
     * @return type
     */
    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
     *  <p>Update action for <code>setCustomLineItemMoney</code></p>
     * @return change
     */
    @NotNull
    @JsonProperty("change")
    public String getChange();

    /**
     *
     * @return customLineItem
     */
    @NotNull
    @Valid
    @JsonProperty("customLineItem")
    public LocalizedString getCustomLineItem();

    /**
     *
     * @return customLineItemId
     */
    @NotNull
    @JsonProperty("customLineItemId")
    public String getCustomLineItemId();

    /**
     *
     * @return nextValue
     */
    @NotNull
    @Valid
    @JsonProperty("nextValue")
    public Money getNextValue();

    /**
     *
     * @return previousValue
     */
    @NotNull
    @Valid
    @JsonProperty("previousValue")
    public Money getPreviousValue();

    /**
     *  <p>Update action for <code>setCustomLineItemMoney</code></p>
     * @param change value to be set
     */

    public void setChange(final String change);

    /**
     * set customLineItem
     * @param customLineItem value to be set
     */

    public void setCustomLineItem(final LocalizedString customLineItem);

    /**
     * set customLineItemId
     * @param customLineItemId value to be set
     */

    public void setCustomLineItemId(final String customLineItemId);

    /**
     * set nextValue
     * @param nextValue value to be set
     */

    public void setNextValue(final Money nextValue);

    /**
     * set previousValue
     * @param previousValue value to be set
     */

    public void setPreviousValue(final Money previousValue);

    /**
     * factory method
     * @return instance of SetCustomLineItemMoneyChange
     */
    public static SetCustomLineItemMoneyChange of() {
        return new SetCustomLineItemMoneyChangeImpl();
    }

    /**
     * factory method to create a shallow copy SetCustomLineItemMoneyChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static SetCustomLineItemMoneyChange of(final SetCustomLineItemMoneyChange template) {
        SetCustomLineItemMoneyChangeImpl instance = new SetCustomLineItemMoneyChangeImpl();
        instance.setChange(template.getChange());
        instance.setCustomLineItem(template.getCustomLineItem());
        instance.setCustomLineItemId(template.getCustomLineItemId());
        instance.setNextValue(template.getNextValue());
        instance.setPreviousValue(template.getPreviousValue());
        return instance;
    }

    /**
     * factory method to create a deep copy of SetCustomLineItemMoneyChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static SetCustomLineItemMoneyChange deepCopy(@Nullable final SetCustomLineItemMoneyChange template) {
        if (template == null) {
            return null;
        }
        SetCustomLineItemMoneyChangeImpl instance = new SetCustomLineItemMoneyChangeImpl();
        instance.setChange(template.getChange());
        instance.setCustomLineItem(Optional.ofNullable(template.getCustomLineItem())
                .map(com.commercetools.history.models.common.LocalizedString::deepCopy)
                .orElse(null));
        instance.setCustomLineItemId(template.getCustomLineItemId());
        instance.setNextValue(Optional.ofNullable(template.getNextValue())
                .map(com.commercetools.history.models.common.Money::deepCopy)
                .orElse(null));
        instance.setPreviousValue(Optional.ofNullable(template.getPreviousValue())
                .map(com.commercetools.history.models.common.Money::deepCopy)
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for SetCustomLineItemMoneyChange
     * @return builder
     */
    public static SetCustomLineItemMoneyChangeBuilder builder() {
        return SetCustomLineItemMoneyChangeBuilder.of();
    }

    /**
     * create builder for SetCustomLineItemMoneyChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetCustomLineItemMoneyChangeBuilder builder(final SetCustomLineItemMoneyChange template) {
        return SetCustomLineItemMoneyChangeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withSetCustomLineItemMoneyChange(Function<SetCustomLineItemMoneyChange, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<SetCustomLineItemMoneyChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SetCustomLineItemMoneyChange>() {
            @Override
            public String toString() {
                return "TypeReference<SetCustomLineItemMoneyChange>";
            }
        };
    }
}
