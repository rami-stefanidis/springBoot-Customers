package com.rami.dao;

import com.rami.annotations.UseClientDataDatasource;
import com.rami.vo.ClientVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Created by Rami Stefanidis on 6/18/2017.
 */
@Mapper
@UseClientDataDatasource
public interface ClientMapperDao {

    ClientVO findClientById(final int clientId);

    List<ClientVO> getAllClients();

    List<ClientVO> getClientsByZipCode(final String zipCode);

    void insertClient(final ClientVO clientVO);

    void updateExistingClient(final ClientVO clientVO);

    void deleteExistingClient(final int id);
}
