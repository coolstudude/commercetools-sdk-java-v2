package com.commercetools.api.models.graph_ql;

import com.commercetools.api.models.graph_ql.GraphQLErrorLocation;
import com.fasterxml.jackson.databind.JsonNode;
import com.commercetools.api.models.graph_ql.GraphQLError;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class GraphQLErrorBuilder {

    
    private String message;
    
    
    private java.util.List<com.commercetools.api.models.graph_ql.GraphQLErrorLocation> locations;
    
    
    private java.util.List<com.fasterxml.jackson.databind.JsonNode> path;

    public GraphQLErrorBuilder message( final String message) {
        this.message = message;
        return this;
    }
    
    public GraphQLErrorBuilder locations( final java.util.List<com.commercetools.api.models.graph_ql.GraphQLErrorLocation> locations) {
        this.locations = locations;
        return this;
    }
    
    public GraphQLErrorBuilder path( final java.util.List<com.fasterxml.jackson.databind.JsonNode> path) {
        this.path = path;
        return this;
    }

    
    public String getMessage(){
        return this.message;
    }
    
    
    public java.util.List<com.commercetools.api.models.graph_ql.GraphQLErrorLocation> getLocations(){
        return this.locations;
    }
    
    
    public java.util.List<com.fasterxml.jackson.databind.JsonNode> getPath(){
        return this.path;
    }

    public GraphQLError build() {
        return new GraphQLErrorImpl(message, locations, path);
    }

    public static GraphQLErrorBuilder of() {
        return new GraphQLErrorBuilder();
    }

    public static GraphQLErrorBuilder of(final GraphQLError template) {
        GraphQLErrorBuilder builder = new GraphQLErrorBuilder();
        builder.message = template.getMessage();
        builder.locations = template.getLocations();
        builder.path = template.getPath();
        return builder;
    }

}
