
package com.commercetools.api.models.order_edit;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * OrderEditBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderEdit orderEdit = OrderEdit.builder()
 *             .id("{id}")
 *             .version(0.3)
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .resource(resourceBuilder -> resourceBuilder)
 *             .plusStagedActions(stagedActionsBuilder -> stagedActionsBuilder)
 *             .result(resultBuilder -> resultBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class OrderEditBuilder implements Builder<OrderEdit> {

    private String id;

    private Long version;

    private java.time.ZonedDateTime createdAt;

    private java.time.ZonedDateTime lastModifiedAt;

    @Nullable
    private com.commercetools.api.models.common.LastModifiedBy lastModifiedBy;

    @Nullable
    private com.commercetools.api.models.common.CreatedBy createdBy;

    @Nullable
    private String key;

    private com.commercetools.api.models.order.OrderReference resource;

    private java.util.List<com.commercetools.api.models.order.StagedOrderUpdateAction> stagedActions;

    @Nullable
    private com.commercetools.api.models.type.CustomFields custom;

    private com.commercetools.api.models.order_edit.OrderEditResult result;

    @Nullable
    private String comment;

    /**
     *  <p>Unique identifier of the OrderEdit.</p>
     * @param id value to be set
     * @return Builder
     */

    public OrderEditBuilder id(final String id) {
        this.id = id;
        return this;
    }

    /**
     *  <p>The current version of the OrderEdit.</p>
     * @param version value to be set
     * @return Builder
     */

    public OrderEditBuilder version(final Long version) {
        this.version = version;
        return this;
    }

    /**
     * set the value to the createdAt
     * @param createdAt value to be set
     * @return Builder
     */

    public OrderEditBuilder createdAt(final java.time.ZonedDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * set the value to the lastModifiedAt
     * @param lastModifiedAt value to be set
     * @return Builder
     */

    public OrderEditBuilder lastModifiedAt(final java.time.ZonedDateTime lastModifiedAt) {
        this.lastModifiedAt = lastModifiedAt;
        return this;
    }

    /**
     *  <p>Present on resources created after 1 February 2019 except for events not tracked.</p>
     * @param builder function to build the lastModifiedBy value
     * @return Builder
     */

    public OrderEditBuilder lastModifiedBy(
            Function<com.commercetools.api.models.common.LastModifiedByBuilder, com.commercetools.api.models.common.LastModifiedByBuilder> builder) {
        this.lastModifiedBy = builder.apply(com.commercetools.api.models.common.LastModifiedByBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Present on resources created after 1 February 2019 except for events not tracked.</p>
     * @param builder function to build the lastModifiedBy value
     * @return Builder
     */

    public OrderEditBuilder withLastModifiedBy(
            Function<com.commercetools.api.models.common.LastModifiedByBuilder, com.commercetools.api.models.common.LastModifiedBy> builder) {
        this.lastModifiedBy = builder.apply(com.commercetools.api.models.common.LastModifiedByBuilder.of());
        return this;
    }

    /**
     *  <p>Present on resources created after 1 February 2019 except for events not tracked.</p>
     * @param lastModifiedBy value to be set
     * @return Builder
     */

    public OrderEditBuilder lastModifiedBy(
            @Nullable final com.commercetools.api.models.common.LastModifiedBy lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
        return this;
    }

    /**
     *  <p>Present on resources created after 1 February 2019 except for events not tracked.</p>
     * @param builder function to build the createdBy value
     * @return Builder
     */

    public OrderEditBuilder createdBy(
            Function<com.commercetools.api.models.common.CreatedByBuilder, com.commercetools.api.models.common.CreatedByBuilder> builder) {
        this.createdBy = builder.apply(com.commercetools.api.models.common.CreatedByBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Present on resources created after 1 February 2019 except for events not tracked.</p>
     * @param builder function to build the createdBy value
     * @return Builder
     */

    public OrderEditBuilder withCreatedBy(
            Function<com.commercetools.api.models.common.CreatedByBuilder, com.commercetools.api.models.common.CreatedBy> builder) {
        this.createdBy = builder.apply(com.commercetools.api.models.common.CreatedByBuilder.of());
        return this;
    }

    /**
     *  <p>Present on resources created after 1 February 2019 except for events not tracked.</p>
     * @param createdBy value to be set
     * @return Builder
     */

    public OrderEditBuilder createdBy(@Nullable final com.commercetools.api.models.common.CreatedBy createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    /**
     *  <p>User-defined unique identifier of the OrderEdit.</p>
     * @param key value to be set
     * @return Builder
     */

    public OrderEditBuilder key(@Nullable final String key) {
        this.key = key;
        return this;
    }

    /**
     *  <p>The order to be updated with this edit.</p>
     * @param builder function to build the resource value
     * @return Builder
     */

    public OrderEditBuilder resource(
            Function<com.commercetools.api.models.order.OrderReferenceBuilder, com.commercetools.api.models.order.OrderReferenceBuilder> builder) {
        this.resource = builder.apply(com.commercetools.api.models.order.OrderReferenceBuilder.of()).build();
        return this;
    }

    /**
     *  <p>The order to be updated with this edit.</p>
     * @param builder function to build the resource value
     * @return Builder
     */

    public OrderEditBuilder withResource(
            Function<com.commercetools.api.models.order.OrderReferenceBuilder, com.commercetools.api.models.order.OrderReference> builder) {
        this.resource = builder.apply(com.commercetools.api.models.order.OrderReferenceBuilder.of());
        return this;
    }

    /**
     *  <p>The order to be updated with this edit.</p>
     * @param resource value to be set
     * @return Builder
     */

    public OrderEditBuilder resource(final com.commercetools.api.models.order.OrderReference resource) {
        this.resource = resource;
        return this;
    }

    /**
     *  <p>The actions to apply to the Order. Cannot be updated after the edit has been applied.</p>
     * @param stagedActions value to be set
     * @return Builder
     */

    public OrderEditBuilder stagedActions(
            final com.commercetools.api.models.order.StagedOrderUpdateAction... stagedActions) {
        this.stagedActions = new ArrayList<>(Arrays.asList(stagedActions));
        return this;
    }

    /**
     *  <p>The actions to apply to the Order. Cannot be updated after the edit has been applied.</p>
     * @param stagedActions value to be set
     * @return Builder
     */

    public OrderEditBuilder stagedActions(
            final java.util.List<com.commercetools.api.models.order.StagedOrderUpdateAction> stagedActions) {
        this.stagedActions = stagedActions;
        return this;
    }

    /**
     *  <p>The actions to apply to the Order. Cannot be updated after the edit has been applied.</p>
     * @param stagedActions value to be set
     * @return Builder
     */

    public OrderEditBuilder plusStagedActions(
            final com.commercetools.api.models.order.StagedOrderUpdateAction... stagedActions) {
        if (this.stagedActions == null) {
            this.stagedActions = new ArrayList<>();
        }
        this.stagedActions.addAll(Arrays.asList(stagedActions));
        return this;
    }

    /**
     *  <p>The actions to apply to the Order. Cannot be updated after the edit has been applied.</p>
     * @param builder function to build the stagedActions value
     * @return Builder
     */

    public OrderEditBuilder plusStagedActions(
            Function<com.commercetools.api.models.order.StagedOrderUpdateActionBuilder, Builder<? extends com.commercetools.api.models.order.StagedOrderUpdateAction>> builder) {
        if (this.stagedActions == null) {
            this.stagedActions = new ArrayList<>();
        }
        this.stagedActions
                .add(builder.apply(com.commercetools.api.models.order.StagedOrderUpdateActionBuilder.of()).build());
        return this;
    }

    /**
     *  <p>The actions to apply to the Order. Cannot be updated after the edit has been applied.</p>
     * @param builder function to build the stagedActions value
     * @return Builder
     */

    public OrderEditBuilder withStagedActions(
            Function<com.commercetools.api.models.order.StagedOrderUpdateActionBuilder, Builder<? extends com.commercetools.api.models.order.StagedOrderUpdateAction>> builder) {
        this.stagedActions = new ArrayList<>();
        this.stagedActions
                .add(builder.apply(com.commercetools.api.models.order.StagedOrderUpdateActionBuilder.of()).build());
        return this;
    }

    /**
     * set the value to the custom using the builder function
     * @param builder function to build the custom value
     * @return Builder
     */

    public OrderEditBuilder custom(
            Function<com.commercetools.api.models.type.CustomFieldsBuilder, com.commercetools.api.models.type.CustomFieldsBuilder> builder) {
        this.custom = builder.apply(com.commercetools.api.models.type.CustomFieldsBuilder.of()).build();
        return this;
    }

    /**
     * set the value to the custom using the builder function
     * @param builder function to build the custom value
     * @return Builder
     */

    public OrderEditBuilder withCustom(
            Function<com.commercetools.api.models.type.CustomFieldsBuilder, com.commercetools.api.models.type.CustomFields> builder) {
        this.custom = builder.apply(com.commercetools.api.models.type.CustomFieldsBuilder.of());
        return this;
    }

    /**
     * set the value to the custom
     * @param custom value to be set
     * @return Builder
     */

    public OrderEditBuilder custom(@Nullable final com.commercetools.api.models.type.CustomFields custom) {
        this.custom = custom;
        return this;
    }

    /**
     *  <p>Contains a preview of the changes in case of unapplied edit. For applied edits, it contains the summary of the changes.</p>
     * @param result value to be set
     * @return Builder
     */

    public OrderEditBuilder result(final com.commercetools.api.models.order_edit.OrderEditResult result) {
        this.result = result;
        return this;
    }

    /**
     *  <p>Contains a preview of the changes in case of unapplied edit. For applied edits, it contains the summary of the changes.</p>
     * @param builder function to build the result value
     * @return Builder
     */

    public OrderEditBuilder result(
            Function<com.commercetools.api.models.order_edit.OrderEditResultBuilder, Builder<? extends com.commercetools.api.models.order_edit.OrderEditResult>> builder) {
        this.result = builder.apply(com.commercetools.api.models.order_edit.OrderEditResultBuilder.of()).build();
        return this;
    }

    /**
     *  <p>This field can be used to add textual information regarding the edit.</p>
     * @param comment value to be set
     * @return Builder
     */

    public OrderEditBuilder comment(@Nullable final String comment) {
        this.comment = comment;
        return this;
    }

    /**
     *  <p>Unique identifier of the OrderEdit.</p>
     * @return id
     */

    public String getId() {
        return this.id;
    }

    /**
     *  <p>The current version of the OrderEdit.</p>
     * @return version
     */

    public Long getVersion() {
        return this.version;
    }

    /**
     * value of createdAt}
     * @return createdAt
     */

    public java.time.ZonedDateTime getCreatedAt() {
        return this.createdAt;
    }

    /**
     * value of lastModifiedAt}
     * @return lastModifiedAt
     */

    public java.time.ZonedDateTime getLastModifiedAt() {
        return this.lastModifiedAt;
    }

    /**
     *  <p>Present on resources created after 1 February 2019 except for events not tracked.</p>
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
     *  <p>User-defined unique identifier of the OrderEdit.</p>
     * @return key
     */

    @Nullable
    public String getKey() {
        return this.key;
    }

    /**
     *  <p>The order to be updated with this edit.</p>
     * @return resource
     */

    public com.commercetools.api.models.order.OrderReference getResource() {
        return this.resource;
    }

    /**
     *  <p>The actions to apply to the Order. Cannot be updated after the edit has been applied.</p>
     * @return stagedActions
     */

    public java.util.List<com.commercetools.api.models.order.StagedOrderUpdateAction> getStagedActions() {
        return this.stagedActions;
    }

    /**
     * value of custom}
     * @return custom
     */

    @Nullable
    public com.commercetools.api.models.type.CustomFields getCustom() {
        return this.custom;
    }

    /**
     *  <p>Contains a preview of the changes in case of unapplied edit. For applied edits, it contains the summary of the changes.</p>
     * @return result
     */

    public com.commercetools.api.models.order_edit.OrderEditResult getResult() {
        return this.result;
    }

    /**
     *  <p>This field can be used to add textual information regarding the edit.</p>
     * @return comment
     */

    @Nullable
    public String getComment() {
        return this.comment;
    }

    /**
     * builds OrderEdit with checking for non-null required values
     * @return OrderEdit
     */
    public OrderEdit build() {
        Objects.requireNonNull(id, OrderEdit.class + ": id is missing");
        Objects.requireNonNull(version, OrderEdit.class + ": version is missing");
        Objects.requireNonNull(createdAt, OrderEdit.class + ": createdAt is missing");
        Objects.requireNonNull(lastModifiedAt, OrderEdit.class + ": lastModifiedAt is missing");
        Objects.requireNonNull(resource, OrderEdit.class + ": resource is missing");
        Objects.requireNonNull(stagedActions, OrderEdit.class + ": stagedActions is missing");
        Objects.requireNonNull(result, OrderEdit.class + ": result is missing");
        return new OrderEditImpl(id, version, createdAt, lastModifiedAt, lastModifiedBy, createdBy, key, resource,
            stagedActions, custom, result, comment);
    }

    /**
     * builds OrderEdit without checking for non-null required values
     * @return OrderEdit
     */
    public OrderEdit buildUnchecked() {
        return new OrderEditImpl(id, version, createdAt, lastModifiedAt, lastModifiedBy, createdBy, key, resource,
            stagedActions, custom, result, comment);
    }

    /**
     * factory method for an instance of OrderEditBuilder
     * @return builder
     */
    public static OrderEditBuilder of() {
        return new OrderEditBuilder();
    }

    /**
     * create builder for OrderEdit instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static OrderEditBuilder of(final OrderEdit template) {
        OrderEditBuilder builder = new OrderEditBuilder();
        builder.id = template.getId();
        builder.version = template.getVersion();
        builder.createdAt = template.getCreatedAt();
        builder.lastModifiedAt = template.getLastModifiedAt();
        builder.lastModifiedBy = template.getLastModifiedBy();
        builder.createdBy = template.getCreatedBy();
        builder.key = template.getKey();
        builder.resource = template.getResource();
        builder.stagedActions = template.getStagedActions();
        builder.custom = template.getCustom();
        builder.result = template.getResult();
        builder.comment = template.getComment();
        return builder;
    }

}
