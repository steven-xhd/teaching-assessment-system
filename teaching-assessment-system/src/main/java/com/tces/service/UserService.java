package com.tces.service;

import com.tces.pojo.TbUser;
import com.tces.pojo.TbUserCustom;
import com.tces.util.Result;

import java.util.List;

public interface UserService {
    List<TbUserCustom> findAll(Integer classId, Integer roleId);

    void delete(int[] ids)throws Exception;

    void update(TbUser user)throws Exception;

    void insert(TbUser user)throws Exception;

    TbUser findById(Integer id)throws Exception;

    List<TbUserCustom> findByNameLike(String name)throws Exception;

    List<TbUserCustom> findAllTeacher();

    Result selectByLogin(TbUser record);
}
