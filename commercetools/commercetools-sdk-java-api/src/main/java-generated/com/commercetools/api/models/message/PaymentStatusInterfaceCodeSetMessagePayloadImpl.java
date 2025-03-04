
package com.commercetools.api.models.message;

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
 *  <p>Generated after a successful Set StatusInterfaceCode update action.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class PaymentStatusInterfaceCodeSetMessagePayloadImpl
        implements PaymentStatusInterfaceCodeSetMessagePayload, ModelBase {

    private String type;

    private String paymentId;

    private String interfaceCode;

    /**
     * create instance with all properties
     */
    @JsonCreator
    PaymentStatusInterfaceCodeSetMessagePayloadImpl(@JsonProperty("paymentId") final String paymentId,
            @JsonProperty("interfaceCode") final String interfaceCode) {
        this.paymentId = paymentId;
        this.interfaceCode = interfaceCode;
        this.type = PAYMENT_STATUS_INTERFACE_CODE_SET;
    }

    /**
     * create empty instance
     */
    public PaymentStatusInterfaceCodeSetMessagePayloadImpl() {
        this.type = PAYMENT_STATUS_INTERFACE_CODE_SET;
    }

    /**
     *
     */

    public String getType() {
        return this.type;
    }

    /**
     *  <p>Unique identifier for the Payment for which the Set StatusInterfaceCode update action was applied.</p>
     */

    public String getPaymentId() {
        return this.paymentId;
    }

    /**
     *  <p>The <code>interfaceCode</code> that was set during the Set StatusInterfaceCode update action.</p>
     */

    public String getInterfaceCode() {
        return this.interfaceCode;
    }

    public void setPaymentId(final String paymentId) {
        this.paymentId = paymentId;
    }

    public void setInterfaceCode(final String interfaceCode) {
        this.interfaceCode = interfaceCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        PaymentStatusInterfaceCodeSetMessagePayloadImpl that = (PaymentStatusInterfaceCodeSetMessagePayloadImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(paymentId, that.paymentId)
                .append(interfaceCode, that.interfaceCode)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type).append(paymentId).append(interfaceCode).toHashCode();
    }

}
