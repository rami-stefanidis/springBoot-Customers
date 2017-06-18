package com.rami.rest;

import com.rami.dao.ClientMapperDao;
import com.rami.dao.ClientsDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Rami Stefanidis  on 6/18/2017.
 */
@RestController
public class TestClient {

    @Autowired
    private ClientsDao clientsDao;

    @Autowired
    private ClientMapperDao clientMapper;

    @RequestMapping("/testClient")
    String home() {
        return "Hello World!" + clientsDao.getTestClient();
    }

    @RequestMapping("/testMyBatis")
    String testMyBatis() {
        return "Hello World!" + clientMapper.findClientById(1);
    }
}
