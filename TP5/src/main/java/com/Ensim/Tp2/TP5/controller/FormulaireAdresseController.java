package com.Ensim.Tp2.TP5.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FormulaireAdresseController {

    @GetMapping("/adresse")
    public String showForm(Model model) {
        return "adresse";
    }
}
