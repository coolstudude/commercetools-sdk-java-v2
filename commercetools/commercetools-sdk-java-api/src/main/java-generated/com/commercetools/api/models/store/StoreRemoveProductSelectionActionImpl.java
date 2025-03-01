
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
 *  <p>This action has no effect if the given Product Selection is not in the Store.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StoreRemoveProductSelectionActionImpl implements StoreRemoveProductSelectionAction, ModelBase {

    private String action;

    private com.commercetools.api.models.product_selection.ProductSelectionResourceIdentifier productSelection;

    /**
     * create instance with all properties
     */
    @JsonCreator
    StoreRemoveProductSelectionActionImpl(
            @JsonProperty("productSelection") final com.commercetools.api.models.product_selection.ProductSelectionResourceIdentifier productSelection) {
        this.productSelection = productSelection;
        this.action = REMOVE_PRODUCT_SELECTION;
    }

    /**
     * create empty instance
     */
    public StoreRemoveProductSelectionActionImpl() {
        this.action = REMOVE_PRODUCT_SELECTION;
    }

    /**
     *
     */

    public String getAction() {
        return this.action;
    }

    /**
     *  <p>Value to remove. The removed Product Selection is made offline.</p>
     */

    public com.commercetools.api.models.product_selection.ProductSelectionResourceIdentifier getProductSelection() {
        return this.productSelection;
    }

    public void setProductSelection(
            final com.commercetools.api.models.product_selection.ProductSelectionResourceIdentifier productSelection) {
        this.productSelection = productSelection;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        StoreRemoveProductSelectionActionImpl that = (StoreRemoveProductSelectionActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(productSelection, that.productSelection)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(productSelection).toHashCode();
    }

}
