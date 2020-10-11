package com.eva.pojo;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Component
public class UrlCollection {

    String str1 = "http://localhost:1000/blog/ad/admin/hello";

    public static final List urlList = new ArrayList();

    @PostConstruct
    public void init(){
        urlList.add(str1);
//        System.out.println(urlList.get(0));
    }

    public static List getUrlList() {
        return urlList;
    }
}
