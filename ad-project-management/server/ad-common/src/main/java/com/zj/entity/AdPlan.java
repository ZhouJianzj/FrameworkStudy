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
@Table(name = "ad_plan")
public class AdPlan {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long  id;
    @Basic
    @Column(name = "user_id" ,nullable = false)
    private long userId;
    @Basic
    @Column(name = "plan_name" ,nullable = false)
    private String planName;
    @Basic
    @Column(name = "start_date",nullable = false)
    private Date startDate;
    @Basic
    @Column(name = "end_date",nullable = false)
    private Date endDate;
    @Basic
    @Column(name = "create_time",nullable = false)
    private Date createTime;
    @Basic
    @Column(name = "update_time",nullable = false)
    private Date updateTime;
}
