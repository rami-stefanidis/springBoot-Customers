package com.rami.services;

import com.rami.dao.ClientMapperDao;
import com.rami.vo.ClientVO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by Rami Stefanidis on 6/18/2017.
 */
@Service
public class ClientManagementService {

    private final Logger LOG = LoggerFactory.getLogger(this.getClass());


    @Autowired
    private ClientMapperDao clientMapperDao;


    @Transactional
    public void insertNewClient(final ClientVO clientVO) {
        LOG.info("Begin insertNewClient. clientVO = {}",clientVO);
        clientMapperDao.insertClient(clientVO);
        LOG.info("Completed insertNewClient. clientVO = {}",clientVO);
    }

    @Transactional
    public void updateExistingClient(final ClientVO clientVO) {
        LOG.info("Begin updateExistingClient. clientVO = {}",clientVO);
        clientMapperDao.updateExistingClient(clientVO);
        LOG.info("Completed updateExistingClient. clientVO = {}",clientVO);
    }

    @Transactional
    public void deleteExistingClient(final int id) {
        LOG.info("Begin deleteExistingClient. id = {}",id);
        clientMapperDao.deleteExistingClient(id);
        LOG.info("Completed deleteExistingClient. id = {}",id);
    }
}
