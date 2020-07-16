package com.vnnhnlm.spring3.controller;

import com.vnnhnlm.spring3.persistence.entity.Bills;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class MenuController {
    @GetMapping("")
    public ModelAndView menu() {
        return new ModelAndView("view");

    }
}
