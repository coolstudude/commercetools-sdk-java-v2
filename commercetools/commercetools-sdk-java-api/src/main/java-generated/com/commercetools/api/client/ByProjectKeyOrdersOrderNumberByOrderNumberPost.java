package com.commercetools.api.client;

import io.vrap.rmf.base.client.utils.Utils;
import io.vrap.rmf.base.client.utils.json.VrapJsonUtils;

import java.io.InputStream;
import java.io.IOException;

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
*  <p>Update Order by orderNumber</p>
*/
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public class ByProjectKeyOrdersOrderNumberByOrderNumberPost extends ApiMethod<ByProjectKeyOrdersOrderNumberByOrderNumberPost> {

    
    private String projectKey;
    private String orderNumber;
    
    private com.commercetools.api.models.order.OrderUpdate orderUpdate;

    public ByProjectKeyOrdersOrderNumberByOrderNumberPost(final ApiHttpClient apiHttpClient, String projectKey, String orderNumber, com.commercetools.api.models.order.OrderUpdate orderUpdate) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.orderNumber = orderNumber;
        this.orderUpdate = orderUpdate;
    }

    public ByProjectKeyOrdersOrderNumberByOrderNumberPost(ByProjectKeyOrdersOrderNumberByOrderNumberPost t) {
        super(t);
        this.projectKey = t.projectKey;
        this.orderNumber = t.orderNumber;
        this.orderUpdate = t.orderUpdate;
    }

    public ApiHttpRequest createHttpRequest() {
        ApiHttpRequest httpRequest = new ApiHttpRequest();
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("/%s/orders/order-number=%s", this.projectKey, this.orderNumber);
        if(!params.isEmpty()){
            httpRequestPath += "?" + String.join("&", params);
        }
        httpRequest.setUri(httpRequestPath); 
        httpRequest.setMethod(ApiHttpMethod.POST);
        httpRequest.setHeaders(getHeaders());
        try{httpRequest.setBody(VrapJsonUtils.toJsonByteArray(orderUpdate));}catch(Exception e){e.printStackTrace();}
        return httpRequest;
    }

    public ApiHttpResponse<com.commercetools.api.models.order.Order> executeBlocking(){
        return executeBlocking(Duration.ofSeconds(60));
    }
    
    public ApiHttpResponse<com.commercetools.api.models.order.Order> executeBlocking(Duration timeout){
        return blockingWait(execute(), timeout);
    }

    public CompletableFuture<ApiHttpResponse<com.commercetools.api.models.order.Order>> execute(){
        return apiHttpClient().execute(this.createHttpRequest())
                .thenApply(response -> Utils.convertResponse(response,com.commercetools.api.models.order.Order.class));
    }

    public String getProjectKey() {return this.projectKey;}
    public String getOrderNumber() {return this.orderNumber;}

    public List<String> getExpand() {
        return this.getQueryParam("expand");
    }

    public void setProjectKey(final String projectKey) { this.projectKey = projectKey; }
    
    public void setOrderNumber(final String orderNumber) { this.orderNumber = orderNumber; }

    public ByProjectKeyOrdersOrderNumberByOrderNumberPost withExpand(final String expand){
        return new ByProjectKeyOrdersOrderNumberByOrderNumberPost(this).addQueryParam("expand", expand);
    }
}
