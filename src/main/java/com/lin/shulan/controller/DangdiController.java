package com.lin.shulan.controller;

import com.lin.shulan.entity.DangdiGentuan;
import com.lin.shulan.service.DangdiService;
import com.lin.shulan.service.DangdiServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
@RequestMapping(value="/dangdi")     // 通过这里配置使下面的映射都在/dangdi下，可去除
public class DangdiController {

    @Autowired
    private DangdiService dangdiService;

//    创建线程安全的map
//    static Map<Integer, DangdiGentuan> gentuan = Collections.synchronizedMap(new HashMap<Integer, DangdiGentuan>());

    // 处理"/gentuan/"的GET请求，用来获取用户列表
    // 还可以通过@RequestParam从页面中传递参数来进行查询条件或者翻页信息的传递
    @RequestMapping(value="/gentuan", method= RequestMethod.GET)
    public List<DangdiGentuan> getGentuanList() {
        return dangdiService.getGentuanList();
    }



}
