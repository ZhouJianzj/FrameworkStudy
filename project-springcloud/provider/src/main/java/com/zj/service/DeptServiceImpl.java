package com.zj.service;

import com.zj.dao.DeptDao;
import com.zj.entities.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeptServiceImpl implements DeptService {
    @Autowired
    private DeptDao deptDao;

    @Override
    public List<Dept> serSelectDept() {
        return deptDao.daoSelectDept();
    }
}
