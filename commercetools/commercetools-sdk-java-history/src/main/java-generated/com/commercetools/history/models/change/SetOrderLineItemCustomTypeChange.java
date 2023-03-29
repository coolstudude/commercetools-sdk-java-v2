
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.history.models.common.CustomFields;
import com.commercetools.history.models.common.LocalizedString;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * SetOrderLineItemCustomTypeChange
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetOrderLineItemCustomTypeChange setOrderLineItemCustomTypeChange = SetOrderLineItemCustomTypeChange.builder()
 *             .change("{change}")
 *             .lineItem(lineItemBuilder -> lineItemBuilder)
 *             .variant("{variant}")
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .previousValue(previousValueBuilder -> previousValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = SetOrderLineItemCustomTypeChangeImpl.class)
public interface SetOrderLineItemCustomTypeChange extends Change {

    /**
     * discriminator value for SetOrderLineItemCustomTypeChange
     */
    String SET_ORDER_LINE_ITEM_CUSTOM_TYPE_CHANGE = "SetOrderLineItemCustomTypeChange";

    /**
     *
     * @return type
     */
    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
     *  <p>Update action for <code>setLineItemCustomType</code></p>
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
     * @return variant
     */
    @NotNull
    @JsonProperty("variant")
    public String getVariant();

    /**
     *
     * @return nextValue
     */
    @NotNull
    @Valid
    @JsonProperty("nextValue")
    public CustomFields getNextValue();

    /**
     *
     * @return previousValue
     */
    @NotNull
    @Valid
    @JsonProperty("previousValue")
    public CustomFields getPreviousValue();

    /**
     *  <p>Update action for <code>setLineItemCustomType</code></p>
     * @param change value to be set
     */

    public void setChange(final String change);

    /**
     * set lineItem
     * @param lineItem value to be set
     */

    public void setLineItem(final LocalizedString lineItem);

    /**
     * set variant
     * @param variant value to be set
     */

    public void setVariant(final String variant);

    /**
     * set nextValue
     * @param nextValue value to be set
     */

    public void setNextValue(final CustomFields nextValue);

    /**
     * set previousValue
     * @param previousValue value to be set
     */

    public void setPreviousValue(final CustomFields previousValue);

    /**
     * factory method
     * @return instance of SetOrderLineItemCustomTypeChange
     */
    public static SetOrderLineItemCustomTypeChange of() {
        return new SetOrderLineItemCustomTypeChangeImpl();
    }

    /**
     * factory method to create a shallow copy SetOrderLineItemCustomTypeChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static SetOrderLineItemCustomTypeChange of(final SetOrderLineItemCustomTypeChange template) {
        SetOrderLineItemCustomTypeChangeImpl instance = new SetOrderLineItemCustomTypeChangeImpl();
        instance.setChange(template.getChange());
        instance.setLineItem(template.getLineItem());
        instance.setVariant(template.getVariant());
        instance.setNextValue(template.getNextValue());
        instance.setPreviousValue(template.getPreviousValue());
        return instance;
    }

    /**
     * factory method to create a deep copy of SetOrderLineItemCustomTypeChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static SetOrderLineItemCustomTypeChange deepCopy(@Nullable final SetOrderLineItemCustomTypeChange template) {
        if (template == null) {
            return null;
        }
        SetOrderLineItemCustomTypeChangeImpl instance = new SetOrderLineItemCustomTypeChangeImpl();
        instance.setChange(template.getChange());
        instance.setLineItem(Optional.ofNullable(template.getLineItem())
                .map(com.commercetools.history.models.common.LocalizedString::deepCopy)
                .orElse(null));
        instance.setVariant(template.getVariant());
        instance.setNextValue(Optional.ofNullable(template.getNextValue())
                .map(com.commercetools.history.models.common.CustomFields::deepCopy)
                .orElse(null));
        instance.setPreviousValue(Optional.ofNullable(template.getPreviousValue())
                .map(com.commercetools.history.models.common.CustomFields::deepCopy)
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for SetOrderLineItemCustomTypeChange
     * @return builder
     */
    public static SetOrderLineItemCustomTypeChangeBuilder builder() {
        return SetOrderLineItemCustomTypeChangeBuilder.of();
    }

    /**
     * create builder for SetOrderLineItemCustomTypeChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetOrderLineItemCustomTypeChangeBuilder builder(final SetOrderLineItemCustomTypeChange template) {
        return SetOrderLineItemCustomTypeChangeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withSetOrderLineItemCustomTypeChange(Function<SetOrderLineItemCustomTypeChange, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<SetOrderLineItemCustomTypeChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SetOrderLineItemCustomTypeChange>() {
            @Override
            public String toString() {
                return "TypeReference<SetOrderLineItemCustomTypeChange>";
            }
        };
    }
}
