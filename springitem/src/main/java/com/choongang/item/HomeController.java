package com.choongang.item;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.choongang.item.domain.Item;
import com.choongang.item.service.ItemService;

@Controller
public class HomeController {
	@Autowired
	private ItemService itemService;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Model model) {
		model.addAttribute("list", itemService.getAll());
		return "home";
	}
	@RequestMapping("/detail.html")
	public String detail(
			@RequestParam("itemid") int itemid, Model model){
		Item item = itemService.getItem(itemid);
		//데이터를 저장
		model.addAttribute("item", item);
		return "detail";
	}	
}
