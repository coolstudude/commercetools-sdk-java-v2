package com.commercetools.api.generated.models.project;

import com.commercetools.api.generated.models.project.ProjectChangeCountriesAction;
import com.commercetools.api.generated.models.project.ProjectChangeCurrenciesAction;
import com.commercetools.api.generated.models.project.ProjectChangeLanguagesAction;
import com.commercetools.api.generated.models.project.ProjectChangeMessagesConfigurationAction;
import com.commercetools.api.generated.models.project.ProjectChangeMessagesEnabledAction;
import com.commercetools.api.generated.models.project.ProjectChangeNameAction;
import com.commercetools.api.generated.models.project.ProjectSetExternalOAuthAction;
import com.commercetools.api.generated.models.project.ProjectSetShippingRateInputTypeAction;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ProjectUpdateActionImpl implements ProjectUpdateAction {

   private String action;

   @JsonCreator
   ProjectUpdateActionImpl() {
      this.action = "null";
   }
   
   
   
   public String getAction(){
      return this.action;
   }


}