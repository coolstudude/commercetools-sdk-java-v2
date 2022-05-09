
package com.commercetools.api.models.channel;

import java.time.*;
import java.util.*;

import com.commercetools.api.models.common.ReferenceTypeId;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.ModelBase;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
*  <p><a href="ctp:api:type:Reference">Reference</a> to a <a href="ctp:api:type:Channel">Channel</a>.</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ChannelReferenceImpl implements ChannelReference, ModelBase {

    private com.commercetools.api.models.common.ReferenceTypeId typeId;

    private String id;

    private com.commercetools.api.models.channel.Channel obj;

    @JsonCreator
    ChannelReferenceImpl(@JsonProperty("id") final String id,
            @JsonProperty("obj") final com.commercetools.api.models.channel.Channel obj) {
        this.id = id;
        this.obj = obj;
        this.typeId = ReferenceTypeId.findEnum("channel");
    }

    public ChannelReferenceImpl() {
        this.typeId = ReferenceTypeId.findEnum("channel");
    }

    /**
    *  <p>Type of referenced resource.</p>
    */
    public com.commercetools.api.models.common.ReferenceTypeId getTypeId() {
        return this.typeId;
    }

    /**
    *  <p>Platform-generated unique identifier of the referenced <a href="ctp:api:type:Channel">Channel</a>.</p>
    */
    public String getId() {
        return this.id;
    }

    /**
    *  <p>Contains the representation of the expanded Channel.
    *  Only present in responses to requests with <a href="/../api/general-concepts#reference-expansion">Reference Expansion</a> for Channels.</p>
    */
    public com.commercetools.api.models.channel.Channel getObj() {
        return this.obj;
    }

    public void setId(final String id) {
        this.id = id;
    }

    public void setObj(final com.commercetools.api.models.channel.Channel obj) {
        this.obj = obj;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ChannelReferenceImpl that = (ChannelReferenceImpl) o;

        return new EqualsBuilder().append(typeId, that.typeId).append(id, that.id).append(obj, that.obj).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(typeId).append(id).append(obj).toHashCode();
    }

}
