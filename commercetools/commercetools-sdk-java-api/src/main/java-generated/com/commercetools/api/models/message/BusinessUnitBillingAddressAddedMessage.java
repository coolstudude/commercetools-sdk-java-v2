
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.common.Address;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Generated after a successful Add Billing Address Identifier update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     BusinessUnitBillingAddressAddedMessage businessUnitBillingAddressAddedMessage = BusinessUnitBillingAddressAddedMessage.builder()
 *             .id("{id}")
 *             .version(0.3)
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .sequenceNumber(0.3)
 *             .resource(resourceBuilder -> resourceBuilder)
 *             .resourceVersion(0.3)
 *             .address(addressBuilder -> addressBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = BusinessUnitBillingAddressAddedMessageImpl.class)
public interface BusinessUnitBillingAddressAddedMessage extends Message {

    /**
     * discriminator value for BusinessUnitBillingAddressAddedMessage
     */
    String BUSINESS_UNIT_BILLING_ADDRESS_ADDED = "BusinessUnitBillingAddressAdded";

    /**
     *  <p>The address that was added to the Business Unit as billing address.</p>
     * @return address
     */
    @NotNull
    @Valid
    @JsonProperty("address")
    public Address getAddress();

    /**
     *  <p>The address that was added to the Business Unit as billing address.</p>
     * @param address value to be set
     */

    public void setAddress(final Address address);

    /**
     * factory method
     * @return instance of BusinessUnitBillingAddressAddedMessage
     */
    public static BusinessUnitBillingAddressAddedMessage of() {
        return new BusinessUnitBillingAddressAddedMessageImpl();
    }

    /**
     * factory method to copy an instance of BusinessUnitBillingAddressAddedMessage
     * @param template instance to be copied
     * @return copy instance
     */
    public static BusinessUnitBillingAddressAddedMessage of(final BusinessUnitBillingAddressAddedMessage template) {
        BusinessUnitBillingAddressAddedMessageImpl instance = new BusinessUnitBillingAddressAddedMessageImpl();
        instance.setId(template.getId());
        instance.setVersion(template.getVersion());
        instance.setCreatedAt(template.getCreatedAt());
        instance.setLastModifiedAt(template.getLastModifiedAt());
        instance.setLastModifiedBy(template.getLastModifiedBy());
        instance.setCreatedBy(template.getCreatedBy());
        instance.setSequenceNumber(template.getSequenceNumber());
        instance.setResource(template.getResource());
        instance.setResourceVersion(template.getResourceVersion());
        instance.setResourceUserProvidedIdentifiers(template.getResourceUserProvidedIdentifiers());
        instance.setAddress(template.getAddress());
        return instance;
    }

    /**
     * builder factory method for BusinessUnitBillingAddressAddedMessage
     * @return builder
     */
    public static BusinessUnitBillingAddressAddedMessageBuilder builder() {
        return BusinessUnitBillingAddressAddedMessageBuilder.of();
    }

    /**
     * create builder for BusinessUnitBillingAddressAddedMessage instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static BusinessUnitBillingAddressAddedMessageBuilder builder(
            final BusinessUnitBillingAddressAddedMessage template) {
        return BusinessUnitBillingAddressAddedMessageBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withBusinessUnitBillingAddressAddedMessage(
            Function<BusinessUnitBillingAddressAddedMessage, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<BusinessUnitBillingAddressAddedMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<BusinessUnitBillingAddressAddedMessage>() {
            @Override
            public String toString() {
                return "TypeReference<BusinessUnitBillingAddressAddedMessage>";
            }
        };
    }
}
