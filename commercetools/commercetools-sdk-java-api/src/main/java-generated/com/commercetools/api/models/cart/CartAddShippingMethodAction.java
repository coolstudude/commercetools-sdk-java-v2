
package com.commercetools.api.models.cart;

import java.time.*;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.annotation.Nullable;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.common.BaseAddress;
import com.commercetools.api.models.order.DeliveryDraft;
import com.commercetools.api.models.shipping_method.ShippingMethodResourceIdentifier;
import com.commercetools.api.models.type.CustomFieldsDraft;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Adds a Shipping Method for a specified shipping address to a Cart with <code>Multiple</code> ShippingMode.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartAddShippingMethodAction cartAddShippingMethodAction = CartAddShippingMethodAction.builder()
 *             .shippingKey("{shippingKey}")
 *             .shippingMethod(shippingMethodBuilder -> shippingMethodBuilder)
 *             .shippingAddress(shippingAddressBuilder -> shippingAddressBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CartAddShippingMethodActionImpl.class)
public interface CartAddShippingMethodAction extends CartUpdateAction {

    /**
     * discriminator value for CartAddShippingMethodAction
     */
    String ADD_SHIPPING_METHOD = "addShippingMethod";

    /**
     *  <p>User-defined identifier for the Shipping that must be unique across the Cart with <code>Multiple</code> ShippingMode.</p>
     * @return shippingKey
     */
    @NotNull
    @JsonProperty("shippingKey")
    public String getShippingKey();

    /**
     *  <p>RecourceIdentifier to a ShippingMethod to add to the Cart with <code>Multiple</code> ShippingMode. If the referenced Shipping Method has a predicate that does not match the Cart, an InvalidOperation error is returned.</p>
     * @return shippingMethod
     */
    @NotNull
    @Valid
    @JsonProperty("shippingMethod")
    public ShippingMethodResourceIdentifier getShippingMethod();

    /**
     *  <p>Determines the shipping rate and Tax Rate of the Line Items.</p>
     * @return shippingAddress
     */
    @NotNull
    @Valid
    @JsonProperty("shippingAddress")
    public BaseAddress getShippingAddress();

    /**
     *  <p>Input used to select a ShippingRatePriceTier. The data type of this field depends on the <code>shippingRateInputType.type</code> configured in the Project:</p>
     *  <ul>
     *   <li>If <code>CartClassification</code>, it must be ClassificationShippingRateInputDraft.</li>
     *   <li>If <code>CartScore</code>, it must be ScoreShippingRateInputDraft.</li>
     *   <li>If <code>CartValue</code>, it cannot be set.</li>
     *  </ul>
     * @return shippingRateInput
     */
    @Valid
    @JsonProperty("shippingRateInput")
    public ShippingRateInputDraft getShippingRateInput();

    /**
     *  <p>Tax Rate used to tax a shipping expense if the Cart has the <code>External</code> TaxMode.</p>
     * @return externalTaxRate
     */
    @Valid
    @JsonProperty("externalTaxRate")
    public ExternalTaxRateDraft getExternalTaxRate();

    /**
     *  <p>Deliveries to be shipped with the referenced Shipping Method.</p>
     * @return deliveries
     */
    @Valid
    @JsonProperty("deliveries")
    public List<DeliveryDraft> getDeliveries();

    /**
     *  <p>Custom Fields for the Shipping Method.</p>
     * @return custom
     */
    @Valid
    @JsonProperty("custom")
    public CustomFieldsDraft getCustom();

    /**
     *  <p>User-defined identifier for the Shipping that must be unique across the Cart with <code>Multiple</code> ShippingMode.</p>
     * @param shippingKey value to be set
     */

    public void setShippingKey(final String shippingKey);

    /**
     *  <p>RecourceIdentifier to a ShippingMethod to add to the Cart with <code>Multiple</code> ShippingMode. If the referenced Shipping Method has a predicate that does not match the Cart, an InvalidOperation error is returned.</p>
     * @param shippingMethod value to be set
     */

    public void setShippingMethod(final ShippingMethodResourceIdentifier shippingMethod);

    /**
     *  <p>Determines the shipping rate and Tax Rate of the Line Items.</p>
     * @param shippingAddress value to be set
     */

    public void setShippingAddress(final BaseAddress shippingAddress);

    /**
     *  <p>Input used to select a ShippingRatePriceTier. The data type of this field depends on the <code>shippingRateInputType.type</code> configured in the Project:</p>
     *  <ul>
     *   <li>If <code>CartClassification</code>, it must be ClassificationShippingRateInputDraft.</li>
     *   <li>If <code>CartScore</code>, it must be ScoreShippingRateInputDraft.</li>
     *   <li>If <code>CartValue</code>, it cannot be set.</li>
     *  </ul>
     * @param shippingRateInput value to be set
     */

    public void setShippingRateInput(final ShippingRateInputDraft shippingRateInput);

    /**
     *  <p>Tax Rate used to tax a shipping expense if the Cart has the <code>External</code> TaxMode.</p>
     * @param externalTaxRate value to be set
     */

    public void setExternalTaxRate(final ExternalTaxRateDraft externalTaxRate);

    /**
     *  <p>Deliveries to be shipped with the referenced Shipping Method.</p>
     * @param deliveries values to be set
     */

    @JsonIgnore
    public void setDeliveries(final DeliveryDraft... deliveries);

    /**
     *  <p>Deliveries to be shipped with the referenced Shipping Method.</p>
     * @param deliveries values to be set
     */

    public void setDeliveries(final List<DeliveryDraft> deliveries);

    /**
     *  <p>Custom Fields for the Shipping Method.</p>
     * @param custom value to be set
     */

    public void setCustom(final CustomFieldsDraft custom);

    /**
     * factory method
     * @return instance of CartAddShippingMethodAction
     */
    public static CartAddShippingMethodAction of() {
        return new CartAddShippingMethodActionImpl();
    }

    /**
     * factory method to create a shallow copy CartAddShippingMethodAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static CartAddShippingMethodAction of(final CartAddShippingMethodAction template) {
        CartAddShippingMethodActionImpl instance = new CartAddShippingMethodActionImpl();
        instance.setShippingKey(template.getShippingKey());
        instance.setShippingMethod(template.getShippingMethod());
        instance.setShippingAddress(template.getShippingAddress());
        instance.setShippingRateInput(template.getShippingRateInput());
        instance.setExternalTaxRate(template.getExternalTaxRate());
        instance.setDeliveries(template.getDeliveries());
        instance.setCustom(template.getCustom());
        return instance;
    }

    /**
     * factory method to create a deep copy of CartAddShippingMethodAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CartAddShippingMethodAction deepCopy(@Nullable final CartAddShippingMethodAction template) {
        if (template == null) {
            return null;
        }
        CartAddShippingMethodActionImpl instance = new CartAddShippingMethodActionImpl();
        instance.setShippingKey(template.getShippingKey());
        instance.setShippingMethod(Optional.ofNullable(template.getShippingMethod())
                .map(com.commercetools.api.models.shipping_method.ShippingMethodResourceIdentifier::deepCopy)
                .orElse(null));
        instance.setShippingAddress(Optional.ofNullable(template.getShippingAddress())
                .map(com.commercetools.api.models.common.BaseAddress::deepCopy)
                .orElse(null));
        instance.setShippingRateInput(Optional.ofNullable(template.getShippingRateInput())
                .map(com.commercetools.api.models.cart.ShippingRateInputDraft::deepCopy)
                .orElse(null));
        instance.setExternalTaxRate(Optional.ofNullable(template.getExternalTaxRate())
                .map(com.commercetools.api.models.cart.ExternalTaxRateDraft::deepCopy)
                .orElse(null));
        instance.setDeliveries(Optional.ofNullable(template.getDeliveries())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.order.DeliveryDraft::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        instance.setCustom(Optional.ofNullable(template.getCustom())
                .map(com.commercetools.api.models.type.CustomFieldsDraft::deepCopy)
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for CartAddShippingMethodAction
     * @return builder
     */
    public static CartAddShippingMethodActionBuilder builder() {
        return CartAddShippingMethodActionBuilder.of();
    }

    /**
     * create builder for CartAddShippingMethodAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CartAddShippingMethodActionBuilder builder(final CartAddShippingMethodAction template) {
        return CartAddShippingMethodActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCartAddShippingMethodAction(Function<CartAddShippingMethodAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CartAddShippingMethodAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CartAddShippingMethodAction>() {
            @Override
            public String toString() {
                return "TypeReference<CartAddShippingMethodAction>";
            }
        };
    }
}
