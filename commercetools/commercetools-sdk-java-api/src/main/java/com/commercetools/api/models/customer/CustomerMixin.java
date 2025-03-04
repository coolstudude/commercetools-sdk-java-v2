
package com.commercetools.api.models.customer;

import com.commercetools.api.models.Referencable;
import com.commercetools.api.models.ResourceIdentifiable;

public interface CustomerMixin extends Referencable<Customer>, ResourceIdentifiable<Customer> {
    @Override
    public default CustomerResourceIdentifier toResourceIdentifier() {
        return CustomerResourceIdentifier.builder().id(getId()).build();
    }

    @Override
    public default CustomerReference toReference() {
        return CustomerReference.builder().id(getId()).build();
    }
}
