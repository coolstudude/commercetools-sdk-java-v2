package com.commercetools.api.models.customer_group;

import com.commercetools.api.models.customer_group.CustomerGroupUpdateAction;
import com.commercetools.api.models.type.FieldContainer;
import com.commercetools.api.models.type.TypeResourceIdentifier;
import com.commercetools.api.models.customer_group.CustomerGroupSetCustomTypeActionImpl;

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
@JsonDeserialize(as = CustomerGroupSetCustomTypeActionImpl.class)
public interface CustomerGroupSetCustomTypeAction extends CustomerGroupUpdateAction {

   /**
   *  <p>If absent, the custom type and any existing CustomFields are removed.</p>
   */
   @Valid
   @JsonProperty("type")
   public TypeResourceIdentifier getType();
   /**
   *  <p>A valid JSON object, based on the FieldDefinitions of the Type.
   *  Sets the custom fields to this value.</p>
   */
   @Valid
   @JsonProperty("fields")
   public FieldContainer getFields();

   public void setType(final TypeResourceIdentifier type);
   
   public void setFields(final FieldContainer fields);
   
   public static CustomerGroupSetCustomTypeActionImpl of(){
      return new CustomerGroupSetCustomTypeActionImpl();
   }
   

   public static CustomerGroupSetCustomTypeActionImpl of(final CustomerGroupSetCustomTypeAction template) {
      CustomerGroupSetCustomTypeActionImpl instance = new CustomerGroupSetCustomTypeActionImpl();
      instance.setType(template.getType());
      instance.setFields(template.getFields());
      return instance;
   }

}
