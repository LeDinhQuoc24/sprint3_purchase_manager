package com.vnnhnlm.spring3.persistence.entity;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="bills")
public class Bills {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "bill_id")
    private Integer id;
    @Column(name = "create_date")
    private Date createDate;
    @Column(name = "bill_type")
    private Integer billType;
    @Column(name = "quantity")
    private Integer quantity;
    @Column(name = "delete_flag")
    private Integer deleteFlag;
    @ManyToOne
    @JoinColumn(name = "good_id")
    private Goods good;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private Users user;

    @Override
    public String toString() {
        return "Bills{" +
                "id=" + id +
                ", createDate=" + createDate +
                ", billType=" + billType +
                ", quantity=" + quantity +
                ", deleteFlag=" + deleteFlag +
                ", good=" + good +
                ", user=" + user +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Integer getBillType() {
        return billType;
    }

    public void setBillType(Integer billType) {
        this.billType = billType;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Integer getDeleteFlag() {
        return deleteFlag;
    }

    public void setDeleteFlag(Integer deleteFlag) {
        this.deleteFlag = deleteFlag;
    }

    public Goods getGood() {
        return good;
    }

    public void setGood(Goods good) {
        this.good = good;
    }

    public Users getUser() {
        return user;
    }

    public void setUser(Users user) {
        this.user = user;
    }
}
