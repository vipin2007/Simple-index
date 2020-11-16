package com.simpleindex.scannerservice.service;

import com.simpleindex.scannerservice.model.Document;

import java.util.List;

public interface DocumentService {
    public List<Document> getDocuments();
    public List<Document> getDocumentsFromDate(String toDate, String fromDate);
}
