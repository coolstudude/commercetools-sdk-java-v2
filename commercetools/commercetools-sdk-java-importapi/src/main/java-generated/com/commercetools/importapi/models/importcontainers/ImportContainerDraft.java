
package com.commercetools.importapi.models.importcontainers;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.constraints.NotNull;

import com.commercetools.importapi.models.common.ImportResourceType;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>The representation sent to the server when creating an ImportContainer.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ImportContainerDraft importContainerDraft = ImportContainerDraft.builder()
 *             .key("{key}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ImportContainerDraftImpl.class)
public interface ImportContainerDraft extends io.vrap.rmf.base.client.Draft<ImportContainerDraft> {

    /**
     *  <p>User-defined unique identifier of the ImportContainer. Keys can only contain alphanumeric characters (a-Z, 0-9), underscores and hyphens (_, -).</p>
     * @return key
     */
    @NotNull
    @JsonProperty("key")
    public String getKey();

    /**
     *  <p>The resource type to be imported. If not given, the ImportContainer is able to import all of the supported ImportResourceTypes.</p>
     * @return resourceType
     */

    @JsonProperty("resourceType")
    public ImportResourceType getResourceType();

    /**
     *  <p>User-defined unique identifier of the ImportContainer. Keys can only contain alphanumeric characters (a-Z, 0-9), underscores and hyphens (_, -).</p>
     * @param key value to be set
     */

    public void setKey(final String key);

    /**
     *  <p>The resource type to be imported. If not given, the ImportContainer is able to import all of the supported ImportResourceTypes.</p>
     * @param resourceType value to be set
     */

    public void setResourceType(final ImportResourceType resourceType);

    /**
     * factory method
     * @return instance of ImportContainerDraft
     */
    public static ImportContainerDraft of() {
        return new ImportContainerDraftImpl();
    }

    /**
     * factory method to create a shallow copy ImportContainerDraft
     * @param template instance to be copied
     * @return copy instance
     */
    public static ImportContainerDraft of(final ImportContainerDraft template) {
        ImportContainerDraftImpl instance = new ImportContainerDraftImpl();
        instance.setKey(template.getKey());
        instance.setResourceType(template.getResourceType());
        return instance;
    }

    /**
     * factory method to create a deep copy of ImportContainerDraft
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ImportContainerDraft deepCopy(@Nullable final ImportContainerDraft template) {
        if (template == null) {
            return null;
        }
        ImportContainerDraftImpl instance = new ImportContainerDraftImpl();
        instance.setKey(template.getKey());
        instance.setResourceType(template.getResourceType());
        return instance;
    }

    /**
     * builder factory method for ImportContainerDraft
     * @return builder
     */
    public static ImportContainerDraftBuilder builder() {
        return ImportContainerDraftBuilder.of();
    }

    /**
     * create builder for ImportContainerDraft instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ImportContainerDraftBuilder builder(final ImportContainerDraft template) {
        return ImportContainerDraftBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withImportContainerDraft(Function<ImportContainerDraft, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ImportContainerDraft> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ImportContainerDraft>() {
            @Override
            public String toString() {
                return "TypeReference<ImportContainerDraft>";
            }
        };
    }
}
