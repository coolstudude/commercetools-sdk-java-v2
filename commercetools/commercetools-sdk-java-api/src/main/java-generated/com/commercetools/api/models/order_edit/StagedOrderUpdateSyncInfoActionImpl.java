
package com.commercetools.api.models.order_edit;

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
 * StagedOrderUpdateSyncInfoAction
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StagedOrderUpdateSyncInfoActionImpl implements StagedOrderUpdateSyncInfoAction, ModelBase {

    private String action;

    private com.commercetools.api.models.channel.ChannelResourceIdentifier channel;

    private String externalId;

    private java.time.ZonedDateTime syncedAt;

    /**
     * create instance with all properties
     */
    @JsonCreator
    StagedOrderUpdateSyncInfoActionImpl(
            @JsonProperty("channel") final com.commercetools.api.models.channel.ChannelResourceIdentifier channel,
            @JsonProperty("externalId") final String externalId,
            @JsonProperty("syncedAt") final java.time.ZonedDateTime syncedAt) {
        this.channel = channel;
        this.externalId = externalId;
        this.syncedAt = syncedAt;
        this.action = UPDATE_SYNC_INFO;
    }

    /**
     * create empty instance
     */
    public StagedOrderUpdateSyncInfoActionImpl() {
        this.action = UPDATE_SYNC_INFO;
    }

    /**
     *
     */

    public String getAction() {
        return this.action;
    }

    /**
     *  <p>ResourceIdentifier to a Channel.</p>
     */

    public com.commercetools.api.models.channel.ChannelResourceIdentifier getChannel() {
        return this.channel;
    }

    /**
     *
     */

    public String getExternalId() {
        return this.externalId;
    }

    /**
     *
     */

    public java.time.ZonedDateTime getSyncedAt() {
        return this.syncedAt;
    }

    public void setChannel(final com.commercetools.api.models.channel.ChannelResourceIdentifier channel) {
        this.channel = channel;
    }

    public void setExternalId(final String externalId) {
        this.externalId = externalId;
    }

    public void setSyncedAt(final java.time.ZonedDateTime syncedAt) {
        this.syncedAt = syncedAt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        StagedOrderUpdateSyncInfoActionImpl that = (StagedOrderUpdateSyncInfoActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(channel, that.channel)
                .append(externalId, that.externalId)
                .append(syncedAt, that.syncedAt)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action)
                .append(channel)
                .append(externalId)
                .append(syncedAt)
                .toHashCode();
    }

}
