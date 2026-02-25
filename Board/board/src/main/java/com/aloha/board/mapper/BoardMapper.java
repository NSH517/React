package com.aloha.board.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.aloha.board.domain.Boards;

@Mapper
public interface BoardMapper {

    List<Boards> list() throws Exception;

    Boards select(String id) throws Exception;

    int insert(Boards boards) throws Exception;

    int update(Boards boards) throws Exception;

    int delete(String id) throws Exception;
    
}
