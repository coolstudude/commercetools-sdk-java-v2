
package com.commercetools.api.models.error;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Returned when the indexing of Product information is still in progress for Projects that have indexing activated.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SearchIndexingInProgressError searchIndexingInProgressError = SearchIndexingInProgressError.builder()
 *             .message("{message}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = SearchIndexingInProgressErrorImpl.class)
public interface SearchIndexingInProgressError extends ErrorObject {

    String SEARCH_INDEXING_IN_PROGRESS = "SearchIndexingInProgress";

    /**
     *
     * @return code
     */
    @NotNull
    @JsonProperty("code")
    public String getCode();

    /**
     *  <p><code>"The indexing is currently in progress. Please wait until the status is "Activated" to execute search requests."</code></p>
     * @return message
     */
    @NotNull
    @JsonProperty("message")
    public String getMessage();

    public void setMessage(final String message);

    public static SearchIndexingInProgressError of() {
        return new SearchIndexingInProgressErrorImpl();
    }

    public static SearchIndexingInProgressError of(final SearchIndexingInProgressError template) {
        SearchIndexingInProgressErrorImpl instance = new SearchIndexingInProgressErrorImpl();
        instance.setMessage(template.getMessage());

        return instance;
    }

    public static SearchIndexingInProgressErrorBuilder builder() {
        return SearchIndexingInProgressErrorBuilder.of();
    }

    public static SearchIndexingInProgressErrorBuilder builder(final SearchIndexingInProgressError template) {
        return SearchIndexingInProgressErrorBuilder.of(template);
    }

    default <T> T withSearchIndexingInProgressError(Function<SearchIndexingInProgressError, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<SearchIndexingInProgressError> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SearchIndexingInProgressError>() {
            @Override
            public String toString() {
                return "TypeReference<SearchIndexingInProgressError>";
            }
        };
    }
}
