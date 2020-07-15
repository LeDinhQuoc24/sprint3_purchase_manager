package com.vnnhnlm.spring3.persistence.entity;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    private List<Goods> goods;

    public Cart() {
        this.goods = new ArrayList<Goods>();
    }
    public Cart(List<Goods> goods) {
        this.goods = goods;
    }

    public List<Goods> getGoods() {
        return goods;
    }

    public void setGoods(List<Goods> goods) {
        this.goods = goods;
    }
    public void addToCart(Goods good) {
        goods.add(good);
    }
    public void removeFromCart(int id) {
        for (Goods good : goods) {
            if (good.getId() == id) {
                goods.remove(good);
                return;
            }
        }
    }
}
