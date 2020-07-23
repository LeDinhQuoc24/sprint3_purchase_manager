package com.vnnhnlm.spring3.persistence.service;

import com.vnnhnlm.spring3.persistence.entity.Bills;
import com.vnnhnlm.spring3.persistence.entity.Goods;

import java.util.List;

public interface GoodsService {
    List<Goods> findAllByDeleteFlagIsNull();

    Goods findAllByDeleteFlagIsNullAndIdIs(Integer id);

    void save(Goods good);

    void remove(Integer id);

//    List<Goods> searchAll(String name,Integer price,Integer quantity,Integer );
}
