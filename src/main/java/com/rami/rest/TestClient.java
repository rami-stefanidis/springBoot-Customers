package com.rami.rest;

import com.rami.dao.ClientMapperDao;
import com.rami.dao.ClientsDao;
import com.rami.vo.ClientVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Rami Stefanidis  on 6/18/2017.
 */
@RestController
public class TestClient {

    @Autowired
    private ClientsDao clientsDao;

    @Autowired
    private ClientMapperDao clientMapper;

    @RequestMapping(value = "/testClient" , method = RequestMethod.GET)
    String home() {
        return "Hello World!" + clientsDao.getTestClient();
    }

    @RequestMapping(value = "/testMyBatis" , method = RequestMethod.GET)
    String testMyBatis() {
        return "Hello World!" + clientMapper.findClientById(1);
    }

    @RequestMapping(value = "/testMyBatisAllClients" , method = RequestMethod.GET)
    String testMyBatisAllClients() {
        List<ClientVO> allClients = clientMapper.getAllClients();
        return "All Clients:" + parseList(allClients);
    }

    @RequestMapping(value = "/testMyBatisClientByZip" , method = RequestMethod.GET)
    String testMyBatisClientByZip() {
        List<ClientVO> allClients = clientMapper.getClientsByZipCode("111223");
        return "All Clients by zip:" + parseList(allClients);
    }

    private String parseList(List<ClientVO> clients) {
        StringBuilder builder = new StringBuilder();
        for(ClientVO clientVO : clients) {
            builder.append(clientVO.toString());
            builder.append("---");
        }

        return builder.toString();
    }
}
