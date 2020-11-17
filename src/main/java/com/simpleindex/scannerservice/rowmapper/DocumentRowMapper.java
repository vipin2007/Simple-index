package com.simpleindex.scannerservice.rowmapper;


import com.simpleindex.scannerservice.model.Document;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class DocumentRowMapper implements RowMapper<Document> {
    private static final Logger LOG = LoggerFactory.getLogger(DocumentRowMapper.class);
    private static final String MESSAGE = "yes";

    @Override
    public Document mapRow(ResultSet resultSet, int i) throws SQLException {
        LOG.info("Mapping the records with Documents bean by using resultSet={}", resultSet.toString());
        return new Document(Integer.toString(resultSet.getInt("ID")), resultSet.getString("FIELD1"), resultSet.getString("FIELD2"),
                resultSet.getString("FIELD3"), resultSet.getString("FIELD4"), resultSet.getString("FIELD5"), MESSAGE);
    }
}