package com.vnnhnlm.spring3.persistence.repository;

import com.vnnhnlm.spring3.persistence.entity.RoleUser;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RoleUserRepository extends JpaRepository<RoleUser,Integer> {
}
