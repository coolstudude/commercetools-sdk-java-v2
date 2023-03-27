
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Generated after a successful Revert Staged Changes update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductRevertedStagedChangesMessage productRevertedStagedChangesMessage = ProductRevertedStagedChangesMessage.builder()
 *             .id("{id}")
 *             .version(0.3)
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .sequenceNumber(0.3)
 *             .resource(resourceBuilder -> resourceBuilder)
 *             .resourceVersion(0.3)
 *             .plusRemovedImageUrls(removedImageUrlsBuilder -> removedImageUrlsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductRevertedStagedChangesMessageImpl.class)
public interface ProductRevertedStagedChangesMessage extends Message {

    /**
     * discriminator value for ProductRevertedStagedChangesMessage
     */
    String PRODUCT_REVERTED_STAGED_CHANGES = "ProductRevertedStagedChanges";

    /**
     *  <p>List of image URLs that were removed during the Revert Staged Changes update action.</p>
     * @return removedImageUrls
     */
    @NotNull
    @JsonProperty("removedImageUrls")
    public List<String> getRemovedImageUrls();

    /**
     *  <p>List of image URLs that were removed during the Revert Staged Changes update action.</p>
     * @param removedImageUrls values to be set
     */

    @JsonIgnore
    public void setRemovedImageUrls(final String... removedImageUrls);

    /**
     *  <p>List of image URLs that were removed during the Revert Staged Changes update action.</p>
     * @param removedImageUrls values to be set
     */

    public void setRemovedImageUrls(final List<String> removedImageUrls);

    /**
     * factory method
     * @return instance of ProductRevertedStagedChangesMessage
     */
    public static ProductRevertedStagedChangesMessage of() {
        return new ProductRevertedStagedChangesMessageImpl();
    }

    /**
     * factory method to copy an instance of ProductRevertedStagedChangesMessage
     * @param template instance to be copied
     * @return copy instance
     */
    public static ProductRevertedStagedChangesMessage of(final ProductRevertedStagedChangesMessage template) {
        ProductRevertedStagedChangesMessageImpl instance = new ProductRevertedStagedChangesMessageImpl();
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
        instance.setRemovedImageUrls(template.getRemovedImageUrls());
        return instance;
    }

    /**
     * builder factory method for ProductRevertedStagedChangesMessage
     * @return builder
     */
    public static ProductRevertedStagedChangesMessageBuilder builder() {
        return ProductRevertedStagedChangesMessageBuilder.of();
    }

    /**
     * create builder for ProductRevertedStagedChangesMessage instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductRevertedStagedChangesMessageBuilder builder(
            final ProductRevertedStagedChangesMessage template) {
        return ProductRevertedStagedChangesMessageBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProductRevertedStagedChangesMessage(Function<ProductRevertedStagedChangesMessage, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ProductRevertedStagedChangesMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductRevertedStagedChangesMessage>() {
            @Override
            public String toString() {
                return "TypeReference<ProductRevertedStagedChangesMessage>";
            }
        };
    }
}
