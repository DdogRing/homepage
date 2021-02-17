package com.ddogring.homepage.mapper;

import com.ddogring.homepage.model.SpecialColumn;
import org.springframework.stereotype.Repository;

@Repository
public interface SpecialColumnMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SpecialColumn record);

    int insertSelective(SpecialColumn record);

    SpecialColumn selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SpecialColumn record);

    int updateByPrimaryKey(SpecialColumn record);
}