package com.zj.springbooteach.web;

import com.zj.springbooteach.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class UserController {

    List<User> list = new ArrayList();
    User[] users = new User[10];
    Map<Integer, User> map = new HashMap<>();

    /**
     * list循环
     *
     * @param model
     * @return
     */
    @RequestMapping(value = "/eachList")
    public String eachList(Model model) {
//        防止迭代递增
        list.clear();
        for (int a = 0; a < 10; a++) {
            User user = new User();
            user.setId(100 + a);
            user.setName("周健" + a);
            user.setAddress("南京" + a);
            list.add(user);
        }
        model.addAttribute("userList", list);
        return "EachList";
    }

    /**
     * 循环array
     *
     * @param model
     * @return
     */
    @RequestMapping(value = "/eachArray")
    public String eachArray(Model model) {
//        装填数据
        for (int a = 0; a < users.length; a++) {
            User user = new User();
            user.setId(100 + a);
            user.setName("周健" + a);
            user.setAddress("南京" + a);
            users[a] = user;
        }
        model.addAttribute("users", users);
        return "Array";
    }

    /**
     * 循环Map
     *
     * @param model
     * @return
     */
    @RequestMapping(value = "/eachMap")
    public String eachMap(Model model) {
        map.clear();
        for (int a = 0; a < 10; a++) {
            User user = new User();
            user.setId(100 + a);
            user.setName("周健" + a);
            user.setAddress("南京" + a);
            map.put(a, user);
        }
        model.addAttribute("userMaps", map);
        return "Map";
    }

    List<Map<Integer, List<User>>> complex = new ArrayList();

    @RequestMapping(value = "/eachComplex")
    public String eachComplex(Model model) {
        complex.clear();
//        为complex添加数据
        for (int a = 0; a < 2; a++) {
            Map<Integer, List<User>> listMap = new HashMap<>();
//            为map添加数据
            for (int b = 0; b < 2; b++) {
                List<User> listMapList = new ArrayList<>();
//                为list添加数据
                for (int c = 0; c < 3; c++) {
                    User user = new User();
                    user.setId(100 + c);
                    user.setName("周健" + c);
                    user.setAddress("南京" + c);
                    listMapList.add(user);
                }
                listMap.put(b, listMapList);
            }
            complex.add(listMap);
        }
        model.addAttribute("listMapLists", complex);
        System.out.println(complex.toString());
        return "Complex";
    }

    @RequestMapping(value = "doIf")
    public String doIf(Model model) {
        model.addAttribute("data", 1);
        return "doIf";
    }

    @RequestMapping(value = "doUnless")
    public String doUnless(Model model) {
        model.addAttribute("data", 1);
        return "doUnless";
    }

    @RequestMapping(value = "doSwitch")
    public String doSwitch(Model model) {
        model.addAttribute("data", 1);
        return "doSwitch";
    }
}
