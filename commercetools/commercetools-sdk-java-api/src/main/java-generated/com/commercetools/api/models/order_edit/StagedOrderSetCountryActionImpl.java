
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
 * StagedOrderSetCountryAction
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StagedOrderSetCountryActionImpl implements StagedOrderSetCountryAction, ModelBase {

    private String action;

    private String country;

    /**
     * create instance with all properties
     */
    @JsonCreator
    StagedOrderSetCountryActionImpl(@JsonProperty("country") final String country) {
        this.country = country;
        this.action = SET_COUNTRY;
    }

    /**
     * create empty instance
     */
    public StagedOrderSetCountryActionImpl() {
        this.action = SET_COUNTRY;
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

    public String getCountry() {
        return this.country;
    }

    public void setCountry(final String country) {
        this.country = country;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        StagedOrderSetCountryActionImpl that = (StagedOrderSetCountryActionImpl) o;

        return new EqualsBuilder().append(action, that.action).append(country, that.country).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(country).toHashCode();
    }

}
