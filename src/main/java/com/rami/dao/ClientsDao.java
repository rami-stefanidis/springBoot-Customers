package com.rami.dao;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * Created by Rami Stefanidis on 6/18/2017.
 */
@Repository
public class ClientsDao {

    private final Logger LOG = LoggerFactory.getLogger(this.getClass());

    private static final String TEST_SQL="SELECT NAME from CLIENT_DATA.CLIENTS WHERE id=1";


    @Autowired
    @Qualifier("clientDataJdbcTemplate")
    private JdbcTemplate jdbcTemplate;


    public String getTestClient() {
        LOG.info("Begin getTestClient.");

        final String test = jdbcTemplate.queryForObject(TEST_SQL,String.class);

        LOG.info("Completed getTestClient. test = {}",test);
        return test;
    }

}
