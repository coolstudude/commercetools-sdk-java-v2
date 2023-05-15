
package com.commercetools.api.predicates.query.me;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class MyQuoteUpdateQueryBuilderDsl {
    public MyQuoteUpdateQueryBuilderDsl() {
    }

    public static MyQuoteUpdateQueryBuilderDsl of() {
        return new MyQuoteUpdateQueryBuilderDsl();
    }

    public LongComparisonPredicateBuilder<MyQuoteUpdateQueryBuilderDsl> version() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("version")),
            p -> new CombinationQueryPredicate<>(p, MyQuoteUpdateQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<MyQuoteUpdateQueryBuilderDsl> actions(
            Function<com.commercetools.api.predicates.query.me.MyQuoteUpdateActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.me.MyQuoteUpdateActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("actions"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.me.MyQuoteUpdateActionQueryBuilderDsl.of())),
            MyQuoteUpdateQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<MyQuoteUpdateQueryBuilderDsl> actions() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("actions")),
            p -> new CombinationQueryPredicate<>(p, MyQuoteUpdateQueryBuilderDsl::of));
    }
}
