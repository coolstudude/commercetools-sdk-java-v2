
package com.commercetools.api.models.product_type;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductTypeUpdateBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductTypeUpdate productTypeUpdate = ProductTypeUpdate.builder()
 *             .version(0.3)
 *             .plusActions(actionsBuilder -> actionsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductTypeUpdateBuilder implements Builder<ProductTypeUpdate> {

    private Long version;

    private java.util.List<com.commercetools.api.models.product_type.ProductTypeUpdateAction> actions;

    /**
     *  <p>Expected version of the ProductType on which the changes should be applied. If the expected version does not match the actual version, a ConcurrentModification error is returned.</p>
     * @param version value to be set
     * @return Builder
     */

    public ProductTypeUpdateBuilder version(final Long version) {
        this.version = version;
        return this;
    }

    /**
     *  <p>Update actions to be performed on the ProductType.</p>
     * @param actions value to be set
     * @return Builder
     */

    public ProductTypeUpdateBuilder actions(
            final com.commercetools.api.models.product_type.ProductTypeUpdateAction... actions) {
        this.actions = new ArrayList<>(Arrays.asList(actions));
        return this;
    }

    /**
     *  <p>Update actions to be performed on the ProductType.</p>
     * @param actions value to be set
     * @return Builder
     */

    public ProductTypeUpdateBuilder actions(
            final java.util.List<com.commercetools.api.models.product_type.ProductTypeUpdateAction> actions) {
        this.actions = actions;
        return this;
    }

    /**
     *  <p>Update actions to be performed on the ProductType.</p>
     * @param actions value to be set
     * @return Builder
     */

    public ProductTypeUpdateBuilder plusActions(
            final com.commercetools.api.models.product_type.ProductTypeUpdateAction... actions) {
        if (this.actions == null) {
            this.actions = new ArrayList<>();
        }
        this.actions.addAll(Arrays.asList(actions));
        return this;
    }

    /**
     *  <p>Update actions to be performed on the ProductType.</p>
     * @param builder function to build the actions value
     * @return Builder
     */

    public ProductTypeUpdateBuilder plusActions(
            Function<com.commercetools.api.models.product_type.ProductTypeUpdateActionBuilder, Builder<? extends com.commercetools.api.models.product_type.ProductTypeUpdateAction>> builder) {
        if (this.actions == null) {
            this.actions = new ArrayList<>();
        }
        this.actions.add(
            builder.apply(com.commercetools.api.models.product_type.ProductTypeUpdateActionBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Update actions to be performed on the ProductType.</p>
     * @param builder function to build the actions value
     * @return Builder
     */

    public ProductTypeUpdateBuilder withActions(
            Function<com.commercetools.api.models.product_type.ProductTypeUpdateActionBuilder, Builder<? extends com.commercetools.api.models.product_type.ProductTypeUpdateAction>> builder) {
        this.actions = new ArrayList<>();
        this.actions.add(
            builder.apply(com.commercetools.api.models.product_type.ProductTypeUpdateActionBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Expected version of the ProductType on which the changes should be applied. If the expected version does not match the actual version, a ConcurrentModification error is returned.</p>
     * @return version
     */

    public Long getVersion() {
        return this.version;
    }

    /**
     *  <p>Update actions to be performed on the ProductType.</p>
     * @return actions
     */

    public java.util.List<com.commercetools.api.models.product_type.ProductTypeUpdateAction> getActions() {
        return this.actions;
    }

    /**
     * builds ProductTypeUpdate with checking for non-null required values
     * @return ProductTypeUpdate
     */
    public ProductTypeUpdate build() {
        Objects.requireNonNull(version, ProductTypeUpdate.class + ": version is missing");
        Objects.requireNonNull(actions, ProductTypeUpdate.class + ": actions is missing");
        return new ProductTypeUpdateImpl(version, actions);
    }

    /**
     * builds ProductTypeUpdate without checking for non-null required values
     * @return ProductTypeUpdate
     */
    public ProductTypeUpdate buildUnchecked() {
        return new ProductTypeUpdateImpl(version, actions);
    }

    /**
     * factory method for an instance of ProductTypeUpdateBuilder
     * @return builder
     */
    public static ProductTypeUpdateBuilder of() {
        return new ProductTypeUpdateBuilder();
    }

    /**
     * create builder for ProductTypeUpdate instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductTypeUpdateBuilder of(final ProductTypeUpdate template) {
        ProductTypeUpdateBuilder builder = new ProductTypeUpdateBuilder();
        builder.version = template.getVersion();
        builder.actions = template.getActions();
        return builder;
    }

}
