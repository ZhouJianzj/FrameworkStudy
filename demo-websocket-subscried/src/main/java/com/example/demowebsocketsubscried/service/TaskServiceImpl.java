package com.example.demowebsocketsubscried.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * @Auther: HeJD
 * @Date: 2018/8/29 17:18
 * @Description:
 */
@Component
public class TaskServiceImpl   {


    /**这个就是我们可以指定频道推送对应数据的对象
     *
     */

    @Autowired
    private SimpMessagingTemplate simpMessagingTemplate;


}