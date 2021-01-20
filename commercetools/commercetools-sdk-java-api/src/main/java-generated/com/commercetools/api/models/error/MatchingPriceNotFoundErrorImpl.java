
package com.commercetools.api.models.error;

import java.time.*;
import java.util.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.channel.ChannelReference;
import com.commercetools.api.models.customer_group.CustomerGroupReference;
import com.commercetools.api.models.error.ErrorObject;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class MatchingPriceNotFoundErrorImpl implements MatchingPriceNotFoundError {

    private String code;

    private String message;

    private String productId;

    private Integer variantId;

    private String currency;

    private String country;

    private com.commercetools.api.models.customer_group.CustomerGroupReference customerGroup;

    private com.commercetools.api.models.channel.ChannelReference channel;

    @JsonCreator
    MatchingPriceNotFoundErrorImpl(@JsonProperty("message") final String message,
            @JsonProperty("productId") final String productId, @JsonProperty("variantId") final Integer variantId,
            @JsonProperty("currency") final String currency, @JsonProperty("country") final String country,
            @JsonProperty("customerGroup") final com.commercetools.api.models.customer_group.CustomerGroupReference customerGroup,
            @JsonProperty("channel") final com.commercetools.api.models.channel.ChannelReference channel) {
        this.message = message;
        this.productId = productId;
        this.variantId = variantId;
        this.currency = currency;
        this.country = country;
        this.customerGroup = customerGroup;
        this.channel = channel;
        this.code = MatchingPriceNotFoundError.MATCHING_PRICE_NOT_FOUND;
    }

    public MatchingPriceNotFoundErrorImpl() {
        this.code = MatchingPriceNotFoundError.MATCHING_PRICE_NOT_FOUND;
    }

    public String getCode() {
        return this.code;
    }

    public String getMessage() {
        return this.message;
    }

    public String getProductId() {
        return this.productId;
    }

    public Integer getVariantId() {
        return this.variantId;
    }

    public String getCurrency() {
        return this.currency;
    }

    public String getCountry() {
        return this.country;
    }

    public com.commercetools.api.models.customer_group.CustomerGroupReference getCustomerGroup() {
        return this.customerGroup;
    }

    public com.commercetools.api.models.channel.ChannelReference getChannel() {
        return this.channel;
    }

    public void setMessage(final String message) {
        this.message = message;
    }

    public void setProductId(final String productId) {
        this.productId = productId;
    }

    public void setVariantId(final Integer variantId) {
        this.variantId = variantId;
    }

    public void setCurrency(final String currency) {
        this.currency = currency;
    }

    public void setCountry(final String country) {
        this.country = country;
    }

    public void setCustomerGroup(
            final com.commercetools.api.models.customer_group.CustomerGroupReference customerGroup) {
        this.customerGroup = customerGroup;
    }

    public void setChannel(final com.commercetools.api.models.channel.ChannelReference channel) {
        this.channel = channel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        MatchingPriceNotFoundErrorImpl that = (MatchingPriceNotFoundErrorImpl) o;

        return new EqualsBuilder().append(code, that.code).append(message, that.message).append(productId,
            that.productId).append(variantId, that.variantId).append(currency, that.currency).append(country,
                that.country).append(customerGroup, that.customerGroup).append(channel, that.channel).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(code).append(message).append(productId).append(variantId).append(
            currency).append(country).append(customerGroup).append(channel).toHashCode();
    }

}
