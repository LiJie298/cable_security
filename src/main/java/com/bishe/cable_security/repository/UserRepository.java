package com.bishe.cable_security.repository;

import com.bishe.cable_security.model.User;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends CrudRepository<User, Integer> {
    /**
     * 通过账号查找用户
     *
     * @param account
     * @return
     */
    @Query("select u from User u where u.account = :account")
    User getUserByAccount(@Param("account") String account);

    /**
     * 通过Id，修改用户的密码
     *
     * @param id
     * @param pwd
     * @return
     */
    @Modifying
//    @Transactional
    @Query("update User u set u.password=:password where u.no=:no")
    int updateUserPwd(@Param("no") String id, @Param("password") String pwd);


    List<User> findAll();


}
