package com.example.mybaticsspringbootstarters.mapper;

import com.example.mybaticsspringbootstarters.model.Hello;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface HelloMapper {
    Hello selectHello(Hello hello);
    List<Hello> selectAllHello();
    int insertHello(Hello hello);
    int updateHello(Hello hello);
    int deleteHello(Hello hello);
}
