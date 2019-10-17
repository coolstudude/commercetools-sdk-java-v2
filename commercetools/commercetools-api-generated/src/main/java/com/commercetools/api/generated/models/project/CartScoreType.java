package com.commercetools.api.generated.models.project;

import com.commercetools.api.generated.models.project.ShippingRateInputType;
import com.commercetools.api.generated.models.shipping_method.ShippingRateTierType;
import com.commercetools.api.generated.models.project.CartScoreTypeImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import javax.annotation.Generated;
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
@JsonDeserialize(as = CartScoreTypeImpl.class)
public interface CartScoreType extends ShippingRateInputType {


   
   public static CartScoreTypeImpl of(){
      return new CartScoreTypeImpl();
   }
   

   public static CartScoreTypeImpl of(final CartScoreType template) {
      CartScoreTypeImpl instance = new CartScoreTypeImpl();
      return instance;
   }

}