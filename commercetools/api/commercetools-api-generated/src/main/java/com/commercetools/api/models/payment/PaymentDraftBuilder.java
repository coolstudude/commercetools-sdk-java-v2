package com.commercetools.api.models.payment;

import com.commercetools.api.models.common.Money;
import com.commercetools.api.models.customer.CustomerResourceIdentifier;
import com.commercetools.api.models.payment.PaymentMethodInfo;
import com.commercetools.api.models.payment.PaymentStatusDraft;
import com.commercetools.api.models.payment.TransactionDraft;
import com.commercetools.api.models.type.CustomFieldsDraft;
import com.commercetools.api.models.payment.PaymentDraft;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class PaymentDraftBuilder {
   
   @Nullable
   private com.commercetools.api.models.customer.CustomerResourceIdentifier customer;
   
   @Nullable
   private String anonymousId;
   
   @Nullable
   private String externalId;
   
   @Nullable
   private String interfaceId;
   
   
   private com.commercetools.api.models.common.Money amountPlanned;
   
   @Nullable
   private com.commercetools.api.models.common.Money amountAuthorized;
   
   @Nullable
   private String authorizedUntil;
   
   @Nullable
   private com.commercetools.api.models.common.Money amountPaid;
   
   @Nullable
   private com.commercetools.api.models.common.Money amountRefunded;
   
   @Nullable
   private com.commercetools.api.models.payment.PaymentMethodInfo paymentMethodInfo;
   
   @Nullable
   private com.commercetools.api.models.payment.PaymentStatusDraft paymentStatus;
   
   @Nullable
   private java.util.List<com.commercetools.api.models.payment.TransactionDraft> transactions;
   
   @Nullable
   private java.util.List<com.commercetools.api.models.type.CustomFieldsDraft> interfaceInteractions;
   
   @Nullable
   private com.commercetools.api.models.type.CustomFieldsDraft custom;
   
   @Nullable
   private String key;
   
   public PaymentDraftBuilder customer(@Nullable final com.commercetools.api.models.customer.CustomerResourceIdentifier customer) {
      this.customer = customer;
      return this;
   }
   
   public PaymentDraftBuilder anonymousId(@Nullable final String anonymousId) {
      this.anonymousId = anonymousId;
      return this;
   }
   
   public PaymentDraftBuilder externalId(@Nullable final String externalId) {
      this.externalId = externalId;
      return this;
   }
   
   public PaymentDraftBuilder interfaceId(@Nullable final String interfaceId) {
      this.interfaceId = interfaceId;
      return this;
   }
   
   public PaymentDraftBuilder amountPlanned( final com.commercetools.api.models.common.Money amountPlanned) {
      this.amountPlanned = amountPlanned;
      return this;
   }
   
   public PaymentDraftBuilder amountAuthorized(@Nullable final com.commercetools.api.models.common.Money amountAuthorized) {
      this.amountAuthorized = amountAuthorized;
      return this;
   }
   
   public PaymentDraftBuilder authorizedUntil(@Nullable final String authorizedUntil) {
      this.authorizedUntil = authorizedUntil;
      return this;
   }
   
   public PaymentDraftBuilder amountPaid(@Nullable final com.commercetools.api.models.common.Money amountPaid) {
      this.amountPaid = amountPaid;
      return this;
   }
   
   public PaymentDraftBuilder amountRefunded(@Nullable final com.commercetools.api.models.common.Money amountRefunded) {
      this.amountRefunded = amountRefunded;
      return this;
   }
   
   public PaymentDraftBuilder paymentMethodInfo(@Nullable final com.commercetools.api.models.payment.PaymentMethodInfo paymentMethodInfo) {
      this.paymentMethodInfo = paymentMethodInfo;
      return this;
   }
   
   public PaymentDraftBuilder paymentStatus(@Nullable final com.commercetools.api.models.payment.PaymentStatusDraft paymentStatus) {
      this.paymentStatus = paymentStatus;
      return this;
   }
   
   public PaymentDraftBuilder transactions(@Nullable final java.util.List<com.commercetools.api.models.payment.TransactionDraft> transactions) {
      this.transactions = transactions;
      return this;
   }
   
   public PaymentDraftBuilder interfaceInteractions(@Nullable final java.util.List<com.commercetools.api.models.type.CustomFieldsDraft> interfaceInteractions) {
      this.interfaceInteractions = interfaceInteractions;
      return this;
   }
   
   public PaymentDraftBuilder custom(@Nullable final com.commercetools.api.models.type.CustomFieldsDraft custom) {
      this.custom = custom;
      return this;
   }
   
   public PaymentDraftBuilder key(@Nullable final String key) {
      this.key = key;
      return this;
   }
   
   @Nullable
   public com.commercetools.api.models.customer.CustomerResourceIdentifier getCustomer(){
      return this.customer;
   }
   
   @Nullable
   public String getAnonymousId(){
      return this.anonymousId;
   }
   
   @Nullable
   public String getExternalId(){
      return this.externalId;
   }
   
   @Nullable
   public String getInterfaceId(){
      return this.interfaceId;
   }
   
   
   public com.commercetools.api.models.common.Money getAmountPlanned(){
      return this.amountPlanned;
   }
   
   @Nullable
   public com.commercetools.api.models.common.Money getAmountAuthorized(){
      return this.amountAuthorized;
   }
   
   @Nullable
   public String getAuthorizedUntil(){
      return this.authorizedUntil;
   }
   
   @Nullable
   public com.commercetools.api.models.common.Money getAmountPaid(){
      return this.amountPaid;
   }
   
   @Nullable
   public com.commercetools.api.models.common.Money getAmountRefunded(){
      return this.amountRefunded;
   }
   
   @Nullable
   public com.commercetools.api.models.payment.PaymentMethodInfo getPaymentMethodInfo(){
      return this.paymentMethodInfo;
   }
   
   @Nullable
   public com.commercetools.api.models.payment.PaymentStatusDraft getPaymentStatus(){
      return this.paymentStatus;
   }
   
   @Nullable
   public java.util.List<com.commercetools.api.models.payment.TransactionDraft> getTransactions(){
      return this.transactions;
   }
   
   @Nullable
   public java.util.List<com.commercetools.api.models.type.CustomFieldsDraft> getInterfaceInteractions(){
      return this.interfaceInteractions;
   }
   
   @Nullable
   public com.commercetools.api.models.type.CustomFieldsDraft getCustom(){
      return this.custom;
   }
   
   @Nullable
   public String getKey(){
      return this.key;
   }

   public PaymentDraft build() {
       return new PaymentDraftImpl(customer, anonymousId, externalId, interfaceId, amountPlanned, amountAuthorized, authorizedUntil, amountPaid, amountRefunded, paymentMethodInfo, paymentStatus, transactions, interfaceInteractions, custom, key);
   }
   
   public static PaymentDraftBuilder of() {
      return new PaymentDraftBuilder();
   }
   
   public static PaymentDraftBuilder of(final PaymentDraft template) {
      PaymentDraftBuilder builder = new PaymentDraftBuilder();
      builder.customer = template.getCustomer();
      builder.anonymousId = template.getAnonymousId();
      builder.externalId = template.getExternalId();
      builder.interfaceId = template.getInterfaceId();
      builder.amountPlanned = template.getAmountPlanned();
      builder.amountAuthorized = template.getAmountAuthorized();
      builder.authorizedUntil = template.getAuthorizedUntil();
      builder.amountPaid = template.getAmountPaid();
      builder.amountRefunded = template.getAmountRefunded();
      builder.paymentMethodInfo = template.getPaymentMethodInfo();
      builder.paymentStatus = template.getPaymentStatus();
      builder.transactions = template.getTransactions();
      builder.interfaceInteractions = template.getInterfaceInteractions();
      builder.custom = template.getCustom();
      builder.key = template.getKey();
      return builder;
   }
   
}
