
package com.commercetools.history.models.change;

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
 * AddDiscountCodeChange
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class AddDiscountCodeChangeImpl implements AddDiscountCodeChange, ModelBase {

    private String type;

    private String change;

    private com.commercetools.history.models.common.DiscountCodeInfo nextValue;

    /**
     * create instance with all properties
     */
    @JsonCreator
    AddDiscountCodeChangeImpl(@JsonProperty("change") final String change,
            @JsonProperty("nextValue") final com.commercetools.history.models.common.DiscountCodeInfo nextValue) {
        this.change = change;
        this.nextValue = nextValue;
        this.type = ADD_DISCOUNT_CODE_CHANGE;
    }

    /**
     * create empty instance
     */
    public AddDiscountCodeChangeImpl() {
        this.type = ADD_DISCOUNT_CODE_CHANGE;
    }

    /**
     *
     */

    public String getType() {
        return this.type;
    }

    /**
     *  <p>Update action for <code>addDiscountCode</code></p>
     */

    public String getChange() {
        return this.change;
    }

    /**
     *
     */

    public com.commercetools.history.models.common.DiscountCodeInfo getNextValue() {
        return this.nextValue;
    }

    public void setChange(final String change) {
        this.change = change;
    }

    public void setNextValue(final com.commercetools.history.models.common.DiscountCodeInfo nextValue) {
        this.nextValue = nextValue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        AddDiscountCodeChangeImpl that = (AddDiscountCodeChangeImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(change, that.change)
                .append(nextValue, that.nextValue)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type).append(change).append(nextValue).toHashCode();
    }

}
