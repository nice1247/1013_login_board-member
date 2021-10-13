package co.nero.prj.board.service;

import java.util.List;

public interface BoardService {
	List<BoardVO> boardSelectList();
	BoardVO boardSelect(BoardVO vo);
	int boardInsert(BoardVO vo);
	int boardUpdate(BoardVO vo);
	int boardDelete(BoardVO vo);
	int boardWriterUpdate(BoardVO vo);
	// 우리가 사용하는 용.
}
