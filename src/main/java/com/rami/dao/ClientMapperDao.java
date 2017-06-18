package com.rami.dao;

import com.rami.annotations.UseClientDataDatasource;
import com.rami.vo.ClientVO;
import org.apache.ibatis.annotations.Mapper;

/**
 * Created by Rami Stefanidis on 6/18/2017.
 */
@Mapper
@UseClientDataDatasource
public interface ClientMapperDao {

    ClientVO findClientById(final int clientId);
}
