
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
 * StagedOrderRemovePaymentAction
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StagedOrderRemovePaymentActionImpl implements StagedOrderRemovePaymentAction, ModelBase {

    private String action;

    private com.commercetools.api.models.payment.PaymentResourceIdentifier payment;

    /**
     * create instance with all properties
     */
    @JsonCreator
    StagedOrderRemovePaymentActionImpl(
            @JsonProperty("payment") final com.commercetools.api.models.payment.PaymentResourceIdentifier payment) {
        this.payment = payment;
        this.action = REMOVE_PAYMENT;
    }

    /**
     * create empty instance
     */
    public StagedOrderRemovePaymentActionImpl() {
        this.action = REMOVE_PAYMENT;
    }

    /**
     *
     */

    public String getAction() {
        return this.action;
    }

    /**
     *  <p>ResourceIdentifier of a Payment.</p>
     */

    public com.commercetools.api.models.payment.PaymentResourceIdentifier getPayment() {
        return this.payment;
    }

    public void setPayment(final com.commercetools.api.models.payment.PaymentResourceIdentifier payment) {
        this.payment = payment;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        StagedOrderRemovePaymentActionImpl that = (StagedOrderRemovePaymentActionImpl) o;

        return new EqualsBuilder().append(action, that.action).append(payment, that.payment).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(payment).toHashCode();
    }

}
