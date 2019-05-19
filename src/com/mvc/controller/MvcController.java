package com.mvc.controller;

import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.mstf.mvc.util.MD5;
import com.mvc.dao.Degree;
import com.mvc.dao.User;
import com.mvc.dao.UserInfo;

@Controller
public class MvcController {
	@RequestMapping(value="/test",method=RequestMethod.POST)
	public String all(@ModelAttribute("user") User user){
		System.err.println(123);
		System.err.println("����"+user.getName()+"����"+user.getAge());
		return "/MyJsp.jsp";
	}
	

	//@RequestParam	����/index.jsp
	@RequestMapping(value="/fz")
	public String fz(@RequestParam String name){
		System.err.println(name);
		return "/a.jsp";
	}
	
	//@PathVariable	����/dt_11.form
	@RequestMapping(value="/dt_{a}")
	public String dt(@PathVariable String a){
		System.err.println(a);
		return "/a.jsp";
	}
	//ModelAndView	����/aaa.form
	@RequestMapping(value="/aaa")
	public ModelAndView show(@ModelAttribute("degree") Degree degree){
		ModelAndView mav=new ModelAndView("a.jsp");
		mav.addObject("deg",degree);
		return mav;
	}
	//@ModelAttribute+����+��֤	  ����/survey.jsp  
	@RequestMapping(value="/add",method=RequestMethod.POST)
	public String add(@Valid @ModelAttribute("degree") Degree degree,BindingResult bind) throws NoSuchAlgorithmException{
		if (bind.hasErrors()) {
			System.err.println("on");
			return "survey.jsp";
			
		}else {
			System.err.println("ok"); 
			return "/a.jsp";
		}
		//����
/*		String newpass=MD5.getInstance(degree.getAge());
		degree.setAge(newpass);
		System.err.println("�ɹ�");
		return "/a.jsp";*/
	}
	//ServletAPI	����/aaa.form
	@RequestMapping(value="/bbb")
	public String bb(@ModelAttribute("degree") Degree degree,HttpServletRequest request,HttpServletResponse response){
		HttpSession session = request.getSession();
		session.setAttribute("deg", degree);
		return "a.jsp";
	}
	
	
	@RequestMapping(value="/xxx")
	public ModelAndView xx(@ModelAttribute("info") UserInfo info){
		ModelAndView mav=new ModelAndView("index.jsp");
		UserInfo userinfo=new UserInfo();
		List<String> list=new ArrayList<String>();
		list.add("����");
		list.add("����");
		String[] tc={"java","ps",".net"};
		userinfo.setTc(tc);
		userinfo.setList(list);
		mav.addObject("userinfo", userinfo);
		return mav;
	}
}
