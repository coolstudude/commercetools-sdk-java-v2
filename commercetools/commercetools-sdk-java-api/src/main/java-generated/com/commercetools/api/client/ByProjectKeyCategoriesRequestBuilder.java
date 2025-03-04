
package com.commercetools.api.client;

import java.util.function.UnaryOperator;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyCategoriesRequestBuilder implements ByProjectKeyCategoriesRequestBuilderMixin {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;

    public ByProjectKeyCategoriesRequestBuilder(final ApiHttpClient apiHttpClient, final String projectKey) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
    }

    public ByProjectKeyCategoriesGet get() {
        return new ByProjectKeyCategoriesGet(apiHttpClient, projectKey);
    }

    public ByProjectKeyCategoriesPost post(com.commercetools.api.models.category.CategoryDraft categoryDraft) {
        return new ByProjectKeyCategoriesPost(apiHttpClient, projectKey, categoryDraft);
    }

    public ByProjectKeyCategoriesPostString post(final String categoryDraft) {
        return new ByProjectKeyCategoriesPostString(apiHttpClient, projectKey, categoryDraft);
    }

    public ByProjectKeyCategoriesPost post(
            UnaryOperator<com.commercetools.api.models.category.CategoryDraftBuilder> op) {
        return post(op.apply(com.commercetools.api.models.category.CategoryDraftBuilder.of()).build());
    }

    public ByProjectKeyCategoriesKeyByKeyRequestBuilder withKey(String key) {
        return new ByProjectKeyCategoriesKeyByKeyRequestBuilder(apiHttpClient, projectKey, key);
    }

    public ByProjectKeyCategoriesByIDRequestBuilder withId(String ID) {
        return new ByProjectKeyCategoriesByIDRequestBuilder(apiHttpClient, projectKey, ID);
    }

}
