
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
 *  <p>Discounts the CartDiscountTarget by an absolute amount (not allowed for MultiBuyLineItemsTarget and MultiBuyCustomLineItemsTarget).</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CartDiscountValueAbsoluteImpl implements CartDiscountValueAbsolute, ModelBase {

    private String type;

    private java.util.List<com.commercetools.api.models.common.CentPrecisionMoney> money;

    /**
     * create instance with all properties
     */
    @JsonCreator
    CartDiscountValueAbsoluteImpl(
            @JsonProperty("money") final java.util.List<com.commercetools.api.models.common.CentPrecisionMoney> money) {
        this.money = money;
        this.type = ABSOLUTE;
    }

    /**
     * create empty instance
     */
    public CartDiscountValueAbsoluteImpl() {
        this.type = ABSOLUTE;
    }

    /**
     *
     */

    public String getType() {
        return this.type;
    }

    /**
     *  <p>Cent precision money values in different currencies.</p>
     */

    public java.util.List<com.commercetools.api.models.common.CentPrecisionMoney> getMoney() {
        return this.money;
    }

    public void setMoney(final com.commercetools.api.models.common.CentPrecisionMoney... money) {
        this.money = new ArrayList<>(Arrays.asList(money));
    }

    public void setMoney(final java.util.List<com.commercetools.api.models.common.CentPrecisionMoney> money) {
        this.money = money;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        CartDiscountValueAbsoluteImpl that = (CartDiscountValueAbsoluteImpl) o;

        return new EqualsBuilder().append(type, that.type).append(money, that.money).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type).append(money).toHashCode();
    }

}
