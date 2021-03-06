package com.poly.controller;

import com.poly.model.Depart;
import com.poly.service.DepartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.Optional;

@Controller
@RequestMapping("/departs")
public class DepartController {
    private DepartService departService;

    @Autowired
    public DepartController(DepartService departService) {
        this.departService = departService;
    }

    @GetMapping("")
    public ModelAndView getAllDepart() {
        ModelAndView modelAndView = new ModelAndView("/depart/list");

        Iterable<Depart> departs = departService.findAll();

        modelAndView.addObject("departs", departs);

        return modelAndView;
    }

    @GetMapping("/create")
    public ModelAndView showCreateForm() {
        ModelAndView modelAndView = new ModelAndView("/depart/create");
        modelAndView.addObject("depart", new Depart());
        return modelAndView;
    }

    @PostMapping("/create")
    public ModelAndView createDepart(@ModelAttribute("depart") Depart depart) {
        ModelAndView modelAndView = new ModelAndView("/depart/create");
        departService.save(depart);
        modelAndView.addObject("message", "New depart is created");
        modelAndView.addObject("depart", new Depart());
        return modelAndView;
    }

    @GetMapping("/{id}/delete")
    public ModelAndView showDeleteForm(@PathVariable("id") Long id) {
        Optional<Depart> depart = departService.findById(id);
        ModelAndView modelAndView = new ModelAndView();
        if (depart == null) {
            modelAndView.setViewName("/error404");
            return modelAndView;
        } else {
            modelAndView.setViewName("/depart/delete");
            modelAndView.addObject("depart", depart);
            return modelAndView;
        }
    }


    @PostMapping("/{id}/delete")
    public ModelAndView deleteDepart(@PathVariable("id") Long id) {
        Optional<Depart> depart = departService.findById(id);
        ModelAndView modelAndView = new ModelAndView();
        if (depart != null) {
            departService.delete(id);
        }
        modelAndView.setViewName("redirect:/departs");
        return modelAndView;
    }

    @GetMapping("/{id}/edit")
    public ModelAndView showEditForm(@PathVariable("id") Long id) {

        ModelAndView modelAndView;
        Optional<Depart> depart = departService.findById(id);
        if (depart != null) {
            modelAndView = new ModelAndView("/depart/edit");
            modelAndView.addObject("depart", depart);
            return modelAndView;
        } else {
            return new ModelAndView("/error404");
        }
    }

    @PostMapping("/{id}/edit")
    public ModelAndView update(@ModelAttribute("depart") Depart depart) {

        ModelAndView modelAndView = new ModelAndView("/depart/edit");
        departService.save(depart);
        modelAndView.addObject("depart", depart);
        modelAndView.addObject("message", "Update successfully");
        return modelAndView;
    }
}
