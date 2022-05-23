
package com.commercetools.api.models.store;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.ModelBase;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
 * StoreDraft
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StoreDraftImpl implements StoreDraft, ModelBase {

    private String key;

    private com.commercetools.api.models.common.LocalizedString name;

    private java.util.List<String> languages;

    private java.util.List<com.commercetools.api.models.channel.ChannelResourceIdentifier> distributionChannels;

    private java.util.List<com.commercetools.api.models.channel.ChannelResourceIdentifier> supplyChannels;

    private java.util.List<com.commercetools.api.models.store.ProductSelectionSettingDraft> productSelections;

    private com.commercetools.api.models.type.CustomFieldsDraft custom;

    @JsonCreator
    StoreDraftImpl(@JsonProperty("key") final String key,
            @JsonProperty("name") final com.commercetools.api.models.common.LocalizedString name,
            @JsonProperty("languages") final java.util.List<String> languages,
            @JsonProperty("distributionChannels") final java.util.List<com.commercetools.api.models.channel.ChannelResourceIdentifier> distributionChannels,
            @JsonProperty("supplyChannels") final java.util.List<com.commercetools.api.models.channel.ChannelResourceIdentifier> supplyChannels,
            @JsonProperty("productSelections") final java.util.List<com.commercetools.api.models.store.ProductSelectionSettingDraft> productSelections,
            @JsonProperty("custom") final com.commercetools.api.models.type.CustomFieldsDraft custom) {
        this.key = key;
        this.name = name;
        this.languages = languages;
        this.distributionChannels = distributionChannels;
        this.supplyChannels = supplyChannels;
        this.productSelections = productSelections;
        this.custom = custom;
    }

    public StoreDraftImpl() {
    }

    /**
     <*  <p>User-specific unique identifier for the store. The <code>key</code> is mandatory and immutable. It is used to reference the store.</p>>
     */

    public String getKey() {
        return this.key;
    }

    /**
     <*  <p>The name of the store</p>>
     */

    public com.commercetools.api.models.common.LocalizedString getName() {
        return this.name;
    }

    /**
     <>
     */

    public java.util.List<String> getLanguages() {
        return this.languages;
    }

    /**
     <*  <p>Set of ResourceIdentifiers to a Channel with <code>ProductDistribution</code> role</p>>
     */

    public java.util.List<com.commercetools.api.models.channel.ChannelResourceIdentifier> getDistributionChannels() {
        return this.distributionChannels;
    }

    /**
     <*  <p>Set of ResourceIdentifiers of Channels with <code>InventorySupply</code> role</p>>
     */

    public java.util.List<com.commercetools.api.models.channel.ChannelResourceIdentifier> getSupplyChannels() {
        return this.supplyChannels;
    }

    /**
     <*  <p>Set of ResourceIdentifiers of Product Selections along with settings. If <code>productSelections</code> is empty all products in the project are available in this Store. If <code>productSelections</code> is not empty but there exists no <code>active</code> Product Selection then no Product is available in this Store.</p>>
     */

    public java.util.List<com.commercetools.api.models.store.ProductSelectionSettingDraft> getProductSelections() {
        return this.productSelections;
    }

    /**
     <>
     */

    public com.commercetools.api.models.type.CustomFieldsDraft getCustom() {
        return this.custom;
    }

    public void setKey(final String key) {
        this.key = key;
    }

    public void setName(final com.commercetools.api.models.common.LocalizedString name) {
        this.name = name;
    }

    public void setLanguages(final String... languages) {
        this.languages = new ArrayList<>(Arrays.asList(languages));
    }

    public void setLanguages(final java.util.List<String> languages) {
        this.languages = languages;
    }

    public void setDistributionChannels(
            final com.commercetools.api.models.channel.ChannelResourceIdentifier... distributionChannels) {
        this.distributionChannels = new ArrayList<>(Arrays.asList(distributionChannels));
    }

    public void setDistributionChannels(
            final java.util.List<com.commercetools.api.models.channel.ChannelResourceIdentifier> distributionChannels) {
        this.distributionChannels = distributionChannels;
    }

    public void setSupplyChannels(
            final com.commercetools.api.models.channel.ChannelResourceIdentifier... supplyChannels) {
        this.supplyChannels = new ArrayList<>(Arrays.asList(supplyChannels));
    }

    public void setSupplyChannels(
            final java.util.List<com.commercetools.api.models.channel.ChannelResourceIdentifier> supplyChannels) {
        this.supplyChannels = supplyChannels;
    }

    public void setProductSelections(
            final com.commercetools.api.models.store.ProductSelectionSettingDraft... productSelections) {
        this.productSelections = new ArrayList<>(Arrays.asList(productSelections));
    }

    public void setProductSelections(
            final java.util.List<com.commercetools.api.models.store.ProductSelectionSettingDraft> productSelections) {
        this.productSelections = productSelections;
    }

    public void setCustom(final com.commercetools.api.models.type.CustomFieldsDraft custom) {
        this.custom = custom;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        StoreDraftImpl that = (StoreDraftImpl) o;

        return new EqualsBuilder().append(key, that.key)
                .append(name, that.name)
                .append(languages, that.languages)
                .append(distributionChannels, that.distributionChannels)
                .append(supplyChannels, that.supplyChannels)
                .append(productSelections, that.productSelections)
                .append(custom, that.custom)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(key)
                .append(name)
                .append(languages)
                .append(distributionChannels)
                .append(supplyChannels)
                .append(productSelections)
                .append(custom)
                .toHashCode();
    }

}
