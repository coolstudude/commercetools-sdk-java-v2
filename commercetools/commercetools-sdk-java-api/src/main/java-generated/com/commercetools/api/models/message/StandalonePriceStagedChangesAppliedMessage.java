
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.standalone_price.StagedStandalonePrice;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Generated after a successful Apply Staged Changes update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StandalonePriceStagedChangesAppliedMessage standalonePriceStagedChangesAppliedMessage = StandalonePriceStagedChangesAppliedMessage.builder()
 *             .id("{id}")
 *             .version(0.3)
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .sequenceNumber(0.3)
 *             .resource(resourceBuilder -> resourceBuilder)
 *             .resourceVersion(0.3)
 *             .stagedChanges(stagedChangesBuilder -> stagedChangesBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = StandalonePriceStagedChangesAppliedMessageImpl.class)
public interface StandalonePriceStagedChangesAppliedMessage extends Message {

    /**
     * discriminator value for StandalonePriceStagedChangesAppliedMessage
     */
    String STANDALONE_PRICE_STAGED_CHANGES_APPLIED = "StandalonePriceStagedChangesApplied";

    /**
     *  <p>Applied changes of the StandalonePrice after the Apply Staged Changes update action.</p>
     * @return stagedChanges
     */
    @NotNull
    @Valid
    @JsonProperty("stagedChanges")
    public StagedStandalonePrice getStagedChanges();

    /**
     *  <p>Applied changes of the StandalonePrice after the Apply Staged Changes update action.</p>
     * @param stagedChanges value to be set
     */

    public void setStagedChanges(final StagedStandalonePrice stagedChanges);

    /**
     * factory method
     * @return instance of StandalonePriceStagedChangesAppliedMessage
     */
    public static StandalonePriceStagedChangesAppliedMessage of() {
        return new StandalonePriceStagedChangesAppliedMessageImpl();
    }

    /**
     * factory method to create a shallow copy StandalonePriceStagedChangesAppliedMessage
     * @param template instance to be copied
     * @return copy instance
     */
    public static StandalonePriceStagedChangesAppliedMessage of(
            final StandalonePriceStagedChangesAppliedMessage template) {
        StandalonePriceStagedChangesAppliedMessageImpl instance = new StandalonePriceStagedChangesAppliedMessageImpl();
        instance.setId(template.getId());
        instance.setVersion(template.getVersion());
        instance.setCreatedAt(template.getCreatedAt());
        instance.setLastModifiedAt(template.getLastModifiedAt());
        instance.setLastModifiedBy(template.getLastModifiedBy());
        instance.setCreatedBy(template.getCreatedBy());
        instance.setSequenceNumber(template.getSequenceNumber());
        instance.setResource(template.getResource());
        instance.setResourceVersion(template.getResourceVersion());
        instance.setResourceUserProvidedIdentifiers(template.getResourceUserProvidedIdentifiers());
        instance.setStagedChanges(template.getStagedChanges());
        return instance;
    }

    /**
     * factory method to create a deep copy of StandalonePriceStagedChangesAppliedMessage
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static StandalonePriceStagedChangesAppliedMessage deepCopy(
            @Nullable final StandalonePriceStagedChangesAppliedMessage template) {
        if (template == null) {
            return null;
        }
        StandalonePriceStagedChangesAppliedMessageImpl instance = new StandalonePriceStagedChangesAppliedMessageImpl();
        instance.setId(template.getId());
        instance.setVersion(template.getVersion());
        instance.setCreatedAt(template.getCreatedAt());
        instance.setLastModifiedAt(template.getLastModifiedAt());
        instance.setLastModifiedBy(Optional.ofNullable(template.getLastModifiedBy())
                .map(com.commercetools.api.models.common.LastModifiedBy::deepCopy)
                .orElse(null));
        instance.setCreatedBy(Optional.ofNullable(template.getCreatedBy())
                .map(com.commercetools.api.models.common.CreatedBy::deepCopy)
                .orElse(null));
        instance.setSequenceNumber(template.getSequenceNumber());
        instance.setResource(Optional.ofNullable(template.getResource())
                .map(com.commercetools.api.models.common.Reference::deepCopy)
                .orElse(null));
        instance.setResourceVersion(template.getResourceVersion());
        instance.setResourceUserProvidedIdentifiers(Optional.ofNullable(template.getResourceUserProvidedIdentifiers())
                .map(com.commercetools.api.models.message.UserProvidedIdentifiers::deepCopy)
                .orElse(null));
        instance.setStagedChanges(Optional.ofNullable(template.getStagedChanges())
                .map(com.commercetools.api.models.standalone_price.StagedStandalonePrice::deepCopy)
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for StandalonePriceStagedChangesAppliedMessage
     * @return builder
     */
    public static StandalonePriceStagedChangesAppliedMessageBuilder builder() {
        return StandalonePriceStagedChangesAppliedMessageBuilder.of();
    }

    /**
     * create builder for StandalonePriceStagedChangesAppliedMessage instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StandalonePriceStagedChangesAppliedMessageBuilder builder(
            final StandalonePriceStagedChangesAppliedMessage template) {
        return StandalonePriceStagedChangesAppliedMessageBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withStandalonePriceStagedChangesAppliedMessage(
            Function<StandalonePriceStagedChangesAppliedMessage, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<StandalonePriceStagedChangesAppliedMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StandalonePriceStagedChangesAppliedMessage>() {
            @Override
            public String toString() {
                return "TypeReference<StandalonePriceStagedChangesAppliedMessage>";
            }
        };
    }
}
