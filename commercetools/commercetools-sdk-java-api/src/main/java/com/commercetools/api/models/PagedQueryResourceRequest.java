
package com.commercetools.api.models;

import java.util.Collection;
import java.util.List;
import java.util.Map;

import io.vrap.rmf.base.client.ApiMethod;
import io.vrap.rmf.base.client.ClientRequestCommand;
import io.vrap.rmf.base.client.RequestCommand;

@Deprecated
/**
 * Interface with common methods for query endpoints
 * @param <T> the type of the underlying request
 * @param <TResult> the type of the underlying result model, like category or product.
 * @deprecated use com.commercetools.api.client.PagedQueryResourceRequest instead
 */
public interface PagedQueryResourceRequest<T extends PagedQueryResourceRequest<T, TResult>, TResult>
        extends RequestCommand<TResult>, ClientRequestCommand<TResult> {
    <TValue> PagedQueryResourceRequest<T, TResult> withLimit(final TValue limit);

    <TValue> PagedQueryResourceRequest<T, TResult> addLimit(final TValue limit);

    <TValue> PagedQueryResourceRequest<T, TResult> withOffset(final TValue offset);

    <TValue> PagedQueryResourceRequest<T, TResult> addOffset(final TValue offset);

    <TValue> PagedQueryResourceRequest<T, TResult> withSort(final TValue sort);

    <TValue> PagedQueryResourceRequest<T, TResult> addSort(final TValue sort);

    <TValue> PagedQueryResourceRequest<T, TResult> withWhere(final TValue where);

    <TValue> PagedQueryResourceRequest<T, TResult> addWhere(final TValue where);

    <TValue> PagedQueryResourceRequest<T, TResult> withExpand(final TValue expand);

    <TValue> PagedQueryResourceRequest<T, TResult> addExpand(final TValue expand);

    <TValue> PagedQueryResourceRequest<T, TResult> withWithTotal(final TValue withTotal);

    <TValue> PagedQueryResourceRequest<T, TResult> addWithTotal(final TValue withTotal);

    <TValue> PagedQueryResourceRequest<T, TResult> withPredicateVar(final String varName, final TValue predicateVar);

    <TValue> PagedQueryResourceRequest<T, TResult> addPredicateVar(final String varName, final TValue predicateVar);

    <TValue> PagedQueryResourceRequest<T, TResult> withPredicateVar(final String varName,
            final Collection<TValue> predicateVar);

    <TValue> PagedQueryResourceRequest<T, TResult> addPredicateVar(final String varName,
            final Collection<TValue> predicateVar);

    List<ApiMethod.ParamEntry<String, String>> getQueryParams();

    List<String> getQueryParam(final String key);

    String getFirstQueryParam(final String key);

    default PagedQueryResourceRequest<T, TResult> asPagedQueryResourceRequest() {
        return this;
    }

    @SuppressWarnings("unchecked")
    default T withWhere(final String where, final String predicateVar, final String predicateVarValue) {
        return (T) withWhere(where).withPredicateVar(predicateVar, predicateVarValue);
    }

    @SuppressWarnings("unchecked")
    default T addWhere(final String where, final String predicateVar, final String predicateVarValue) {
        return (T) addWhere(where).withPredicateVar(predicateVar, predicateVarValue);
    }

    @SuppressWarnings("unchecked")
    default T withWhere(final String where, final Map<String, Collection<String>> predicateVar) {
        PagedQueryResourceRequest<T, TResult> request = withWhere(where);
        predicateVar.forEach(request::withPredicateVar);
        return (T) request;
    }

    @SuppressWarnings("unchecked")
    default T addWhere(final String where, final Map<String, Collection<String>> predicateVar) {
        PagedQueryResourceRequest<T, TResult> request = addWhere(where);
        predicateVar.forEach(request::withPredicateVar);
        return (T) request;
    }

    @SuppressWarnings("unchecked")
    default T withWhere(final String where, final Collection<Map.Entry<String, String>> predicateVar) {
        PagedQueryResourceRequest<T, TResult> request = withWhere(where);
        predicateVar.forEach(pair -> request.withPredicateVar(pair.getKey(), pair.getValue()));
        return (T) request;
    }

    @SuppressWarnings("unchecked")
    default T addWhere(final String where, final Collection<Map.Entry<String, String>> predicateVar) {
        PagedQueryResourceRequest<T, TResult> request = addWhere(where);
        predicateVar.forEach(pair -> request.withPredicateVar(pair.getKey(), pair.getValue()));
        return (T) request;
    }

    @SuppressWarnings("unchecked")
    default T asPagedQueryResourceRequestToBaseType() {
        return (T) this;
    }
}
