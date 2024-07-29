package kr.co.yooncheolcommunity.api.board.dao;

import kr.co.yooncheolcommunity.api.board.dto.Board;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BoardDao {

    List<Board> getBoardList();
}
