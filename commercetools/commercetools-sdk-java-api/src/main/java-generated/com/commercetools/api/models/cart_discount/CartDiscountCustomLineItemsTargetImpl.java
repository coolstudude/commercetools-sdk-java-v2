
package com.commercetools.api.models.cart_discount;

import java.time.*;
import java.util.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.cart_discount.CartDiscountTarget;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class CartDiscountCustomLineItemsTargetImpl implements CartDiscountCustomLineItemsTarget {

    private String type;

    private String predicate;

    @JsonCreator
    CartDiscountCustomLineItemsTargetImpl(@JsonProperty("predicate") final String predicate) {
        this.predicate = predicate;
        this.type = CartDiscountCustomLineItemsTarget.CUSTOM_LINE_ITEMS;
    }

    public CartDiscountCustomLineItemsTargetImpl() {
        this.type = CartDiscountCustomLineItemsTarget.CUSTOM_LINE_ITEMS;
    }

    public String getType() {
        return this.type;
    }

    public String getPredicate() {
        return this.predicate;
    }

    public void setPredicate(final String predicate) {
        this.predicate = predicate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        CartDiscountCustomLineItemsTargetImpl that = (CartDiscountCustomLineItemsTargetImpl) o;

        return new EqualsBuilder().append(type, that.type).append(predicate, that.predicate).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type).append(predicate).toHashCode();
    }

}
