package com.vnnhnlm.spring3.persistence.repository;

import com.vnnhnlm.spring3.persistence.entity.Bills;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BillsRepository extends JpaRepository<Bills,Integer>{
    List<Bills> findAllByDeleteFlagIsNull();

    Bills findAllByDeleteFlagIsNullAndIdIs(Integer id);

//    void updateBill(Bills bill);
//    void remove(Integer id);



}
