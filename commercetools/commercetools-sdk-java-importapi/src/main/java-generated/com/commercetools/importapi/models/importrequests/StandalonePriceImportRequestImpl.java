
package com.commercetools.importapi.models.importrequests;

import java.time.*;
import java.util.*;

import com.commercetools.importapi.models.common.ImportResourceType;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.ModelBase;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
 *  <p>The request body to import Standalone Prices. Contains data for Standalone Prices to be created or updated in a Project.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StandalonePriceImportRequestImpl implements StandalonePriceImportRequest, ModelBase {

    private com.commercetools.importapi.models.common.ImportResourceType type;

    private java.util.List<com.commercetools.importapi.models.standalone_prices.StandalonePriceImport> resources;

    /**
     * create instance with all properties
     */
    @JsonCreator
    StandalonePriceImportRequestImpl(
            @JsonProperty("resources") final java.util.List<com.commercetools.importapi.models.standalone_prices.StandalonePriceImport> resources) {
        this.resources = resources;
        this.type = ImportResourceType.findEnum("standalone-price");
    }

    /**
     * create empty instance
     */
    public StandalonePriceImportRequestImpl() {
        this.type = ImportResourceType.findEnum("standalone-price");
    }

    /**
     *  <p>The type of the import resource.</p>
     */

    public com.commercetools.importapi.models.common.ImportResourceType getType() {
        return this.type;
    }

    /**
     *  <p>The Standalone Price import resources of this request.</p>
     */

    public java.util.List<com.commercetools.importapi.models.standalone_prices.StandalonePriceImport> getResources() {
        return this.resources;
    }

    public void setResources(
            final com.commercetools.importapi.models.standalone_prices.StandalonePriceImport... resources) {
        this.resources = new ArrayList<>(Arrays.asList(resources));
    }

    public void setResources(
            final java.util.List<com.commercetools.importapi.models.standalone_prices.StandalonePriceImport> resources) {
        this.resources = resources;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        StandalonePriceImportRequestImpl that = (StandalonePriceImportRequestImpl) o;

        return new EqualsBuilder().append(type, that.type).append(resources, that.resources).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type).append(resources).toHashCode();
    }

}
