package com.jojoldu.webservice.web;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.boot.test.context.SpringBootTest.WebEnvironment.RANDOM_PORT;

/**
 * Created by jojoldu@gmail.com on 2017. 12. 31.
 * Blog : http://jojoldu.tistory.com
 * Github : https://github.com/jojoldu
 */

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = RANDOM_PORT)
public class WebRestControllerTest {

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void Profile확인 () {
        //when
        String profile = this.restTemplate.getForObject("/profile", String.class);

        //then
        assertThat(profile).isEqualTo("local");
    }
}
