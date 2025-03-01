
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
 * ReturnInfoDraft
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ReturnInfoDraftImpl implements ReturnInfoDraft, ModelBase {

    private java.util.List<com.commercetools.api.models.order.ReturnItemDraft> items;

    private String returnTrackingId;

    private java.time.ZonedDateTime returnDate;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ReturnInfoDraftImpl(
            @JsonProperty("items") final java.util.List<com.commercetools.api.models.order.ReturnItemDraft> items,
            @JsonProperty("returnTrackingId") final String returnTrackingId,
            @JsonProperty("returnDate") final java.time.ZonedDateTime returnDate) {
        this.items = items;
        this.returnTrackingId = returnTrackingId;
        this.returnDate = returnDate;
    }

    /**
     * create empty instance
     */
    public ReturnInfoDraftImpl() {
    }

    /**
     *
     */

    public java.util.List<com.commercetools.api.models.order.ReturnItemDraft> getItems() {
        return this.items;
    }

    /**
     *  <p>Identifies, which return tracking ID is connected to this particular return.</p>
     */

    public String getReturnTrackingId() {
        return this.returnTrackingId;
    }

    /**
     *
     */

    public java.time.ZonedDateTime getReturnDate() {
        return this.returnDate;
    }

    public void setItems(final com.commercetools.api.models.order.ReturnItemDraft... items) {
        this.items = new ArrayList<>(Arrays.asList(items));
    }

    public void setItems(final java.util.List<com.commercetools.api.models.order.ReturnItemDraft> items) {
        this.items = items;
    }

    public void setReturnTrackingId(final String returnTrackingId) {
        this.returnTrackingId = returnTrackingId;
    }

    public void setReturnDate(final java.time.ZonedDateTime returnDate) {
        this.returnDate = returnDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ReturnInfoDraftImpl that = (ReturnInfoDraftImpl) o;

        return new EqualsBuilder().append(items, that.items)
                .append(returnTrackingId, that.returnTrackingId)
                .append(returnDate, that.returnDate)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(items).append(returnTrackingId).append(returnDate).toHashCode();
    }

}
