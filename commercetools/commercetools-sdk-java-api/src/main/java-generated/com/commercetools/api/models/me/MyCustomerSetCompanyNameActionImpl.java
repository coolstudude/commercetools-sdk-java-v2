
package com.commercetools.api.models.me;

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
 *  <p>Setting the <code>companyName</code> field on the Customer produces the CustomerCompanyNameSet Message.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class MyCustomerSetCompanyNameActionImpl implements MyCustomerSetCompanyNameAction, ModelBase {

    private String action;

    private String companyName;

    /**
     * create instance with all properties
     */
    @JsonCreator
    MyCustomerSetCompanyNameActionImpl(@JsonProperty("companyName") final String companyName) {
        this.companyName = companyName;
        this.action = SET_COMPANY_NAME;
    }

    /**
     * create empty instance
     */
    public MyCustomerSetCompanyNameActionImpl() {
        this.action = SET_COMPANY_NAME;
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

    public String getCompanyName() {
        return this.companyName;
    }

    public void setCompanyName(final String companyName) {
        this.companyName = companyName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        MyCustomerSetCompanyNameActionImpl that = (MyCustomerSetCompanyNameActionImpl) o;

        return new EqualsBuilder().append(action, that.action).append(companyName, that.companyName).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(companyName).toHashCode();
    }

}
