package com.example.demo;

import com.deepoove.poi.data.TextRenderData;
import com.deepoove.poi.data.Texts;
import org.apache.commons.lang3.StringUtils;
import org.assertj.core.error.ShouldHaveOnlyElementsOfType;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import sun.net.www.http.HttpClient;

import java.io.*;
import java.lang.reflect.Field;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;


@SpringBootTest
class DemoApplicationTests {

    @Test
    void contextLoads() {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyyMMdd");
        String format = LocalDate.now().format(dateTimeFormatter);
        System.out.println(format);
    }

    @Test
    void test() {
//       List<String> list=new ArrayList();
//       list.add("jia");
//       list.add("xian");
//       list.add("hao");
//        List<String> j = list.stream().filter(n -> n.startsWith("j")).collect(Collectors.toList());
//        System.out.println(j);
        System.out.println("nnnn");
    }


    @Test
    void test1() {
       String[] strings=new String[]{"a","b","c"};
        String join = String.join("/", strings);
        System.out.println(join);
    }
}
