package com.websocket.domain;

/**
 * @Author: wangxuefeng@hsgene.com
 * @Description:
 * @Date: Created in 10:43 2018/3/20
 * @Modified By:
 */
public class WiselyResponse
{
    private String responseMessage;

    public WiselyResponse(String responseMessage)
    {
        this.responseMessage = responseMessage;
    }

    public String getResponseMessage()
    {
        return responseMessage;
    }

    public void setResponseMessage(String responseMessage)
    {
        this.responseMessage = responseMessage;
    }

    @Override
    public String toString()
    {
        return "WiselyResponse{" + "responseMessage='" + responseMessage + '\'' + '}';
    }
}
