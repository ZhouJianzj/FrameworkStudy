package com.zj.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Ad_unit")
public class AdUnit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    @Column(name = "id" ,nullable = false)
    private long id;

    @Basic
    @Column(name = "plan_id" ,nullable = false)
    private long planId;

    @Basic
    @Column(name = "unit_name",nullable = false)
    private long unitName;

    @Basic
    @Column(name = "unit_status",nullable = false)
    private Integer unitStatus;
    /**
     * 广告展示位置
     */
    @Basic
    @Column (name = "position_type",nullable = false)
    private Integer positionType;
    @Basic
    @Column(name = "budget" ,nullable = false)
    private long budget;
    @Basic
    @Column(name = "create_time",nullable = false)
    private Date createTime;

    @Basic
    @Column(name = "update_time",nullable = false)
    private Date updateTime;


}
