package com.aloha.board.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.aloha.board.domain.Boards;
import com.aloha.board.service.BoardService;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;

@Slf4j
@Controller
@RequestMapping("/board")
@RequiredArgsConstructor
public class BoardController {

    private final BoardService boardService;

    @GetMapping("/list")
    public List<Boards> list() throws Exception {
        return boardService.list();
    }
    
    @GetMapping("/{id}")
    public Boards select(@PathVariable String id) throws Exception {
        return boardService.select(id);
    }

    @PostMapping
    public Boards insert(@RequestBody Boards boards) throws Exception {
        boardService.insert(boards);
        return boards;
    }

    @PutMapping("/{id}")
    public Boards update(@PathVariable String id, 
                         @RequestBody Boards boards) throws Exception {
        boards.setId(id);
        boardService.update(boards);
        return boards;
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable String id) throws Exception {
        boardService.delete(id);
    }
    
    
    
}
