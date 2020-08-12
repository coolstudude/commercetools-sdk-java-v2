package com.commercetools.api.models.product_type;

import com.commercetools.api.models.product_type.AttributeLocalizedEnumValue;
import com.commercetools.api.models.product_type.ProductTypeUpdateAction;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ProductTypeChangeLocalizedEnumValueOrderActionImpl implements ProductTypeChangeLocalizedEnumValueOrderAction {

   private String action;
   
   private String attributeName;
   
   private java.util.List<com.commercetools.api.models.product_type.AttributeLocalizedEnumValue> values;

   @JsonCreator
   ProductTypeChangeLocalizedEnumValueOrderActionImpl(@JsonProperty("attributeName") final String attributeName, @JsonProperty("values") final java.util.List<com.commercetools.api.models.product_type.AttributeLocalizedEnumValue> values) {
      this.attributeName = attributeName;
      this.values = values;
      this.action = "changeLocalizedEnumValueOrder";
   }
   public ProductTypeChangeLocalizedEnumValueOrderActionImpl() {
      
   }
   
   
   public String getAction(){
      return this.action;
   }
   
   
   public String getAttributeName(){
      return this.attributeName;
   }
   
   
   public java.util.List<com.commercetools.api.models.product_type.AttributeLocalizedEnumValue> getValues(){
      return this.values;
   }

   public void setAttributeName(final String attributeName){
      this.attributeName = attributeName;
   }
   
   public void setValues(final java.util.List<com.commercetools.api.models.product_type.AttributeLocalizedEnumValue> values){
      this.values = values;
   }

}
