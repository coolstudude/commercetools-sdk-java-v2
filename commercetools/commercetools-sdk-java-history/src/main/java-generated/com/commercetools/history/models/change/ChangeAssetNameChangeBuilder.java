
package com.commercetools.history.models.change;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ChangeAssetNameChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ChangeAssetNameChange changeAssetNameChange = ChangeAssetNameChange.builder()
 *             .change("{change}")
 *             .asset(assetBuilder -> assetBuilder)
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .previousValue(previousValueBuilder -> previousValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ChangeAssetNameChangeBuilder implements Builder<ChangeAssetNameChange> {

    private String change;

    private com.commercetools.history.models.change_value.AssetChangeValue asset;

    private com.commercetools.history.models.common.LocalizedString nextValue;

    private com.commercetools.history.models.common.LocalizedString previousValue;

    /**
     *  <p>Update action for <code>changeAssetName</code></p>
     * @param change value to be set
     * @return Builder
     */

    public ChangeAssetNameChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     * set the value to the asset using the builder function
     * @param builder function to build the asset value
     * @return Builder
     */

    public ChangeAssetNameChangeBuilder asset(
            Function<com.commercetools.history.models.change_value.AssetChangeValueBuilder, com.commercetools.history.models.change_value.AssetChangeValueBuilder> builder) {
        this.asset = builder.apply(com.commercetools.history.models.change_value.AssetChangeValueBuilder.of()).build();
        return this;
    }

    /**
     * set the value to the asset using the builder function
     * @param builder function to build the asset value
     * @return Builder
     */

    public ChangeAssetNameChangeBuilder withAsset(
            Function<com.commercetools.history.models.change_value.AssetChangeValueBuilder, com.commercetools.history.models.change_value.AssetChangeValue> builder) {
        this.asset = builder.apply(com.commercetools.history.models.change_value.AssetChangeValueBuilder.of());
        return this;
    }

    /**
     * set the value to the asset
     * @param asset value to be set
     * @return Builder
     */

    public ChangeAssetNameChangeBuilder asset(
            final com.commercetools.history.models.change_value.AssetChangeValue asset) {
        this.asset = asset;
        return this;
    }

    /**
     * set the value to the nextValue using the builder function
     * @param builder function to build the nextValue value
     * @return Builder
     */

    public ChangeAssetNameChangeBuilder nextValue(
            Function<com.commercetools.history.models.common.LocalizedStringBuilder, com.commercetools.history.models.common.LocalizedStringBuilder> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     * set the value to the nextValue using the builder function
     * @param builder function to build the nextValue value
     * @return Builder
     */

    public ChangeAssetNameChangeBuilder withNextValue(
            Function<com.commercetools.history.models.common.LocalizedStringBuilder, com.commercetools.history.models.common.LocalizedString> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.common.LocalizedStringBuilder.of());
        return this;
    }

    /**
     * set the value to the nextValue
     * @param nextValue value to be set
     * @return Builder
     */

    public ChangeAssetNameChangeBuilder nextValue(
            final com.commercetools.history.models.common.LocalizedString nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    /**
     * set the value to the previousValue using the builder function
     * @param builder function to build the previousValue value
     * @return Builder
     */

    public ChangeAssetNameChangeBuilder previousValue(
            Function<com.commercetools.history.models.common.LocalizedStringBuilder, com.commercetools.history.models.common.LocalizedStringBuilder> builder) {
        this.previousValue = builder.apply(com.commercetools.history.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     * set the value to the previousValue using the builder function
     * @param builder function to build the previousValue value
     * @return Builder
     */

    public ChangeAssetNameChangeBuilder withPreviousValue(
            Function<com.commercetools.history.models.common.LocalizedStringBuilder, com.commercetools.history.models.common.LocalizedString> builder) {
        this.previousValue = builder.apply(com.commercetools.history.models.common.LocalizedStringBuilder.of());
        return this;
    }

    /**
     * set the value to the previousValue
     * @param previousValue value to be set
     * @return Builder
     */

    public ChangeAssetNameChangeBuilder previousValue(
            final com.commercetools.history.models.common.LocalizedString previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    /**
     *  <p>Update action for <code>changeAssetName</code></p>
     * @return change
     */

    public String getChange() {
        return this.change;
    }

    /**
     * value of asset}
     * @return asset
     */

    public com.commercetools.history.models.change_value.AssetChangeValue getAsset() {
        return this.asset;
    }

    /**
     * value of nextValue}
     * @return nextValue
     */

    public com.commercetools.history.models.common.LocalizedString getNextValue() {
        return this.nextValue;
    }

    /**
     * value of previousValue}
     * @return previousValue
     */

    public com.commercetools.history.models.common.LocalizedString getPreviousValue() {
        return this.previousValue;
    }

    /**
     * builds ChangeAssetNameChange with checking for non-null required values
     * @return ChangeAssetNameChange
     */
    public ChangeAssetNameChange build() {
        Objects.requireNonNull(change, ChangeAssetNameChange.class + ": change is missing");
        Objects.requireNonNull(asset, ChangeAssetNameChange.class + ": asset is missing");
        Objects.requireNonNull(nextValue, ChangeAssetNameChange.class + ": nextValue is missing");
        Objects.requireNonNull(previousValue, ChangeAssetNameChange.class + ": previousValue is missing");
        return new ChangeAssetNameChangeImpl(change, asset, nextValue, previousValue);
    }

    /**
     * builds ChangeAssetNameChange without checking for non-null required values
     * @return ChangeAssetNameChange
     */
    public ChangeAssetNameChange buildUnchecked() {
        return new ChangeAssetNameChangeImpl(change, asset, nextValue, previousValue);
    }

    /**
     * factory method for an instance of ChangeAssetNameChangeBuilder
     * @return builder
     */
    public static ChangeAssetNameChangeBuilder of() {
        return new ChangeAssetNameChangeBuilder();
    }

    /**
     * create builder for ChangeAssetNameChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ChangeAssetNameChangeBuilder of(final ChangeAssetNameChange template) {
        ChangeAssetNameChangeBuilder builder = new ChangeAssetNameChangeBuilder();
        builder.change = template.getChange();
        builder.asset = template.getAsset();
        builder.nextValue = template.getNextValue();
        builder.previousValue = template.getPreviousValue();
        return builder;
    }

}
