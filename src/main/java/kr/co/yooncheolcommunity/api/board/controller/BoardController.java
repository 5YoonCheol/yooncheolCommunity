package kr.co.yooncheolcommunity.api.board.controller;

import kr.co.yooncheolcommunity.api.board.dto.Board;
import kr.co.yooncheolcommunity.api.board.service.BoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/board")
public class BoardController {
    final BoardService boardService;

    @PostMapping(value ="/get-board-list")
    public List<Board> getBoardList(){
        return boardService.getBoardList();
    }
}
