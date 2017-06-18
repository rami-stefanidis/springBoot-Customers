package com.rami.services;

import com.rami.dao.ClientMapperDao;
import com.rami.vo.ClientVO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Rami Stefanidis on 6/18/2017.
 */
@Service
public class ClientManagementService {

    private final Logger LOG = LoggerFactory.getLogger(this.getClass());


    @Autowired
    private ClientMapperDao clientMapperDao;


    public void insertNewClient(final ClientVO clientVO) {
        LOG.info("Begin insertNewClient. clientVO = {}",clientVO);
        clientMapperDao.insertClient(clientVO);
        LOG.info("Completed insertNewClient. clientVO = {}",clientVO);
    }
}
