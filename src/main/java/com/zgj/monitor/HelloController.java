package com.zgj.monitor;

import com.zgj.entity.Book;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Created by zgj on 2018/11/29.
 */
@RestController
//@RequestMapping("/")
public class HelloController {
    @Resource(name="book")
    private Book book;
//    @Value("${book.author}")   指定application.properties中的配置
//    private String bookAuthor;
//    @Value("${book.name}")
//    private String bookName;
    @RequestMapping(value = "/{name}",method = RequestMethod.GET)
    public String index(@PathVariable("name") String name){
        String   html = "<html><h1>那么</h1></hmtl>";
        return  html;

    }

}
