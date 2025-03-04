
package com.commercetools.ml.models.image_search_config;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * ImageSearchConfigUpdateAction
 *
 * <hr>
 * Example to create a subtype instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ImageSearchConfigUpdateAction imageSearchConfigUpdateAction = ImageSearchConfigUpdateAction.changeStatusBuilder()
 *             status(ImageSearchConfigStatus.ON)
 *             .build()
 * </code></pre>
 * </div>
 */
@JsonSubTypes({
        @JsonSubTypes.Type(value = com.commercetools.ml.models.image_search_config.ChangeStatusUpdateActionImpl.class, name = ChangeStatusUpdateAction.CHANGE_STATUS) })
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "action", defaultImpl = ImageSearchConfigUpdateActionImpl.class, visible = true)
@JsonDeserialize(as = ImageSearchConfigUpdateActionImpl.class)
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public interface ImageSearchConfigUpdateAction {

    /**
     *
     * @return action
     */
    @NotNull
    @JsonProperty("action")
    public String getAction();

    /**
     * factory method to create a deep copy of ImageSearchConfigUpdateAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ImageSearchConfigUpdateAction deepCopy(@Nullable final ImageSearchConfigUpdateAction template) {
        if (template == null) {
            return null;
        }
        if (template instanceof com.commercetools.ml.models.image_search_config.ChangeStatusUpdateAction) {
            return com.commercetools.ml.models.image_search_config.ChangeStatusUpdateAction
                    .deepCopy((com.commercetools.ml.models.image_search_config.ChangeStatusUpdateAction) template);
        }
        ImageSearchConfigUpdateActionImpl instance = new ImageSearchConfigUpdateActionImpl();
        return instance;
    }

    /**
     * builder for changeStatus subtype
     * @return builder
     */
    public static com.commercetools.ml.models.image_search_config.ChangeStatusUpdateActionBuilder changeStatusBuilder() {
        return com.commercetools.ml.models.image_search_config.ChangeStatusUpdateActionBuilder.of();
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withImageSearchConfigUpdateAction(Function<ImageSearchConfigUpdateAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ImageSearchConfigUpdateAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ImageSearchConfigUpdateAction>() {
            @Override
            public String toString() {
                return "TypeReference<ImageSearchConfigUpdateAction>";
            }
        };
    }
}
