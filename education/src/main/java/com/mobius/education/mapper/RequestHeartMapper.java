package com.mobius.education.mapper;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface RequestHeartMapper {
    public int selectHeartCount(Long requestNumber);

}
