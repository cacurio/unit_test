package com.mkyong.common.payments;

public interface PaymentGateway {

    PaymentResponse requestPayment(PaymentRequest paymentRequest);
}
