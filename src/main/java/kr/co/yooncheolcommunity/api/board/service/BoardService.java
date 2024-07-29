package kr.co.yooncheolcommunity.api.board.service;

import kr.co.yooncheolcommunity.api.board.dao.BoardDao;
import kr.co.yooncheolcommunity.api.board.dto.Board;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BoardService {
    private final BoardDao boardDao;

    public List<Board> getBoardList() {
        return boardDao.getBoardList();
    }
}
