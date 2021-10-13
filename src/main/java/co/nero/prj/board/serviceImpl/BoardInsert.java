package co.nero.prj.board.serviceImpl;

import co.nero.prj.board.service.BoardVO;
import co.nero.prj.comm.Command;
import co.nero.prj.comm.LoginSt;

public class BoardInsert implements Command {

	@Override
	public void execute() {
		BoardVO vo = new BoardVO();
		vo.setBWriter(LoginSt.NAME);
		System.out.println("제목을 입력하세요.");
		vo.setBTitle(scn.nextLine());
		System.out.println("내용을 입력하세요.");
		vo.setBContents(scn.nextLine());
		
		int n = daobs.boardInsert(vo);
		if(n != 0) {
			System.out.println("등록되었습니다.");
		} else {
			System.out.println("등록에 실패하였습니다.");
		}
	}

}
