
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
 * OrderTransitionCustomLineItemStateAction
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class OrderTransitionCustomLineItemStateActionImpl
        implements OrderTransitionCustomLineItemStateAction, ModelBase {

    private String action;

    private String customLineItemId;

    private Long quantity;

    private com.commercetools.api.models.state.StateResourceIdentifier fromState;

    private com.commercetools.api.models.state.StateResourceIdentifier toState;

    private java.time.ZonedDateTime actualTransitionDate;

    /**
     * create instance with all properties
     */
    @JsonCreator
    OrderTransitionCustomLineItemStateActionImpl(@JsonProperty("customLineItemId") final String customLineItemId,
            @JsonProperty("quantity") final Long quantity,
            @JsonProperty("fromState") final com.commercetools.api.models.state.StateResourceIdentifier fromState,
            @JsonProperty("toState") final com.commercetools.api.models.state.StateResourceIdentifier toState,
            @JsonProperty("actualTransitionDate") final java.time.ZonedDateTime actualTransitionDate) {
        this.customLineItemId = customLineItemId;
        this.quantity = quantity;
        this.fromState = fromState;
        this.toState = toState;
        this.actualTransitionDate = actualTransitionDate;
        this.action = TRANSITION_CUSTOM_LINE_ITEM_STATE;
    }

    /**
     * create empty instance
     */
    public OrderTransitionCustomLineItemStateActionImpl() {
        this.action = TRANSITION_CUSTOM_LINE_ITEM_STATE;
    }

    /**
     *
     */

    public String getAction() {
        return this.action;
    }

    /**
     *
     */

    public String getCustomLineItemId() {
        return this.customLineItemId;
    }

    /**
     *
     */

    public Long getQuantity() {
        return this.quantity;
    }

    /**
     *  <p>ResourceIdentifier to a State.</p>
     */

    public com.commercetools.api.models.state.StateResourceIdentifier getFromState() {
        return this.fromState;
    }

    /**
     *  <p>ResourceIdentifier to a State.</p>
     */

    public com.commercetools.api.models.state.StateResourceIdentifier getToState() {
        return this.toState;
    }

    /**
     *
     */

    public java.time.ZonedDateTime getActualTransitionDate() {
        return this.actualTransitionDate;
    }

    public void setCustomLineItemId(final String customLineItemId) {
        this.customLineItemId = customLineItemId;
    }

    public void setQuantity(final Long quantity) {
        this.quantity = quantity;
    }

    public void setFromState(final com.commercetools.api.models.state.StateResourceIdentifier fromState) {
        this.fromState = fromState;
    }

    public void setToState(final com.commercetools.api.models.state.StateResourceIdentifier toState) {
        this.toState = toState;
    }

    public void setActualTransitionDate(final java.time.ZonedDateTime actualTransitionDate) {
        this.actualTransitionDate = actualTransitionDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        OrderTransitionCustomLineItemStateActionImpl that = (OrderTransitionCustomLineItemStateActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(customLineItemId, that.customLineItemId)
                .append(quantity, that.quantity)
                .append(fromState, that.fromState)
                .append(toState, that.toState)
                .append(actualTransitionDate, that.actualTransitionDate)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action)
                .append(customLineItemId)
                .append(quantity)
                .append(fromState)
                .append(toState)
                .append(actualTransitionDate)
                .toHashCode();
    }

}
