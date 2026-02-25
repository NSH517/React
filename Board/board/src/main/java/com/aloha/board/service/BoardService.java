package com.aloha.board.service;

import java.util.List;

import com.aloha.board.domain.Boards;

public interface BoardService {
    
    List<Boards> list() throws Exception;

    Boards select(String id) throws Exception;

    boolean insert(Boards boards) throws Exception;

    boolean update(Boards boards) throws Exception;

    boolean delete(String id) throws Exception;
    
}
