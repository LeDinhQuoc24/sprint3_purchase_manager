package com.vnnhnlm.spring3.controller;

import com.vnnhnlm.spring3.persistence.entity.Bills;
import com.vnnhnlm.spring3.persistence.entity.Goods;
import com.vnnhnlm.spring3.persistence.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RestController
@RequestMapping("")
public class GoodsController {
    @Autowired
    private GoodsService goodsService;

    @GetMapping("goodsList")
    public List<Goods> goodsList() {
        return goodsService.findAllByDeleteFlagIsNull();
    }
    @GetMapping("listGoods")
    public ModelAndView listBills() {
        return new ModelAndView("Goods/list");
    }
}
