
package com.commercetools.history.models.common;

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
 * DiscountCodeInfo
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class DiscountCodeInfoImpl implements DiscountCodeInfo, ModelBase {

    private com.commercetools.history.models.common.Reference discountCode;

    private com.commercetools.history.models.common.DiscountCodeState state;

    /**
     * create instance with all properties
     */
    @JsonCreator
    DiscountCodeInfoImpl(
            @JsonProperty("discountCode") final com.commercetools.history.models.common.Reference discountCode,
            @JsonProperty("state") final com.commercetools.history.models.common.DiscountCodeState state) {
        this.discountCode = discountCode;
        this.state = state;
    }

    /**
     * create empty instance
     */
    public DiscountCodeInfoImpl() {
    }

    /**
     *
     */

    public com.commercetools.history.models.common.Reference getDiscountCode() {
        return this.discountCode;
    }

    /**
     *
     */

    public com.commercetools.history.models.common.DiscountCodeState getState() {
        return this.state;
    }

    public void setDiscountCode(final com.commercetools.history.models.common.Reference discountCode) {
        this.discountCode = discountCode;
    }

    public void setState(final com.commercetools.history.models.common.DiscountCodeState state) {
        this.state = state;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        DiscountCodeInfoImpl that = (DiscountCodeInfoImpl) o;

        return new EqualsBuilder().append(discountCode, that.discountCode).append(state, that.state).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(discountCode).append(state).toHashCode();
    }

}
