package com.vnnhnlm.spring3.persistence.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class Goods {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "good_id")
    private Integer id;
    @Column(name = "good_name")
    private String name;
    @Column(name = "price")
    private Integer price;
    @Column(name = "quantity")
    private Integer quantity;
    @Column(name = "category")
    private String category;
    @Column(name = "trade_mask")
    private String tradeMask;
    @Column(name = "sale_off")
    private Integer saleOff;
    @Column(name = "delete_flag")
    private Integer deleteFlag;
    @OneToMany(targetEntity = Bills.class)
    private List<Bills> bills;

    @Override
    public String toString() {
        return "Goods{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                ", category='" + category + '\'' +
                ", tradeMask='" + tradeMask + '\'' +
                ", saleOff=" + saleOff +
                ", deleteFlag=" + deleteFlag +
                ", bills=" + bills +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getTradeMask() {
        return tradeMask;
    }

    public void setTradeMask(String tradeMask) {
        this.tradeMask = tradeMask;
    }

    public Integer getSaleOff() {
        return saleOff;
    }

    public void setSaleOff(Integer saleOff) {
        this.saleOff = saleOff;
    }

    public Integer getDeleteFlag() {
        return deleteFlag;
    }

    public void setDeleteFlag(Integer deleteFlag) {
        this.deleteFlag = deleteFlag;
    }

    public List<Bills> getBills() {
        return bills;
    }

    public void setBills(List<Bills> bills) {
        this.bills = bills;
    }
}
