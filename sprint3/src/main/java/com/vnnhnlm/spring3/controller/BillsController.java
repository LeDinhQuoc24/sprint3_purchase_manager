package com.vnnhnlm.spring3.controller;

import com.vnnhnlm.spring3.persistence.entity.Bills;
import com.vnnhnlm.spring3.persistence.service.BillsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/bills")
public class BillsController {
    @Autowired
    BillsService billsService;

    @GetMapping("")
    public List<Bills> getAllBills() {
        return billsService.findAllByDeleteFlagIsNull();
    }

//    @GetMapping("/{id}")
//    public Bills getBill(@PathVariable("id")Integer id) {
//        Bills bill = billsService.findAllByDeleteFlagIsNullAndIdIs(id);
//        if (bill != null) {
//            return
//
//        }
//
//    }

}
