package com.example.demo5.code.textone.heiehei.service.imp;


import com.example.demo5.code.textone.config.mysql.DBContextHolder;
import com.example.demo5.code.textone.config.mysql.DynamicDataSource;
import com.example.demo5.code.textone.heiehei.dao.DataSourceMapper;
import com.example.demo5.code.textone.heiehei.entity.DataSourceEntity;
import com.example.demo5.code.textone.heiehei.service.DBChangeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

/**
 * @Author : JCccc
 * @CreateTime : 2019/10/22
 * @Description :
 **/
@Service
public class DBChangeServiceImpl implements DBChangeService {

    @Autowired
    DataSourceMapper dataSourceMapper;
    @Autowired
    private DynamicDataSource dynamicDataSource;
    @Override
    public List<DataSourceEntity> get() {
        return dataSourceMapper.get();
    }

    @Override
    public boolean changeDb(String datasourceId) throws Exception {

        //默认切换到主数据源,进行整体资源的查找
        DBContextHolder.clearDataSource();

        List<DataSourceEntity> dataSourcesList = dataSourceMapper.get();

        for (DataSourceEntity dataSource : dataSourcesList) {
            if (dataSource.getDatasourceId().equals(datasourceId)) {
                System.out.println("需要使用的的数据源已经找到,datasourceId是：" + dataSource.getDatasourceId());
                //创建数据源连接&检查 若存在则不需重新创建
                dynamicDataSource.createDataSourceWithCheck(dataSource);
                //切换到该数据源
                DBContextHolder.setDataSource(dataSource.getDatasourceId());
                return true;
            }
        }
        return false;

    }


}
