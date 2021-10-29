package com.zj.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

/**
 * @author zhoujian
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "ad_unit_district")
public class AdUnitDistrict {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    @Column(name = "id" ,nullable = false)
    private Integer id;
    @Basic
    @Column(name = "unit_id")
    private Integer unitId;
    @Basic
    @Column(name = "province")
    private String province;
    @Basic
    @Column(name = "city")
    private String city;
}
