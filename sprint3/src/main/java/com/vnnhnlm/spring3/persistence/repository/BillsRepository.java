package com.vnnhnlm.spring3.persistence.repository;

import com.vnnhnlm.spring3.persistence.entity.Bills;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface BillsRepository extends JpaRepository<Bills, Integer> {
    List<Bills> findAllByDeleteFlagIsNull();

    Bills findAllByDeleteFlagIsNullAndIdIs(Integer id);

    @Query(value = "select b from Bills b where b.user.name like %?1% and b.deleteFlag is null order by b.id")
    List<Bills> searchAllByName(String name);

    @Query(value = "select b from Bills b where b.billType>=?1 and b.quantity>=?2 and b.user.name like %?3% and " +
            "b.good.name like %?4% and b.deleteFlag is null order by b.id")
    List<Bills> searchAll(Integer billType,Integer quantity,String nameUser,String nameGood);



//    void updateBill(Bills bill);
//    void remove(Integer id);


}
