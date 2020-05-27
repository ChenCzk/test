package com.czk.service.imp;


import com.czk.dao.RoleDao;
import com.czk.pojo.Role;
import com.czk.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleServiceImp implements RoleService {

    @Autowired
    private RoleDao dao;

    public Role getRole(int id) {
        Role select = dao.select(id);
        return select;
    }
}
