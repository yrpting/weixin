package com.weixin.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.alibaba.druid.support.json.JSONUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

@Controller
@RequestMapping("/")
public class WeixinController {
	private static Logger logger = LoggerFactory.getLogger(WeixinController.class);
	/*@Autowired
	private GitService gitService;*/

	@RequestMapping("start")
	public ModelAndView welcome(ModelAndView mv) {
		mv.setViewName("hello");
		//add by rupengyan at 20161208 19:00
		return mv;
	}
	@RequestMapping("test")
	@ResponseBody
	public String weixin(String signature,String echostr,String timestamp,String nonce){
	    System.out.println(echostr);
	    System.out.println(timestamp);
	    System.out.println(nonce);
	    return echostr;
	    
	}
}
