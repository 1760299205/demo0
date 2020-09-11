package com.example.demo5.code.textone.heiehei.service;

import com.example.demo5.code.textone.heiehei.entity.DataSourceEntity;
import java.util.List;

/**
 * @Author : JCccc
 * @CreateTime : 2019/10/22
 * @Description :
 **/

public interface DBChangeService {

    List<DataSourceEntity> get();

    boolean changeDb(String datasourceId) throws Exception;
}