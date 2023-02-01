package com.ensim.tp4.demo.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;

import com.ensim.tp4.demo.repository.AddressRepository;

@Controller
public class AddressController {

	@Autowired
	AddressRepository addressRepository;

	@GetMapping("/adresses")
	public String showAddresses(Model model) {
		model.addAttribute("allAddresses", addressRepository.findAll());
		return "addresses";
	}

	@GetMapping(value = "/addresse")
	public String ajouterAddresse(ModelMap model) {

		return "ajouteraddresse";
	}

}