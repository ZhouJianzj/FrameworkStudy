package com.zj.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "ad_unit_keyword")
public class AdUnitKeyword {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "id",nullable = false)
    private Integer id;
    @Basic
    @Column(name = "unit_id",nullable = false)
    private Integer unitId;
    @Basic
    @Column(name = "keyword",nullable = false)
    private String keyword;

}
