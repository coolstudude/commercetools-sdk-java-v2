
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Generated after a successful Set PurchaseOrderNumber update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderPurchaseOrderNumberSetMessage orderPurchaseOrderNumberSetMessage = OrderPurchaseOrderNumberSetMessage.builder()
 *             .id("{id}")
 *             .version(0.3)
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .sequenceNumber(0.3)
 *             .resource(resourceBuilder -> resourceBuilder)
 *             .resourceVersion(0.3)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = OrderPurchaseOrderNumberSetMessageImpl.class)
public interface OrderPurchaseOrderNumberSetMessage extends OrderMessage {

    String ORDER_PURCHASE_ORDER_NUMBER_SET = "OrderPurchaseOrderNumberSet";

    /**
     *  <p>Purchase order number on the Order after the Set PurchaseOrderNumber update action.</p>
     * @return purchaseOrderNumber
     */

    @JsonProperty("purchaseOrderNumber")
    public String getPurchaseOrderNumber();

    /**
     *  <p>Purchase order number on the Order before the Set PurchaseOrderNumber update action.</p>
     * @return oldPurchaseOrderNumber
     */

    @JsonProperty("oldPurchaseOrderNumber")
    public String getOldPurchaseOrderNumber();

    public void setPurchaseOrderNumber(final String purchaseOrderNumber);

    public void setOldPurchaseOrderNumber(final String oldPurchaseOrderNumber);

    public static OrderPurchaseOrderNumberSetMessage of() {
        return new OrderPurchaseOrderNumberSetMessageImpl();
    }

    public static OrderPurchaseOrderNumberSetMessage of(final OrderPurchaseOrderNumberSetMessage template) {
        OrderPurchaseOrderNumberSetMessageImpl instance = new OrderPurchaseOrderNumberSetMessageImpl();
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
        instance.setPurchaseOrderNumber(template.getPurchaseOrderNumber());
        instance.setOldPurchaseOrderNumber(template.getOldPurchaseOrderNumber());
        return instance;
    }

    public static OrderPurchaseOrderNumberSetMessageBuilder builder() {
        return OrderPurchaseOrderNumberSetMessageBuilder.of();
    }

    public static OrderPurchaseOrderNumberSetMessageBuilder builder(final OrderPurchaseOrderNumberSetMessage template) {
        return OrderPurchaseOrderNumberSetMessageBuilder.of(template);
    }

    default <T> T withOrderPurchaseOrderNumberSetMessage(Function<OrderPurchaseOrderNumberSetMessage, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<OrderPurchaseOrderNumberSetMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<OrderPurchaseOrderNumberSetMessage>() {
            @Override
            public String toString() {
                return "TypeReference<OrderPurchaseOrderNumberSetMessage>";
            }
        };
    }
}
