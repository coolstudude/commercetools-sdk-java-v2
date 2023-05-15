
package com.commercetools.api.predicates.query.message;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class StagedQuoteValidToSetMessageQueryBuilderDsl {
    public StagedQuoteValidToSetMessageQueryBuilderDsl() {
    }

    public static StagedQuoteValidToSetMessageQueryBuilderDsl of() {
        return new StagedQuoteValidToSetMessageQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<StagedQuoteValidToSetMessageQueryBuilderDsl> id() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
            p -> new CombinationQueryPredicate<>(p, StagedQuoteValidToSetMessageQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<StagedQuoteValidToSetMessageQueryBuilderDsl> version() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("version")),
            p -> new CombinationQueryPredicate<>(p, StagedQuoteValidToSetMessageQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<StagedQuoteValidToSetMessageQueryBuilderDsl> createdAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("createdAt")),
            p -> new CombinationQueryPredicate<>(p, StagedQuoteValidToSetMessageQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<StagedQuoteValidToSetMessageQueryBuilderDsl> lastModifiedAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("lastModifiedAt")),
            p -> new CombinationQueryPredicate<>(p, StagedQuoteValidToSetMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<StagedQuoteValidToSetMessageQueryBuilderDsl> lastModifiedBy(
            Function<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("lastModifiedBy"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl.of())),
            StagedQuoteValidToSetMessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<StagedQuoteValidToSetMessageQueryBuilderDsl> createdBy(
            Function<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("createdBy"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl.of())),
            StagedQuoteValidToSetMessageQueryBuilderDsl::of);
    }

    public LongComparisonPredicateBuilder<StagedQuoteValidToSetMessageQueryBuilderDsl> sequenceNumber() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("sequenceNumber")),
            p -> new CombinationQueryPredicate<>(p, StagedQuoteValidToSetMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<StagedQuoteValidToSetMessageQueryBuilderDsl> resource(
            Function<com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("resource"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl.of())),
            StagedQuoteValidToSetMessageQueryBuilderDsl::of);
    }

    public LongComparisonPredicateBuilder<StagedQuoteValidToSetMessageQueryBuilderDsl> resourceVersion() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("resourceVersion")),
            p -> new CombinationQueryPredicate<>(p, StagedQuoteValidToSetMessageQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<StagedQuoteValidToSetMessageQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, StagedQuoteValidToSetMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<StagedQuoteValidToSetMessageQueryBuilderDsl> resourceUserProvidedIdentifiers(
            Function<com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("resourceUserProvidedIdentifiers"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl.of())),
            StagedQuoteValidToSetMessageQueryBuilderDsl::of);
    }

    public DateTimeComparisonPredicateBuilder<StagedQuoteValidToSetMessageQueryBuilderDsl> validTo() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("validTo")),
            p -> new CombinationQueryPredicate<>(p, StagedQuoteValidToSetMessageQueryBuilderDsl::of));
    }
}
