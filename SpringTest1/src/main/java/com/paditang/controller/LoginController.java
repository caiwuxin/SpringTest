package com.paditang.controller;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.paditang.bean.LoginBean;
import com.paditang.entity.User;
import com.paditang.service.UserService;

@Controller
public class LoginController {

	@Autowired
	private UserService userService;
	
	@RequestMapping(value="/index.html")
	public String loginPage(){
		return "login";
	}
	
	@RequestMapping(value="/loginCheck.html")
	public ModelAndView loginCheck(HttpServletRequest request,LoginBean loginBean){
		boolean isValidUser =
				userService.hasMatchUser(loginBean.getLoginName(), loginBean.getPassword());
		if(!isValidUser){
			return new ModelAndView("login","error","用户名或者密码错误");//视图的逻辑名，数据模型名称，数据模型对象
		}else {
			User user = userService.findUserByUserName(loginBean.getLoginName());
			user.setLastIp(request.getLocalAddr());
			user.setLastVisit(new Date());
			userService.loginSuccess(user);
			request.getSession().setAttribute("user", user);
			return new ModelAndView("main");
		}
	}
	
}
