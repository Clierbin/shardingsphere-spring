package com.gupaovip.shardingsphere.shardingsphereyml.service;

import com.gupaovip.shardingsphere.shardingsphereyml.entity.Dictionary;
import com.gupaovip.shardingsphere.shardingsphereyml.mapper.DictionaryMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * ClassName:DictionaryService
 * Package:com.gupaovip.shardingsphere.shardingsphereyml.service
 * description
 * Created by zhangbin on 2019/11/12.
 *
 * @author: zhangbin q243132465@163.com
 * @Version 1.0.0
 * @CreateTime： 2019/11/12 17:19
 */
@Service
public class DictionaryService {
    @Autowired
    private DictionaryMapper dictionaryMapper;

    public long addOne(Dictionary dictionaryDO) {
        this.dictionaryMapper.addOne(dictionaryDO);
        return dictionaryDO.getDictionaryId();
    }
}
