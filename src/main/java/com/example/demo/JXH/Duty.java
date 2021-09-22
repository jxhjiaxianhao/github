package com.example.demo.JXH;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Configuration
@EnableScheduling
@Slf4j
public class Duty {
    @Scheduled(fixedRate = 5000)
    private void show(){
        List<String> list=new ArrayList<>();
        list.add("2");
        log.info("执行静态定时任务时间:"+ LocalDateTime.now());
    }
}
