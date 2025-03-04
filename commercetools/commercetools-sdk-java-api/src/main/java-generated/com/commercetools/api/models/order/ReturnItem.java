
package com.commercetools.api.models.order;

import java.time.*;
import java.time.ZonedDateTime;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.type.CustomFields;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * ReturnItem
 *
 * <hr>
 * Example to create a subtype instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ReturnItem returnItem = ReturnItem.customLineItemReturnItemBuilder()
 *             id("{id}")
 *             quantity(0.3)
 *             shipmentState(ReturnShipmentState.ADVISED)
 *             paymentState(ReturnPaymentState.NON_REFUNDABLE)
 *             lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             customLineItemId("{customLineItemId}")
 *             .build()
 * </code></pre>
 * </div>
 */
@JsonSubTypes({
        @JsonSubTypes.Type(value = com.commercetools.api.models.order.CustomLineItemReturnItemImpl.class, name = CustomLineItemReturnItem.CUSTOM_LINE_ITEM_RETURN_ITEM),
        @JsonSubTypes.Type(value = com.commercetools.api.models.order.LineItemReturnItemImpl.class, name = LineItemReturnItem.LINE_ITEM_RETURN_ITEM) })
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "type", defaultImpl = ReturnItemImpl.class, visible = true)
@JsonDeserialize(as = ReturnItemImpl.class)
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public interface ReturnItem extends com.commercetools.api.models.Customizable<ReturnItem> {

    /**
     *  <p>Unique identifier of the ReturnItem.</p>
     * @return id
     */
    @NotNull
    @JsonProperty("id")
    public String getId();

    /**
     *
     * @return quantity
     */
    @NotNull
    @JsonProperty("quantity")
    public Long getQuantity();

    /**
     *
     * @return type
     */
    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
     *
     * @return comment
     */

    @JsonProperty("comment")
    public String getComment();

    /**
     *
     * @return shipmentState
     */
    @NotNull
    @JsonProperty("shipmentState")
    public ReturnShipmentState getShipmentState();

    /**
     *
     * @return paymentState
     */
    @NotNull
    @JsonProperty("paymentState")
    public ReturnPaymentState getPaymentState();

    /**
     *  <p>Custom Fields of this return item.</p>
     * @return custom
     */
    @Valid
    @JsonProperty("custom")
    public CustomFields getCustom();

    /**
     *
     * @return lastModifiedAt
     */
    @NotNull
    @JsonProperty("lastModifiedAt")
    public ZonedDateTime getLastModifiedAt();

    /**
     *
     * @return createdAt
     */
    @NotNull
    @JsonProperty("createdAt")
    public ZonedDateTime getCreatedAt();

    /**
     *  <p>Unique identifier of the ReturnItem.</p>
     * @param id value to be set
     */

    public void setId(final String id);

    /**
     * set quantity
     * @param quantity value to be set
     */

    public void setQuantity(final Long quantity);

    /**
     * set comment
     * @param comment value to be set
     */

    public void setComment(final String comment);

    /**
     * set shipmentState
     * @param shipmentState value to be set
     */

    public void setShipmentState(final ReturnShipmentState shipmentState);

    /**
     * set paymentState
     * @param paymentState value to be set
     */

    public void setPaymentState(final ReturnPaymentState paymentState);

    /**
     *  <p>Custom Fields of this return item.</p>
     * @param custom value to be set
     */

    public void setCustom(final CustomFields custom);

    /**
     * set lastModifiedAt
     * @param lastModifiedAt value to be set
     */

    public void setLastModifiedAt(final ZonedDateTime lastModifiedAt);

    /**
     * set createdAt
     * @param createdAt value to be set
     */

    public void setCreatedAt(final ZonedDateTime createdAt);

    /**
     * factory method to create a deep copy of ReturnItem
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ReturnItem deepCopy(@Nullable final ReturnItem template) {
        if (template == null) {
            return null;
        }
        if (template instanceof com.commercetools.api.models.order.CustomLineItemReturnItem) {
            return com.commercetools.api.models.order.CustomLineItemReturnItem
                    .deepCopy((com.commercetools.api.models.order.CustomLineItemReturnItem) template);
        }
        if (template instanceof com.commercetools.api.models.order.LineItemReturnItem) {
            return com.commercetools.api.models.order.LineItemReturnItem
                    .deepCopy((com.commercetools.api.models.order.LineItemReturnItem) template);
        }
        ReturnItemImpl instance = new ReturnItemImpl();
        instance.setId(template.getId());
        instance.setQuantity(template.getQuantity());
        instance.setComment(template.getComment());
        instance.setShipmentState(template.getShipmentState());
        instance.setPaymentState(template.getPaymentState());
        instance.setCustom(com.commercetools.api.models.type.CustomFields.deepCopy(template.getCustom()));
        instance.setLastModifiedAt(template.getLastModifiedAt());
        instance.setCreatedAt(template.getCreatedAt());
        return instance;
    }

    /**
     * builder for customLineItemReturnItem subtype
     * @return builder
     */
    public static com.commercetools.api.models.order.CustomLineItemReturnItemBuilder customLineItemReturnItemBuilder() {
        return com.commercetools.api.models.order.CustomLineItemReturnItemBuilder.of();
    }

    /**
     * builder for lineItemReturnItem subtype
     * @return builder
     */
    public static com.commercetools.api.models.order.LineItemReturnItemBuilder lineItemReturnItemBuilder() {
        return com.commercetools.api.models.order.LineItemReturnItemBuilder.of();
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withReturnItem(Function<ReturnItem, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ReturnItem> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ReturnItem>() {
            @Override
            public String toString() {
                return "TypeReference<ReturnItem>";
            }
        };
    }
}
