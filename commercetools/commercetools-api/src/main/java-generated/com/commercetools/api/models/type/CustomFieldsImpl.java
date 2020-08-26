package com.commercetools.api.models.type;

import com.commercetools.api.models.type.FieldContainer;
import com.commercetools.api.models.type.TypeReference;
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
public final class CustomFieldsImpl implements CustomFields {

    private com.commercetools.api.models.type.TypeReference type;
    
    private com.commercetools.api.models.type.FieldContainer fields;

    @JsonCreator
    CustomFieldsImpl(@JsonProperty("type") final com.commercetools.api.models.type.TypeReference type, @JsonProperty("fields") final com.commercetools.api.models.type.FieldContainer fields) {
        this.type = type;
        this.fields = fields;
    }
    public CustomFieldsImpl() {
       
    }

    
    public com.commercetools.api.models.type.TypeReference getType(){
        return this.type;
    }
    
    /**
    *  <p>A valid JSON object, based on FieldDefinition.</p>
    */
    public com.commercetools.api.models.type.FieldContainer getFields(){
        return this.fields;
    }

    public void setType(final com.commercetools.api.models.type.TypeReference type){
        this.type = type;
    }
    
    public void setFields(final com.commercetools.api.models.type.FieldContainer fields){
        this.fields = fields;
    }

}
