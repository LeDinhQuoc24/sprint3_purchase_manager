package com.vnnhnlm.spring3.controller;

import com.vnnhnlm.spring3.persistence.entity.Bills;
import com.vnnhnlm.spring3.persistence.service.BillsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;


import java.util.List;

@RestController
@RequestMapping("")
public class BillsController {
    @Autowired
    private BillsService billsService;

    @GetMapping("billsList")
    public  List<Bills> billList() {
        return billsService.findAllByDeleteFlagIsNull();
    }

    @GetMapping("listBills")
    public ModelAndView listBills() {
        return new ModelAndView("Bills/list");
    }
    @GetMapping("createBill")
    public ModelAndView createBill() {
        return new ModelAndView("Bills/create");
    }
    @GetMapping(value = "bills",params = {"name"})
    public List<Bills> billListByName(@RequestParam(value="name",defaultValue = "") String name) {

        return billsService.searchAllByName(name);
    }
    @GetMapping(value="billsBySearch",params = {"billType","quantity","nameUser","nameGood"})
    public List<Bills> billsBySearch(@RequestParam(value="billType",defaultValue = "0")int billType,
                                     @RequestParam(value="quantity",defaultValue = "0")int quantity,
                                     @RequestParam(value="nameUser",defaultValue = "")String nameUser,
                                     @RequestParam(value="nameGood",defaultValue = "")String nameGood)
    {
        return billsService.searchAll(billType, quantity, nameUser, nameGood);
    }


}
