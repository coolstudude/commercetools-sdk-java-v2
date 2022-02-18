
package com.commercetools.api.models.order_edit;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class StagedOrderSetDeliveryCustomTypeActionBuilder implements Builder<StagedOrderSetDeliveryCustomTypeAction> {

    private String deliveryId;

    @Nullable
    private com.commercetools.api.models.type.TypeResourceIdentifier type;

    @Nullable
    private java.lang.Object fields;

    public StagedOrderSetDeliveryCustomTypeActionBuilder deliveryId(final String deliveryId) {
        this.deliveryId = deliveryId;
        return this;
    }

    public StagedOrderSetDeliveryCustomTypeActionBuilder type(
            Function<com.commercetools.api.models.type.TypeResourceIdentifierBuilder, com.commercetools.api.models.type.TypeResourceIdentifierBuilder> builder) {
        this.type = builder.apply(com.commercetools.api.models.type.TypeResourceIdentifierBuilder.of()).build();
        return this;
    }

    public StagedOrderSetDeliveryCustomTypeActionBuilder type(
            @Nullable final com.commercetools.api.models.type.TypeResourceIdentifier type) {
        this.type = type;
        return this;
    }

    public StagedOrderSetDeliveryCustomTypeActionBuilder fields(@Nullable final java.lang.Object fields) {
        this.fields = fields;
        return this;
    }

    public String getDeliveryId() {
        return this.deliveryId;
    }

    @Nullable
    public com.commercetools.api.models.type.TypeResourceIdentifier getType() {
        return this.type;
    }

    @Nullable
    public java.lang.Object getFields() {
        return this.fields;
    }

    public StagedOrderSetDeliveryCustomTypeAction build() {
        Objects.requireNonNull(deliveryId, StagedOrderSetDeliveryCustomTypeAction.class + ": deliveryId is missing");
        return new StagedOrderSetDeliveryCustomTypeActionImpl(deliveryId, type, fields);
    }

    /**
     * builds StagedOrderSetDeliveryCustomTypeAction without checking for non null required values
     */
    public StagedOrderSetDeliveryCustomTypeAction buildUnchecked() {
        return new StagedOrderSetDeliveryCustomTypeActionImpl(deliveryId, type, fields);
    }

    public static StagedOrderSetDeliveryCustomTypeActionBuilder of() {
        return new StagedOrderSetDeliveryCustomTypeActionBuilder();
    }

    public static StagedOrderSetDeliveryCustomTypeActionBuilder of(
            final StagedOrderSetDeliveryCustomTypeAction template) {
        StagedOrderSetDeliveryCustomTypeActionBuilder builder = new StagedOrderSetDeliveryCustomTypeActionBuilder();
        builder.deliveryId = template.getDeliveryId();
        builder.type = template.getType();
        builder.fields = template.getFields();
        return builder;
    }

}
