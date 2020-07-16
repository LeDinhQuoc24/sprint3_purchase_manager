package com.vnnhnlm.spring3.persistence.entity;

import javax.persistence.*;

@Entity
@Table(name="role_user")
public class RoleUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "role_user_id")
    private Integer id;
    @ManyToOne
    @JoinColumn(name = "role_id")
    private Roles role;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private Users user;

    @Override
    public String toString() {
        return "RoleUser{" +
                "id=" + id +
                ", role=" + role +
                ", user=" + user +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Roles getRole() {
        return role;
    }

    public void setRole(Roles role) {
        this.role = role;
    }

    public Users getUser() {
        return user;
    }

    public void setUser(Users user) {
        this.user = user;
    }
}
