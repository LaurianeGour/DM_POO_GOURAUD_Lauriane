package com.Ensim.Tp2.TP5.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.Ensim.Tp2.TP5.model.AdressRepository;

@Controller
public class AdressController {

    @Autowired
    AdressRepository adressRepository;

    @GetMapping("/adresses")
    public String showAddresses(Model model) {
        model.addAttribute("allAdresses", adressRepository.findAll());
        return "adresses";
    }
}
