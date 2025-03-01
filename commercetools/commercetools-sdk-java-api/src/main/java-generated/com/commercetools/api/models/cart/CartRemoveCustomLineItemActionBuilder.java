
package com.commercetools.api.models.cart;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CartRemoveCustomLineItemActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartRemoveCustomLineItemAction cartRemoveCustomLineItemAction = CartRemoveCustomLineItemAction.builder()
 *             .customLineItemId("{customLineItemId}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CartRemoveCustomLineItemActionBuilder implements Builder<CartRemoveCustomLineItemAction> {

    private String customLineItemId;

    /**
     *  <p><code>id</code> of the Custom Line Item to remove.</p>
     * @param customLineItemId value to be set
     * @return Builder
     */

    public CartRemoveCustomLineItemActionBuilder customLineItemId(final String customLineItemId) {
        this.customLineItemId = customLineItemId;
        return this;
    }

    /**
     *  <p><code>id</code> of the Custom Line Item to remove.</p>
     * @return customLineItemId
     */

    public String getCustomLineItemId() {
        return this.customLineItemId;
    }

    /**
     * builds CartRemoveCustomLineItemAction with checking for non-null required values
     * @return CartRemoveCustomLineItemAction
     */
    public CartRemoveCustomLineItemAction build() {
        Objects.requireNonNull(customLineItemId,
            CartRemoveCustomLineItemAction.class + ": customLineItemId is missing");
        return new CartRemoveCustomLineItemActionImpl(customLineItemId);
    }

    /**
     * builds CartRemoveCustomLineItemAction without checking for non-null required values
     * @return CartRemoveCustomLineItemAction
     */
    public CartRemoveCustomLineItemAction buildUnchecked() {
        return new CartRemoveCustomLineItemActionImpl(customLineItemId);
    }

    /**
     * factory method for an instance of CartRemoveCustomLineItemActionBuilder
     * @return builder
     */
    public static CartRemoveCustomLineItemActionBuilder of() {
        return new CartRemoveCustomLineItemActionBuilder();
    }

    /**
     * create builder for CartRemoveCustomLineItemAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CartRemoveCustomLineItemActionBuilder of(final CartRemoveCustomLineItemAction template) {
        CartRemoveCustomLineItemActionBuilder builder = new CartRemoveCustomLineItemActionBuilder();
        builder.customLineItemId = template.getCustomLineItemId();
        return builder;
    }

}
