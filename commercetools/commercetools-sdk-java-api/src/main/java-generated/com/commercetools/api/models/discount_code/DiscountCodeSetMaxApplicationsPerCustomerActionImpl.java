
package com.commercetools.api.models.discount_code;

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
 * DiscountCodeSetMaxApplicationsPerCustomerAction
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class DiscountCodeSetMaxApplicationsPerCustomerActionImpl
        implements DiscountCodeSetMaxApplicationsPerCustomerAction, ModelBase {

    private String action;

    private Long maxApplicationsPerCustomer;

    /**
     * create instance with all properties
     */
    @JsonCreator
    DiscountCodeSetMaxApplicationsPerCustomerActionImpl(
            @JsonProperty("maxApplicationsPerCustomer") final Long maxApplicationsPerCustomer) {
        this.maxApplicationsPerCustomer = maxApplicationsPerCustomer;
        this.action = SET_MAX_APPLICATIONS_PER_CUSTOMER;
    }

    /**
     * create empty instance
     */
    public DiscountCodeSetMaxApplicationsPerCustomerActionImpl() {
        this.action = SET_MAX_APPLICATIONS_PER_CUSTOMER;
    }

    /**
     *
     */

    public String getAction() {
        return this.action;
    }

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     */

    public Long getMaxApplicationsPerCustomer() {
        return this.maxApplicationsPerCustomer;
    }

    public void setMaxApplicationsPerCustomer(final Long maxApplicationsPerCustomer) {
        this.maxApplicationsPerCustomer = maxApplicationsPerCustomer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        DiscountCodeSetMaxApplicationsPerCustomerActionImpl that = (DiscountCodeSetMaxApplicationsPerCustomerActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(maxApplicationsPerCustomer, that.maxApplicationsPerCustomer)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(maxApplicationsPerCustomer).toHashCode();
    }

}
