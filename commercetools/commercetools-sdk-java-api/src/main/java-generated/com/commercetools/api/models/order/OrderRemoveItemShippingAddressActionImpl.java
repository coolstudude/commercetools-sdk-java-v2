
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
 * OrderRemoveItemShippingAddressAction
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class OrderRemoveItemShippingAddressActionImpl implements OrderRemoveItemShippingAddressAction, ModelBase {

    private String action;

    private String addressKey;

    /**
     * create instance with all properties
     */
    @JsonCreator
    OrderRemoveItemShippingAddressActionImpl(@JsonProperty("addressKey") final String addressKey) {
        this.addressKey = addressKey;
        this.action = REMOVE_ITEM_SHIPPING_ADDRESS;
    }

    /**
     * create empty instance
     */
    public OrderRemoveItemShippingAddressActionImpl() {
        this.action = REMOVE_ITEM_SHIPPING_ADDRESS;
    }

    /**
     *
     */

    public String getAction() {
        return this.action;
    }

    /**
     *
     */

    public String getAddressKey() {
        return this.addressKey;
    }

    public void setAddressKey(final String addressKey) {
        this.addressKey = addressKey;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        OrderRemoveItemShippingAddressActionImpl that = (OrderRemoveItemShippingAddressActionImpl) o;

        return new EqualsBuilder().append(action, that.action).append(addressKey, that.addressKey).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(addressKey).toHashCode();
    }

}
