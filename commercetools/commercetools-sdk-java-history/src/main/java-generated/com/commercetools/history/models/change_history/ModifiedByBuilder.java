
package com.commercetools.history.models.change_history;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ModifiedByBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ModifiedBy modifiedBy = ModifiedBy.builder()
 *             .id("{id}")
 *             .type("{type}")
 *             .isPlatformClient(true)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ModifiedByBuilder implements Builder<ModifiedBy> {

    private String id;

    private String type;

    @Nullable
    private com.commercetools.history.models.common.Reference customer;

    @Nullable
    private String anonymousId;

    @Nullable
    private String clientId;

    private Boolean isPlatformClient;

    /**
     *  <p>ID of the Merchant Center user who made the change.</p>
     *  <p>Present only if the change was made in the Merchant Center.</p>
     * @param id value to be set
     * @return Builder
     */

    public ModifiedByBuilder id(final String id) {
        this.id = id;
        return this;
    }

    /**
     *  <p>Indicates who performed the change.</p>
     *  <ul>
     *   <li>If the change was made by a user, the value is <code>"user"</code>.</li>
     *   <li>If the change was made by an API Client with or without an external user ID, the value is <code>"external-user"</code>.</li>
     *  </ul>
     * @param type value to be set
     * @return Builder
     */

    public ModifiedByBuilder type(final String type) {
        this.type = type;
        return this;
    }

    /**
     *  <p>Reference to the Customer who made the change.</p>
     *  <p>Present only if the change was made using a token from the password flow.</p>
     * @param builder function to build the customer value
     * @return Builder
     */

    public ModifiedByBuilder customer(
            Function<com.commercetools.history.models.common.ReferenceBuilder, com.commercetools.history.models.common.ReferenceBuilder> builder) {
        this.customer = builder.apply(com.commercetools.history.models.common.ReferenceBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Reference to the Customer who made the change.</p>
     *  <p>Present only if the change was made using a token from the password flow.</p>
     * @param builder function to build the customer value
     * @return Builder
     */

    public ModifiedByBuilder withCustomer(
            Function<com.commercetools.history.models.common.ReferenceBuilder, com.commercetools.history.models.common.Reference> builder) {
        this.customer = builder.apply(com.commercetools.history.models.common.ReferenceBuilder.of());
        return this;
    }

    /**
     *  <p>Reference to the Customer who made the change.</p>
     *  <p>Present only if the change was made using a token from the password flow.</p>
     * @param customer value to be set
     * @return Builder
     */

    public ModifiedByBuilder customer(@Nullable final com.commercetools.history.models.common.Reference customer) {
        this.customer = customer;
        return this;
    }

    /**
     *  <p>Present only if the change was made using a token from an anonymous session.</p>
     * @param anonymousId value to be set
     * @return Builder
     */

    public ModifiedByBuilder anonymousId(@Nullable final String anonymousId) {
        this.anonymousId = anonymousId;
        return this;
    }

    /**
     *  <p>ID of the API Client that made the change.</p>
     *  <p>Present only if the change was made using an API Client.</p>
     * @param clientId value to be set
     * @return Builder
     */

    public ModifiedByBuilder clientId(@Nullable final String clientId) {
        this.clientId = clientId;
        return this;
    }

    /**
     *  <p><code>true</code> if the change was made using the Merchant Center or ImpEx.</p>
     * @param isPlatformClient value to be set
     * @return Builder
     */

    public ModifiedByBuilder isPlatformClient(final Boolean isPlatformClient) {
        this.isPlatformClient = isPlatformClient;
        return this;
    }

    /**
     *  <p>ID of the Merchant Center user who made the change.</p>
     *  <p>Present only if the change was made in the Merchant Center.</p>
     * @return id
     */

    public String getId() {
        return this.id;
    }

    /**
     *  <p>Indicates who performed the change.</p>
     *  <ul>
     *   <li>If the change was made by a user, the value is <code>"user"</code>.</li>
     *   <li>If the change was made by an API Client with or without an external user ID, the value is <code>"external-user"</code>.</li>
     *  </ul>
     * @return type
     */

    public String getType() {
        return this.type;
    }

    /**
     *  <p>Reference to the Customer who made the change.</p>
     *  <p>Present only if the change was made using a token from the password flow.</p>
     * @return customer
     */

    @Nullable
    public com.commercetools.history.models.common.Reference getCustomer() {
        return this.customer;
    }

    /**
     *  <p>Present only if the change was made using a token from an anonymous session.</p>
     * @return anonymousId
     */

    @Nullable
    public String getAnonymousId() {
        return this.anonymousId;
    }

    /**
     *  <p>ID of the API Client that made the change.</p>
     *  <p>Present only if the change was made using an API Client.</p>
     * @return clientId
     */

    @Nullable
    public String getClientId() {
        return this.clientId;
    }

    /**
     *  <p><code>true</code> if the change was made using the Merchant Center or ImpEx.</p>
     * @return isPlatformClient
     */

    public Boolean getIsPlatformClient() {
        return this.isPlatformClient;
    }

    /**
     * builds ModifiedBy with checking for non-null required values
     * @return ModifiedBy
     */
    public ModifiedBy build() {
        Objects.requireNonNull(id, ModifiedBy.class + ": id is missing");
        Objects.requireNonNull(type, ModifiedBy.class + ": type is missing");
        Objects.requireNonNull(isPlatformClient, ModifiedBy.class + ": isPlatformClient is missing");
        return new ModifiedByImpl(id, type, customer, anonymousId, clientId, isPlatformClient);
    }

    /**
     * builds ModifiedBy without checking for non-null required values
     * @return ModifiedBy
     */
    public ModifiedBy buildUnchecked() {
        return new ModifiedByImpl(id, type, customer, anonymousId, clientId, isPlatformClient);
    }

    /**
     * factory method for an instance of ModifiedByBuilder
     * @return builder
     */
    public static ModifiedByBuilder of() {
        return new ModifiedByBuilder();
    }

    /**
     * create builder for ModifiedBy instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ModifiedByBuilder of(final ModifiedBy template) {
        ModifiedByBuilder builder = new ModifiedByBuilder();
        builder.id = template.getId();
        builder.type = template.getType();
        builder.customer = template.getCustomer();
        builder.anonymousId = template.getAnonymousId();
        builder.clientId = template.getClientId();
        builder.isPlatformClient = template.getIsPlatformClient();
        return builder;
    }

}
