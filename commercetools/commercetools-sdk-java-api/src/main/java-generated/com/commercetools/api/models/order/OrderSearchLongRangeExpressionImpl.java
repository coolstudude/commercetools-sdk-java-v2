
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
 * OrderSearchLongRangeExpression
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class OrderSearchLongRangeExpressionImpl implements OrderSearchLongRangeExpression, ModelBase {

    private com.commercetools.api.models.order.OrderSearchLongRangeValue range;

    /**
     * create instance with all properties
     */
    @JsonCreator
    OrderSearchLongRangeExpressionImpl(
            @JsonProperty("range") final com.commercetools.api.models.order.OrderSearchLongRangeValue range) {
        this.range = range;
    }

    /**
     * create empty instance
     */
    public OrderSearchLongRangeExpressionImpl() {
    }

    /**
     *
     */

    public com.commercetools.api.models.order.OrderSearchLongRangeValue getRange() {
        return this.range;
    }

    public void setRange(final com.commercetools.api.models.order.OrderSearchLongRangeValue range) {
        this.range = range;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        OrderSearchLongRangeExpressionImpl that = (OrderSearchLongRangeExpressionImpl) o;

        return new EqualsBuilder().append(range, that.range).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(range).toHashCode();
    }

}
