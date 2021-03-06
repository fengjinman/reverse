package com.jinman.dao;

import com.jinman.entity.Score;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface ScoreMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_score
     *
     * @mbg.generated Fri Jun 15 17:04:50 CST 2018
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_score
     *
     * @mbg.generated Fri Jun 15 17:04:50 CST 2018
     */
    int insert(Score record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_score
     *
     * @mbg.generated Fri Jun 15 17:04:50 CST 2018
     */
    Score selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_score
     *
     * @mbg.generated Fri Jun 15 17:04:50 CST 2018
     */
    List<Score> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_score
     *
     * @mbg.generated Fri Jun 15 17:04:50 CST 2018
     */
    int updateByPrimaryKey(Score record);
}