
package com.commercetools.importapi.client.resource;

import java.nio.charset.StandardCharsets;
import java.util.concurrent.CompletableFuture;

import com.commercetools.importapi.client.ApiRoot;
import com.tngtech.junit.dataprovider.DataProvider;
import com.tngtech.junit.dataprovider.DataProviderExtension;
import com.tngtech.junit.dataprovider.UseDataProvider;
import com.tngtech.junit.dataprovider.UseDataProviderExtension;

import io.vrap.rmf.base.client.*;
import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.ApiHttpRequest;
import io.vrap.rmf.base.client.VrapHttpClient;
import io.vrap.rmf.base.client.error.ApiClientException;
import io.vrap.rmf.base.client.error.ApiServerException;
import io.vrap.rmf.base.client.utils.Generated;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.TestTemplate;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;

@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@ExtendWith(UseDataProviderExtension.class)
@ExtendWith(DataProviderExtension.class)
public class ByProjectKeyImportContainersByImportContainerKeyImportOperationsTest {
    private final VrapHttpClient httpClientMock = Mockito.mock(VrapHttpClient.class);
    private final String projectKey = "test_projectKey";
    private final static ApiRoot apiRoot = ApiRoot.of();
    private final ApiHttpClient client = ClientBuilder.of(httpClientMock).defaultClient("").build();

    @TestTemplate
    @UseDataProvider("requestWithMethodParameters")
    public void withMethods(ApiHttpRequest request, String httpMethod, String uri) {
        Assertions.assertThat(httpMethod).isEqualTo(request.getMethod().name().toLowerCase());
        Assertions.assertThat(uri).isEqualTo(request.getUri().toString());
    }

    @TestTemplate
    @UseDataProvider("executeMethodParameters")
    public void executeServerException(ClientRequestCommand<?> httpRequest) throws Exception {
        Mockito.when(httpClientMock.execute(Mockito.any()))
                .thenReturn(CompletableFuture.completedFuture(
                    new ApiHttpResponse<>(500, null, "".getBytes(StandardCharsets.UTF_8), "Oops!")));

        Assertions.assertThatThrownBy(() -> client.execute(httpRequest).toCompletableFuture().get())
                .hasCauseInstanceOf(ApiServerException.class);
    }

    @TestTemplate
    @UseDataProvider("executeMethodParameters")
    public void executeClientException(ClientRequestCommand<?> httpRequest) throws Exception {
        Mockito.when(httpClientMock.execute(Mockito.any()))
                .thenReturn(CompletableFuture.completedFuture(
                    new ApiHttpResponse<>(400, null, "".getBytes(StandardCharsets.UTF_8), "Oops!")));

        Assertions.assertThatThrownBy(() -> client.execute(httpRequest).toCompletableFuture().get())
                .hasCauseInstanceOf(ApiClientException.class);
    }

    @DataProvider
    public static Object[][] requestWithMethodParameters() {
        return new Object[][] { new Object[] {
                apiRoot.withProjectKeyValue("test_projectKey")
                        .importContainers()
                        .withImportContainerKeyValue("test_importContainerKey")
                        .importOperations()
                        .get()
                        .withLimit(0.26748633)
                        .createHttpRequest(),
                "get",
                "test_projectKey/import-containers/test_importContainerKey/import-operations?limit=0.26748633", },
                new Object[] {
                        apiRoot.withProjectKeyValue("test_projectKey")
                                .importContainers()
                                .withImportContainerKeyValue("test_importContainerKey")
                                .importOperations()
                                .get()
                                .withOffset(0.7475848)
                                .createHttpRequest(),
                        "get",
                        "test_projectKey/import-containers/test_importContainerKey/import-operations?offset=0.7475848", },
                new Object[] {
                        apiRoot.withProjectKeyValue("test_projectKey")
                                .importContainers()
                                .withImportContainerKeyValue("test_importContainerKey")
                                .importOperations()
                                .get()
                                .withSort("sort")
                                .createHttpRequest(),
                        "get",
                        "test_projectKey/import-containers/test_importContainerKey/import-operations?sort=sort", },
                new Object[] {
                        apiRoot.withProjectKeyValue("test_projectKey")
                                .importContainers()
                                .withImportContainerKeyValue("test_importContainerKey")
                                .importOperations()
                                .get()
                                .withResourceKey("resourceKey")
                                .createHttpRequest(),
                        "get",
                        "test_projectKey/import-containers/test_importContainerKey/import-operations?resourceKey=resourceKey", },
                new Object[] {
                        apiRoot.withProjectKeyValue("test_projectKey")
                                .importContainers()
                                .withImportContainerKeyValue("test_importContainerKey")
                                .importOperations()
                                .get()
                                .withState(com.commercetools.importapi.models.common.ProcessingState.findEnum("state"))
                                .createHttpRequest(),
                        "get",
                        "test_projectKey/import-containers/test_importContainerKey/import-operations?state=state", },
                new Object[] {
                        apiRoot.withProjectKeyValue("test_projectKey")
                                .importContainers()
                                .withImportContainerKeyValue("test_importContainerKey")
                                .importOperations()
                                .get()
                                .withDebug(true)
                                .createHttpRequest(),
                        "get",
                        "test_projectKey/import-containers/test_importContainerKey/import-operations?debug=true", },
                new Object[] {
                        apiRoot.withProjectKeyValue("test_projectKey")
                                .importContainers()
                                .withImportContainerKeyValue("test_importContainerKey")
                                .importOperations()
                                .get()
                                .createHttpRequest(),
                        "get", "test_projectKey/import-containers/test_importContainerKey/import-operations", } };
    }

    @DataProvider
    public static Object[][] executeMethodParameters() {
        return new Object[][] {
                new Object[] { apiRoot.withProjectKeyValue("test_projectKey")
                        .importContainers()
                        .withImportContainerKeyValue("test_importContainerKey")
                        .importOperations()
                        .get()
                        .withLimit(0.26748633), },
                new Object[] { apiRoot.withProjectKeyValue("test_projectKey")
                        .importContainers()
                        .withImportContainerKeyValue("test_importContainerKey")
                        .importOperations()
                        .get()
                        .withOffset(0.7475848), },
                new Object[] { apiRoot.withProjectKeyValue("test_projectKey")
                        .importContainers()
                        .withImportContainerKeyValue("test_importContainerKey")
                        .importOperations()
                        .get()
                        .withSort("sort"), },
                new Object[] { apiRoot.withProjectKeyValue("test_projectKey")
                        .importContainers()
                        .withImportContainerKeyValue("test_importContainerKey")
                        .importOperations()
                        .get()
                        .withResourceKey("resourceKey"), },
                new Object[] { apiRoot.withProjectKeyValue("test_projectKey")
                        .importContainers()
                        .withImportContainerKeyValue("test_importContainerKey")
                        .importOperations()
                        .get()
                        .withState(com.commercetools.importapi.models.common.ProcessingState.findEnum("state")), },
                new Object[] { apiRoot.withProjectKeyValue("test_projectKey")
                        .importContainers()
                        .withImportContainerKeyValue("test_importContainerKey")
                        .importOperations()
                        .get()
                        .withDebug(true), },
                new Object[] { apiRoot.withProjectKeyValue("test_projectKey")
                        .importContainers()
                        .withImportContainerKeyValue("test_importContainerKey")
                        .importOperations()
                        .get(), } };
    }
}
