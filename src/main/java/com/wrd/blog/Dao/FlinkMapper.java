package com.wrd.blog.Dao;


import com.wrd.blog.Entity.Flink;
import com.wrd.blog.Entity.FlinkExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface FlinkMapper {
    long countByExample(FlinkExample example);

    int deleteByExample(FlinkExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Flink record);

    int insertSelective(Flink record);

    List<Flink> selectByExample(FlinkExample example);

    Flink selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Flink record, @Param("example") FlinkExample example);

    int updateByExample(@Param("record") Flink record, @Param("example") FlinkExample example);

    int updateByPrimaryKeySelective(Flink record);

    int updateByPrimaryKey(Flink record);
}