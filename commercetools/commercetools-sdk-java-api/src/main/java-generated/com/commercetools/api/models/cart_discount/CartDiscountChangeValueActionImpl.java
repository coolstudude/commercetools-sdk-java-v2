
package com.commercetools.api.models.cart_discount;

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
 * CartDiscountChangeValueAction
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CartDiscountChangeValueActionImpl implements CartDiscountChangeValueAction, ModelBase {

    private String action;

    private com.commercetools.api.models.cart_discount.CartDiscountValueDraft value;

    /**
     * create instance with all properties
     */
    @JsonCreator
    CartDiscountChangeValueActionImpl(
            @JsonProperty("value") final com.commercetools.api.models.cart_discount.CartDiscountValueDraft value) {
        this.value = value;
        this.action = CHANGE_VALUE;
    }

    /**
     * create empty instance
     */
    public CartDiscountChangeValueActionImpl() {
        this.action = CHANGE_VALUE;
    }

    /**
     *
     */

    public String getAction() {
        return this.action;
    }

    /**
     *  <p>New value to set.</p>
     */

    public com.commercetools.api.models.cart_discount.CartDiscountValueDraft getValue() {
        return this.value;
    }

    public void setValue(final com.commercetools.api.models.cart_discount.CartDiscountValueDraft value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        CartDiscountChangeValueActionImpl that = (CartDiscountChangeValueActionImpl) o;

        return new EqualsBuilder().append(action, that.action).append(value, that.value).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(value).toHashCode();
    }

}
