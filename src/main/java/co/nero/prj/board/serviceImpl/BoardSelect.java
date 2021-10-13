package co.nero.prj.board.serviceImpl;

import co.nero.prj.board.service.BoardVO;
import co.nero.prj.comm.Command;

public class BoardSelect implements Command {
	
	@Override
	public void execute() {
		BoardVO board = new BoardVO();
		System.out.println("=======================");
		System.out.println("조회할 게시글의 번호를 입력하세요.");
		board.setBId(scn.nextInt());
		board = daobs.boardSelect(board);
		
		System.out.print("번호 : " + board.getBId());
		System.out.print(", 작성자 : " + board.getBWriter());
		System.out.print(", 작성일자 : " + board.getBWriteDate());
		System.out.print(", 제목 : " + board.getBTitle());
		System.out.print(", 내용 : " + board.getBContents());
		System.out.println(", 조회수 : " + board.getBHit());
	}

}
