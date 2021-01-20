
package com.commercetools.api.models.product;

import java.io.IOException;
import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.product.SuggestTokenizer;
import com.commercetools.api.models.product.WhitespaceTokenizerImpl;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.Accessor;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = WhitespaceTokenizerImpl.class)
public interface WhitespaceTokenizer extends SuggestTokenizer {

    String WHITESPACE = "whitespace";

    public static WhitespaceTokenizer of() {
        return new WhitespaceTokenizerImpl();
    }

    public static WhitespaceTokenizer of(final WhitespaceTokenizer template) {
        WhitespaceTokenizerImpl instance = new WhitespaceTokenizerImpl();
        return instance;
    }

    public static WhitespaceTokenizerBuilder builder() {
        return WhitespaceTokenizerBuilder.of();
    }

    public static WhitespaceTokenizerBuilder builder(final WhitespaceTokenizer template) {
        return WhitespaceTokenizerBuilder.of(template);
    }

    default <T> T withWhitespaceTokenizer(Function<WhitespaceTokenizer, T> helper) {
        return helper.apply(this);
    }
}
