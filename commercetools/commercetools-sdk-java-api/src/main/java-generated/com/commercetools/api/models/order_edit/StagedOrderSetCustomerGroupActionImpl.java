
package com.commercetools.api.models.order_edit;

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
 * StagedOrderSetCustomerGroupAction
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StagedOrderSetCustomerGroupActionImpl implements StagedOrderSetCustomerGroupAction, ModelBase {

    private String action;

    private com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifier customerGroup;

    /**
     * create instance with all properties
     */
    @JsonCreator
    StagedOrderSetCustomerGroupActionImpl(
            @JsonProperty("customerGroup") final com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifier customerGroup) {
        this.customerGroup = customerGroup;
        this.action = SET_CUSTOMER_GROUP;
    }

    /**
     * create empty instance
     */
    public StagedOrderSetCustomerGroupActionImpl() {
        this.action = SET_CUSTOMER_GROUP;
    }

    /**
     *
     */

    public String getAction() {
        return this.action;
    }

    /**
     *  <p>ResourceIdentifier to a CustomerGroup.</p>
     */

    public com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifier getCustomerGroup() {
        return this.customerGroup;
    }

    public void setCustomerGroup(
            final com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifier customerGroup) {
        this.customerGroup = customerGroup;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        StagedOrderSetCustomerGroupActionImpl that = (StagedOrderSetCustomerGroupActionImpl) o;

        return new EqualsBuilder().append(action, that.action).append(customerGroup, that.customerGroup).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(customerGroup).toHashCode();
    }

}
