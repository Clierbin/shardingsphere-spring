package com.gupaovip.shardingsphere.shardingsphereprop.hutool;

import cn.hutool.core.util.IdUtil;

/**
 * ClassName:FirstHutoolTest
 * Package:com.gupaovip.shardingsphere.shardingsphereprop.hutool
 * description
 * Created by zhangbin on 2019/11/12.
 *
 * @author: zhangbin q243132465@163.com
 * @Version 1.0.0
 * @CreateTime： 2019/11/12 15:07
 */
public class FirstHutoolTest {
    public static void main(String[] args) {
        String randomUUID = IdUtil.randomUUID();
        System.out.println(randomUUID);
    }
}
