package wxf.hq.application.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author: wangxuefeng@hsgene.com
 * @Description:
 * @Date: Created in 11:29 2018/2/2
 * @Modified By:
 */
@Controller
@RequestMapping("wxf/")
public class IndexController
{

    @RequestMapping("/index")
    public String index(){
        return "index";
    }
}
