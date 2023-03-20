package com.venky.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.venky.model.Mobile;
import com.venky.repo.MobileRepo;
@Controller
public class MobileController {

	@Autowired
	private MobileRepo repo;
	@RequestMapping(value="/")
	public String home() {
		return"home";
	}
	@RequestMapping("/add")
	public String add() {
		return "addMobile";
	}
	@RequestMapping(value="/added",method=RequestMethod.POST)
	public String submited(Mobile mobile,Model m) {
		repo.save(mobile);
		return "success";
	}
	@RequestMapping(value="/views",method=RequestMethod.GET)
	public String view(Model m) {
		m.addAttribute("mobile", repo.findAll());
		return "viewMobile";
	}
	@RequestMapping(value="/edit/{model_no}")
	public String getedit(@PathVariable Integer model_no,Model m ) {
		Mobile mobile=repo.findById(model_no).get();
		m.addAttribute("command",mobile);
		return "editMobile";
	}
	@RequestMapping(value="/editMobile",method=RequestMethod.POST)
	public String edit(@RequestParam Integer model_no,
			
			@RequestParam String model_name,
			@RequestParam String mobile_name,
			@RequestParam String ram_size,
			@RequestParam String rom_size,
			@RequestParam String os_name,
			@RequestParam String f_cam,
			@RequestParam String b_cam,
			@RequestParam String battary_capacity,
			@RequestParam String imei_no,
			@RequestParam String price,
			@RequestParam String color,Mobile mobile,Model m) {
		repo.save(mobile);
		return "redirect:/viewMobile";
	}
	@RequestMapping(value="/delete/{model_no}",method=RequestMethod.GET)
	public String delete(@PathVariable Integer model_no) {
		repo.deleteById(model_no);
		return "redirect:/viewMobile"; 
	}
	
	
	
}
