package com.simpleindex.scannerservice.dao;

import com.simpleindex.scannerservice.model.Document;

import java.util.List;

public interface DocumentDao {
    public List<Document> getDocuments();
    public List<Document> getDocumentsFromDate(String toDate, String fromDate);
}
