
package com.commercetools.api.models.store;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * StoreUpdateBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StoreUpdate storeUpdate = StoreUpdate.builder()
 *             .version(0.3)
 *             .plusActions(actionsBuilder -> actionsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StoreUpdateBuilder implements Builder<StoreUpdate> {

    private Long version;

    private java.util.List<com.commercetools.api.models.store.StoreUpdateAction> actions;

    /**
     *  <p>Expected version of the Store on which the changes should be applied. If the expected version does not match the actual version, a ConcurrentModification error is returned.</p>
     * @param version value to be set
     * @return Builder
     */

    public StoreUpdateBuilder version(final Long version) {
        this.version = version;
        return this;
    }

    /**
     *  <p>Update actions to be performed on the Store.</p>
     * @param actions value to be set
     * @return Builder
     */

    public StoreUpdateBuilder actions(final com.commercetools.api.models.store.StoreUpdateAction... actions) {
        this.actions = new ArrayList<>(Arrays.asList(actions));
        return this;
    }

    /**
     *  <p>Update actions to be performed on the Store.</p>
     * @param actions value to be set
     * @return Builder
     */

    public StoreUpdateBuilder actions(
            final java.util.List<com.commercetools.api.models.store.StoreUpdateAction> actions) {
        this.actions = actions;
        return this;
    }

    /**
     *  <p>Update actions to be performed on the Store.</p>
     * @param actions value to be set
     * @return Builder
     */

    public StoreUpdateBuilder plusActions(final com.commercetools.api.models.store.StoreUpdateAction... actions) {
        if (this.actions == null) {
            this.actions = new ArrayList<>();
        }
        this.actions.addAll(Arrays.asList(actions));
        return this;
    }

    /**
     *  <p>Update actions to be performed on the Store.</p>
     * @param builder function to build the actions value
     * @return Builder
     */

    public StoreUpdateBuilder plusActions(
            Function<com.commercetools.api.models.store.StoreUpdateActionBuilder, Builder<? extends com.commercetools.api.models.store.StoreUpdateAction>> builder) {
        if (this.actions == null) {
            this.actions = new ArrayList<>();
        }
        this.actions.add(builder.apply(com.commercetools.api.models.store.StoreUpdateActionBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Update actions to be performed on the Store.</p>
     * @param builder function to build the actions value
     * @return Builder
     */

    public StoreUpdateBuilder withActions(
            Function<com.commercetools.api.models.store.StoreUpdateActionBuilder, Builder<? extends com.commercetools.api.models.store.StoreUpdateAction>> builder) {
        this.actions = new ArrayList<>();
        this.actions.add(builder.apply(com.commercetools.api.models.store.StoreUpdateActionBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Expected version of the Store on which the changes should be applied. If the expected version does not match the actual version, a ConcurrentModification error is returned.</p>
     * @return version
     */

    public Long getVersion() {
        return this.version;
    }

    /**
     *  <p>Update actions to be performed on the Store.</p>
     * @return actions
     */

    public java.util.List<com.commercetools.api.models.store.StoreUpdateAction> getActions() {
        return this.actions;
    }

    /**
     * builds StoreUpdate with checking for non-null required values
     * @return StoreUpdate
     */
    public StoreUpdate build() {
        Objects.requireNonNull(version, StoreUpdate.class + ": version is missing");
        Objects.requireNonNull(actions, StoreUpdate.class + ": actions is missing");
        return new StoreUpdateImpl(version, actions);
    }

    /**
     * builds StoreUpdate without checking for non-null required values
     * @return StoreUpdate
     */
    public StoreUpdate buildUnchecked() {
        return new StoreUpdateImpl(version, actions);
    }

    /**
     * factory method for an instance of StoreUpdateBuilder
     * @return builder
     */
    public static StoreUpdateBuilder of() {
        return new StoreUpdateBuilder();
    }

    /**
     * create builder for StoreUpdate instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StoreUpdateBuilder of(final StoreUpdate template) {
        StoreUpdateBuilder builder = new StoreUpdateBuilder();
        builder.version = template.getVersion();
        builder.actions = template.getActions();
        return builder;
    }

}
