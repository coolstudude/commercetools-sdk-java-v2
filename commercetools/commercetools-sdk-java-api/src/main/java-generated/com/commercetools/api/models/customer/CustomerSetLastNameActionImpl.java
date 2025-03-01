
package com.commercetools.api.models.customer;

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
 *  <p>Setting the last name of the Customer produces the CustomerLastNameSetMessage.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CustomerSetLastNameActionImpl implements CustomerSetLastNameAction, ModelBase {

    private String action;

    private String lastName;

    /**
     * create instance with all properties
     */
    @JsonCreator
    CustomerSetLastNameActionImpl(@JsonProperty("lastName") final String lastName) {
        this.lastName = lastName;
        this.action = SET_LAST_NAME;
    }

    /**
     * create empty instance
     */
    public CustomerSetLastNameActionImpl() {
        this.action = SET_LAST_NAME;
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

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(final String lastName) {
        this.lastName = lastName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        CustomerSetLastNameActionImpl that = (CustomerSetLastNameActionImpl) o;

        return new EqualsBuilder().append(action, that.action).append(lastName, that.lastName).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(lastName).toHashCode();
    }

}
