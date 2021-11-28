package com.zj.springbootfastdfs.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class File {
    Integer id ;
    String fileLocalName;
    String fileGroup;
    String fileRemoteName;
    Double fileSize;
    String fileType;
}
