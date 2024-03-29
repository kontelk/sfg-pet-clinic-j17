package com.kt.sfgpetclinicj17.controllers;

import com.kt.sfgpetclinicj17.services.VetService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by kontelk on 8/19/23.
 */
@Controller
public class VetController {

    private final VetService vetService;

    public VetController(VetService vetService) {
        this.vetService = vetService;
    }

    @RequestMapping({"/vetsList", "vets.html"})
    public String listVets(Model model) {
        model.addAttribute("vets",
                vetService.findAll());
        return "vets/vetsList";
    }
}
