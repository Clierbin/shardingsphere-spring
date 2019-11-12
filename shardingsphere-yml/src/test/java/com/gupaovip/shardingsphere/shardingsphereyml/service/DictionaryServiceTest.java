package com.gupaovip.shardingsphere.shardingsphereyml.service;

import com.gupaovip.shardingsphere.shardingsphereyml.entity.Dictionary;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


/**
 * ClassName:DictionaryServiceTest
 * Package:com.gupaovip.shardingsphere.shardingsphereyml.service
 * description
 * Created by zhangbin on 2019/11/12.
 *
 * @author: zhangbin q243132465@163.com
 * @Version 1.0.0
 * @CreateTime： 2019/11/12 19:52
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class DictionaryServiceTest {
    @Autowired
    private DictionaryService dictionaryService;
    @Test
    public void addOne() {
        Dictionary dictionary = new Dictionary();
        dictionary.setDictionaryId(666L);
        dictionary.setName("StringUtils.EMPTY");
        dictionary.setValue("StringUtils.EMPTY");

        dictionaryService.addOne(dictionary);
    }
}