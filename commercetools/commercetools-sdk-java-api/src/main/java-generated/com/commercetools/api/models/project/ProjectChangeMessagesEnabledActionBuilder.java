
package com.commercetools.api.models.project;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProjectChangeMessagesEnabledActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProjectChangeMessagesEnabledAction projectChangeMessagesEnabledAction = ProjectChangeMessagesEnabledAction.builder()
 *             .messagesEnabled(true)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProjectChangeMessagesEnabledActionBuilder implements Builder<ProjectChangeMessagesEnabledAction> {

    private Boolean messagesEnabled;

    /**
     <>
     */

    public ProjectChangeMessagesEnabledActionBuilder messagesEnabled(final Boolean messagesEnabled) {
        this.messagesEnabled = messagesEnabled;
        return this;
    }

    public Boolean getMessagesEnabled() {
        return this.messagesEnabled;
    }

    public ProjectChangeMessagesEnabledAction build() {
        Objects.requireNonNull(messagesEnabled,
            ProjectChangeMessagesEnabledAction.class + ": messagesEnabled is missing");
        return new ProjectChangeMessagesEnabledActionImpl(messagesEnabled);
    }

    /**
     * builds ProjectChangeMessagesEnabledAction without checking for non null required values
     */
    public ProjectChangeMessagesEnabledAction buildUnchecked() {
        return new ProjectChangeMessagesEnabledActionImpl(messagesEnabled);
    }

    public static ProjectChangeMessagesEnabledActionBuilder of() {
        return new ProjectChangeMessagesEnabledActionBuilder();
    }

    public static ProjectChangeMessagesEnabledActionBuilder of(final ProjectChangeMessagesEnabledAction template) {
        ProjectChangeMessagesEnabledActionBuilder builder = new ProjectChangeMessagesEnabledActionBuilder();
        builder.messagesEnabled = template.getMessagesEnabled();
        return builder;
    }

}
