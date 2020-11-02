package com.commercetools.api.models.project;

import com.commercetools.api.models.project.CartClassificationType;
import com.commercetools.api.models.project.CartScoreType;
import com.commercetools.api.models.project.CartValueType;
import com.commercetools.api.models.shipping_method.ShippingRateTierType;


import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.Accessor;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;
import java.util.function.Function;
import java.io.IOException;

@JsonSubTypes({
   @JsonSubTypes.Type(value = com.commercetools.api.models.project.CartValueTypeImpl.class, name = "CartValue"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.project.CartClassificationTypeImpl.class, name = "CartClassification"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.project.CartScoreTypeImpl.class, name = "CartScore")
})
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "type",
    defaultImpl = ShippingRateInputTypeImpl.class
)
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public interface ShippingRateInputType  {





    default <T> T withShippingRateInputType(Function<ShippingRateInputType, T> helper) {
        return helper.apply(this);
    }
}
