package com.example.demo;

import com.csvreader.CsvReader;
import com.example.demo.JXH.Dog;

import com.example.demo.JXH.mapper.Son;
import com.example.demo.JXH.mapper.UserDao;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.reflect.FieldUtils;
import org.apache.tomcat.util.http.fileupload.FileUtils;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootContextLoader;
import org.springframework.boot.test.context.SpringBootTest;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.nio.charset.Charset;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;
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
    void test() throws NoSuchFieldException, IllegalAccessException {
        User user = new User();
        user.setName("44");
        Class<? extends User> aClass = user.getClass();
        Field name = aClass.getDeclaredField("name");
        name.setAccessible(true);
        String name1 = name.getName();
        System.out.println(name1);
        Object o = name.get(user);
        System.out.println(o);

    }


    @Test
    void test1() {
        List<String> list = new ArrayList<>();
        if ((1 == 1 && 2 == 2) || 9 == 19) {
            System.out.println(111);
        }
    }

    @Autowired
    private User user;
    @Autowired
    private Dog dog;

    @Test
    void test2() throws Exception {
        Charset DEFAULT_CHARSET = Charset.forName("GBK");// 字符变码
        CsvReader csvReader = new CsvReader("F:/1.xls", '就', DEFAULT_CHARSET);
        csvReader.readHeaders();// 在循环中就不会读到表头 少一行
        // java.io.IOException: Maximum column count of 100,000 exceeded in record 34. Set the SafetySwitch property to false if you're expecting more than 100,000 columns per record to avoid this error.
        csvReader.setSafetySwitch(false);
        while (csvReader.readRecord()) {
            char delimiter = csvReader.getDelimiter();
            System.out.println(delimiter);
            String[] values = csvReader.getValues();
            for (String value : values) {
                System.out.println(value);
            }
            int length = values.length;
            System.out.println(length);
            String rawRecord = csvReader.getRawRecord();
            System.out.println(rawRecord);
        }
    }

    @Autowired
    private UserDao userDao;

    @Test
    void test100() {
        List<Map<String, String>> userList = userDao.getUserList();
        User user = new User();
        user.show();
        System.out.println("123"==UserDao.Java_HOME);
    }

    @Test
    void test101() throws Exception {
//        Class<User> userClass = User.class;
//        Method show = userClass.getDeclaredMethod("show");
//        show.invoke(userClass.newInstance());
        User user = new User();
        Class<? extends User> aClass = user.getClass();
        Method show = aClass.getDeclaredMethod("getName");
        Object invoke = show.invoke(aClass.newInstance());
        System.out.println(invoke);
    }

    @Test
    void test102() throws Exception {
        User son = new User();
        Class<? extends User> aClass = son.getClass();
        Field name = aClass.getDeclaredField("id");
        name.setAccessible(true);
        Type genericType = name.getGenericType();
        String typeName = genericType.getTypeName();

        System.out.println(typeName);
        System.out.println(genericType);

    }
}

