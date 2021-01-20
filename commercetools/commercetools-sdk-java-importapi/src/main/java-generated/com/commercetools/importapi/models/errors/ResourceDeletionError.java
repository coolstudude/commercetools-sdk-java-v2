
package com.commercetools.importapi.models.errors;

import java.io.IOException;
import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.importapi.models.errors.ErrorObject;
import com.commercetools.importapi.models.errors.ResourceDeletionErrorImpl;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.Accessor;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ResourceDeletionErrorImpl.class)
public interface ResourceDeletionError extends ErrorObject {

    String RESOURCE_DELETION = "ResourceDeletion";

    @JsonProperty("resource")
    public JsonNode getResource();

    public void setResource(final JsonNode resource);

    public static ResourceDeletionError of() {
        return new ResourceDeletionErrorImpl();
    }

    public static ResourceDeletionError of(final ResourceDeletionError template) {
        ResourceDeletionErrorImpl instance = new ResourceDeletionErrorImpl();
        instance.setMessage(template.getMessage());
        instance.setResource(template.getResource());
        return instance;
    }

    public static ResourceDeletionErrorBuilder builder() {
        return ResourceDeletionErrorBuilder.of();
    }

    public static ResourceDeletionErrorBuilder builder(final ResourceDeletionError template) {
        return ResourceDeletionErrorBuilder.of(template);
    }

    default <T> T withResourceDeletionError(Function<ResourceDeletionError, T> helper) {
        return helper.apply(this);
    }
}
