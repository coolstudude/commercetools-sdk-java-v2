
package com.commercetools.api.models.cart;

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
 * CartSetCustomerEmailAction
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CartSetCustomerEmailActionImpl implements CartSetCustomerEmailAction, ModelBase {

    private String action;

    private String email;

    /**
     * create instance with all properties
     */
    @JsonCreator
    CartSetCustomerEmailActionImpl(@JsonProperty("email") final String email) {
        this.email = email;
        this.action = SET_CUSTOMER_EMAIL;
    }

    /**
     * create empty instance
     */
    public CartSetCustomerEmailActionImpl() {
        this.action = SET_CUSTOMER_EMAIL;
    }

    /**
     *
     */

    public String getAction() {
        return this.action;
    }

    /**
     *  <p>Value to set. If empty, any existing value is removed.</p>
     */

    public String getEmail() {
        return this.email;
    }

    public void setEmail(final String email) {
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        CartSetCustomerEmailActionImpl that = (CartSetCustomerEmailActionImpl) o;

        return new EqualsBuilder().append(action, that.action).append(email, that.email).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(email).toHashCode();
    }

}
