package com.commercetools.api.models.customer;

import com.commercetools.api.models.customer.CustomerUpdateAction;
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
public final class CustomerAddBillingAddressIdActionImpl implements CustomerAddBillingAddressIdAction {

    private String action;
    
    private String addressId;
    
    private String addressKey;

    @JsonCreator
    CustomerAddBillingAddressIdActionImpl(@JsonProperty("addressId") final String addressId, @JsonProperty("addressKey") final String addressKey) {
        this.addressId = addressId;
        this.addressKey = addressKey;
        this.action = "addBillingAddressId";
    }
    public CustomerAddBillingAddressIdActionImpl() {
       
    }

    
    public String getAction(){
        return this.action;
    }
    
    
    public String getAddressId(){
        return this.addressId;
    }
    
    
    public String getAddressKey(){
        return this.addressKey;
    }

    public void setAddressId(final String addressId){
        this.addressId = addressId;
    }
    
    public void setAddressKey(final String addressKey){
        this.addressKey = addressKey;
    }

}
