package com.example.book.controller;


import com.example.book.model.ResponseJson;
import com.example.book.serviceImpl.BookServiceImplementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class MainController {
	
	@Autowired
	BookServiceImplementation _bookServiceImp;

	@RequestMapping(value = { "/", "/index" }, method = RequestMethod.GET)
	public String index(Model model, String search) {


		if (search != null)
		{
		ResponseJson response = _bookServiceImp.search(search);

		model.addAttribute("totalItems", response.getTotalItems());
		model.addAttribute("books", response.getItems());
		}
		return "index";
	}

}
