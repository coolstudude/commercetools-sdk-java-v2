package com.commercetools.api.client;

import io.vrap.rmf.base.client.utils.Utils;
import io.vrap.rmf.base.client.utils.json.VrapJsonUtils;

import java.io.InputStream;
import java.io.IOException;

import java.net.URI;
import java.nio.file.Files;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.stream.Collectors;
import java.util.concurrent.CompletableFuture;
import io.vrap.rmf.base.client.utils.Generated;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import io.vrap.rmf.base.client.*;


import static io.vrap.rmf.base.client.utils.ClientUtils.blockingWait;

/**
*  <p>Updates a cart in the store specified by {storeKey}. The {storeKey} path parameter maps to a Store's key.
*  If the cart exists in the commercetools project but does not have the store field,
*  or the store field references a different store, this method returns a ResourceNotFound error.</p>
*/
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public class ByProjectKeyInStoreKeyByStoreKeyCartsByIDPost extends ApiMethod<ByProjectKeyInStoreKeyByStoreKeyCartsByIDPost, com.commercetools.api.models.cart.Cart> implements com.commercetools.api.client.ConflictingTrait<ByProjectKeyInStoreKeyByStoreKeyCartsByIDPost>, com.commercetools.api.client.ExpandableTrait<ByProjectKeyInStoreKeyByStoreKeyCartsByIDPost>, com.commercetools.api.client.ErrorableTrait<ByProjectKeyInStoreKeyByStoreKeyCartsByIDPost>, com.commercetools.api.client.DeprecatableTrait<ByProjectKeyInStoreKeyByStoreKeyCartsByIDPost> {

    
    private String projectKey;
    private String storeKey;
    private String ID;
    
    private com.commercetools.api.models.cart.CartUpdate cartUpdate;

    public ByProjectKeyInStoreKeyByStoreKeyCartsByIDPost(final ApiHttpClient apiHttpClient, String projectKey, String storeKey, String ID, com.commercetools.api.models.cart.CartUpdate cartUpdate) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.storeKey = storeKey;
        this.ID = ID;
        this.cartUpdate = cartUpdate;
    }

    public ByProjectKeyInStoreKeyByStoreKeyCartsByIDPost(ByProjectKeyInStoreKeyByStoreKeyCartsByIDPost t) {
        super(t);
        this.projectKey = t.projectKey;
        this.storeKey = t.storeKey;
        this.ID = t.ID;
        this.cartUpdate = t.cartUpdate;
    }

    @Override
    public ApiHttpRequest createHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("/%s/in-store/key=%s/carts/%s", this.projectKey, this.storeKey, this.ID);
        if(!params.isEmpty()){
            httpRequestPath += "?" + String.join("&", params);
        }
        try {
        final byte[] body = apiHttpClient().getSerializerService().toJsonByteArray(cartUpdate);
        return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(httpRequestPath), getHeaders(), body);
    } catch(Exception e) {
        e.printStackTrace();
    }
    
        return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(httpRequestPath), getHeaders(), null);
    }

    @Override
    public ApiHttpResponse<com.commercetools.api.models.cart.Cart> executeBlocking(Duration timeout){
        return blockingWait(execute(), timeout);
    }

    @Override
    public CompletableFuture<ApiHttpResponse<com.commercetools.api.models.cart.Cart>> execute(){
        return apiHttpClient().execute(this.createHttpRequest(), com.commercetools.api.models.cart.Cart.class);
    }

    public String getProjectKey() {return this.projectKey;}
    public String getStoreKey() {return this.storeKey;}
    public String getID() {return this.ID;}

    public List<String> getExpand() {
        return this.getQueryParam("expand");
    }

    public void setProjectKey(final String projectKey) { this.projectKey = projectKey; }
    
    public void setStoreKey(final String storeKey) { this.storeKey = storeKey; }
    
    public void setID(final String ID) { this.ID = ID; }

    public ByProjectKeyInStoreKeyByStoreKeyCartsByIDPost withExpand(final String expand){
        return copy().addQueryParam("expand", expand);
    }
    
    @Override
    protected ByProjectKeyInStoreKeyByStoreKeyCartsByIDPost copy()
    {
        return new ByProjectKeyInStoreKeyByStoreKeyCartsByIDPost(this);
    }
}
