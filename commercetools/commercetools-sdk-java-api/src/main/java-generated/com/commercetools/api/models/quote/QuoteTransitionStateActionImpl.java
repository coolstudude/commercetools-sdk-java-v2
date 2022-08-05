
package com.commercetools.api.models.quote;

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
 *  <p>If the existing State has set <code>transitions</code>, there must be a direct transition to the new State. If <code>transitions</code> is not set, no validation is performed. This update action produces the Quote State Transition Message.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class QuoteTransitionStateActionImpl implements QuoteTransitionStateAction, ModelBase {

    private String action;

    private com.commercetools.api.models.state.StateResourceIdentifier state;

    private Boolean force;

    @JsonCreator
    QuoteTransitionStateActionImpl(
            @JsonProperty("state") final com.commercetools.api.models.state.StateResourceIdentifier state,
            @JsonProperty("force") final Boolean force) {
        this.state = state;
        this.force = force;
        this.action = TRANSITION_STATE;
    }

    public QuoteTransitionStateActionImpl() {
        this.action = TRANSITION_STATE;
    }

    /**
     *
     */

    public String getAction() {
        return this.action;
    }

    /**
     *  <p>Value to set. If there is no State yet, this must be an initial State.</p>
     */

    public com.commercetools.api.models.state.StateResourceIdentifier getState() {
        return this.state;
    }

    /**
     *  <p>Switch validations on or off.</p>
     */

    public Boolean getForce() {
        return this.force;
    }

    public void setState(final com.commercetools.api.models.state.StateResourceIdentifier state) {
        this.state = state;
    }

    public void setForce(final Boolean force) {
        this.force = force;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        QuoteTransitionStateActionImpl that = (QuoteTransitionStateActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(state, that.state)
                .append(force, that.force)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(state).append(force).toHashCode();
    }

}
