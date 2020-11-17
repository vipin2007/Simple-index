package com.simpleindex.scannerservice.dao.impl;

import com.simpleindex.scannerservice.dao.DocumentDao;
import com.simpleindex.scannerservice.model.Document;
import com.simpleindex.scannerservice.rowmapper.DocumentRowMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("documentsDao")
public class DocumentDaoImpl implements DocumentDao {
    private static final Logger LOG = LoggerFactory.getLogger(DocumentDaoImpl.class);
    private static final String SELECT_ALL_QUERY_FOR_DOCUMENTS = "Select ID, FIELD1 , FIELD2, FIELD3, FIELD4, FIELD5 From DOCUMENTS";
    private static final String SELECT_QUERY_FOR_DOCUMENTS_BETWEEN_DATES = "Select ID, FIELD1 , FIELD2, FIELD3, FIELD4, FIELD5 From DOCUMENTS WHERE FIELD4 BETWEEN toDate AND fromDate";

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public List<Document> getDocuments() {
        LOG.info("Fetching the records by using query={}", SELECT_ALL_QUERY_FOR_DOCUMENTS);
        List<Document> documentList = jdbcTemplate.query(SELECT_ALL_QUERY_FOR_DOCUMENTS, new DocumentRowMapper());
        LOG.info("returning the number of documents records={}", documentList.size());
        return documentList;
    }

    @Override
    public List<Document> getDocumentsFromDate(String toDate, String fromDate) {
        LOG.info("Fetching the records by using toDate={} and fromDate={}", toDate, fromDate);
        String sql = "Select ID, FIELD1 , FIELD2, FIELD3, FIELD4, FIELD5 From DOCUMENTS WHERE FIELD4 BETWEEN '" + toDate + "' AND '" + fromDate + "' ORDER BY FIELD3";
        LOG.info("sql={}", sql);
        List<Document> documentList = jdbcTemplate.query(sql, new DocumentRowMapper());
        LOG.info("returning the number of documents records={}", documentList.size());
        return documentList;
    }
}
