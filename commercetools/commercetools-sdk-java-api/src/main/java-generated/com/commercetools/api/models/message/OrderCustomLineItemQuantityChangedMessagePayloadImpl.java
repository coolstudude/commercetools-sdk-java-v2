
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.ModelBase;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
 *  <p>Generated after a successful Change Custom Line Item Quantity update action.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class OrderCustomLineItemQuantityChangedMessagePayloadImpl
        implements OrderCustomLineItemQuantityChangedMessagePayload, ModelBase {

    private String type;

    private String customLineItemId;

    private Long quantity;

    private Long oldQuantity;

    /**
     * create instance with all properties
     */
    @JsonCreator
    OrderCustomLineItemQuantityChangedMessagePayloadImpl(
            @JsonProperty("customLineItemId") final String customLineItemId,
            @JsonProperty("quantity") final Long quantity, @JsonProperty("oldQuantity") final Long oldQuantity) {
        this.customLineItemId = customLineItemId;
        this.quantity = quantity;
        this.oldQuantity = oldQuantity;
        this.type = ORDER_CUSTOM_LINE_ITEM_QUANTITY_CHANGED;
    }

    /**
     * create empty instance
     */
    public OrderCustomLineItemQuantityChangedMessagePayloadImpl() {
        this.type = ORDER_CUSTOM_LINE_ITEM_QUANTITY_CHANGED;
    }

    /**
     *
     */

    public String getType() {
        return this.type;
    }

    /**
     *  <p>Unique identifier of the Custom Line Item.</p>
     */

    public String getCustomLineItemId() {
        return this.customLineItemId;
    }

    /**
     *  <p>Custom Line Item quantity after the Change Custom Line Item Quantity update action.</p>
     */

    public Long getQuantity() {
        return this.quantity;
    }

    /**
     *  <p>Custom Line Item quantity before the Change Custom Line Item Quantity update action.</p>
     */

    public Long getOldQuantity() {
        return this.oldQuantity;
    }

    public void setCustomLineItemId(final String customLineItemId) {
        this.customLineItemId = customLineItemId;
    }

    public void setQuantity(final Long quantity) {
        this.quantity = quantity;
    }

    public void setOldQuantity(final Long oldQuantity) {
        this.oldQuantity = oldQuantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        OrderCustomLineItemQuantityChangedMessagePayloadImpl that = (OrderCustomLineItemQuantityChangedMessagePayloadImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(customLineItemId, that.customLineItemId)
                .append(quantity, that.quantity)
                .append(oldQuantity, that.oldQuantity)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type)
                .append(customLineItemId)
                .append(quantity)
                .append(oldQuantity)
                .toHashCode();
    }

}
