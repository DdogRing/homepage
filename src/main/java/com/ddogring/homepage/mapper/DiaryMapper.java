package com.ddogring.homepage.mapper;

import com.ddogring.homepage.model.Diary;
import org.springframework.stereotype.Repository;

@Repository
public interface DiaryMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Diary record);

    int insertSelective(Diary record);

    Diary selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Diary record);

    int updateByPrimaryKeyWithBLOBs(Diary record);

    int updateByPrimaryKey(Diary record);
}