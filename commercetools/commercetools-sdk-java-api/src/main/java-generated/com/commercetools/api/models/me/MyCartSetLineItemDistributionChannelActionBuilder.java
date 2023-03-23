
package com.commercetools.api.models.me;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * MyCartSetLineItemDistributionChannelActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MyCartSetLineItemDistributionChannelAction myCartSetLineItemDistributionChannelAction = MyCartSetLineItemDistributionChannelAction.builder()
 *             .lineItemId("{lineItemId}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class MyCartSetLineItemDistributionChannelActionBuilder
        implements Builder<MyCartSetLineItemDistributionChannelAction> {

    private String lineItemId;

    @Nullable
    private com.commercetools.api.models.channel.ChannelResourceIdentifier distributionChannel;

    /**
     *  <p><code>id</code> of the LineItem to update.</p>
     * @param lineItemId
     * @return Builder
     */

    public MyCartSetLineItemDistributionChannelActionBuilder lineItemId(final String lineItemId) {
        this.lineItemId = lineItemId;
        return this;
    }

    /**
     *  <ul>
     *   <li>If present, a Reference to the Channel is set for the LineItem specified by <code>lineItemId</code>.</li>
     *   <li>If not present, the current Reference to a distribution channel is removed from the LineItem specified by <code>lineItemId</code>. The Channel must have the <code>ProductDistribution</code> ChannelRoleEnum.</li>
     *  </ul>
     * @return Builder
     */

    public MyCartSetLineItemDistributionChannelActionBuilder distributionChannel(
            Function<com.commercetools.api.models.channel.ChannelResourceIdentifierBuilder, com.commercetools.api.models.channel.ChannelResourceIdentifierBuilder> builder) {
        this.distributionChannel = builder
                .apply(com.commercetools.api.models.channel.ChannelResourceIdentifierBuilder.of())
                .build();
        return this;
    }

    /**
     *  <ul>
     *   <li>If present, a Reference to the Channel is set for the LineItem specified by <code>lineItemId</code>.</li>
     *   <li>If not present, the current Reference to a distribution channel is removed from the LineItem specified by <code>lineItemId</code>. The Channel must have the <code>ProductDistribution</code> ChannelRoleEnum.</li>
     *  </ul>
     * @param distributionChannel
     * @return Builder
     */

    public MyCartSetLineItemDistributionChannelActionBuilder distributionChannel(
            @Nullable final com.commercetools.api.models.channel.ChannelResourceIdentifier distributionChannel) {
        this.distributionChannel = distributionChannel;
        return this;
    }

    public String getLineItemId() {
        return this.lineItemId;
    }

    @Nullable
    public com.commercetools.api.models.channel.ChannelResourceIdentifier getDistributionChannel() {
        return this.distributionChannel;
    }

    public MyCartSetLineItemDistributionChannelAction build() {
        Objects.requireNonNull(lineItemId,
            MyCartSetLineItemDistributionChannelAction.class + ": lineItemId is missing");
        return new MyCartSetLineItemDistributionChannelActionImpl(lineItemId, distributionChannel);
    }

    /**
     * builds MyCartSetLineItemDistributionChannelAction without checking for non null required values
     */
    public MyCartSetLineItemDistributionChannelAction buildUnchecked() {
        return new MyCartSetLineItemDistributionChannelActionImpl(lineItemId, distributionChannel);
    }

    public static MyCartSetLineItemDistributionChannelActionBuilder of() {
        return new MyCartSetLineItemDistributionChannelActionBuilder();
    }

    public static MyCartSetLineItemDistributionChannelActionBuilder of(
            final MyCartSetLineItemDistributionChannelAction template) {
        MyCartSetLineItemDistributionChannelActionBuilder builder = new MyCartSetLineItemDistributionChannelActionBuilder();
        builder.lineItemId = template.getLineItemId();
        builder.distributionChannel = template.getDistributionChannel();
        return builder;
    }

}
