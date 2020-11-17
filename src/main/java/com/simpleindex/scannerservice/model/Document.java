package com.simpleindex.scannerservice.model;

public class Document {
    private String id;
    private String customerNumber;
    private String year;
    private String invoiceNumber;
    private String invoiceDate;
    private String month;
    private String message;

    public Document() {
    }

    public Document(String id, String customerNumber, String year, String invoiceNumber, String invoiceDate, String month, String message) {
        this.id = id;
        this.customerNumber = customerNumber;
        this.year = year;
        this.invoiceNumber = invoiceNumber;
        this.invoiceDate = invoiceDate;
        this.month = month;
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCustomerNumber() {
        return customerNumber;
    }

    public void setCustomerNumber(String customerNumber) {
        this.customerNumber = customerNumber;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getInvoiceNumber() {
        return invoiceNumber;
    }

    public void setInvoiceNumber(String invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }

    public String getInvoiceDate() {
        return invoiceDate;
    }

    public void setInvoiceDate(String invoiceDate) {
        this.invoiceDate = invoiceDate;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    @Override
    public String toString() {
        return "Documents{" +
                "id=" + id +
                ", field1='" + customerNumber + '\'' +
                ", field2='" + year + '\'' +
                ", field3='" + invoiceNumber + '\'' +
                ", field4='" + invoiceDate + '\'' +
                ", field5='" + month + '\'' +
                '}';
    }
}
