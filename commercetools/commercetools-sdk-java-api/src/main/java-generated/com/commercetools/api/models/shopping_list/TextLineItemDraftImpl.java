
package com.commercetools.api.models.shopping_list;

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
 * TextLineItemDraft
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class TextLineItemDraftImpl implements TextLineItemDraft, ModelBase {

    private java.time.ZonedDateTime addedAt;

    private com.commercetools.api.models.type.CustomFieldsDraft custom;

    private com.commercetools.api.models.common.LocalizedString description;

    private com.commercetools.api.models.common.LocalizedString name;

    private Long quantity;

    /**
     * create instance with all properties
     */
    @JsonCreator
    TextLineItemDraftImpl(@JsonProperty("addedAt") final java.time.ZonedDateTime addedAt,
            @JsonProperty("custom") final com.commercetools.api.models.type.CustomFieldsDraft custom,
            @JsonProperty("description") final com.commercetools.api.models.common.LocalizedString description,
            @JsonProperty("name") final com.commercetools.api.models.common.LocalizedString name,
            @JsonProperty("quantity") final Long quantity) {
        this.addedAt = addedAt;
        this.custom = custom;
        this.description = description;
        this.name = name;
        this.quantity = quantity;
    }

    /**
     * create empty instance
     */
    public TextLineItemDraftImpl() {
    }

    /**
     *  <p>Date and time the TextLineItem is added to the ShoppingList. If not set, the current date and time (UTC) is used.</p>
     */

    public java.time.ZonedDateTime getAddedAt() {
        return this.addedAt;
    }

    /**
     *  <p>Custom Fields for the TextLineItem.</p>
     */

    public com.commercetools.api.models.type.CustomFieldsDraft getCustom() {
        return this.custom;
    }

    /**
     *  <p>Description of the TextLineItem.</p>
     */

    public com.commercetools.api.models.common.LocalizedString getDescription() {
        return this.description;
    }

    /**
     *  <p>Name of the TextLineItem.</p>
     */

    public com.commercetools.api.models.common.LocalizedString getName() {
        return this.name;
    }

    /**
     *  <p>Number of entries in the TextLineItem.</p>
     */

    public Long getQuantity() {
        return this.quantity;
    }

    public void setAddedAt(final java.time.ZonedDateTime addedAt) {
        this.addedAt = addedAt;
    }

    public void setCustom(final com.commercetools.api.models.type.CustomFieldsDraft custom) {
        this.custom = custom;
    }

    public void setDescription(final com.commercetools.api.models.common.LocalizedString description) {
        this.description = description;
    }

    public void setName(final com.commercetools.api.models.common.LocalizedString name) {
        this.name = name;
    }

    public void setQuantity(final Long quantity) {
        this.quantity = quantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        TextLineItemDraftImpl that = (TextLineItemDraftImpl) o;

        return new EqualsBuilder().append(addedAt, that.addedAt)
                .append(custom, that.custom)
                .append(description, that.description)
                .append(name, that.name)
                .append(quantity, that.quantity)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(addedAt)
                .append(custom)
                .append(description)
                .append(name)
                .append(quantity)
                .toHashCode();
    }

}
