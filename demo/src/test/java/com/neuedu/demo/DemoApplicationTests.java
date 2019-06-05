package com.neuedu.demo;

import com.neuedu.mapper.BoyMapper;
import com.neuedu.pojo.Boys;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

    @Autowired
    private BoyMapper bm;

    @Test
    public void contextLoads() {
        System.out.println("方法开始执行>>>");
        List<Boys> boys = bm.selectList();
        System.out.println(boys);


    }

}
