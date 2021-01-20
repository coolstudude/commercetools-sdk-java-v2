
package com.commercetools.api.models.project;

import java.io.IOException;
import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.project.ProjectChangeCountriesAction;
import com.commercetools.api.models.project.ProjectChangeCountryTaxRateFallbackEnabledAction;
import com.commercetools.api.models.project.ProjectChangeCurrenciesAction;
import com.commercetools.api.models.project.ProjectChangeLanguagesAction;
import com.commercetools.api.models.project.ProjectChangeMessagesConfigurationAction;
import com.commercetools.api.models.project.ProjectChangeMessagesEnabledAction;
import com.commercetools.api.models.project.ProjectChangeNameAction;
import com.commercetools.api.models.project.ProjectSetExternalOAuthAction;
import com.commercetools.api.models.project.ProjectSetShippingRateInputTypeAction;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.Accessor;
import io.vrap.rmf.base.client.utils.Generated;

@JsonSubTypes({
        @JsonSubTypes.Type(value = com.commercetools.api.models.project.ProjectChangeCountriesActionImpl.class, name = ProjectChangeCountriesAction.CHANGE_COUNTRIES),
        @JsonSubTypes.Type(value = com.commercetools.api.models.project.ProjectChangeCountryTaxRateFallbackEnabledActionImpl.class, name = ProjectChangeCountryTaxRateFallbackEnabledAction.CHANGE_COUNTRY_TAX_RATE_FALLBACK_ENABLED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.project.ProjectChangeCurrenciesActionImpl.class, name = ProjectChangeCurrenciesAction.CHANGE_CURRENCIES),
        @JsonSubTypes.Type(value = com.commercetools.api.models.project.ProjectChangeLanguagesActionImpl.class, name = ProjectChangeLanguagesAction.CHANGE_LANGUAGES),
        @JsonSubTypes.Type(value = com.commercetools.api.models.project.ProjectChangeMessagesConfigurationActionImpl.class, name = ProjectChangeMessagesConfigurationAction.CHANGE_MESSAGES_CONFIGURATION),
        @JsonSubTypes.Type(value = com.commercetools.api.models.project.ProjectChangeMessagesEnabledActionImpl.class, name = ProjectChangeMessagesEnabledAction.CHANGE_MESSAGES_ENABLED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.project.ProjectChangeNameActionImpl.class, name = ProjectChangeNameAction.CHANGE_NAME),
        @JsonSubTypes.Type(value = com.commercetools.api.models.project.ProjectSetExternalOAuthActionImpl.class, name = ProjectSetExternalOAuthAction.SET_EXTERNAL_O_AUTH),
        @JsonSubTypes.Type(value = com.commercetools.api.models.project.ProjectSetShippingRateInputTypeActionImpl.class, name = ProjectSetShippingRateInputTypeAction.SET_SHIPPING_RATE_INPUT_TYPE) })
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "action", defaultImpl = ProjectUpdateActionImpl.class, visible = true)
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public interface ProjectUpdateAction extends com.commercetools.api.models.ResourceUpdateAction<ProjectUpdateAction> {

    @NotNull
    @JsonProperty("action")
    public String getAction();

    default <T> T withProjectUpdateAction(Function<ProjectUpdateAction, T> helper) {
        return helper.apply(this);
    }
}
