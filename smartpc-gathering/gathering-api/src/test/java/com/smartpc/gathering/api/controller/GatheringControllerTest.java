package com.smartpc.gathering.api.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.ResultMatcher;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.RequestResultMatchers;


/**
 * @author 刘德云
 * @version V1.0
 * @Title: GatheringControllerTest
 * @Package com.smartpc.gathering.core
 * @Description: rest 接口测试
 * @date 2017/5/10 下午11:36
 */
@RunWith(SpringRunner.class)
@WebMvcTest(GatheringController.class)
public class GatheringControllerTest {
    @MockBean(classes = GatheringController.class)
    private MockMvc mockMvc;
    @Test
    public void testHello() throws Exception {
        RequestBuilder request =null;
        request = MockMvcRequestBuilders.get("/");
    }
}
