package com.commercetools.api.models.payment;

import com.commercetools.api.models.payment.PaymentUpdateAction;
import com.commercetools.api.models.payment.PaymentChangeTransactionInteractionIdAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class PaymentChangeTransactionInteractionIdActionBuilder {

    
    private String transactionId;
    
    
    private String interactionId;

    public PaymentChangeTransactionInteractionIdActionBuilder transactionId( final String transactionId) {
        this.transactionId = transactionId;
        return this;
    }
    
    public PaymentChangeTransactionInteractionIdActionBuilder interactionId( final String interactionId) {
        this.interactionId = interactionId;
        return this;
    }

    
    public String getTransactionId(){
        return this.transactionId;
    }
    
    
    public String getInteractionId(){
        return this.interactionId;
    }

    public PaymentChangeTransactionInteractionIdAction build() {
        return new PaymentChangeTransactionInteractionIdActionImpl(transactionId, interactionId);
    }

    public static PaymentChangeTransactionInteractionIdActionBuilder of() {
        return new PaymentChangeTransactionInteractionIdActionBuilder();
    }

    public static PaymentChangeTransactionInteractionIdActionBuilder of(final PaymentChangeTransactionInteractionIdAction template) {
        PaymentChangeTransactionInteractionIdActionBuilder builder = new PaymentChangeTransactionInteractionIdActionBuilder();
        builder.transactionId = template.getTransactionId();
        builder.interactionId = template.getInteractionId();
        return builder;
    }

}
