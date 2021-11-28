package com.zj.springbootfastdfs.service;

import com.zj.springbootfastdfs.dao.Dao;
import com.zj.springbootfastdfs.entity.File;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author zhoujian
 */
@org.springframework.stereotype.Service
public class ServiceImpl implements Service {
    @Resource
    Dao dao;


    @Override
    public List<File> findAllFilesService() {
        return dao.findAllFilesDao();
    }
}
