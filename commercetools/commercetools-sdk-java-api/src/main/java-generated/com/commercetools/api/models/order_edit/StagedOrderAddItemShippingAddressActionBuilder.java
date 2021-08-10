
package com.commercetools.api.models.order_edit;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class StagedOrderAddItemShippingAddressActionBuilder
        implements Builder<StagedOrderAddItemShippingAddressAction> {

    private com.commercetools.api.models.common.BaseAddress address;

    public StagedOrderAddItemShippingAddressActionBuilder address(
            final com.commercetools.api.models.common.BaseAddress address) {
        this.address = address;
        return this;
    }

    public com.commercetools.api.models.common.BaseAddress getAddress() {
        return this.address;
    }

    public StagedOrderAddItemShippingAddressAction build() {
        Objects.requireNonNull(address);
        return new StagedOrderAddItemShippingAddressActionImpl(address);
    }

    /**
     * builds StagedOrderAddItemShippingAddressAction without checking for non null required values
     */
    public StagedOrderAddItemShippingAddressAction buildUnchecked() {
        return new StagedOrderAddItemShippingAddressActionImpl(address);
    }

    public static StagedOrderAddItemShippingAddressActionBuilder of() {
        return new StagedOrderAddItemShippingAddressActionBuilder();
    }

    public static StagedOrderAddItemShippingAddressActionBuilder of(
            final StagedOrderAddItemShippingAddressAction template) {
        StagedOrderAddItemShippingAddressActionBuilder builder = new StagedOrderAddItemShippingAddressActionBuilder();
        builder.address = template.getAddress();
        return builder;
    }

}
