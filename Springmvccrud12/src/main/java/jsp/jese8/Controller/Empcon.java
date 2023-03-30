package jsp.jese8.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;


import jsp.jese8.Dao.EmpDao;
import jsp.jese8.Dto.EmpDto;


@Controller
public class Empcon<Empdto> {
	@Autowired
	EmpDto dto;
@Autowired
	EmpDao dao;
//<------------------insert------------------->
	@RequestMapping("/signup")
	public ModelAndView signup() {
		ModelAndView modelAndView=new ModelAndView("signup.jsp");
		modelAndView.addObject("empobject", dto);
		return modelAndView;	
	}
	@ResponseBody
	@RequestMapping("/insert")
	public void saveData(EmpDto dto) {
		dao.insert(dto);
  //<----------------delete------------------>
	}
	@RequestMapping("/delete")
	public ModelAndView delete() {
		ModelAndView modelAndView=new ModelAndView("delete.jsp");
		modelAndView.addObject("deletebyid",dto );
		return modelAndView;
	}
	@ResponseBody
	@RequestMapping("/deleteemail")
	public String deleteMail(EmpDto dto) {
		EmpDto empdto=dao.findbyid(dto.getEmail());
		dao.deletedata(empdto);
		return "record deleted"+dto.getEmail();
	}
	//<------------------update----------------->
	@RequestMapping("/update")
	public ModelAndView update() {
		ModelAndView modelAndView=new ModelAndView("update.jsp");
		modelAndView.addObject("updatename", dto);
		return modelAndView;
	}
	@ResponseBody
	@RequestMapping("/updatebyname")
	public String updateName(String email, String name) {
		dao.updatedata(email,name);
		return "record update"+dto.getName();
				
	}
	//<------------------fetch--------------------->
	@RequestMapping("/fetch")
	public ModelAndView fetch() {
		ModelAndView modelAndView=new ModelAndView("fetch.jsp");
		modelAndView.addObject("fetchbyid", dto);
		return modelAndView;
	}
	@ResponseBody
	@RequestMapping("/fetchemail")
	public ModelAndView fetch(String email) {
		EmpDto dto=dao.fetchEmail(email);
		ModelAndView modelAndView=new ModelAndView("display.jsp");
		modelAndView.addObject("requestkey", dto);
		return modelAndView;
		
	}
	//<------------------fetchAll------------------->
	
	@RequestMapping("/display")
	public ModelAndView displayAll() {
		List<EmpDto>details=dao.fetchAll();
		ModelAndView modelAndView=new ModelAndView("fetchall.jsp");
		modelAndView.addObject("formkey", details);
		return modelAndView;
	}
}

