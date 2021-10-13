package co.nero.prj.board.serviceImpl;

import co.nero.prj.board.service.BoardService;
import co.nero.prj.board.service.BoardVO;
import co.nero.prj.comm.Command;

public class BoardWriterUpdate implements Command {

	@Override
	public void execute() {
		BoardService boardService = new BoardServiceImpl();
		BoardVO vo = new BoardVO();
		vo = boardService.boardSelect(vo);
		
		daobs.boardWriterUpdate(vo);
	}

}
