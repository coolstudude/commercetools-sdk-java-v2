
package com.commercetools.api.models.order;

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
 * OrderFromQuoteDraft
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class OrderFromQuoteDraftImpl implements OrderFromQuoteDraft, ModelBase {

    private com.commercetools.api.models.quote.QuoteResourceIdentifier quote;

    private Long version;

    private Boolean quoteStateToAccepted;

    private String orderNumber;

    private com.commercetools.api.models.order.PaymentState paymentState;

    private com.commercetools.api.models.order.ShipmentState shipmentState;

    private com.commercetools.api.models.order.OrderState orderState;

    private com.commercetools.api.models.state.StateResourceIdentifier state;

    /**
     * create instance with all properties
     */
    @JsonCreator
    OrderFromQuoteDraftImpl(
            @JsonProperty("quote") final com.commercetools.api.models.quote.QuoteResourceIdentifier quote,
            @JsonProperty("version") final Long version,
            @JsonProperty("quoteStateToAccepted") final Boolean quoteStateToAccepted,
            @JsonProperty("orderNumber") final String orderNumber,
            @JsonProperty("paymentState") final com.commercetools.api.models.order.PaymentState paymentState,
            @JsonProperty("shipmentState") final com.commercetools.api.models.order.ShipmentState shipmentState,
            @JsonProperty("orderState") final com.commercetools.api.models.order.OrderState orderState,
            @JsonProperty("state") final com.commercetools.api.models.state.StateResourceIdentifier state) {
        this.quote = quote;
        this.version = version;
        this.quoteStateToAccepted = quoteStateToAccepted;
        this.orderNumber = orderNumber;
        this.paymentState = paymentState;
        this.shipmentState = shipmentState;
        this.orderState = orderState;
        this.state = state;
    }

    /**
     * create empty instance
     */
    public OrderFromQuoteDraftImpl() {
    }

    /**
     *  <p>ResourceIdentifier of the Quote from which this Order is created. If the Quote has <code>QuoteState</code> in <code>Accepted</code>, <code>Declined</code> or <code>Withdrawn</code> then the order creation will fail. The creation will also fail if the <code>Quote</code> has expired (<code>validTo</code> check).</p>
     */

    public com.commercetools.api.models.quote.QuoteResourceIdentifier getQuote() {
        return this.quote;
    }

    /**
     *  <p><code>version</code> of the Quote from which an Order is created.</p>
     */

    public Long getVersion() {
        return this.version;
    }

    /**
     *  <p>If <code>true</code>, the <code>quoteState</code> of the referenced Quote will be set to <code>Accepted</code>.</p>
     */

    public Boolean getQuoteStateToAccepted() {
        return this.quoteStateToAccepted;
    }

    /**
     *  <p>String that uniquely identifies an order. It can be used to create more human-readable (in contrast to ID) identifier for the order. It should be unique across a project. Once it's set it cannot be changed. For easier use on Get, Update and Delete actions we suggest assigning order numbers that match the regular expression <code>[a-z0-9_\-]{2,36}</code>.</p>
     */

    public String getOrderNumber() {
        return this.orderNumber;
    }

    /**
     *  <p>Payment state of the Order.</p>
     */

    public com.commercetools.api.models.order.PaymentState getPaymentState() {
        return this.paymentState;
    }

    /**
     *  <p>Shipment state of the Order.</p>
     */

    public com.commercetools.api.models.order.ShipmentState getShipmentState() {
        return this.shipmentState;
    }

    /**
     *  <p>Order will be created with <code>Open</code> status by default.</p>
     */

    public com.commercetools.api.models.order.OrderState getOrderState() {
        return this.orderState;
    }

    /**
     *  <p>Reference to a State indicating the Order's state.</p>
     */

    public com.commercetools.api.models.state.StateResourceIdentifier getState() {
        return this.state;
    }

    public void setQuote(final com.commercetools.api.models.quote.QuoteResourceIdentifier quote) {
        this.quote = quote;
    }

    public void setVersion(final Long version) {
        this.version = version;
    }

    public void setQuoteStateToAccepted(final Boolean quoteStateToAccepted) {
        this.quoteStateToAccepted = quoteStateToAccepted;
    }

    public void setOrderNumber(final String orderNumber) {
        this.orderNumber = orderNumber;
    }

    public void setPaymentState(final com.commercetools.api.models.order.PaymentState paymentState) {
        this.paymentState = paymentState;
    }

    public void setShipmentState(final com.commercetools.api.models.order.ShipmentState shipmentState) {
        this.shipmentState = shipmentState;
    }

    public void setOrderState(final com.commercetools.api.models.order.OrderState orderState) {
        this.orderState = orderState;
    }

    public void setState(final com.commercetools.api.models.state.StateResourceIdentifier state) {
        this.state = state;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        OrderFromQuoteDraftImpl that = (OrderFromQuoteDraftImpl) o;

        return new EqualsBuilder().append(quote, that.quote)
                .append(version, that.version)
                .append(quoteStateToAccepted, that.quoteStateToAccepted)
                .append(orderNumber, that.orderNumber)
                .append(paymentState, that.paymentState)
                .append(shipmentState, that.shipmentState)
                .append(orderState, that.orderState)
                .append(state, that.state)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(quote)
                .append(version)
                .append(quoteStateToAccepted)
                .append(orderNumber)
                .append(paymentState)
                .append(shipmentState)
                .append(orderState)
                .append(state)
                .toHashCode();
    }

}
