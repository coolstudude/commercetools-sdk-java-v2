
package com.commercetools.api.models.state;

import com.commercetools.api.models.Referencable;
import com.commercetools.api.models.ResourceIdentifiable;
import com.commercetools.api.models.common.ReferenceTypeId;

public interface StateMixin extends Referencable<State>, ResourceIdentifiable<State> {
    @Override
    public default StateResourceIdentifier toResourceIdentifier() {
        return StateResourceIdentifier.builder().id(getId()).build();
    }

    @Override
    public default StateReference toReference() {
        return StateReference.builder().id(getId()).build();
    }

    public static ReferenceTypeId referenceTypeId() {
        return ReferenceTypeId.STATE;
    }
}
