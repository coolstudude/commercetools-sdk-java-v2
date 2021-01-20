
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.message.MessagePayload;
import com.commercetools.api.models.order.Order;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class OrderImportedMessagePayloadImpl implements OrderImportedMessagePayload {

    private String type;

    private com.commercetools.api.models.order.Order order;

    @JsonCreator
    OrderImportedMessagePayloadImpl(@JsonProperty("order") final com.commercetools.api.models.order.Order order) {
        this.order = order;
        this.type = OrderImportedMessagePayload.ORDER_IMPORTED;
    }

    public OrderImportedMessagePayloadImpl() {
        this.type = OrderImportedMessagePayload.ORDER_IMPORTED;
    }

    public String getType() {
        return this.type;
    }

    public com.commercetools.api.models.order.Order getOrder() {
        return this.order;
    }

    public void setOrder(final com.commercetools.api.models.order.Order order) {
        this.order = order;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        OrderImportedMessagePayloadImpl that = (OrderImportedMessagePayloadImpl) o;

        return new EqualsBuilder().append(type, that.type).append(order, that.order).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type).append(order).toHashCode();
    }

}
