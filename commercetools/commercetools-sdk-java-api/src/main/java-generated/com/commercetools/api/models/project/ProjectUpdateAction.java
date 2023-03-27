
package com.commercetools.api.models.project;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProjectUpdateAction
 *
 * <hr>
 * Example to create a subtype instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProjectUpdateAction projectUpdateAction = ProjectUpdateAction.changeMyBusinessUnitStatusOnCreationBuilder()
 *             status(BusinessUnitConfigurationStatus.ACTIVE)
 *             .build()
 * </code></pre>
 * </div>
 */
@JsonSubTypes({
        @JsonSubTypes.Type(value = com.commercetools.api.models.project.ProjectChangeBusinessUnitStatusOnCreationActionImpl.class, name = ProjectChangeBusinessUnitStatusOnCreationAction.CHANGE_MY_BUSINESS_UNIT_STATUS_ON_CREATION),
        @JsonSubTypes.Type(value = com.commercetools.api.models.project.ProjectChangeCartsConfigurationActionImpl.class, name = ProjectChangeCartsConfigurationAction.CHANGE_CARTS_CONFIGURATION),
        @JsonSubTypes.Type(value = com.commercetools.api.models.project.ProjectChangeCountriesActionImpl.class, name = ProjectChangeCountriesAction.CHANGE_COUNTRIES),
        @JsonSubTypes.Type(value = com.commercetools.api.models.project.ProjectChangeCountryTaxRateFallbackEnabledActionImpl.class, name = ProjectChangeCountryTaxRateFallbackEnabledAction.CHANGE_COUNTRY_TAX_RATE_FALLBACK_ENABLED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.project.ProjectChangeCurrenciesActionImpl.class, name = ProjectChangeCurrenciesAction.CHANGE_CURRENCIES),
        @JsonSubTypes.Type(value = com.commercetools.api.models.project.ProjectChangeLanguagesActionImpl.class, name = ProjectChangeLanguagesAction.CHANGE_LANGUAGES),
        @JsonSubTypes.Type(value = com.commercetools.api.models.project.ProjectChangeMessagesConfigurationActionImpl.class, name = ProjectChangeMessagesConfigurationAction.CHANGE_MESSAGES_CONFIGURATION),
        @JsonSubTypes.Type(value = com.commercetools.api.models.project.ProjectChangeNameActionImpl.class, name = ProjectChangeNameAction.CHANGE_NAME),
        @JsonSubTypes.Type(value = com.commercetools.api.models.project.ProjectChangeOrderSearchStatusActionImpl.class, name = ProjectChangeOrderSearchStatusAction.CHANGE_ORDER_SEARCH_STATUS),
        @JsonSubTypes.Type(value = com.commercetools.api.models.project.ProjectChangeProductSearchIndexingEnabledActionImpl.class, name = ProjectChangeProductSearchIndexingEnabledAction.CHANGE_PRODUCT_SEARCH_INDEXING_ENABLED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.project.ProjectChangeShoppingListsConfigurationActionImpl.class, name = ProjectChangeShoppingListsConfigurationAction.CHANGE_SHOPPING_LISTS_CONFIGURATION),
        @JsonSubTypes.Type(value = com.commercetools.api.models.project.ProjectSetExternalOAuthActionImpl.class, name = ProjectSetExternalOAuthAction.SET_EXTERNAL_O_AUTH),
        @JsonSubTypes.Type(value = com.commercetools.api.models.project.ProjectSetShippingRateInputTypeActionImpl.class, name = ProjectSetShippingRateInputTypeAction.SET_SHIPPING_RATE_INPUT_TYPE) })
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "action", defaultImpl = ProjectUpdateActionImpl.class, visible = true)
@JsonDeserialize(as = ProjectUpdateActionImpl.class)
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public interface ProjectUpdateAction extends com.commercetools.api.models.ResourceUpdateAction<ProjectUpdateAction> {

    /**
     *
     * @return action
     */
    @NotNull
    @JsonProperty("action")
    public String getAction();

    /**
     * builder for changeMyBusinessUnitStatusOnCreation subtype
     * @return builder
     */
    public static com.commercetools.api.models.project.ProjectChangeBusinessUnitStatusOnCreationActionBuilder changeMyBusinessUnitStatusOnCreationBuilder() {
        return com.commercetools.api.models.project.ProjectChangeBusinessUnitStatusOnCreationActionBuilder.of();
    }

    /**
     * builder for changeCartsConfiguration subtype
     * @return builder
     */
    public static com.commercetools.api.models.project.ProjectChangeCartsConfigurationActionBuilder changeCartsConfigurationBuilder() {
        return com.commercetools.api.models.project.ProjectChangeCartsConfigurationActionBuilder.of();
    }

    /**
     * builder for changeCountries subtype
     * @return builder
     */
    public static com.commercetools.api.models.project.ProjectChangeCountriesActionBuilder changeCountriesBuilder() {
        return com.commercetools.api.models.project.ProjectChangeCountriesActionBuilder.of();
    }

    /**
     * builder for changeCountryTaxRateFallbackEnabled subtype
     * @return builder
     */
    public static com.commercetools.api.models.project.ProjectChangeCountryTaxRateFallbackEnabledActionBuilder changeCountryTaxRateFallbackEnabledBuilder() {
        return com.commercetools.api.models.project.ProjectChangeCountryTaxRateFallbackEnabledActionBuilder.of();
    }

    /**
     * builder for changeCurrencies subtype
     * @return builder
     */
    public static com.commercetools.api.models.project.ProjectChangeCurrenciesActionBuilder changeCurrenciesBuilder() {
        return com.commercetools.api.models.project.ProjectChangeCurrenciesActionBuilder.of();
    }

    /**
     * builder for changeLanguages subtype
     * @return builder
     */
    public static com.commercetools.api.models.project.ProjectChangeLanguagesActionBuilder changeLanguagesBuilder() {
        return com.commercetools.api.models.project.ProjectChangeLanguagesActionBuilder.of();
    }

    /**
     * builder for changeMessagesConfiguration subtype
     * @return builder
     */
    public static com.commercetools.api.models.project.ProjectChangeMessagesConfigurationActionBuilder changeMessagesConfigurationBuilder() {
        return com.commercetools.api.models.project.ProjectChangeMessagesConfigurationActionBuilder.of();
    }

    /**
     * builder for changeName subtype
     * @return builder
     */
    public static com.commercetools.api.models.project.ProjectChangeNameActionBuilder changeNameBuilder() {
        return com.commercetools.api.models.project.ProjectChangeNameActionBuilder.of();
    }

    /**
     * builder for changeOrderSearchStatus subtype
     * @return builder
     */
    public static com.commercetools.api.models.project.ProjectChangeOrderSearchStatusActionBuilder changeOrderSearchStatusBuilder() {
        return com.commercetools.api.models.project.ProjectChangeOrderSearchStatusActionBuilder.of();
    }

    /**
     * builder for changeProductSearchIndexingEnabled subtype
     * @return builder
     */
    public static com.commercetools.api.models.project.ProjectChangeProductSearchIndexingEnabledActionBuilder changeProductSearchIndexingEnabledBuilder() {
        return com.commercetools.api.models.project.ProjectChangeProductSearchIndexingEnabledActionBuilder.of();
    }

    /**
     * builder for changeShoppingListsConfiguration subtype
     * @return builder
     */
    public static com.commercetools.api.models.project.ProjectChangeShoppingListsConfigurationActionBuilder changeShoppingListsConfigurationBuilder() {
        return com.commercetools.api.models.project.ProjectChangeShoppingListsConfigurationActionBuilder.of();
    }

    /**
     * builder for setExternalOAuth subtype
     * @return builder
     */
    public static com.commercetools.api.models.project.ProjectSetExternalOAuthActionBuilder setExternalOAuthBuilder() {
        return com.commercetools.api.models.project.ProjectSetExternalOAuthActionBuilder.of();
    }

    /**
     * builder for setShippingRateInputType subtype
     * @return builder
     */
    public static com.commercetools.api.models.project.ProjectSetShippingRateInputTypeActionBuilder setShippingRateInputTypeBuilder() {
        return com.commercetools.api.models.project.ProjectSetShippingRateInputTypeActionBuilder.of();
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProjectUpdateAction(Function<ProjectUpdateAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ProjectUpdateAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProjectUpdateAction>() {
            @Override
            public String toString() {
                return "TypeReference<ProjectUpdateAction>";
            }
        };
    }
}
