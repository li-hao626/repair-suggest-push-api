package com.smec.repair.suggest.push;

import com.smec.mpaas.unicorn.comm.annotation.EnableUnicorn;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author LiHao
 */
@SpringBootApplication
@EnableUnicorn
@MapperScan("com.smec.repair.suggest.push.dao")
public class RepairSuggestPushApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(RepairSuggestPushApiApplication.class, args);
    }

}
