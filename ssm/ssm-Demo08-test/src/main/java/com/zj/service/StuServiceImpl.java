package com.zj.service;

import com.zj.dao.StuDao;
import com.zj.eneties.Stu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author zhoujian
 */
@Component
public class StuServiceImpl implements StuService {
    @Autowired
    private StuDao stuDao;

    @Override
    public List<Stu> serviceFind(int id) {
        return stuDao.select(id);
    }
}
