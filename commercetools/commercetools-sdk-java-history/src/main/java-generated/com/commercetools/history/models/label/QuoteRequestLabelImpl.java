
package com.commercetools.history.models.label;

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
 * QuoteRequestLabel
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class QuoteRequestLabelImpl implements QuoteRequestLabel, ModelBase {

    private String type;

    private String key;

    private com.commercetools.history.models.common.Reference customer;

    /**
     * create instance with all properties
     */
    @JsonCreator
    QuoteRequestLabelImpl(@JsonProperty("key") final String key,
            @JsonProperty("customer") final com.commercetools.history.models.common.Reference customer) {
        this.key = key;
        this.customer = customer;
        this.type = QUOTE_REQUEST_LABEL;
    }

    /**
     * create empty instance
     */
    public QuoteRequestLabelImpl() {
        this.type = QUOTE_REQUEST_LABEL;
    }

    /**
     *
     */

    public String getType() {
        return this.type;
    }

    /**
     *
     */

    public String getKey() {
        return this.key;
    }

    /**
     *
     */

    public com.commercetools.history.models.common.Reference getCustomer() {
        return this.customer;
    }

    public void setKey(final String key) {
        this.key = key;
    }

    public void setCustomer(final com.commercetools.history.models.common.Reference customer) {
        this.customer = customer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        QuoteRequestLabelImpl that = (QuoteRequestLabelImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(key, that.key)
                .append(customer, that.customer)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type).append(key).append(customer).toHashCode();
    }

}
