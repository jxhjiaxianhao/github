package com.example.demo;

import com.deepoove.poi.XWPFTemplate;
import io.undertow.util.FileUtils;
import org.apache.commons.lang3.StringUtils;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Field;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;


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
    void test1() throws IOException {
        List list = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            Map map = new HashMap();
            map.put("name", "贾先浩");
            map.put("age", 16);
            list.add(map);
        }
        Map map = new HashMap();
        map.put("songs", list);
        XWPFTemplate template = XWPFTemplate.compile("D:/1.docx");
        template.render(map);

        template.writeAndClose(new FileOutputStream("D:/2.docx"));
    }

    @Test
    void test5() {
        String REPORT = "word";

    }

    @Test
    void test9() {
        List<User> list = new ArrayList<>();
        User user1 = new User();
        user1.setInteger(1);
        list.add(user1);
        User user2 = new User();
        user2.setInteger(5);
        list.add(user2);
        User user3 = new User();
        user3.setInteger(3);
        list.add(user3);
        User user4 = new User();
        user4.setInteger(0);
        list.add(user4);
        Collections.sort(list);
        for (User user : list) {
            System.out.println(user);
        }
    }

    @Test
    void test10() {
        String i = "";
        if (i != "") {
            System.out.println(111);
        }
    }
}
