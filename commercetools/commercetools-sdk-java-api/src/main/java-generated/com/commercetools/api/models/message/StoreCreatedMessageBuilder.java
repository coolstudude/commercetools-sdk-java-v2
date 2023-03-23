
package com.commercetools.api.models.message;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * StoreCreatedMessageBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StoreCreatedMessage storeCreatedMessage = StoreCreatedMessage.builder()
 *             .id("{id}")
 *             .version(0.3)
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .sequenceNumber(0.3)
 *             .resource(resourceBuilder -> resourceBuilder)
 *             .resourceVersion(0.3)
 *             .plusDistributionChannels(distributionChannelsBuilder -> distributionChannelsBuilder)
 *             .plusSupplyChannels(supplyChannelsBuilder -> supplyChannelsBuilder)
 *             .plusProductSelections(productSelectionsBuilder -> productSelectionsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StoreCreatedMessageBuilder implements Builder<StoreCreatedMessage> {

    private String id;

    private Long version;

    private java.time.ZonedDateTime createdAt;

    private java.time.ZonedDateTime lastModifiedAt;

    @Nullable
    private com.commercetools.api.models.common.LastModifiedBy lastModifiedBy;

    @Nullable
    private com.commercetools.api.models.common.CreatedBy createdBy;

    private Long sequenceNumber;

    private com.commercetools.api.models.common.Reference resource;

    private Long resourceVersion;

    @Nullable
    private com.commercetools.api.models.message.UserProvidedIdentifiers resourceUserProvidedIdentifiers;

    @Nullable
    private com.commercetools.api.models.common.LocalizedString name;

    @Nullable
    private java.util.List<String> languages;

    @Nullable
    private java.util.List<com.commercetools.api.models.store_country.StoreCountry> countries;

    private java.util.List<com.commercetools.api.models.channel.ChannelReference> distributionChannels;

    private java.util.List<com.commercetools.api.models.channel.ChannelReference> supplyChannels;

    private java.util.List<com.commercetools.api.models.store.ProductSelectionSetting> productSelections;

    @Nullable
    private com.commercetools.api.models.type.CustomFields custom;

    /**
     *  <p>Unique identifier of the Message. Can be used to track which Messages have been processed.</p>
     * @param id
     * @return Builder
     */

    public StoreCreatedMessageBuilder id(final String id) {
        this.id = id;
        return this;
    }

    /**
     *  <p>Version of a resource. In case of Messages, this is always <code>1</code>.</p>
     * @param version
     * @return Builder
     */

    public StoreCreatedMessageBuilder version(final Long version) {
        this.version = version;
        return this;
    }

    /**
     *  <p>Date and time (UTC) the Message was generated.</p>
     * @param createdAt
     * @return Builder
     */

    public StoreCreatedMessageBuilder createdAt(final java.time.ZonedDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     *  <p>Value of <code>createdAt</code>.</p>
     * @param lastModifiedAt
     * @return Builder
     */

    public StoreCreatedMessageBuilder lastModifiedAt(final java.time.ZonedDateTime lastModifiedAt) {
        this.lastModifiedAt = lastModifiedAt;
        return this;
    }

    /**
     *  <p>Value of <code>createdBy</code>.</p>
     * @return Builder
     */

    public StoreCreatedMessageBuilder lastModifiedBy(
            Function<com.commercetools.api.models.common.LastModifiedByBuilder, com.commercetools.api.models.common.LastModifiedByBuilder> builder) {
        this.lastModifiedBy = builder.apply(com.commercetools.api.models.common.LastModifiedByBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Value of <code>createdBy</code>.</p>
     * @param lastModifiedBy
     * @return Builder
     */

    public StoreCreatedMessageBuilder lastModifiedBy(
            @Nullable final com.commercetools.api.models.common.LastModifiedBy lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
        return this;
    }

    /**
     *  <p>Present on resources created after 1 February 2019 except for events not tracked.</p>
     * @return Builder
     */

    public StoreCreatedMessageBuilder createdBy(
            Function<com.commercetools.api.models.common.CreatedByBuilder, com.commercetools.api.models.common.CreatedByBuilder> builder) {
        this.createdBy = builder.apply(com.commercetools.api.models.common.CreatedByBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Present on resources created after 1 February 2019 except for events not tracked.</p>
     * @param createdBy
     * @return Builder
     */

    public StoreCreatedMessageBuilder createdBy(
            @Nullable final com.commercetools.api.models.common.CreatedBy createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    /**
     *  <p>Message number in relation to other Messages for a given resource. The <code>sequenceNumber</code> of the next Message for the resource is the successor of the <code>sequenceNumber</code> of the current Message. Meaning, the <code>sequenceNumber</code> of the next Message equals the <code>sequenceNumber</code> of the current Message + 1. <code>sequenceNumber</code> can be used to ensure that Messages are processed in the correct order for a particular resource.</p>
     * @param sequenceNumber
     * @return Builder
     */

    public StoreCreatedMessageBuilder sequenceNumber(final Long sequenceNumber) {
        this.sequenceNumber = sequenceNumber;
        return this;
    }

    /**
     *  <p>Reference to the resource on which the change or action was performed.</p>
     * @param resource
     * @return Builder
     */

    public StoreCreatedMessageBuilder resource(final com.commercetools.api.models.common.Reference resource) {
        this.resource = resource;
        return this;
    }

    /**
     *  <p>Reference to the resource on which the change or action was performed.</p>
     * @return Builder
     */

    public StoreCreatedMessageBuilder resource(
            Function<com.commercetools.api.models.common.ReferenceBuilder, Builder<? extends com.commercetools.api.models.common.Reference>> builder) {
        this.resource = builder.apply(com.commercetools.api.models.common.ReferenceBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Version of the resource on which the change or action was performed.</p>
     * @param resourceVersion
     * @return Builder
     */

    public StoreCreatedMessageBuilder resourceVersion(final Long resourceVersion) {
        this.resourceVersion = resourceVersion;
        return this;
    }

    /**
     *  <p>User-provided identifiers of the resource, such as <code>key</code> or <code>externalId</code>. Only present if the resource has such identifiers.</p>
     * @return Builder
     */

    public StoreCreatedMessageBuilder resourceUserProvidedIdentifiers(
            Function<com.commercetools.api.models.message.UserProvidedIdentifiersBuilder, com.commercetools.api.models.message.UserProvidedIdentifiersBuilder> builder) {
        this.resourceUserProvidedIdentifiers = builder
                .apply(com.commercetools.api.models.message.UserProvidedIdentifiersBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>User-provided identifiers of the resource, such as <code>key</code> or <code>externalId</code>. Only present if the resource has such identifiers.</p>
     * @param resourceUserProvidedIdentifiers
     * @return Builder
     */

    public StoreCreatedMessageBuilder resourceUserProvidedIdentifiers(
            @Nullable final com.commercetools.api.models.message.UserProvidedIdentifiers resourceUserProvidedIdentifiers) {
        this.resourceUserProvidedIdentifiers = resourceUserProvidedIdentifiers;
        return this;
    }

    /**
     *  <p>The <code>name</code> of the Store that was created.</p>
     * @return Builder
     */

    public StoreCreatedMessageBuilder name(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.name = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     *  <p>The <code>name</code> of the Store that was created.</p>
     * @param name
     * @return Builder
     */

    public StoreCreatedMessageBuilder name(@Nullable final com.commercetools.api.models.common.LocalizedString name) {
        this.name = name;
        return this;
    }

    /**
     *  <p>Languages of the Store that was created. Languages are represented as IETF language tags.</p>
     * @param languages
     * @return Builder
     */

    public StoreCreatedMessageBuilder languages(@Nullable final String... languages) {
        this.languages = new ArrayList<>(Arrays.asList(languages));
        return this;
    }

    /**
     *  <p>Languages of the Store that was created. Languages are represented as IETF language tags.</p>
     * @param languages
     * @return Builder
     */

    public StoreCreatedMessageBuilder languages(@Nullable final java.util.List<String> languages) {
        this.languages = languages;
        return this;
    }

    /**
     *  <p>Languages of the Store that was created. Languages are represented as IETF language tags.</p>
     * @param languages
     * @return Builder
     */

    public StoreCreatedMessageBuilder plusLanguages(@Nullable final String... languages) {
        if (this.languages == null) {
            this.languages = new ArrayList<>();
        }
        this.languages.addAll(Arrays.asList(languages));
        return this;
    }

    /**
     *  <p>Countries of the Store that was created.</p>
     * @param countries
     * @return Builder
     */

    public StoreCreatedMessageBuilder countries(
            @Nullable final com.commercetools.api.models.store_country.StoreCountry... countries) {
        this.countries = new ArrayList<>(Arrays.asList(countries));
        return this;
    }

    /**
     *  <p>Countries of the Store that was created.</p>
     * @param countries
     * @return Builder
     */

    public StoreCreatedMessageBuilder countries(
            @Nullable final java.util.List<com.commercetools.api.models.store_country.StoreCountry> countries) {
        this.countries = countries;
        return this;
    }

    /**
     *  <p>Countries of the Store that was created.</p>
     * @param countries
     * @return Builder
     */

    public StoreCreatedMessageBuilder plusCountries(
            @Nullable final com.commercetools.api.models.store_country.StoreCountry... countries) {
        if (this.countries == null) {
            this.countries = new ArrayList<>();
        }
        this.countries.addAll(Arrays.asList(countries));
        return this;
    }

    /**
     *  <p>Countries of the Store that was created.</p>
     * @return Builder
     */

    public StoreCreatedMessageBuilder plusCountries(
            Function<com.commercetools.api.models.store_country.StoreCountryBuilder, com.commercetools.api.models.store_country.StoreCountryBuilder> builder) {
        if (this.countries == null) {
            this.countries = new ArrayList<>();
        }
        this.countries.add(builder.apply(com.commercetools.api.models.store_country.StoreCountryBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Countries of the Store that was created.</p>
     * @return Builder
     */

    public StoreCreatedMessageBuilder withCountries(
            Function<com.commercetools.api.models.store_country.StoreCountryBuilder, com.commercetools.api.models.store_country.StoreCountryBuilder> builder) {
        this.countries = new ArrayList<>();
        this.countries.add(builder.apply(com.commercetools.api.models.store_country.StoreCountryBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Distribution Channels of the Store that was created.</p>
     * @param distributionChannels
     * @return Builder
     */

    public StoreCreatedMessageBuilder distributionChannels(
            final com.commercetools.api.models.channel.ChannelReference... distributionChannels) {
        this.distributionChannels = new ArrayList<>(Arrays.asList(distributionChannels));
        return this;
    }

    /**
     *  <p>Distribution Channels of the Store that was created.</p>
     * @param distributionChannels
     * @return Builder
     */

    public StoreCreatedMessageBuilder distributionChannels(
            final java.util.List<com.commercetools.api.models.channel.ChannelReference> distributionChannels) {
        this.distributionChannels = distributionChannels;
        return this;
    }

    /**
     *  <p>Distribution Channels of the Store that was created.</p>
     * @param distributionChannels
     * @return Builder
     */

    public StoreCreatedMessageBuilder plusDistributionChannels(
            final com.commercetools.api.models.channel.ChannelReference... distributionChannels) {
        if (this.distributionChannels == null) {
            this.distributionChannels = new ArrayList<>();
        }
        this.distributionChannels.addAll(Arrays.asList(distributionChannels));
        return this;
    }

    /**
     *  <p>Distribution Channels of the Store that was created.</p>
     * @return Builder
     */

    public StoreCreatedMessageBuilder plusDistributionChannels(
            Function<com.commercetools.api.models.channel.ChannelReferenceBuilder, com.commercetools.api.models.channel.ChannelReferenceBuilder> builder) {
        if (this.distributionChannels == null) {
            this.distributionChannels = new ArrayList<>();
        }
        this.distributionChannels
                .add(builder.apply(com.commercetools.api.models.channel.ChannelReferenceBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Distribution Channels of the Store that was created.</p>
     * @return Builder
     */

    public StoreCreatedMessageBuilder withDistributionChannels(
            Function<com.commercetools.api.models.channel.ChannelReferenceBuilder, com.commercetools.api.models.channel.ChannelReferenceBuilder> builder) {
        this.distributionChannels = new ArrayList<>();
        this.distributionChannels
                .add(builder.apply(com.commercetools.api.models.channel.ChannelReferenceBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Supply Channels of the Store that was created.</p>
     * @param supplyChannels
     * @return Builder
     */

    public StoreCreatedMessageBuilder supplyChannels(
            final com.commercetools.api.models.channel.ChannelReference... supplyChannels) {
        this.supplyChannels = new ArrayList<>(Arrays.asList(supplyChannels));
        return this;
    }

    /**
     *  <p>Supply Channels of the Store that was created.</p>
     * @param supplyChannels
     * @return Builder
     */

    public StoreCreatedMessageBuilder supplyChannels(
            final java.util.List<com.commercetools.api.models.channel.ChannelReference> supplyChannels) {
        this.supplyChannels = supplyChannels;
        return this;
    }

    /**
     *  <p>Supply Channels of the Store that was created.</p>
     * @param supplyChannels
     * @return Builder
     */

    public StoreCreatedMessageBuilder plusSupplyChannels(
            final com.commercetools.api.models.channel.ChannelReference... supplyChannels) {
        if (this.supplyChannels == null) {
            this.supplyChannels = new ArrayList<>();
        }
        this.supplyChannels.addAll(Arrays.asList(supplyChannels));
        return this;
    }

    /**
     *  <p>Supply Channels of the Store that was created.</p>
     * @return Builder
     */

    public StoreCreatedMessageBuilder plusSupplyChannels(
            Function<com.commercetools.api.models.channel.ChannelReferenceBuilder, com.commercetools.api.models.channel.ChannelReferenceBuilder> builder) {
        if (this.supplyChannels == null) {
            this.supplyChannels = new ArrayList<>();
        }
        this.supplyChannels
                .add(builder.apply(com.commercetools.api.models.channel.ChannelReferenceBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Supply Channels of the Store that was created.</p>
     * @return Builder
     */

    public StoreCreatedMessageBuilder withSupplyChannels(
            Function<com.commercetools.api.models.channel.ChannelReferenceBuilder, com.commercetools.api.models.channel.ChannelReferenceBuilder> builder) {
        this.supplyChannels = new ArrayList<>();
        this.supplyChannels
                .add(builder.apply(com.commercetools.api.models.channel.ChannelReferenceBuilder.of()).build());
        return this;
    }

    /**
     *  <p>ProductSelectionSettings of the Store that was created.</p>
     * @param productSelections
     * @return Builder
     */

    public StoreCreatedMessageBuilder productSelections(
            final com.commercetools.api.models.store.ProductSelectionSetting... productSelections) {
        this.productSelections = new ArrayList<>(Arrays.asList(productSelections));
        return this;
    }

    /**
     *  <p>ProductSelectionSettings of the Store that was created.</p>
     * @param productSelections
     * @return Builder
     */

    public StoreCreatedMessageBuilder productSelections(
            final java.util.List<com.commercetools.api.models.store.ProductSelectionSetting> productSelections) {
        this.productSelections = productSelections;
        return this;
    }

    /**
     *  <p>ProductSelectionSettings of the Store that was created.</p>
     * @param productSelections
     * @return Builder
     */

    public StoreCreatedMessageBuilder plusProductSelections(
            final com.commercetools.api.models.store.ProductSelectionSetting... productSelections) {
        if (this.productSelections == null) {
            this.productSelections = new ArrayList<>();
        }
        this.productSelections.addAll(Arrays.asList(productSelections));
        return this;
    }

    /**
     *  <p>ProductSelectionSettings of the Store that was created.</p>
     * @return Builder
     */

    public StoreCreatedMessageBuilder plusProductSelections(
            Function<com.commercetools.api.models.store.ProductSelectionSettingBuilder, com.commercetools.api.models.store.ProductSelectionSettingBuilder> builder) {
        if (this.productSelections == null) {
            this.productSelections = new ArrayList<>();
        }
        this.productSelections
                .add(builder.apply(com.commercetools.api.models.store.ProductSelectionSettingBuilder.of()).build());
        return this;
    }

    /**
     *  <p>ProductSelectionSettings of the Store that was created.</p>
     * @return Builder
     */

    public StoreCreatedMessageBuilder withProductSelections(
            Function<com.commercetools.api.models.store.ProductSelectionSettingBuilder, com.commercetools.api.models.store.ProductSelectionSettingBuilder> builder) {
        this.productSelections = new ArrayList<>();
        this.productSelections
                .add(builder.apply(com.commercetools.api.models.store.ProductSelectionSettingBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Custom Fields on the Store that was created.</p>
     * @return Builder
     */

    public StoreCreatedMessageBuilder custom(
            Function<com.commercetools.api.models.type.CustomFieldsBuilder, com.commercetools.api.models.type.CustomFieldsBuilder> builder) {
        this.custom = builder.apply(com.commercetools.api.models.type.CustomFieldsBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Custom Fields on the Store that was created.</p>
     * @param custom
     * @return Builder
     */

    public StoreCreatedMessageBuilder custom(@Nullable final com.commercetools.api.models.type.CustomFields custom) {
        this.custom = custom;
        return this;
    }

    public String getId() {
        return this.id;
    }

    public Long getVersion() {
        return this.version;
    }

    public java.time.ZonedDateTime getCreatedAt() {
        return this.createdAt;
    }

    public java.time.ZonedDateTime getLastModifiedAt() {
        return this.lastModifiedAt;
    }

    @Nullable
    public com.commercetools.api.models.common.LastModifiedBy getLastModifiedBy() {
        return this.lastModifiedBy;
    }

    @Nullable
    public com.commercetools.api.models.common.CreatedBy getCreatedBy() {
        return this.createdBy;
    }

    public Long getSequenceNumber() {
        return this.sequenceNumber;
    }

    public com.commercetools.api.models.common.Reference getResource() {
        return this.resource;
    }

    public Long getResourceVersion() {
        return this.resourceVersion;
    }

    @Nullable
    public com.commercetools.api.models.message.UserProvidedIdentifiers getResourceUserProvidedIdentifiers() {
        return this.resourceUserProvidedIdentifiers;
    }

    @Nullable
    public com.commercetools.api.models.common.LocalizedString getName() {
        return this.name;
    }

    @Nullable
    public java.util.List<String> getLanguages() {
        return this.languages;
    }

    @Nullable
    public java.util.List<com.commercetools.api.models.store_country.StoreCountry> getCountries() {
        return this.countries;
    }

    public java.util.List<com.commercetools.api.models.channel.ChannelReference> getDistributionChannels() {
        return this.distributionChannels;
    }

    public java.util.List<com.commercetools.api.models.channel.ChannelReference> getSupplyChannels() {
        return this.supplyChannels;
    }

    public java.util.List<com.commercetools.api.models.store.ProductSelectionSetting> getProductSelections() {
        return this.productSelections;
    }

    @Nullable
    public com.commercetools.api.models.type.CustomFields getCustom() {
        return this.custom;
    }

    public StoreCreatedMessage build() {
        Objects.requireNonNull(id, StoreCreatedMessage.class + ": id is missing");
        Objects.requireNonNull(version, StoreCreatedMessage.class + ": version is missing");
        Objects.requireNonNull(createdAt, StoreCreatedMessage.class + ": createdAt is missing");
        Objects.requireNonNull(lastModifiedAt, StoreCreatedMessage.class + ": lastModifiedAt is missing");
        Objects.requireNonNull(sequenceNumber, StoreCreatedMessage.class + ": sequenceNumber is missing");
        Objects.requireNonNull(resource, StoreCreatedMessage.class + ": resource is missing");
        Objects.requireNonNull(resourceVersion, StoreCreatedMessage.class + ": resourceVersion is missing");
        Objects.requireNonNull(distributionChannels, StoreCreatedMessage.class + ": distributionChannels is missing");
        Objects.requireNonNull(supplyChannels, StoreCreatedMessage.class + ": supplyChannels is missing");
        Objects.requireNonNull(productSelections, StoreCreatedMessage.class + ": productSelections is missing");
        return new StoreCreatedMessageImpl(id, version, createdAt, lastModifiedAt, lastModifiedBy, createdBy,
            sequenceNumber, resource, resourceVersion, resourceUserProvidedIdentifiers, name, languages, countries,
            distributionChannels, supplyChannels, productSelections, custom);
    }

    /**
     * builds StoreCreatedMessage without checking for non null required values
     */
    public StoreCreatedMessage buildUnchecked() {
        return new StoreCreatedMessageImpl(id, version, createdAt, lastModifiedAt, lastModifiedBy, createdBy,
            sequenceNumber, resource, resourceVersion, resourceUserProvidedIdentifiers, name, languages, countries,
            distributionChannels, supplyChannels, productSelections, custom);
    }

    public static StoreCreatedMessageBuilder of() {
        return new StoreCreatedMessageBuilder();
    }

    public static StoreCreatedMessageBuilder of(final StoreCreatedMessage template) {
        StoreCreatedMessageBuilder builder = new StoreCreatedMessageBuilder();
        builder.id = template.getId();
        builder.version = template.getVersion();
        builder.createdAt = template.getCreatedAt();
        builder.lastModifiedAt = template.getLastModifiedAt();
        builder.lastModifiedBy = template.getLastModifiedBy();
        builder.createdBy = template.getCreatedBy();
        builder.sequenceNumber = template.getSequenceNumber();
        builder.resource = template.getResource();
        builder.resourceVersion = template.getResourceVersion();
        builder.resourceUserProvidedIdentifiers = template.getResourceUserProvidedIdentifiers();
        builder.name = template.getName();
        builder.languages = template.getLanguages();
        builder.countries = template.getCountries();
        builder.distributionChannels = template.getDistributionChannels();
        builder.supplyChannels = template.getSupplyChannels();
        builder.productSelections = template.getProductSelections();
        builder.custom = template.getCustom();
        return builder;
    }

}
