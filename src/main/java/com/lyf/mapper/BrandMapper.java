package com.lyf.mapper;


import com.lyf.pojo.Brand;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface BrandMapper {


    /**
     * 查询所有
     */
    List<Brand> selectAll();


    /**
     * 查看详情：根据Id查询
     */
    Brand selectById(int id);

    /**
     * 条件查询
     *  * 参数接收
     *      1. 散装参数：如果方法中有多个参数，需要使用@Param("SQL参数占位符名称")
     *      2. 对象参数:对象的属性名称要和参数占位符名称一致
     *      3. map集合参数
     *
     */

    //List<Brand> selectByCondition(@Param("status") int status, @Param("companyName") String companyName, @Param("brandName") String brandName);  //散装参数
    //List<Brand> selectByCondition(Brand brand);  //对象参数
    List<Brand> selectByCondition(Map map);  //map集合参数

    /**
     * 单条件动态查询
     * @param brand
     * @return
     */
    List<Brand> selectByConditionSingle(Brand brand);  //数据封装为对象，传入参数


    /**
     * 添加
     */
    void add(Brand brand);


    /**
     * 修改
     */
    int update(Brand brand);

    /**
     * 根据id删除
     */
    void deleteById(int id);


    /**
     * 批量删除
     */
    /*使用@Param注解改变map集合的默认key的名称*/
    void deleteByIds(@Param("ids") int[] ids);

}
