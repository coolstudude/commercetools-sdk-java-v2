
package com.commercetools.history.models.change;

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
 * SetLastNameChange
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SetLastNameChangeImpl implements SetLastNameChange, ModelBase {

    private String type;

    private String change;

    private String previousValue;

    private String nextValue;

    /**
     * create instance with all properties
     */
    @JsonCreator
    SetLastNameChangeImpl(@JsonProperty("change") final String change,
            @JsonProperty("previousValue") final String previousValue,
            @JsonProperty("nextValue") final String nextValue) {
        this.change = change;
        this.previousValue = previousValue;
        this.nextValue = nextValue;
        this.type = SET_LAST_NAME_CHANGE;
    }

    /**
     * create empty instance
     */
    public SetLastNameChangeImpl() {
        this.type = SET_LAST_NAME_CHANGE;
    }

    /**
     *
     */

    public String getType() {
        return this.type;
    }

    /**
     *  <p>Shape of the action for <code>setLastName</code></p>
     */

    public String getChange() {
        return this.change;
    }

    /**
     *
     */

    public String getPreviousValue() {
        return this.previousValue;
    }

    /**
     *
     */

    public String getNextValue() {
        return this.nextValue;
    }

    public void setChange(final String change) {
        this.change = change;
    }

    public void setPreviousValue(final String previousValue) {
        this.previousValue = previousValue;
    }

    public void setNextValue(final String nextValue) {
        this.nextValue = nextValue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        SetLastNameChangeImpl that = (SetLastNameChangeImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(change, that.change)
                .append(previousValue, that.previousValue)
                .append(nextValue, that.nextValue)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type)
                .append(change)
                .append(previousValue)
                .append(nextValue)
                .toHashCode();
    }

}
