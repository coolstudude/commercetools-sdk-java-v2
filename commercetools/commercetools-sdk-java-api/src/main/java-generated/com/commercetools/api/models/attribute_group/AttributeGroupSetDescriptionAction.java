
package com.commercetools.api.models.attribute_group;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;

import com.commercetools.api.models.common.LocalizedString;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * AttributeGroupSetDescriptionAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     AttributeGroupSetDescriptionAction attributeGroupSetDescriptionAction = AttributeGroupSetDescriptionAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = AttributeGroupSetDescriptionActionImpl.class)
public interface AttributeGroupSetDescriptionAction extends AttributeGroupUpdateAction {

    String SET_DESCRIPTION = "setDescription";

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @return description
     */
    @Valid
    @JsonProperty("description")
    public LocalizedString getDescription();

    public void setDescription(final LocalizedString description);

    public static AttributeGroupSetDescriptionAction of() {
        return new AttributeGroupSetDescriptionActionImpl();
    }

    public static AttributeGroupSetDescriptionAction of(final AttributeGroupSetDescriptionAction template) {
        AttributeGroupSetDescriptionActionImpl instance = new AttributeGroupSetDescriptionActionImpl();
        instance.setDescription(template.getDescription());
        return instance;
    }

    public static AttributeGroupSetDescriptionActionBuilder builder() {
        return AttributeGroupSetDescriptionActionBuilder.of();
    }

    public static AttributeGroupSetDescriptionActionBuilder builder(final AttributeGroupSetDescriptionAction template) {
        return AttributeGroupSetDescriptionActionBuilder.of(template);
    }

    default <T> T withAttributeGroupSetDescriptionAction(Function<AttributeGroupSetDescriptionAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<AttributeGroupSetDescriptionAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<AttributeGroupSetDescriptionAction>() {
            @Override
            public String toString() {
                return "TypeReference<AttributeGroupSetDescriptionAction>";
            }
        };
    }
}
