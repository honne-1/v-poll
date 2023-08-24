package com.example.polling_app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.jpa.convert.threeten.Jsr310JpaConverters;

import javax.annotation.PostConstruct;
import java.util.TimeZone;

@SpringBootApplication
@EntityScan(basePackageClasses = {
        PollingAppApplication.class,
        Jsr310JpaConverters.class
})
public class PollingAppApplication {
    /**
     * Set Spring Boot SetTimeZone
     */
    @PostConstruct
    void init() {
        // 生成对象时完成时区转换
        TimeZone.setDefault(TimeZone.getTimeZone("Asia/Shanghai"));
    }

    public static void main(String[] args) {
        SpringApplication.run(PollingAppApplication.class, args);
    }
}