
package com.commercetools.api.models.shopping_list;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ShoppingListChangeNameActionBuilder implements Builder<ShoppingListChangeNameAction> {

    private com.commercetools.api.models.common.LocalizedString name;

    public ShoppingListChangeNameActionBuilder name(final com.commercetools.api.models.common.LocalizedString name) {
        this.name = name;
        return this;
    }

    public com.commercetools.api.models.common.LocalizedString getName() {
        return this.name;
    }

    public ShoppingListChangeNameAction build() {
        Objects.requireNonNull(name);
        return new ShoppingListChangeNameActionImpl(name);
    }

    /**
     * builds ShoppingListChangeNameAction without checking for non null required values
     */
    public ShoppingListChangeNameAction buildUnchecked() {
        return new ShoppingListChangeNameActionImpl(name);
    }

    public static ShoppingListChangeNameActionBuilder of() {
        return new ShoppingListChangeNameActionBuilder();
    }

    public static ShoppingListChangeNameActionBuilder of(final ShoppingListChangeNameAction template) {
        ShoppingListChangeNameActionBuilder builder = new ShoppingListChangeNameActionBuilder();
        builder.name = template.getName();
        return builder;
    }

}
