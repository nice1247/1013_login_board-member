package co.nero.prj.board.serviceImpl;

import co.nero.prj.board.service.BoardVO;
import co.nero.prj.comm.Command;
import co.nero.prj.comm.LoginSt;

public class BoardDelete implements Command {

	@Override
	public void execute() {
		BoardVO vo = new BoardVO();
		if (LoginSt.AUTHOR.equals("ADMIN")) {
			System.out.println("================");
			System.out.println("삭제할 게시글의 번호를 입력하세요.");
			vo.setBId(scn.nextInt());
			int n = daobs.boardDelete(vo);
			if (n != 0) {
				System.out.println("정상적으로 삭제되었습니다.\n");
			} else {
				System.out.println("게시글이 삭제되지 않았습니다.\n");
			}
		} else {
			System.out.println("권한이 없습니다.");
			System.out.println("공지사항 목록으로 돌아갑니다.\n");
		}
	}

}
