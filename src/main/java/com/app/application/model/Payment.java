package com.app.application.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDate;
import java.util.Objects;

@Entity
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Double amount;
    private String country;
    private String currency;
    private LocalDate date;
    private String orderId;
    private Integer taxCode;
    private Double taxRate;
    private String type;

    public Payment() {
    }

//    public payment(Long id, Double amount, String country, String currency, LocalDate date, String orderId, Integer taxCode, Double taxRate, String type) {
//        this.id = id;
//        this.amount = amount;
//        this.country = country;
//        this.currency = currency;
//        this.date = date;
//        this.orderId = orderId;
//        this.taxCode = taxCode;
//        this.taxRate = taxRate;
//        this.type = type;
//    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public Integer getTaxCode() {
        return taxCode;
    }

    public void setTaxCode(Integer taxCode) {
        this.taxCode = taxCode;
    }

    public Double getTaxRate() {
        return taxRate;
    }

    public void setTaxRate(Double taxRate) {
        this.taxRate = taxRate;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Payment payment = (Payment) o;
        return Objects.equals(id, payment.id) && Objects.equals(amount, payment.amount) && Objects.equals(country, payment.country) && Objects.equals(currency, payment.currency) && Objects.equals(date, payment.date) && Objects.equals(orderId, payment.orderId) && Objects.equals(taxCode, payment.taxCode) && Objects.equals(taxRate, payment.taxRate) && Objects.equals(type, payment.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, amount, country, currency, date, orderId, taxCode, taxRate, type);
    }

    @Override
    public String toString() {
        return "payment{" +
                "id=" + id +
                ", amount=" + amount +
                ", country='" + country + '\'' +
                ", currency='" + currency + '\'' +
                ", date=" + date +
                ", orderId='" + orderId + '\'' +
                ", taxCode=" + taxCode +
                ", taxRate=" + taxRate +
                ", type='" + type + '\'' +
                '}';
    }
}
