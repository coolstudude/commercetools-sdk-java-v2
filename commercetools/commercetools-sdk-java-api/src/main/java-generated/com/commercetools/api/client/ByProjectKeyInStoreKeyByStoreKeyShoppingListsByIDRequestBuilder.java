
package com.commercetools.api.client;

import java.util.function.UnaryOperator;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyInStoreKeyByStoreKeyShoppingListsByIDRequestBuilder {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;
    private final String storeKey;
    private final String ID;

    public ByProjectKeyInStoreKeyByStoreKeyShoppingListsByIDRequestBuilder(final ApiHttpClient apiHttpClient,
            final String projectKey, final String storeKey, final String ID) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
        this.storeKey = storeKey;
        this.ID = ID;
    }

    public ByProjectKeyInStoreKeyByStoreKeyShoppingListsByIDGet get() {
        return new ByProjectKeyInStoreKeyByStoreKeyShoppingListsByIDGet(apiHttpClient, projectKey, storeKey, ID);
    }

    public ByProjectKeyInStoreKeyByStoreKeyShoppingListsByIDPost post(
            com.commercetools.api.models.shopping_list.ShoppingListUpdate shoppingListUpdate) {
        return new ByProjectKeyInStoreKeyByStoreKeyShoppingListsByIDPost(apiHttpClient, projectKey, storeKey, ID,
            shoppingListUpdate);
    }

    public ByProjectKeyInStoreKeyByStoreKeyShoppingListsByIDPostString post(final String shoppingListUpdate) {
        return new ByProjectKeyInStoreKeyByStoreKeyShoppingListsByIDPostString(apiHttpClient, projectKey, storeKey, ID,
            shoppingListUpdate);
    }

    public ByProjectKeyInStoreKeyByStoreKeyShoppingListsByIDPost post(
            UnaryOperator<com.commercetools.api.models.shopping_list.ShoppingListUpdateBuilder> op) {
        return post(op.apply(com.commercetools.api.models.shopping_list.ShoppingListUpdateBuilder.of()).build());
    }

    public ByProjectKeyInStoreKeyByStoreKeyShoppingListsByIDDelete delete() {
        return new ByProjectKeyInStoreKeyByStoreKeyShoppingListsByIDDelete(apiHttpClient, projectKey, storeKey, ID);
    }

    public <TValue> ByProjectKeyInStoreKeyByStoreKeyShoppingListsByIDDelete delete(TValue version) {
        return delete().withVersion(version);
    }

}
