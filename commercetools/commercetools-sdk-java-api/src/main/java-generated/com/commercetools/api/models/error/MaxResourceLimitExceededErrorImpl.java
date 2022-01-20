
package com.commercetools.api.models.error;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.ModelBase;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class MaxResourceLimitExceededErrorImpl implements MaxResourceLimitExceededError, ModelBase {

    private String code;

    private String message;

    private com.commercetools.api.models.common.ReferenceTypeId exceededResource;

    @JsonCreator
    MaxResourceLimitExceededErrorImpl(@JsonProperty("message") final String message,
            @JsonProperty("exceededResource") final com.commercetools.api.models.common.ReferenceTypeId exceededResource) {
        this.message = message;
        this.exceededResource = exceededResource;
        this.code = MAX_RESOURCE_LIMIT_EXCEEDED;
    }

    public MaxResourceLimitExceededErrorImpl() {
        this.code = MAX_RESOURCE_LIMIT_EXCEEDED;
    }

    public String getCode() {
        return this.code;
    }

    public String getMessage() {
        return this.message;
    }

    public com.commercetools.api.models.common.ReferenceTypeId getExceededResource() {
        return this.exceededResource;
    }

    public void setMessage(final String message) {
        this.message = message;
    }

    public void setExceededResource(final com.commercetools.api.models.common.ReferenceTypeId exceededResource) {
        this.exceededResource = exceededResource;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        MaxResourceLimitExceededErrorImpl that = (MaxResourceLimitExceededErrorImpl) o;

        return new EqualsBuilder().append(code, that.code)
                .append(message, that.message)
                .append(exceededResource, that.exceededResource)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(code).append(message).append(exceededResource).toHashCode();
    }

}
