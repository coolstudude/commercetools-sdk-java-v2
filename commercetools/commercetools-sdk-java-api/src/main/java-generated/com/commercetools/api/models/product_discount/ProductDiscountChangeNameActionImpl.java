
package com.commercetools.api.models.product_discount;

import java.time.*;
import java.util.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.common.LocalizedString;
import com.commercetools.api.models.product_discount.ProductDiscountUpdateAction;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ProductDiscountChangeNameActionImpl implements ProductDiscountChangeNameAction {

    private String action;

    private com.commercetools.api.models.common.LocalizedString name;

    @JsonCreator
    ProductDiscountChangeNameActionImpl(
            @JsonProperty("name") final com.commercetools.api.models.common.LocalizedString name) {
        this.name = name;
        this.action = ProductDiscountChangeNameAction.CHANGE_NAME;
    }

    public ProductDiscountChangeNameActionImpl() {
        this.action = ProductDiscountChangeNameAction.CHANGE_NAME;
    }

    public String getAction() {
        return this.action;
    }

    public com.commercetools.api.models.common.LocalizedString getName() {
        return this.name;
    }

    public void setName(final com.commercetools.api.models.common.LocalizedString name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ProductDiscountChangeNameActionImpl that = (ProductDiscountChangeNameActionImpl) o;

        return new EqualsBuilder().append(action, that.action).append(name, that.name).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(name).toHashCode();
    }

}
