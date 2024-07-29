package kr.co.yooncheolcommunity.api.board.dto;

import lombok.Data;

@Data
public class Board {
    private int boardNo;
    private String title;
    private String content;
    private String writer;
    private String regTmod;
    private String updTmod;
}
