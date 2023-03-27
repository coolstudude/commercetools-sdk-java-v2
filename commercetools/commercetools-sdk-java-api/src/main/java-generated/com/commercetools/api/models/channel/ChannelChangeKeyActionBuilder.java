
package com.commercetools.api.models.channel;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ChannelChangeKeyActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ChannelChangeKeyAction channelChangeKeyAction = ChannelChangeKeyAction.builder()
 *             .key("{key}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ChannelChangeKeyActionBuilder implements Builder<ChannelChangeKeyAction> {

    private String key;

    /**
     *  <p>New value to set. Must not be empty.</p>
     * @param key value to be set
     * @return Builder
     */

    public ChannelChangeKeyActionBuilder key(final String key) {
        this.key = key;
        return this;
    }

    /**
     *  <p>New value to set. Must not be empty.</p>
     * @return key
     */

    public String getKey() {
        return this.key;
    }

    /**
     * builds ChannelChangeKeyAction with checking for non-null required values
     * @return ChannelChangeKeyAction
     */
    public ChannelChangeKeyAction build() {
        Objects.requireNonNull(key, ChannelChangeKeyAction.class + ": key is missing");
        return new ChannelChangeKeyActionImpl(key);
    }

    /**
     * builds ChannelChangeKeyAction without checking for non-null required values
     * @return ChannelChangeKeyAction
     */
    public ChannelChangeKeyAction buildUnchecked() {
        return new ChannelChangeKeyActionImpl(key);
    }

    /**
     * factory method for an instance of ChannelChangeKeyActionBuilder
     * @return builder
     */
    public static ChannelChangeKeyActionBuilder of() {
        return new ChannelChangeKeyActionBuilder();
    }

    /**
     * create builder for ChannelChangeKeyAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ChannelChangeKeyActionBuilder of(final ChannelChangeKeyAction template) {
        ChannelChangeKeyActionBuilder builder = new ChannelChangeKeyActionBuilder();
        builder.key = template.getKey();
        return builder;
    }

}
