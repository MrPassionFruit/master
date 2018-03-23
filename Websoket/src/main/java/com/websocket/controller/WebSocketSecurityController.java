package com.websocket.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Controller;

import java.security.Principal;

/**
 * @Author: wangxuefeng@hsgene.com
 * @Description:
 * @Date: Created in 14:11 2018/3/20
 * @Modified By:
 */
@Controller
public class WebSocketSecurityController
{
    @Autowired
    private SimpMessagingTemplate simpMessagingTemplate;

    @MessageMapping("/chat")
    public void chat(Principal principal, String msg)
    {
        System.out.println(msg);
        if ("test1".equals(principal.getName()))
        {
            simpMessagingTemplate
                    .convertAndSendToUser("test", "/queue/notifications", principal.getName() + "-send: " + msg);
        }
        else
        {
            simpMessagingTemplate
                    .convertAndSendToUser("test1", "/queue/notifications", principal.getName() + "-send: " + msg);
        }
    }
}
