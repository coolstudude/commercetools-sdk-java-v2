
package com.commercetools.api.models.inventory;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.common.Reference;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
*  <p><a href="ctp:api:type:Reference">Reference</a> to a <a href="ctp:api:type:InventoryEntry">InventoryEntry</a>.</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = InventoryEntryReferenceImpl.class)
public interface InventoryEntryReference extends Reference, com.commercetools.api.models.Identifiable<InventoryEntry> {

    String INVENTORY_ENTRY = "inventory-entry";

    /**
    *  <p>Contains the representation of the expanded InventoryEntry. Only present in responses to requests with <a href="/../api/general-concepts#reference-expansion">Reference Expansion</a> for InventoryEntries.</p>
    */
    @Valid
    @JsonProperty("obj")
    public InventoryEntry getObj();

    /**
    *  <p>Platform-generated unique identifier of the referenced <a href="ctp:api:type:InventoryEntry">InventoryEntry</a>.</p>
    */
    @NotNull
    @JsonProperty("id")
    public String getId();

    public void setObj(final InventoryEntry obj);

    public void setId(final String id);

    public static InventoryEntryReference of() {
        return new InventoryEntryReferenceImpl();
    }

    public static InventoryEntryReference of(final InventoryEntryReference template) {
        InventoryEntryReferenceImpl instance = new InventoryEntryReferenceImpl();
        instance.setId(template.getId());
        instance.setObj(template.getObj());
        return instance;
    }

    public static InventoryEntryReferenceBuilder builder() {
        return InventoryEntryReferenceBuilder.of();
    }

    public static InventoryEntryReferenceBuilder builder(final InventoryEntryReference template) {
        return InventoryEntryReferenceBuilder.of(template);
    }

    default <T> T withInventoryEntryReference(Function<InventoryEntryReference, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<InventoryEntryReference> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<InventoryEntryReference>() {
            @Override
            public String toString() {
                return "TypeReference<InventoryEntryReference>";
            }
        };
    }
}
