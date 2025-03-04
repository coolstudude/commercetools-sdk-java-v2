
package com.commercetools.api.models.cart;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CartSetDeliveryAddressCustomFieldActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartSetDeliveryAddressCustomFieldAction cartSetDeliveryAddressCustomFieldAction = CartSetDeliveryAddressCustomFieldAction.builder()
 *             .deliveryId("{deliveryId}")
 *             .name("{name}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CartSetDeliveryAddressCustomFieldActionBuilder
        implements Builder<CartSetDeliveryAddressCustomFieldAction> {

    private String deliveryId;

    private String name;

    @Nullable
    private java.lang.Object value;

    /**
     *  <p><code>id</code> of the Delivery.</p>
     * @param deliveryId value to be set
     * @return Builder
     */

    public CartSetDeliveryAddressCustomFieldActionBuilder deliveryId(final String deliveryId) {
        this.deliveryId = deliveryId;
        return this;
    }

    /**
     *  <p>Name of the Custom Field.</p>
     * @param name value to be set
     * @return Builder
     */

    public CartSetDeliveryAddressCustomFieldActionBuilder name(final String name) {
        this.name = name;
        return this;
    }

    /**
     *  <p>If <code>value</code> is absent or <code>null</code>, this field will be removed if it exists. Removing a field that does not exist returns an InvalidOperation error. If <code>value</code> is provided, it is set for the field defined by <code>name</code>.</p>
     * @param value value to be set
     * @return Builder
     */

    public CartSetDeliveryAddressCustomFieldActionBuilder value(@Nullable final java.lang.Object value) {
        this.value = value;
        return this;
    }

    /**
     *  <p><code>id</code> of the Delivery.</p>
     * @return deliveryId
     */

    public String getDeliveryId() {
        return this.deliveryId;
    }

    /**
     *  <p>Name of the Custom Field.</p>
     * @return name
     */

    public String getName() {
        return this.name;
    }

    /**
     *  <p>If <code>value</code> is absent or <code>null</code>, this field will be removed if it exists. Removing a field that does not exist returns an InvalidOperation error. If <code>value</code> is provided, it is set for the field defined by <code>name</code>.</p>
     * @return value
     */

    @Nullable
    public java.lang.Object getValue() {
        return this.value;
    }

    /**
     * builds CartSetDeliveryAddressCustomFieldAction with checking for non-null required values
     * @return CartSetDeliveryAddressCustomFieldAction
     */
    public CartSetDeliveryAddressCustomFieldAction build() {
        Objects.requireNonNull(deliveryId, CartSetDeliveryAddressCustomFieldAction.class + ": deliveryId is missing");
        Objects.requireNonNull(name, CartSetDeliveryAddressCustomFieldAction.class + ": name is missing");
        return new CartSetDeliveryAddressCustomFieldActionImpl(deliveryId, name, value);
    }

    /**
     * builds CartSetDeliveryAddressCustomFieldAction without checking for non-null required values
     * @return CartSetDeliveryAddressCustomFieldAction
     */
    public CartSetDeliveryAddressCustomFieldAction buildUnchecked() {
        return new CartSetDeliveryAddressCustomFieldActionImpl(deliveryId, name, value);
    }

    /**
     * factory method for an instance of CartSetDeliveryAddressCustomFieldActionBuilder
     * @return builder
     */
    public static CartSetDeliveryAddressCustomFieldActionBuilder of() {
        return new CartSetDeliveryAddressCustomFieldActionBuilder();
    }

    /**
     * create builder for CartSetDeliveryAddressCustomFieldAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CartSetDeliveryAddressCustomFieldActionBuilder of(
            final CartSetDeliveryAddressCustomFieldAction template) {
        CartSetDeliveryAddressCustomFieldActionBuilder builder = new CartSetDeliveryAddressCustomFieldActionBuilder();
        builder.deliveryId = template.getDeliveryId();
        builder.name = template.getName();
        builder.value = template.getValue();
        return builder;
    }

}
