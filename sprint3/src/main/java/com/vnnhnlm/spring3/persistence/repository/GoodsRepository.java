package com.vnnhnlm.spring3.persistence.repository;

import com.vnnhnlm.spring3.persistence.entity.Goods;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface GoodsRepository extends JpaRepository<Goods,Integer>{
    List<Goods> findAllByDeleteFlagIsNull();
    Goods findAllByDeleteFlagIsNullAndIdIs(Integer id);
}
