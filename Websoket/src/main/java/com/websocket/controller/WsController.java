package com.websocket.controller;

import com.websocket.domain.WiselyMessage;
import com.websocket.domain.WiselyResponse;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

/**
 * @Author: wangxuefeng@hsgene.com
 * @Description:
 * @Date: Created in 10:46 2018/3/20
 * @Modified By:
 */
@Controller
public class WsController
{
    @MessageMapping("welcome")
    @SendTo("/topic/getResponse")
    public WiselyResponse say(WiselyMessage message) throws Exception
    {
        System.out.println(message);
        Thread.sleep(3000);
        return new WiselyResponse("Welcome," + message.getName());

    }
}
