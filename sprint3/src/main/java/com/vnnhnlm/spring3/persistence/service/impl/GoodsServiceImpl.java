package com.vnnhnlm.spring3.persistence.service.impl;

import com.vnnhnlm.spring3.persistence.entity.Goods;
import com.vnnhnlm.spring3.persistence.repository.GoodsRepository;
import com.vnnhnlm.spring3.persistence.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GoodsServiceImpl implements GoodsService {
    @Autowired
    private GoodsRepository goodsRepository;

    @Override
    public List<Goods> findAllByDeleteFlagIsNull() {
        return goodsRepository.findAllByDeleteFlagIsNull();
    }

    @Override
    public Goods findAllByDeleteFlagIsNullAndIdIs(Integer id) {
        return goodsRepository.findAllByDeleteFlagIsNullAndIdIs(id);
    }

    @Override
    public void save(Goods good) {
        goodsRepository.save(good);
    }

    @Override
    public void remove(Integer id) {
        goodsRepository.deleteById(id);
    }
}
