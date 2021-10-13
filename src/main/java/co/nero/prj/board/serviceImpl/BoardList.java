package co.nero.prj.board.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import co.nero.prj.board.service.BoardService;
import co.nero.prj.board.service.BoardVO;
import co.nero.prj.comm.Command;

public class BoardList implements Command {

	@Override
	public void execute() {
		BoardService boardService = new BoardServiceImpl();
		List<BoardVO> boards = new ArrayList<BoardVO>();
		boards = boardService.boardSelectList();
		
		System.out.println("### 공지사항 목록 ###");
		for(BoardVO vo : boards) {
			System.out.print(vo.getBId() +" : ");
			System.out.print(vo.getBWriter() +" : ");
			System.out.print(vo.getBTitle() +" : ");
			System.out.print(vo.getBWriteDate() +" : ");
			System.out.println(vo.getBHit());
			
		}
		System.out.println("### 공지사항 목록 끝 ###");
	}

}
