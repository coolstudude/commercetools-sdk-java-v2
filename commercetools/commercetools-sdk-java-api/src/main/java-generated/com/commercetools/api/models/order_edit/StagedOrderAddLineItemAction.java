
package com.commercetools.api.models.order_edit;

import java.time.*;
import java.time.ZonedDateTime;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.Valid;

import com.commercetools.api.models.cart.ExternalLineItemTotalPrice;
import com.commercetools.api.models.cart.ExternalTaxRateDraft;
import com.commercetools.api.models.cart.ItemShippingDetailsDraft;
import com.commercetools.api.models.channel.ChannelResourceIdentifier;
import com.commercetools.api.models.common.Money;
import com.commercetools.api.models.order.StagedOrderUpdateAction;
import com.commercetools.api.models.type.CustomFieldsDraft;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * StagedOrderAddLineItemAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StagedOrderAddLineItemAction stagedOrderAddLineItemAction = StagedOrderAddLineItemAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = StagedOrderAddLineItemActionImpl.class)
public interface StagedOrderAddLineItemAction
        extends StagedOrderUpdateAction, com.commercetools.api.models.CustomizableDraft<StagedOrderAddLineItemAction> {

    /**
     * discriminator value for StagedOrderAddLineItemAction
     */
    String ADD_LINE_ITEM = "addLineItem";

    /**
     *  <p>The representation used when creating or updating a customizable data type with Custom Fields.</p>
     * @return custom
     */
    @Valid
    @JsonProperty("custom")
    public CustomFieldsDraft getCustom();

    /**
     *  <p>ResourceIdentifier to a Channel.</p>
     * @return distributionChannel
     */
    @Valid
    @JsonProperty("distributionChannel")
    public ChannelResourceIdentifier getDistributionChannel();

    /**
     *  <p>Controls calculation of taxed prices for Line Items, Custom Line Items, and Shipping Methods as explained in Cart tax calculation.</p>
     * @return externalTaxRate
     */
    @Valid
    @JsonProperty("externalTaxRate")
    public ExternalTaxRateDraft getExternalTaxRate();

    /**
     *
     * @return productId
     */

    @JsonProperty("productId")
    public String getProductId();

    /**
     *
     * @return variantId
     */

    @JsonProperty("variantId")
    public Long getVariantId();

    /**
     *
     * @return sku
     */

    @JsonProperty("sku")
    public String getSku();

    /**
     *
     * @return quantity
     */

    @JsonProperty("quantity")
    public Long getQuantity();

    /**
     *
     * @return addedAt
     */

    @JsonProperty("addedAt")
    public ZonedDateTime getAddedAt();

    /**
     *  <p>ResourceIdentifier to a Channel.</p>
     * @return supplyChannel
     */
    @Valid
    @JsonProperty("supplyChannel")
    public ChannelResourceIdentifier getSupplyChannel();

    /**
     *  <p>Draft type that stores amounts in cent precision for the specified currency.</p>
     *  <p>For storing money values in fractions of the minor unit in a currency, use HighPrecisionMoneyDraft instead.</p>
     * @return externalPrice
     */
    @Valid
    @JsonProperty("externalPrice")
    public Money getExternalPrice();

    /**
     *
     * @return externalTotalPrice
     */
    @Valid
    @JsonProperty("externalTotalPrice")
    public ExternalLineItemTotalPrice getExternalTotalPrice();

    /**
     *  <p>For order creation and updates, the sum of the <code>targets</code> must match the quantity of the Line Items or Custom Line Items.</p>
     * @return shippingDetails
     */
    @Valid
    @JsonProperty("shippingDetails")
    public ItemShippingDetailsDraft getShippingDetails();

    /**
     *  <p>The representation used when creating or updating a customizable data type with Custom Fields.</p>
     * @param custom value to be set
     */

    public void setCustom(final CustomFieldsDraft custom);

    /**
     *  <p>ResourceIdentifier to a Channel.</p>
     * @param distributionChannel value to be set
     */

    public void setDistributionChannel(final ChannelResourceIdentifier distributionChannel);

    /**
     *  <p>Controls calculation of taxed prices for Line Items, Custom Line Items, and Shipping Methods as explained in Cart tax calculation.</p>
     * @param externalTaxRate value to be set
     */

    public void setExternalTaxRate(final ExternalTaxRateDraft externalTaxRate);

    /**
     * set productId
     * @param productId value to be set
     */

    public void setProductId(final String productId);

    /**
     * set variantId
     * @param variantId value to be set
     */

    public void setVariantId(final Long variantId);

    /**
     * set sku
     * @param sku value to be set
     */

    public void setSku(final String sku);

    /**
     * set quantity
     * @param quantity value to be set
     */

    public void setQuantity(final Long quantity);

    /**
     * set addedAt
     * @param addedAt value to be set
     */

    public void setAddedAt(final ZonedDateTime addedAt);

    /**
     *  <p>ResourceIdentifier to a Channel.</p>
     * @param supplyChannel value to be set
     */

    public void setSupplyChannel(final ChannelResourceIdentifier supplyChannel);

    /**
     *  <p>Draft type that stores amounts in cent precision for the specified currency.</p>
     *  <p>For storing money values in fractions of the minor unit in a currency, use HighPrecisionMoneyDraft instead.</p>
     * @param externalPrice value to be set
     */

    public void setExternalPrice(final Money externalPrice);

    /**
     * set externalTotalPrice
     * @param externalTotalPrice value to be set
     */

    public void setExternalTotalPrice(final ExternalLineItemTotalPrice externalTotalPrice);

    /**
     *  <p>For order creation and updates, the sum of the <code>targets</code> must match the quantity of the Line Items or Custom Line Items.</p>
     * @param shippingDetails value to be set
     */

    public void setShippingDetails(final ItemShippingDetailsDraft shippingDetails);

    /**
     * factory method
     * @return instance of StagedOrderAddLineItemAction
     */
    public static StagedOrderAddLineItemAction of() {
        return new StagedOrderAddLineItemActionImpl();
    }

    /**
     * factory method to create a shallow copy StagedOrderAddLineItemAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static StagedOrderAddLineItemAction of(final StagedOrderAddLineItemAction template) {
        StagedOrderAddLineItemActionImpl instance = new StagedOrderAddLineItemActionImpl();
        instance.setCustom(template.getCustom());
        instance.setDistributionChannel(template.getDistributionChannel());
        instance.setExternalTaxRate(template.getExternalTaxRate());
        instance.setProductId(template.getProductId());
        instance.setVariantId(template.getVariantId());
        instance.setSku(template.getSku());
        instance.setQuantity(template.getQuantity());
        instance.setAddedAt(template.getAddedAt());
        instance.setSupplyChannel(template.getSupplyChannel());
        instance.setExternalPrice(template.getExternalPrice());
        instance.setExternalTotalPrice(template.getExternalTotalPrice());
        instance.setShippingDetails(template.getShippingDetails());
        return instance;
    }

    /**
     * factory method to create a deep copy of StagedOrderAddLineItemAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static StagedOrderAddLineItemAction deepCopy(@Nullable final StagedOrderAddLineItemAction template) {
        if (template == null) {
            return null;
        }
        StagedOrderAddLineItemActionImpl instance = new StagedOrderAddLineItemActionImpl();
        instance.setCustom(Optional.ofNullable(template.getCustom())
                .map(com.commercetools.api.models.type.CustomFieldsDraft::deepCopy)
                .orElse(null));
        instance.setDistributionChannel(Optional.ofNullable(template.getDistributionChannel())
                .map(com.commercetools.api.models.channel.ChannelResourceIdentifier::deepCopy)
                .orElse(null));
        instance.setExternalTaxRate(Optional.ofNullable(template.getExternalTaxRate())
                .map(com.commercetools.api.models.cart.ExternalTaxRateDraft::deepCopy)
                .orElse(null));
        instance.setProductId(template.getProductId());
        instance.setVariantId(template.getVariantId());
        instance.setSku(template.getSku());
        instance.setQuantity(template.getQuantity());
        instance.setAddedAt(template.getAddedAt());
        instance.setSupplyChannel(Optional.ofNullable(template.getSupplyChannel())
                .map(com.commercetools.api.models.channel.ChannelResourceIdentifier::deepCopy)
                .orElse(null));
        instance.setExternalPrice(Optional.ofNullable(template.getExternalPrice())
                .map(com.commercetools.api.models.common.Money::deepCopy)
                .orElse(null));
        instance.setExternalTotalPrice(Optional.ofNullable(template.getExternalTotalPrice())
                .map(com.commercetools.api.models.cart.ExternalLineItemTotalPrice::deepCopy)
                .orElse(null));
        instance.setShippingDetails(Optional.ofNullable(template.getShippingDetails())
                .map(com.commercetools.api.models.cart.ItemShippingDetailsDraft::deepCopy)
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for StagedOrderAddLineItemAction
     * @return builder
     */
    public static StagedOrderAddLineItemActionBuilder builder() {
        return StagedOrderAddLineItemActionBuilder.of();
    }

    /**
     * create builder for StagedOrderAddLineItemAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StagedOrderAddLineItemActionBuilder builder(final StagedOrderAddLineItemAction template) {
        return StagedOrderAddLineItemActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withStagedOrderAddLineItemAction(Function<StagedOrderAddLineItemAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<StagedOrderAddLineItemAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StagedOrderAddLineItemAction>() {
            @Override
            public String toString() {
                return "TypeReference<StagedOrderAddLineItemAction>";
            }
        };
    }
}
