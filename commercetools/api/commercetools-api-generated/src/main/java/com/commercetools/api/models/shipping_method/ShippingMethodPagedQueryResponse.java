package com.commercetools.api.models.shipping_method;

import com.commercetools.api.models.shipping_method.ShippingMethod;
import com.commercetools.api.models.shipping_method.ShippingMethodPagedQueryResponseImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;

import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = ShippingMethodPagedQueryResponseImpl.class)
public interface ShippingMethodPagedQueryResponse  {

   
   
   @JsonProperty("limit")
   public Long getLimit();
   
   @NotNull
   @JsonProperty("count")
   public Long getCount();
   
   
   @JsonProperty("total")
   public Long getTotal();
   
   
   @JsonProperty("offset")
   public Long getOffset();
   
   @NotNull
   @Valid
   @JsonProperty("results")
   public List<ShippingMethod> getResults();

   public void setLimit(final Long limit);
   
   public void setCount(final Long count);
   
   public void setTotal(final Long total);
   
   public void setOffset(final Long offset);
   
   public void setResults(final List<ShippingMethod> results);
   
   public static ShippingMethodPagedQueryResponseImpl of(){
      return new ShippingMethodPagedQueryResponseImpl();
   }
   

   public static ShippingMethodPagedQueryResponseImpl of(final ShippingMethodPagedQueryResponse template) {
      ShippingMethodPagedQueryResponseImpl instance = new ShippingMethodPagedQueryResponseImpl();
      instance.setLimit(template.getLimit());
      instance.setCount(template.getCount());
      instance.setTotal(template.getTotal());
      instance.setOffset(template.getOffset());
      instance.setResults(template.getResults());
      return instance;
   }

}
