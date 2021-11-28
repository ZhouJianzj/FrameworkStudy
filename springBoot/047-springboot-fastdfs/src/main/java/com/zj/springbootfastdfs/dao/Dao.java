package com.zj.springbootfastdfs.dao;

import com.zj.springbootfastdfs.entity.File;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Dao {
     List<File> findAllFilesDao();
}
