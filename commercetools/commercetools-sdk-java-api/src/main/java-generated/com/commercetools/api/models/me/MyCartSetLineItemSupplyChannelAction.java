
package com.commercetools.api.models.me;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.channel.ChannelResourceIdentifier;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Performing this action has no impact on inventory that should be reserved.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MyCartSetLineItemSupplyChannelAction myCartSetLineItemSupplyChannelAction = MyCartSetLineItemSupplyChannelAction.builder()
 *             .lineItemId("{lineItemId}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = MyCartSetLineItemSupplyChannelActionImpl.class)
public interface MyCartSetLineItemSupplyChannelAction extends MyCartUpdateAction {

    String SET_LINE_ITEM_SUPPLY_CHANNEL = "setLineItemSupplyChannel";

    /**
     *  <p><code>id</code> of the LineItem to update.</p>
     * @return lineItemId
     */
    @NotNull
    @JsonProperty("lineItemId")
    public String getLineItemId();

    /**
     *  <ul>
     *   <li>If present, a Reference to the Channel is set for the LineItem specified by <code>lineItemId</code>.</li>
     *   <li>If not present, the current Reference to a supply channel will be removed from the LineItem specified by <code>lineItemId</code>. The Channel must have the <code>InventorySupply</code> ChannelRoleEnum.</li>
     *  </ul>
     * @return supplyChannel
     */
    @Valid
    @JsonProperty("supplyChannel")
    public ChannelResourceIdentifier getSupplyChannel();

    public void setLineItemId(final String lineItemId);

    public void setSupplyChannel(final ChannelResourceIdentifier supplyChannel);

    public static MyCartSetLineItemSupplyChannelAction of() {
        return new MyCartSetLineItemSupplyChannelActionImpl();
    }

    public static MyCartSetLineItemSupplyChannelAction of(final MyCartSetLineItemSupplyChannelAction template) {
        MyCartSetLineItemSupplyChannelActionImpl instance = new MyCartSetLineItemSupplyChannelActionImpl();
        instance.setLineItemId(template.getLineItemId());
        instance.setSupplyChannel(template.getSupplyChannel());
        return instance;
    }

    public static MyCartSetLineItemSupplyChannelActionBuilder builder() {
        return MyCartSetLineItemSupplyChannelActionBuilder.of();
    }

    public static MyCartSetLineItemSupplyChannelActionBuilder builder(
            final MyCartSetLineItemSupplyChannelAction template) {
        return MyCartSetLineItemSupplyChannelActionBuilder.of(template);
    }

    default <T> T withMyCartSetLineItemSupplyChannelAction(Function<MyCartSetLineItemSupplyChannelAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<MyCartSetLineItemSupplyChannelAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<MyCartSetLineItemSupplyChannelAction>() {
            @Override
            public String toString() {
                return "TypeReference<MyCartSetLineItemSupplyChannelAction>";
            }
        };
    }
}
