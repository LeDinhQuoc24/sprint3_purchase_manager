package com.vnnhnlm.spring3.persistence.repository;

import com.vnnhnlm.spring3.persistence.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UsersRepository extends JpaRepository<Users, Integer> {
    List<Users> findAllByDeleteFlagIsNull();

    Users findAllByDeleteFlagIsNullAndIdIs(Integer id);

}
