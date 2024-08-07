package com.example.library.lib_demo.model;

import java.util.UUID;

public class CreditResponse {

    private UUID paymentId;
    private String status;

    public UUID getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(UUID paymentId) {
        this.paymentId = paymentId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
