
package com.commercetools.api.models.message;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * LineItemStateTransitionMessageBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     LineItemStateTransitionMessage lineItemStateTransitionMessage = LineItemStateTransitionMessage.builder()
 *             .id("{id}")
 *             .version(0.3)
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .sequenceNumber(0.3)
 *             .resource(resourceBuilder -> resourceBuilder)
 *             .resourceVersion(0.3)
 *             .lineItemId("{lineItemId}")
 *             .transitionDate(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .quantity(0.3)
 *             .fromState(fromStateBuilder -> fromStateBuilder)
 *             .toState(toStateBuilder -> toStateBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class LineItemStateTransitionMessageBuilder implements Builder<LineItemStateTransitionMessage> {

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

    private String lineItemId;

    private java.time.ZonedDateTime transitionDate;

    private Long quantity;

    private com.commercetools.api.models.state.StateReference fromState;

    private com.commercetools.api.models.state.StateReference toState;

    /**
     *  <p>Unique identifier of the Message. Can be used to track which Messages have been processed.</p>
     * @param id value to be set
     * @return Builder
     */

    public LineItemStateTransitionMessageBuilder id(final String id) {
        this.id = id;
        return this;
    }

    /**
     *  <p>Version of a resource. In case of Messages, this is always <code>1</code>.</p>
     * @param version value to be set
     * @return Builder
     */

    public LineItemStateTransitionMessageBuilder version(final Long version) {
        this.version = version;
        return this;
    }

    /**
     *  <p>Date and time (UTC) the Message was generated.</p>
     * @param createdAt value to be set
     * @return Builder
     */

    public LineItemStateTransitionMessageBuilder createdAt(final java.time.ZonedDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     *  <p>Value of <code>createdAt</code>.</p>
     * @param lastModifiedAt value to be set
     * @return Builder
     */

    public LineItemStateTransitionMessageBuilder lastModifiedAt(final java.time.ZonedDateTime lastModifiedAt) {
        this.lastModifiedAt = lastModifiedAt;
        return this;
    }

    /**
     *  <p>Value of <code>createdBy</code>.</p>
     * @param builder function to build the lastModifiedBy value
     * @return Builder
     */

    public LineItemStateTransitionMessageBuilder lastModifiedBy(
            Function<com.commercetools.api.models.common.LastModifiedByBuilder, com.commercetools.api.models.common.LastModifiedByBuilder> builder) {
        this.lastModifiedBy = builder.apply(com.commercetools.api.models.common.LastModifiedByBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Value of <code>createdBy</code>.</p>
     * @param builder function to build the lastModifiedBy value
     * @return Builder
     */

    public LineItemStateTransitionMessageBuilder withLastModifiedBy(
            Function<com.commercetools.api.models.common.LastModifiedByBuilder, com.commercetools.api.models.common.LastModifiedBy> builder) {
        this.lastModifiedBy = builder.apply(com.commercetools.api.models.common.LastModifiedByBuilder.of());
        return this;
    }

    /**
     *  <p>Value of <code>createdBy</code>.</p>
     * @param lastModifiedBy value to be set
     * @return Builder
     */

    public LineItemStateTransitionMessageBuilder lastModifiedBy(
            @Nullable final com.commercetools.api.models.common.LastModifiedBy lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
        return this;
    }

    /**
     *  <p>Present on resources created after 1 February 2019 except for events not tracked.</p>
     * @param builder function to build the createdBy value
     * @return Builder
     */

    public LineItemStateTransitionMessageBuilder createdBy(
            Function<com.commercetools.api.models.common.CreatedByBuilder, com.commercetools.api.models.common.CreatedByBuilder> builder) {
        this.createdBy = builder.apply(com.commercetools.api.models.common.CreatedByBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Present on resources created after 1 February 2019 except for events not tracked.</p>
     * @param builder function to build the createdBy value
     * @return Builder
     */

    public LineItemStateTransitionMessageBuilder withCreatedBy(
            Function<com.commercetools.api.models.common.CreatedByBuilder, com.commercetools.api.models.common.CreatedBy> builder) {
        this.createdBy = builder.apply(com.commercetools.api.models.common.CreatedByBuilder.of());
        return this;
    }

    /**
     *  <p>Present on resources created after 1 February 2019 except for events not tracked.</p>
     * @param createdBy value to be set
     * @return Builder
     */

    public LineItemStateTransitionMessageBuilder createdBy(
            @Nullable final com.commercetools.api.models.common.CreatedBy createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    /**
     *  <p>Message number in relation to other Messages for a given resource. The <code>sequenceNumber</code> of the next Message for the resource is the successor of the <code>sequenceNumber</code> of the current Message. Meaning, the <code>sequenceNumber</code> of the next Message equals the <code>sequenceNumber</code> of the current Message + 1. <code>sequenceNumber</code> can be used to ensure that Messages are processed in the correct order for a particular resource.</p>
     * @param sequenceNumber value to be set
     * @return Builder
     */

    public LineItemStateTransitionMessageBuilder sequenceNumber(final Long sequenceNumber) {
        this.sequenceNumber = sequenceNumber;
        return this;
    }

    /**
     *  <p>Reference to the resource on which the change or action was performed.</p>
     * @param resource value to be set
     * @return Builder
     */

    public LineItemStateTransitionMessageBuilder resource(
            final com.commercetools.api.models.common.Reference resource) {
        this.resource = resource;
        return this;
    }

    /**
     *  <p>Reference to the resource on which the change or action was performed.</p>
     * @param builder function to build the resource value
     * @return Builder
     */

    public LineItemStateTransitionMessageBuilder resource(
            Function<com.commercetools.api.models.common.ReferenceBuilder, Builder<? extends com.commercetools.api.models.common.Reference>> builder) {
        this.resource = builder.apply(com.commercetools.api.models.common.ReferenceBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Version of the resource on which the change or action was performed.</p>
     * @param resourceVersion value to be set
     * @return Builder
     */

    public LineItemStateTransitionMessageBuilder resourceVersion(final Long resourceVersion) {
        this.resourceVersion = resourceVersion;
        return this;
    }

    /**
     *  <p>User-provided identifiers of the resource, such as <code>key</code> or <code>externalId</code>. Only present if the resource has such identifiers.</p>
     * @param builder function to build the resourceUserProvidedIdentifiers value
     * @return Builder
     */

    public LineItemStateTransitionMessageBuilder resourceUserProvidedIdentifiers(
            Function<com.commercetools.api.models.message.UserProvidedIdentifiersBuilder, com.commercetools.api.models.message.UserProvidedIdentifiersBuilder> builder) {
        this.resourceUserProvidedIdentifiers = builder
                .apply(com.commercetools.api.models.message.UserProvidedIdentifiersBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>User-provided identifiers of the resource, such as <code>key</code> or <code>externalId</code>. Only present if the resource has such identifiers.</p>
     * @param builder function to build the resourceUserProvidedIdentifiers value
     * @return Builder
     */

    public LineItemStateTransitionMessageBuilder withResourceUserProvidedIdentifiers(
            Function<com.commercetools.api.models.message.UserProvidedIdentifiersBuilder, com.commercetools.api.models.message.UserProvidedIdentifiers> builder) {
        this.resourceUserProvidedIdentifiers = builder
                .apply(com.commercetools.api.models.message.UserProvidedIdentifiersBuilder.of());
        return this;
    }

    /**
     *  <p>User-provided identifiers of the resource, such as <code>key</code> or <code>externalId</code>. Only present if the resource has such identifiers.</p>
     * @param resourceUserProvidedIdentifiers value to be set
     * @return Builder
     */

    public LineItemStateTransitionMessageBuilder resourceUserProvidedIdentifiers(
            @Nullable final com.commercetools.api.models.message.UserProvidedIdentifiers resourceUserProvidedIdentifiers) {
        this.resourceUserProvidedIdentifiers = resourceUserProvidedIdentifiers;
        return this;
    }

    /**
     *  <p>Unique identifier of the Line Item.</p>
     * @param lineItemId value to be set
     * @return Builder
     */

    public LineItemStateTransitionMessageBuilder lineItemId(final String lineItemId) {
        this.lineItemId = lineItemId;
        return this;
    }

    /**
     *  <p>Date and time (UTC) when the transition of the Line Item State was performed.</p>
     * @param transitionDate value to be set
     * @return Builder
     */

    public LineItemStateTransitionMessageBuilder transitionDate(final java.time.ZonedDateTime transitionDate) {
        this.transitionDate = transitionDate;
        return this;
    }

    /**
     *  <p>Number of Line Items for which the State was transitioned.</p>
     * @param quantity value to be set
     * @return Builder
     */

    public LineItemStateTransitionMessageBuilder quantity(final Long quantity) {
        this.quantity = quantity;
        return this;
    }

    /**
     *  <p>State the Line Item was transitioned from.</p>
     * @param builder function to build the fromState value
     * @return Builder
     */

    public LineItemStateTransitionMessageBuilder fromState(
            Function<com.commercetools.api.models.state.StateReferenceBuilder, com.commercetools.api.models.state.StateReferenceBuilder> builder) {
        this.fromState = builder.apply(com.commercetools.api.models.state.StateReferenceBuilder.of()).build();
        return this;
    }

    /**
     *  <p>State the Line Item was transitioned from.</p>
     * @param builder function to build the fromState value
     * @return Builder
     */

    public LineItemStateTransitionMessageBuilder withFromState(
            Function<com.commercetools.api.models.state.StateReferenceBuilder, com.commercetools.api.models.state.StateReference> builder) {
        this.fromState = builder.apply(com.commercetools.api.models.state.StateReferenceBuilder.of());
        return this;
    }

    /**
     *  <p>State the Line Item was transitioned from.</p>
     * @param fromState value to be set
     * @return Builder
     */

    public LineItemStateTransitionMessageBuilder fromState(
            final com.commercetools.api.models.state.StateReference fromState) {
        this.fromState = fromState;
        return this;
    }

    /**
     *  <p>State the Line Item was transitioned to.</p>
     * @param builder function to build the toState value
     * @return Builder
     */

    public LineItemStateTransitionMessageBuilder toState(
            Function<com.commercetools.api.models.state.StateReferenceBuilder, com.commercetools.api.models.state.StateReferenceBuilder> builder) {
        this.toState = builder.apply(com.commercetools.api.models.state.StateReferenceBuilder.of()).build();
        return this;
    }

    /**
     *  <p>State the Line Item was transitioned to.</p>
     * @param builder function to build the toState value
     * @return Builder
     */

    public LineItemStateTransitionMessageBuilder withToState(
            Function<com.commercetools.api.models.state.StateReferenceBuilder, com.commercetools.api.models.state.StateReference> builder) {
        this.toState = builder.apply(com.commercetools.api.models.state.StateReferenceBuilder.of());
        return this;
    }

    /**
     *  <p>State the Line Item was transitioned to.</p>
     * @param toState value to be set
     * @return Builder
     */

    public LineItemStateTransitionMessageBuilder toState(
            final com.commercetools.api.models.state.StateReference toState) {
        this.toState = toState;
        return this;
    }

    /**
     *  <p>Unique identifier of the Message. Can be used to track which Messages have been processed.</p>
     * @return id
     */

    public String getId() {
        return this.id;
    }

    /**
     *  <p>Version of a resource. In case of Messages, this is always <code>1</code>.</p>
     * @return version
     */

    public Long getVersion() {
        return this.version;
    }

    /**
     *  <p>Date and time (UTC) the Message was generated.</p>
     * @return createdAt
     */

    public java.time.ZonedDateTime getCreatedAt() {
        return this.createdAt;
    }

    /**
     *  <p>Value of <code>createdAt</code>.</p>
     * @return lastModifiedAt
     */

    public java.time.ZonedDateTime getLastModifiedAt() {
        return this.lastModifiedAt;
    }

    /**
     *  <p>Value of <code>createdBy</code>.</p>
     * @return lastModifiedBy
     */

    @Nullable
    public com.commercetools.api.models.common.LastModifiedBy getLastModifiedBy() {
        return this.lastModifiedBy;
    }

    /**
     *  <p>Present on resources created after 1 February 2019 except for events not tracked.</p>
     * @return createdBy
     */

    @Nullable
    public com.commercetools.api.models.common.CreatedBy getCreatedBy() {
        return this.createdBy;
    }

    /**
     *  <p>Message number in relation to other Messages for a given resource. The <code>sequenceNumber</code> of the next Message for the resource is the successor of the <code>sequenceNumber</code> of the current Message. Meaning, the <code>sequenceNumber</code> of the next Message equals the <code>sequenceNumber</code> of the current Message + 1. <code>sequenceNumber</code> can be used to ensure that Messages are processed in the correct order for a particular resource.</p>
     * @return sequenceNumber
     */

    public Long getSequenceNumber() {
        return this.sequenceNumber;
    }

    /**
     *  <p>Reference to the resource on which the change or action was performed.</p>
     * @return resource
     */

    public com.commercetools.api.models.common.Reference getResource() {
        return this.resource;
    }

    /**
     *  <p>Version of the resource on which the change or action was performed.</p>
     * @return resourceVersion
     */

    public Long getResourceVersion() {
        return this.resourceVersion;
    }

    /**
     *  <p>User-provided identifiers of the resource, such as <code>key</code> or <code>externalId</code>. Only present if the resource has such identifiers.</p>
     * @return resourceUserProvidedIdentifiers
     */

    @Nullable
    public com.commercetools.api.models.message.UserProvidedIdentifiers getResourceUserProvidedIdentifiers() {
        return this.resourceUserProvidedIdentifiers;
    }

    /**
     *  <p>Unique identifier of the Line Item.</p>
     * @return lineItemId
     */

    public String getLineItemId() {
        return this.lineItemId;
    }

    /**
     *  <p>Date and time (UTC) when the transition of the Line Item State was performed.</p>
     * @return transitionDate
     */

    public java.time.ZonedDateTime getTransitionDate() {
        return this.transitionDate;
    }

    /**
     *  <p>Number of Line Items for which the State was transitioned.</p>
     * @return quantity
     */

    public Long getQuantity() {
        return this.quantity;
    }

    /**
     *  <p>State the Line Item was transitioned from.</p>
     * @return fromState
     */

    public com.commercetools.api.models.state.StateReference getFromState() {
        return this.fromState;
    }

    /**
     *  <p>State the Line Item was transitioned to.</p>
     * @return toState
     */

    public com.commercetools.api.models.state.StateReference getToState() {
        return this.toState;
    }

    /**
     * builds LineItemStateTransitionMessage with checking for non-null required values
     * @return LineItemStateTransitionMessage
     */
    public LineItemStateTransitionMessage build() {
        Objects.requireNonNull(id, LineItemStateTransitionMessage.class + ": id is missing");
        Objects.requireNonNull(version, LineItemStateTransitionMessage.class + ": version is missing");
        Objects.requireNonNull(createdAt, LineItemStateTransitionMessage.class + ": createdAt is missing");
        Objects.requireNonNull(lastModifiedAt, LineItemStateTransitionMessage.class + ": lastModifiedAt is missing");
        Objects.requireNonNull(sequenceNumber, LineItemStateTransitionMessage.class + ": sequenceNumber is missing");
        Objects.requireNonNull(resource, LineItemStateTransitionMessage.class + ": resource is missing");
        Objects.requireNonNull(resourceVersion, LineItemStateTransitionMessage.class + ": resourceVersion is missing");
        Objects.requireNonNull(lineItemId, LineItemStateTransitionMessage.class + ": lineItemId is missing");
        Objects.requireNonNull(transitionDate, LineItemStateTransitionMessage.class + ": transitionDate is missing");
        Objects.requireNonNull(quantity, LineItemStateTransitionMessage.class + ": quantity is missing");
        Objects.requireNonNull(fromState, LineItemStateTransitionMessage.class + ": fromState is missing");
        Objects.requireNonNull(toState, LineItemStateTransitionMessage.class + ": toState is missing");
        return new LineItemStateTransitionMessageImpl(id, version, createdAt, lastModifiedAt, lastModifiedBy, createdBy,
            sequenceNumber, resource, resourceVersion, resourceUserProvidedIdentifiers, lineItemId, transitionDate,
            quantity, fromState, toState);
    }

    /**
     * builds LineItemStateTransitionMessage without checking for non-null required values
     * @return LineItemStateTransitionMessage
     */
    public LineItemStateTransitionMessage buildUnchecked() {
        return new LineItemStateTransitionMessageImpl(id, version, createdAt, lastModifiedAt, lastModifiedBy, createdBy,
            sequenceNumber, resource, resourceVersion, resourceUserProvidedIdentifiers, lineItemId, transitionDate,
            quantity, fromState, toState);
    }

    /**
     * factory method for an instance of LineItemStateTransitionMessageBuilder
     * @return builder
     */
    public static LineItemStateTransitionMessageBuilder of() {
        return new LineItemStateTransitionMessageBuilder();
    }

    /**
     * create builder for LineItemStateTransitionMessage instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static LineItemStateTransitionMessageBuilder of(final LineItemStateTransitionMessage template) {
        LineItemStateTransitionMessageBuilder builder = new LineItemStateTransitionMessageBuilder();
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
        builder.lineItemId = template.getLineItemId();
        builder.transitionDate = template.getTransitionDate();
        builder.quantity = template.getQuantity();
        builder.fromState = template.getFromState();
        builder.toState = template.getToState();
        return builder;
    }

}
