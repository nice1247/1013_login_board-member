package co.nero.prj.board.serviceImpl;

import co.nero.prj.board.service.BoardService;
import co.nero.prj.board.service.BoardVO;
import co.nero.prj.comm.Command;
import co.nero.prj.comm.LoginSt;

public class BoardUpdate implements Command {

	@Override
	public void execute() {
		BoardService boardService = new BoardServiceImpl();
		// boardService라는 치구는 인터페이스..
		BoardVO vo = new BoardVO();
		System.out.println("변경할 글의 번호를 입력하세요.");
		vo.setBId(scn.nextInt());
		scn.nextLine();
		vo = boardService.boardSelect(vo);

		if (vo != null && vo.getBWriter().equals(LoginSt.NAME)) {
			System.out.println("변경할 내용을 입력하세요.");
			vo.setBContents(scn.nextLine());
			int n = daobs.boardUpdate(vo);
			
			if (n != 0) {
				System.out.println("정상적으로 변경되었습니다.\n");
			} else {
				System.out.println("글 수정이 실패하였습니다.\n");
			}
		} else {
			System.out.println("나의 글이 아닙니다.\n공지사항 목록으로 돌아갑니다.\n");
		}
	}

}
