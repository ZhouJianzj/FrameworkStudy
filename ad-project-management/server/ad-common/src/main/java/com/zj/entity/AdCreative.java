package com.zj.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

/**
 * @author zhoujian
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "ad_creative")
public class AdCreative {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;
    @Basic
    @Column(name = "name")
    private String name;
    @Basic
    @Column(name = "type")
    private long type;
    @Basic
    @Column(name = "material_type")
    private long materialType;
    @Basic
    @Column(name = "height")
    private Integer height ;
    @Basic
    @Column(name = "width")
    private Integer width;
    @Basic
    @Column(name = "size")
    private long size;
    @Basic
    @Column(name = "duration")
    private  Integer duration;
    @Basic
    @Column(name = "audit_status")
    private long auditStatus;
    @Basic
    @Column(name = "user_id")
    private long userId;
    @Basic
    @Column(name = "url")
    private String url;
    @Basic
    @Column(name = "create_time")
    private Date createTime;
    @Basic
    @Column(name = "update_time")
    private Date updateTime;


}
