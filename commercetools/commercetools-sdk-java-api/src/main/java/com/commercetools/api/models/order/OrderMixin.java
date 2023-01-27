
package com.commercetools.api.models.order;

import com.commercetools.api.models.Referencable;
import com.commercetools.api.models.ResourceIdentifiable;
import com.commercetools.api.models.common.ReferenceTypeId;

public interface OrderMixin extends Referencable<Order>, ResourceIdentifiable<Order> {
    @Override
    public default OrderResourceIdentifier toResourceIdentifier() {
        return OrderResourceIdentifier.builder().id(getId()).build();
    }

    @Override
    public default OrderReference toReference() {
        return OrderReference.builder().id(getId()).build();
    }

    public static ReferenceTypeId referenceTypeId() {
        return ReferenceTypeId.ORDER;
    }
}
