
package com.commercetools.api.models.me;

import java.time.*;
import java.util.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.me.MyShoppingListUpdateAction;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class MyShoppingListChangeLineItemQuantityActionImpl
        implements MyShoppingListChangeLineItemQuantityAction {

    private String action;

    private String lineItemId;

    private Long quantity;

    @JsonCreator
    MyShoppingListChangeLineItemQuantityActionImpl(@JsonProperty("lineItemId") final String lineItemId,
            @JsonProperty("quantity") final Long quantity) {
        this.lineItemId = lineItemId;
        this.quantity = quantity;
        this.action = MyShoppingListChangeLineItemQuantityAction.CHANGE_LINE_ITEM_QUANTITY;
    }

    public MyShoppingListChangeLineItemQuantityActionImpl() {
        this.action = MyShoppingListChangeLineItemQuantityAction.CHANGE_LINE_ITEM_QUANTITY;
    }

    public String getAction() {
        return this.action;
    }

    public String getLineItemId() {
        return this.lineItemId;
    }

    public Long getQuantity() {
        return this.quantity;
    }

    public void setLineItemId(final String lineItemId) {
        this.lineItemId = lineItemId;
    }

    public void setQuantity(final Long quantity) {
        this.quantity = quantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        MyShoppingListChangeLineItemQuantityActionImpl that = (MyShoppingListChangeLineItemQuantityActionImpl) o;

        return new EqualsBuilder().append(action, that.action).append(lineItemId, that.lineItemId).append(quantity,
            that.quantity).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(lineItemId).append(quantity).toHashCode();
    }

}
