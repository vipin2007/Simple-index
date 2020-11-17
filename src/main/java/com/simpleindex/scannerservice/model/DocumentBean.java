package com.simpleindex.scannerservice.model;

public class DocumentBean {
    private String toDate;
    private String fromDate;

    public String getToDate() {
        return toDate;
    }

    public void setToDate(String toDate) {
        this.toDate = toDate;
    }

    public String getFromDate() {
        return fromDate;
    }

    public void setFromDate(String fromDate) {
        this.fromDate = fromDate;
    }

    @Override
    public String toString() {
        return "DocumentBean{" +
                "toDate='" + toDate + '\'' +
                ", fromDate='" + fromDate + '\'' +
                '}';
    }
}
