
package com.commercetools.api.models.shopping_list;

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
 * ShoppingListSetCustomerAction
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ShoppingListSetCustomerActionImpl implements ShoppingListSetCustomerAction, ModelBase {

    private String action;

    private com.commercetools.api.models.customer.CustomerResourceIdentifier customer;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ShoppingListSetCustomerActionImpl(
            @JsonProperty("customer") final com.commercetools.api.models.customer.CustomerResourceIdentifier customer) {
        this.customer = customer;
        this.action = SET_CUSTOMER;
    }

    /**
     * create empty instance
     */
    public ShoppingListSetCustomerActionImpl() {
        this.action = SET_CUSTOMER;
    }

    /**
     *
     */

    public String getAction() {
        return this.action;
    }

    /**
     *  <p>The Customer the ShoppingList should be associated to. If empty, any existing value will be removed.</p>
     */

    public com.commercetools.api.models.customer.CustomerResourceIdentifier getCustomer() {
        return this.customer;
    }

    public void setCustomer(final com.commercetools.api.models.customer.CustomerResourceIdentifier customer) {
        this.customer = customer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ShoppingListSetCustomerActionImpl that = (ShoppingListSetCustomerActionImpl) o;

        return new EqualsBuilder().append(action, that.action).append(customer, that.customer).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(customer).toHashCode();
    }

}
