
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

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class DiscountCodeSetCartPredicateActionImpl implements DiscountCodeSetCartPredicateAction, ModelBase {

    private String action;

    private String cartPredicate;

    @JsonCreator
    DiscountCodeSetCartPredicateActionImpl(@JsonProperty("cartPredicate") final String cartPredicate) {
        this.cartPredicate = cartPredicate;
        this.action = SET_CART_PREDICATE;
    }

    public DiscountCodeSetCartPredicateActionImpl() {
        this.action = SET_CART_PREDICATE;
    }

    public String getAction() {
        return this.action;
    }

    /**
    *  <p>Value to set. If empty, any existing value will be removed.</p>
    */
    public String getCartPredicate() {
        return this.cartPredicate;
    }

    public void setCartPredicate(final String cartPredicate) {
        this.cartPredicate = cartPredicate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        DiscountCodeSetCartPredicateActionImpl that = (DiscountCodeSetCartPredicateActionImpl) o;

        return new EqualsBuilder().append(action, that.action).append(cartPredicate, that.cartPredicate).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(cartPredicate).toHashCode();
    }

}
