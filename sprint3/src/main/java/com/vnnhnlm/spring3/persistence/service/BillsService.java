package com.vnnhnlm.spring3.persistence.service;

import com.vnnhnlm.spring3.persistence.entity.Bills;

import java.util.List;

public interface BillsService {
    List<Bills> findAllByDeleteFlagIsNull();

    Bills findAllByDeleteFlagIsNullAndIdIs(Integer id);

    void save(Bills bill);

    void remove(Integer id);

}
