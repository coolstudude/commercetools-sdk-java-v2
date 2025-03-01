
package com.commercetools.api.models.order;

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
 * OrderSetStoreAction
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class OrderSetStoreActionImpl implements OrderSetStoreAction, ModelBase {

    private String action;

    private com.commercetools.api.models.store.StoreResourceIdentifier store;

    /**
     * create instance with all properties
     */
    @JsonCreator
    OrderSetStoreActionImpl(
            @JsonProperty("store") final com.commercetools.api.models.store.StoreResourceIdentifier store) {
        this.store = store;
        this.action = SET_STORE;
    }

    /**
     * create empty instance
     */
    public OrderSetStoreActionImpl() {
        this.action = SET_STORE;
    }

    /**
     *
     */

    public String getAction() {
        return this.action;
    }

    /**
     *  <p>ResourceIdentifier to a Store.</p>
     */

    public com.commercetools.api.models.store.StoreResourceIdentifier getStore() {
        return this.store;
    }

    public void setStore(final com.commercetools.api.models.store.StoreResourceIdentifier store) {
        this.store = store;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        OrderSetStoreActionImpl that = (OrderSetStoreActionImpl) o;

        return new EqualsBuilder().append(action, that.action).append(store, that.store).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(store).toHashCode();
    }

}
