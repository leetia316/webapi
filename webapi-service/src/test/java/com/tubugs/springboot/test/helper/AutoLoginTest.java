package com.tubugs.springboot.test.helper;

import com.tubugs.springboot.helper.AutoLoginHelper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by xuzhang on 2017/8/27.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class AutoLoginTest {
    @Autowired
    private AutoLoginHelper autoLoginHelper;

    @Test
    public void test1() {
        String input = "兔八哥";
        System.out.println("input:" + input);
        String encode = autoLoginHelper.encrypt(input);
        System.out.println("encode:" + encode);
        String decode = autoLoginHelper.decrypt(encode);
        System.out.println("decode:" + decode);
    }
}
