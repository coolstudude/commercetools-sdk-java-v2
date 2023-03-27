
package com.commercetools.api.models.channel;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * ChannelSetRolesAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ChannelSetRolesAction channelSetRolesAction = ChannelSetRolesAction.builder()
 *             .plusRoles(rolesBuilder -> rolesBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ChannelSetRolesActionImpl.class)
public interface ChannelSetRolesAction extends ChannelUpdateAction {

    /**
     * discriminator value for ChannelSetRolesAction
     */
    String SET_ROLES = "setRoles";

    /**
     *  <p>Value to set. If not specified, then <code>InventorySupply</code> is assigned by default.</p>
     * @return roles
     */
    @NotNull
    @JsonProperty("roles")
    public List<ChannelRoleEnum> getRoles();

    /**
     *  <p>Value to set. If not specified, then <code>InventorySupply</code> is assigned by default.</p>
     * @param roles values to be set
     */

    @JsonIgnore
    public void setRoles(final ChannelRoleEnum... roles);

    /**
     *  <p>Value to set. If not specified, then <code>InventorySupply</code> is assigned by default.</p>
     * @param roles values to be set
     */

    public void setRoles(final List<ChannelRoleEnum> roles);

    /**
     * factory method
     * @return instance of ChannelSetRolesAction
     */
    public static ChannelSetRolesAction of() {
        return new ChannelSetRolesActionImpl();
    }

    /**
     * factory method to copy an instance of ChannelSetRolesAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static ChannelSetRolesAction of(final ChannelSetRolesAction template) {
        ChannelSetRolesActionImpl instance = new ChannelSetRolesActionImpl();
        instance.setRoles(template.getRoles());
        return instance;
    }

    /**
     * builder factory method for ChannelSetRolesAction
     * @return builder
     */
    public static ChannelSetRolesActionBuilder builder() {
        return ChannelSetRolesActionBuilder.of();
    }

    /**
     * create builder for ChannelSetRolesAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ChannelSetRolesActionBuilder builder(final ChannelSetRolesAction template) {
        return ChannelSetRolesActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withChannelSetRolesAction(Function<ChannelSetRolesAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ChannelSetRolesAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ChannelSetRolesAction>() {
            @Override
            public String toString() {
                return "TypeReference<ChannelSetRolesAction>";
            }
        };
    }
}
