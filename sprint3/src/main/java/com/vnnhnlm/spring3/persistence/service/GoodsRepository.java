package com.vnnhnlm.spring3.persistence.service;

import com.vnnhnlm.spring3.persistence.entity.Bills;
import com.vnnhnlm.spring3.persistence.entity.Goods;

import java.util.List;

public interface GoodsRepository {
    List<Goods> findAllByDeleteFlagIsNull();

    Goods findAllByDeleteFlagIsNullAndIdIs(Integer id);

    void save(Goods good);

    void remove(Integer id);
}
