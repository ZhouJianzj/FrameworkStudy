package cn.itcast.hotel.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author zhoujian
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class QueryParams {
    private String key;
    private Integer page;
    private Integer size;
    private String sortBy;



    private String brand;
    private String starName;
    private String city;
    private Integer minPrice;
    private Integer maxPrice;

    private String location;


}
