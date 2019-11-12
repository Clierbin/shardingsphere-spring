package com.gupaovip.shardingsphere.shardingsphereyml.service;

import com.gupaovip.shardingsphere.shardingsphereyml.entity.OtherTable;
import com.gupaovip.shardingsphere.shardingsphereyml.mapper.OrderMapper;
import com.gupaovip.shardingsphere.shardingsphereyml.mapper.OtherTableMapper;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * ClassName:OtherTest
 * Package:com.gupaovip.shardingsphere.shardingsphereyml.service
 * description
 * Created by zhangbin on 2019/11/12.
 *
 * @author: zhangbin q243132465@163.com
 * @Version 1.0.0
 * @CreateTime： 2019/11/12 21:04
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class OtherTest {
    @Autowired
    private OtherTableMapper otherTableMapper;

    @Test
    public void otherTest(){
        OtherTable otherTable = new OtherTable();
        otherTable.setId(666L);
        otherTable.setName("zhangbin666");
        otherTableMapper.addOne(otherTable);
    }

    @Test
    public void selectAll(){
        List<OtherTable> all = otherTableMapper.getAll();
        for (OtherTable otherTable : all) {
            System.out.println(otherTable);
        }
    }
}
