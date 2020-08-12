package com.commercetools.api.models.cart;

import com.commercetools.api.models.cart.Cart;
import com.commercetools.api.models.cart.CartPagedQueryResponseImpl;

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
@JsonDeserialize(as = CartPagedQueryResponseImpl.class)
public interface CartPagedQueryResponse  {

   
   @NotNull
   @JsonProperty("limit")
   public Long getLimit();
   
   @NotNull
   @JsonProperty("count")
   public Long getCount();
   
   
   @JsonProperty("total")
   public Long getTotal();
   
   @NotNull
   @JsonProperty("offset")
   public Long getOffset();
   
   @NotNull
   @Valid
   @JsonProperty("results")
   public List<Cart> getResults();

   public void setLimit(final Long limit);
   
   public void setCount(final Long count);
   
   public void setTotal(final Long total);
   
   public void setOffset(final Long offset);
   
   public void setResults(final List<Cart> results);
   
   public static CartPagedQueryResponseImpl of(){
      return new CartPagedQueryResponseImpl();
   }
   

   public static CartPagedQueryResponseImpl of(final CartPagedQueryResponse template) {
      CartPagedQueryResponseImpl instance = new CartPagedQueryResponseImpl();
      instance.setLimit(template.getLimit());
      instance.setCount(template.getCount());
      instance.setTotal(template.getTotal());
      instance.setOffset(template.getOffset());
      instance.setResults(template.getResults());
      return instance;
   }

}
