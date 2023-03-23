
package com.commercetools.api.models.graph_ql;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * GraphQLErrorBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     GraphQLError graphQLError = GraphQLError.builder()
 *             .message("{message}")
 *             .plusLocations(locationsBuilder -> locationsBuilder)
 *             .plusPath(pathBuilder -> pathBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class GraphQLErrorBuilder implements Builder<GraphQLError> {

    private String message;

    private java.util.List<com.commercetools.api.models.graph_ql.GraphQLErrorLocation> locations;

    private java.util.List<java.lang.Object> path;

    /**
     *
     * @param message
     * @return Builder
     */

    public GraphQLErrorBuilder message(final String message) {
        this.message = message;
        return this;
    }

    /**
     *
     * @param locations
     * @return Builder
     */

    public GraphQLErrorBuilder locations(
            final com.commercetools.api.models.graph_ql.GraphQLErrorLocation... locations) {
        this.locations = new ArrayList<>(Arrays.asList(locations));
        return this;
    }

    /**
     *
     * @param locations
     * @return Builder
     */

    public GraphQLErrorBuilder locations(
            final java.util.List<com.commercetools.api.models.graph_ql.GraphQLErrorLocation> locations) {
        this.locations = locations;
        return this;
    }

    /**
     *
     * @param locations
     * @return Builder
     */

    public GraphQLErrorBuilder plusLocations(
            final com.commercetools.api.models.graph_ql.GraphQLErrorLocation... locations) {
        if (this.locations == null) {
            this.locations = new ArrayList<>();
        }
        this.locations.addAll(Arrays.asList(locations));
        return this;
    }

    /**
     *
     * @return Builder
     */

    public GraphQLErrorBuilder plusLocations(
            Function<com.commercetools.api.models.graph_ql.GraphQLErrorLocationBuilder, com.commercetools.api.models.graph_ql.GraphQLErrorLocationBuilder> builder) {
        if (this.locations == null) {
            this.locations = new ArrayList<>();
        }
        this.locations
                .add(builder.apply(com.commercetools.api.models.graph_ql.GraphQLErrorLocationBuilder.of()).build());
        return this;
    }

    /**
     *
     * @return Builder
     */

    public GraphQLErrorBuilder withLocations(
            Function<com.commercetools.api.models.graph_ql.GraphQLErrorLocationBuilder, com.commercetools.api.models.graph_ql.GraphQLErrorLocationBuilder> builder) {
        this.locations = new ArrayList<>();
        this.locations
                .add(builder.apply(com.commercetools.api.models.graph_ql.GraphQLErrorLocationBuilder.of()).build());
        return this;
    }

    /**
     *
     * @param path
     * @return Builder
     */

    public GraphQLErrorBuilder path(final java.lang.Object... path) {
        this.path = new ArrayList<>(Arrays.asList(path));
        return this;
    }

    /**
     *
     * @param path
     * @return Builder
     */

    public GraphQLErrorBuilder path(final java.util.List<java.lang.Object> path) {
        this.path = path;
        return this;
    }

    /**
     *
     * @param path
     * @return Builder
     */

    public GraphQLErrorBuilder plusPath(final java.lang.Object... path) {
        if (this.path == null) {
            this.path = new ArrayList<>();
        }
        this.path.addAll(Arrays.asList(path));
        return this;
    }

    public String getMessage() {
        return this.message;
    }

    public java.util.List<com.commercetools.api.models.graph_ql.GraphQLErrorLocation> getLocations() {
        return this.locations;
    }

    public java.util.List<java.lang.Object> getPath() {
        return this.path;
    }

    public GraphQLError build() {
        Objects.requireNonNull(message, GraphQLError.class + ": message is missing");
        Objects.requireNonNull(locations, GraphQLError.class + ": locations is missing");
        Objects.requireNonNull(path, GraphQLError.class + ": path is missing");
        return new GraphQLErrorImpl(message, locations, path);
    }

    /**
     * builds GraphQLError without checking for non null required values
     */
    public GraphQLError buildUnchecked() {
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
