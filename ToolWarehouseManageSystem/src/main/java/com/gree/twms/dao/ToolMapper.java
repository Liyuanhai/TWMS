package com.gree.twms.dao;

import com.gree.twms.pojo.Tool;
import com.gree.twms.pojo.ToolExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ToolMapper {
    int countByExample(ToolExample example);

    int deleteByExample(ToolExample example);

    int deleteByPrimaryKey(String tid);

    int insert(Tool record);

    int insertSelective(Tool record);

    List<Tool> selectByExample(ToolExample example);

    Tool selectByPrimaryKey(String tid);

    int updateByExampleSelective(@Param("record") Tool record, @Param("example") ToolExample
            example);

    int updateByExample(@Param("record") Tool record, @Param("example") ToolExample example);

    int updateByPrimaryKeySelective(Tool record);

    int updateByPrimaryKey(Tool record);
}