package com.vnnhnlm.spring3.persistence.service.impl;

import com.vnnhnlm.spring3.persistence.entity.Bills;
import com.vnnhnlm.spring3.persistence.repository.BillsRepository;
import com.vnnhnlm.spring3.persistence.service.BillsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BillsServiceImpl implements BillsService {
    @Autowired
    BillsRepository billsRepository;
    @Override
    public List<Bills> findAllByDeleteFlagIsNull() {
        return billsRepository.findAllByDeleteFlagIsNull();
    }

    @Override
    public Bills findAllByDeleteFlagIsNullAndIdIs(Integer id) {
        return billsRepository.findAllByDeleteFlagIsNullAndIdIs(id);
    }

    @Override
    public void save(Bills bill) {
        billsRepository.save(bill);
    }

    @Override
    public void remove(Integer id) {
        Bills bill= billsRepository.findAllByDeleteFlagIsNullAndIdIs(id);
        bill.setDeleteFlag(1);
        billsRepository.save(bill);
    }

}
