package com.commercetools.importapi.client;

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
*  <p>Creates import request for creating new customers or updating existing ones.</p>
*/
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public class ByProjectKeyCustomersImportSinkKeyByImportSinkKeyPost extends ApiMethod<ByProjectKeyCustomersImportSinkKeyByImportSinkKeyPost, com.commercetools.importapi.models.importrequests.ImportResponse> implements com.commercetools.importapi.client.Secured_by_manage_customersTrait<ByProjectKeyCustomersImportSinkKeyByImportSinkKeyPost> {

    
    private String projectKey;
    private String importSinkKey;
    
    private com.commercetools.importapi.models.importrequests.CustomerImportRequest customerImportRequest;

    public ByProjectKeyCustomersImportSinkKeyByImportSinkKeyPost(final ApiHttpClient apiHttpClient, String projectKey, String importSinkKey, com.commercetools.importapi.models.importrequests.CustomerImportRequest customerImportRequest) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.importSinkKey = importSinkKey;
        this.customerImportRequest = customerImportRequest;
    }

    public ByProjectKeyCustomersImportSinkKeyByImportSinkKeyPost(ByProjectKeyCustomersImportSinkKeyByImportSinkKeyPost t) {
        super(t);
        this.projectKey = t.projectKey;
        this.importSinkKey = t.importSinkKey;
        this.customerImportRequest = t.customerImportRequest;
    }

    @Override
    public ApiHttpRequest createHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("/%s/customers/importSinkKey=%s", this.projectKey, this.importSinkKey);
        if(!params.isEmpty()){
            httpRequestPath += "?" + String.join("&", params);
        }
        try {
        final byte[] body = apiHttpClient().getSerializerService().toJsonByteArray(customerImportRequest);
        return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(httpRequestPath), getHeaders(), body);
    } catch(Exception e) {
        e.printStackTrace();
    }
    
        return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(httpRequestPath), getHeaders(), null);
    }

    @Override
    public ApiHttpResponse<com.commercetools.importapi.models.importrequests.ImportResponse> executeBlocking(Duration timeout){
        return blockingWait(execute(), timeout);
    }

    @Override
    public CompletableFuture<ApiHttpResponse<com.commercetools.importapi.models.importrequests.ImportResponse>> execute(){
        return apiHttpClient().execute(this.createHttpRequest(), com.commercetools.importapi.models.importrequests.ImportResponse.class);
    }

    public String getProjectKey() {return this.projectKey;}
    public String getImportSinkKey() {return this.importSinkKey;}


    public void setProjectKey(final String projectKey) { this.projectKey = projectKey; }
    
    public void setImportSinkKey(final String importSinkKey) { this.importSinkKey = importSinkKey; }

    
    @Override
    protected ByProjectKeyCustomersImportSinkKeyByImportSinkKeyPost copy()
    {
        return new ByProjectKeyCustomersImportSinkKeyByImportSinkKeyPost(this);
    }
}
