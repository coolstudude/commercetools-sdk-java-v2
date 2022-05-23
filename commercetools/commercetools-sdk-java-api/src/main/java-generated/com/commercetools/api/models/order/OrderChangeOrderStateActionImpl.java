
package com.commercetools.api.models.order;

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
 * OrderChangeOrderStateAction
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class OrderChangeOrderStateActionImpl implements OrderChangeOrderStateAction, ModelBase {

    private String action;

    private com.commercetools.api.models.order.OrderState orderState;

    @JsonCreator
    OrderChangeOrderStateActionImpl(
            @JsonProperty("orderState") final com.commercetools.api.models.order.OrderState orderState) {
        this.orderState = orderState;
        this.action = CHANGE_ORDER_STATE;
    }

    public OrderChangeOrderStateActionImpl() {
        this.action = CHANGE_ORDER_STATE;
    }

    /**
     <>
     */

    public String getAction() {
        return this.action;
    }

    /**
     <>
     */

    public com.commercetools.api.models.order.OrderState getOrderState() {
        return this.orderState;
    }

    public void setOrderState(final com.commercetools.api.models.order.OrderState orderState) {
        this.orderState = orderState;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        OrderChangeOrderStateActionImpl that = (OrderChangeOrderStateActionImpl) o;

        return new EqualsBuilder().append(action, that.action).append(orderState, that.orderState).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(orderState).toHashCode();
    }

}
