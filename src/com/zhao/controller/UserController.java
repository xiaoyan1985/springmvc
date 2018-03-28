package com.zhao.controller;

import java.lang.ProcessBuilder.Redirect;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.zhao.pojo.User;
import com.zhao.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {

	@Autowired
	UserService userService;
	@RequestMapping("/list")
	public String UserList(Model model) {
		List<User> list =userService.findAll();
		model.addAttribute("list",list);
		return  "itemsList";
	}
	
	@RequestMapping("/edit")
	public String Edit(Integer iduser,Model model){
		User user=userService.findById(iduser);
		model.addAttribute("item",user);
		return "editItem";
	}
	
	@RequestMapping(value ="/saveOrUpdate",method = RequestMethod.POST)
	public String saveOrUpdate(User user){
		userService.update(user);
		return "redirect:list";
	}
	
	@RequestMapping("/deleteByID")
	public String deleteByID(Integer iduser){
		userService.deleteById(iduser);
		return "redirect:list";
	}
	
	@RequestMapping("/add")
	public String Add(){
		return "AddUser";
	}
	
	@RequestMapping("/addUser")
	public String Insert(User user){
		//自增主鍵
		try {
			int maxId =userService.findMaxId();
			/*if(maxId==0){
				user.setIduser(1);
			}else{*/
				user.setIduser(maxId+1);
			//}
			
		} catch (Exception e) {
			// TODO: handle exception
			user.setIduser(1);
		}
		userService.insert(user);
		return "redirect:list";
	}
}
