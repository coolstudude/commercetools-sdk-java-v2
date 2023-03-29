
package com.commercetools.history.models.common;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * LocalizedString
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     LocalizedString localizedString = LocalizedString.builder()
 *             ./^[a-z]{2}(-[A-Z]{2})?$/("{/^[a-z]{2}(-[A-Z]{2})?$/}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = LocalizedStringImpl.class)
public interface LocalizedString {

    /**
     *
     * @return map of the pattern property values
     */
    @NotNull
    @JsonAnyGetter
    public Map<String, String> values();

    /**
     * set pattern property
     * @param key property name
     * @param value property value
     */

    @JsonAnySetter
    public void setValue(String key, String value);

    /**
     * factory method
     * @return instance of LocalizedString
     */
    public static LocalizedString of() {
        return new LocalizedStringImpl();
    }

    /**
     * factory method to copy an instance of LocalizedString
     * @param template instance to be copied
     * @return copy instance
     */
    public static LocalizedString of(final LocalizedString template) {
        LocalizedStringImpl instance = new LocalizedStringImpl();
        Optional.ofNullable(template).ifPresent(t -> t.values().forEach(instance::setValue));
        return instance;
    }

    /**
     * builder factory method for LocalizedString
     * @return builder
     */
    public static LocalizedStringBuilder builder() {
        return LocalizedStringBuilder.of();
    }

    /**
     * create builder for LocalizedString instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static LocalizedStringBuilder builder(final LocalizedString template) {
        return LocalizedStringBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withLocalizedString(Function<LocalizedString, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<LocalizedString> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<LocalizedString>() {
            @Override
            public String toString() {
                return "TypeReference<LocalizedString>";
            }
        };
    }
}
