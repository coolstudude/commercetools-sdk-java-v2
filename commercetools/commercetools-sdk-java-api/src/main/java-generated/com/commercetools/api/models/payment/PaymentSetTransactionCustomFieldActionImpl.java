
package com.commercetools.api.models.payment;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class PaymentSetTransactionCustomFieldActionImpl implements PaymentSetTransactionCustomFieldAction {

    private String action;

    private String transactionId;

    private String name;

    private java.lang.Object value;

    @JsonCreator
    PaymentSetTransactionCustomFieldActionImpl(@JsonProperty("transactionId") final String transactionId,
            @JsonProperty("name") final String name, @JsonProperty("value") final java.lang.Object value) {
        this.transactionId = transactionId;
        this.name = name;
        this.value = value;
        this.action = SET_TRANSACTION_CUSTOM_FIELD;
    }

    public PaymentSetTransactionCustomFieldActionImpl() {
        this.action = SET_TRANSACTION_CUSTOM_FIELD;
    }

    public String getAction() {
        return this.action;
    }

    public String getTransactionId() {
        return this.transactionId;
    }

    public String getName() {
        return this.name;
    }

    public java.lang.Object getValue() {
        return this.value;
    }

    public void setTransactionId(final String transactionId) {
        this.transactionId = transactionId;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public void setValue(final java.lang.Object value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        PaymentSetTransactionCustomFieldActionImpl that = (PaymentSetTransactionCustomFieldActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(transactionId, that.transactionId)
                .append(name, that.name)
                .append(value, that.value)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(transactionId).append(name).append(value).toHashCode();
    }

}
