
package com.commercetools.api.models.channel;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.Valid;

import com.commercetools.api.models.common.GeoJson;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * ChannelSetGeoLocationAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ChannelSetGeoLocationAction channelSetGeoLocationAction = ChannelSetGeoLocationAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ChannelSetGeoLocationActionImpl.class)
public interface ChannelSetGeoLocationAction extends ChannelUpdateAction {

    /**
     * discriminator value for ChannelSetGeoLocationAction
     */
    String SET_GEO_LOCATION = "setGeoLocation";

    /**
     *  <p>Value to set.</p>
     * @return geoLocation
     */
    @Valid
    @JsonProperty("geoLocation")
    public GeoJson getGeoLocation();

    /**
     *  <p>Value to set.</p>
     * @param geoLocation value to be set
     */

    public void setGeoLocation(final GeoJson geoLocation);

    /**
     * factory method
     * @return instance of ChannelSetGeoLocationAction
     */
    public static ChannelSetGeoLocationAction of() {
        return new ChannelSetGeoLocationActionImpl();
    }

    /**
     * factory method to create a shallow copy ChannelSetGeoLocationAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static ChannelSetGeoLocationAction of(final ChannelSetGeoLocationAction template) {
        ChannelSetGeoLocationActionImpl instance = new ChannelSetGeoLocationActionImpl();
        instance.setGeoLocation(template.getGeoLocation());
        return instance;
    }

    /**
     * factory method to create a deep copy of ChannelSetGeoLocationAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ChannelSetGeoLocationAction deepCopy(@Nullable final ChannelSetGeoLocationAction template) {
        if (template == null) {
            return null;
        }
        ChannelSetGeoLocationActionImpl instance = new ChannelSetGeoLocationActionImpl();
        instance.setGeoLocation(Optional.ofNullable(template.getGeoLocation())
                .map(com.commercetools.api.models.common.GeoJson::deepCopy)
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for ChannelSetGeoLocationAction
     * @return builder
     */
    public static ChannelSetGeoLocationActionBuilder builder() {
        return ChannelSetGeoLocationActionBuilder.of();
    }

    /**
     * create builder for ChannelSetGeoLocationAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ChannelSetGeoLocationActionBuilder builder(final ChannelSetGeoLocationAction template) {
        return ChannelSetGeoLocationActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withChannelSetGeoLocationAction(Function<ChannelSetGeoLocationAction, T> helper) {
        return helper.apply(this);
    }

    public static ChannelSetGeoLocationAction ofUnset() {
        return ChannelSetGeoLocationAction.of();
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ChannelSetGeoLocationAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ChannelSetGeoLocationAction>() {
            @Override
            public String toString() {
                return "TypeReference<ChannelSetGeoLocationAction>";
            }
        };
    }
}
