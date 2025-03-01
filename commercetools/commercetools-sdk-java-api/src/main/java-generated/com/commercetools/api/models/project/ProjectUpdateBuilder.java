
package com.commercetools.api.models.project;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProjectUpdateBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProjectUpdate projectUpdate = ProjectUpdate.builder()
 *             .version(0.3)
 *             .plusActions(actionsBuilder -> actionsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProjectUpdateBuilder implements Builder<ProjectUpdate> {

    private Long version;

    private java.util.List<com.commercetools.api.models.project.ProjectUpdateAction> actions;

    /**
     *  <p>Expected version of the Project on which the changes should be applied. If the expected version does not match the actual version, a ConcurrentModification error is returned.</p>
     * @param version value to be set
     * @return Builder
     */

    public ProjectUpdateBuilder version(final Long version) {
        this.version = version;
        return this;
    }

    /**
     *  <p>Update actions to be performed on the Project.</p>
     * @param actions value to be set
     * @return Builder
     */

    public ProjectUpdateBuilder actions(final com.commercetools.api.models.project.ProjectUpdateAction... actions) {
        this.actions = new ArrayList<>(Arrays.asList(actions));
        return this;
    }

    /**
     *  <p>Update actions to be performed on the Project.</p>
     * @param actions value to be set
     * @return Builder
     */

    public ProjectUpdateBuilder actions(
            final java.util.List<com.commercetools.api.models.project.ProjectUpdateAction> actions) {
        this.actions = actions;
        return this;
    }

    /**
     *  <p>Update actions to be performed on the Project.</p>
     * @param actions value to be set
     * @return Builder
     */

    public ProjectUpdateBuilder plusActions(final com.commercetools.api.models.project.ProjectUpdateAction... actions) {
        if (this.actions == null) {
            this.actions = new ArrayList<>();
        }
        this.actions.addAll(Arrays.asList(actions));
        return this;
    }

    /**
     *  <p>Update actions to be performed on the Project.</p>
     * @param builder function to build the actions value
     * @return Builder
     */

    public ProjectUpdateBuilder plusActions(
            Function<com.commercetools.api.models.project.ProjectUpdateActionBuilder, Builder<? extends com.commercetools.api.models.project.ProjectUpdateAction>> builder) {
        if (this.actions == null) {
            this.actions = new ArrayList<>();
        }
        this.actions.add(builder.apply(com.commercetools.api.models.project.ProjectUpdateActionBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Update actions to be performed on the Project.</p>
     * @param builder function to build the actions value
     * @return Builder
     */

    public ProjectUpdateBuilder withActions(
            Function<com.commercetools.api.models.project.ProjectUpdateActionBuilder, Builder<? extends com.commercetools.api.models.project.ProjectUpdateAction>> builder) {
        this.actions = new ArrayList<>();
        this.actions.add(builder.apply(com.commercetools.api.models.project.ProjectUpdateActionBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Expected version of the Project on which the changes should be applied. If the expected version does not match the actual version, a ConcurrentModification error is returned.</p>
     * @return version
     */

    public Long getVersion() {
        return this.version;
    }

    /**
     *  <p>Update actions to be performed on the Project.</p>
     * @return actions
     */

    public java.util.List<com.commercetools.api.models.project.ProjectUpdateAction> getActions() {
        return this.actions;
    }

    /**
     * builds ProjectUpdate with checking for non-null required values
     * @return ProjectUpdate
     */
    public ProjectUpdate build() {
        Objects.requireNonNull(version, ProjectUpdate.class + ": version is missing");
        Objects.requireNonNull(actions, ProjectUpdate.class + ": actions is missing");
        return new ProjectUpdateImpl(version, actions);
    }

    /**
     * builds ProjectUpdate without checking for non-null required values
     * @return ProjectUpdate
     */
    public ProjectUpdate buildUnchecked() {
        return new ProjectUpdateImpl(version, actions);
    }

    /**
     * factory method for an instance of ProjectUpdateBuilder
     * @return builder
     */
    public static ProjectUpdateBuilder of() {
        return new ProjectUpdateBuilder();
    }

    /**
     * create builder for ProjectUpdate instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProjectUpdateBuilder of(final ProjectUpdate template) {
        ProjectUpdateBuilder builder = new ProjectUpdateBuilder();
        builder.version = template.getVersion();
        builder.actions = template.getActions();
        return builder;
    }

}
