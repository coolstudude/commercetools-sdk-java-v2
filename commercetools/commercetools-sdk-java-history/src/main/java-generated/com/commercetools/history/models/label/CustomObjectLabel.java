
package com.commercetools.history.models.label;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * CustomObjectLabel
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomObjectLabel customObjectLabel = CustomObjectLabel.builder()
 *             .key("{key}")
 *             .container("{container}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CustomObjectLabelImpl.class)
public interface CustomObjectLabel extends Label {

    /**
     * discriminator value for CustomObjectLabel
     */
    String CUSTOM_OBJECT_LABEL = "CustomObjectLabel";

    /**
     *
     * @return type
     */
    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
     *
     * @return key
     */
    @NotNull
    @JsonProperty("key")
    public String getKey();

    /**
     *
     * @return container
     */
    @NotNull
    @JsonProperty("container")
    public String getContainer();

    /**
     * set key
     * @param key value to be set
     */

    public void setKey(final String key);

    /**
     * set container
     * @param container value to be set
     */

    public void setContainer(final String container);

    /**
     * factory method
     * @return instance of CustomObjectLabel
     */
    public static CustomObjectLabel of() {
        return new CustomObjectLabelImpl();
    }

    /**
     * factory method to copy an instance of CustomObjectLabel
     * @param template instance to be copied
     * @return copy instance
     */
    public static CustomObjectLabel of(final CustomObjectLabel template) {
        CustomObjectLabelImpl instance = new CustomObjectLabelImpl();
        instance.setKey(template.getKey());
        instance.setContainer(template.getContainer());
        return instance;
    }

    /**
     * builder factory method for CustomObjectLabel
     * @return builder
     */
    public static CustomObjectLabelBuilder builder() {
        return CustomObjectLabelBuilder.of();
    }

    /**
     * create builder for CustomObjectLabel instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CustomObjectLabelBuilder builder(final CustomObjectLabel template) {
        return CustomObjectLabelBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCustomObjectLabel(Function<CustomObjectLabel, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CustomObjectLabel> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CustomObjectLabel>() {
            @Override
            public String toString() {
                return "TypeReference<CustomObjectLabel>";
            }
        };
    }
}
