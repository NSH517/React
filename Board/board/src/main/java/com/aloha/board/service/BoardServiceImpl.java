package com.aloha.board.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.aloha.board.domain.Boards;
import com.aloha.board.mapper.BoardMapper;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class BoardServiceImpl implements BoardService{

    private final BoardMapper boardMapper;

    @Override
    public List<Boards> list() throws Exception {
        List<Boards> list = boardMapper.list();
        return list;
    }

    @Override
    public Boards select(String id) throws Exception {
        Boards boards = boardMapper.select(id);
        return boards;
    }

    @Override
    public boolean insert(Boards boards) throws Exception {
        int result = boardMapper.insert(boards);
        return result > 0;
    }

    @Override
    public boolean update(Boards boards) throws Exception {
        int result = boardMapper.update(boards);
        return result > 0;
    }

    @Override
    public boolean delete(String id) throws Exception {
        int result = boardMapper.delete(id);
        return result > 0;
    }
    
}
