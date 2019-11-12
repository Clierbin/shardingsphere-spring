package com.gupaovip.shardingsphere.shardingsphereprop.service.impl;

import com.gupaovip.shardingsphere.shardingsphereprop.entity.TConfigDO;
import com.gupaovip.shardingsphere.shardingsphereprop.mapper.TConfigMapper;
import com.gupaovip.shardingsphere.shardingsphereprop.service.ConfigService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * ClassName:ConfigServiceImpl
 * Package:com.gupaovip.shardingsphere.shardingsphereprop.service.impl
 * description
 * Created by zhangbin on 2019/11/12.
 *
 * @author: zhangbin q243132465@163.com
 * @Version 1.0.0
 * @CreateTime： 2019/11/12 16:15
 */
@Service
public class ConfigServiceImpl implements ConfigService {
    @Autowired
    private TConfigMapper tConfigMapper;


    @Override
    public void insert() {
        for (int i = 1; i<11;i++){
        TConfigDO tConfigDO = new TConfigDO();
        tConfigDO.setConfigId(i);
        tConfigDO.setParaName("字典");
        tConfigDO.setParaValue("666");
        tConfigDO.setParaDesc("字典描述");

        int insert = tConfigMapper.insert(tConfigDO);
        }
    }
}
