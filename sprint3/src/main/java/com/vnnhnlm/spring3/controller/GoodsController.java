package com.vnnhnlm.spring3.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("")
public class GoodsController {
    @GetMapping("listGoods")
    public ModelAndView listBills() {
        return new ModelAndView("Goods/list");
    }
}
