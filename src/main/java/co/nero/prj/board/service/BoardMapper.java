package co.nero.prj.board.service;

import java.util.List;

public interface BoardMapper {
	List<BoardVO> boardSelectList();
	BoardVO boardSelect(BoardVO vo);
	int boardInsert(BoardVO vo);
	int boardUpdate(BoardVO vo);
	int boardDelete(BoardVO vo);
	int boardHitUpdate(int id);
	int boardWriterUpdate(BoardVO vo);

	//이 친구는  mybatis db 요ㅕㅇ
}
