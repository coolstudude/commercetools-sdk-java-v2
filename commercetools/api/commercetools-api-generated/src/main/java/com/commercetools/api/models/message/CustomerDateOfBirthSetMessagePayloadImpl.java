package com.commercetools.api.models.message;

import com.commercetools.api.models.message.MessagePayload;
import java.time.LocalDate;
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
public final class CustomerDateOfBirthSetMessagePayloadImpl implements CustomerDateOfBirthSetMessagePayload {

   private String type;
   
   private java.time.LocalDate dateOfBirth;

   @JsonCreator
   CustomerDateOfBirthSetMessagePayloadImpl(@JsonProperty("dateOfBirth") final java.time.LocalDate dateOfBirth) {
      this.dateOfBirth = dateOfBirth;
      this.type = "CustomerDateOfBirthSet";
   }
   public CustomerDateOfBirthSetMessagePayloadImpl() {
      
   }
   
   
   public String getType(){
      return this.type;
   }
   
   
   public java.time.LocalDate getDateOfBirth(){
      return this.dateOfBirth;
   }

   public void setDateOfBirth(final java.time.LocalDate dateOfBirth){
      this.dateOfBirth = dateOfBirth;
   }

}
