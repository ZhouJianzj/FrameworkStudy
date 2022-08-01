package cn.itcast.hotel.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author zhoujian
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PageResult {
    private Integer total;
    private List hotels;

}
