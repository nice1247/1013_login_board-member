package co.nero.prj.member.serviceImpl;

import co.nero.prj.board.service.BoardService;
import co.nero.prj.board.service.BoardVO;
import co.nero.prj.board.serviceImpl.BoardSelect;
import co.nero.prj.board.serviceImpl.BoardServiceImpl;
import co.nero.prj.comm.Command;
import co.nero.prj.comm.LoginSt;
import co.nero.prj.member.service.MemberService;
import co.nero.prj.member.service.MemberVO;

public class MemberUpdate implements Command {

	@Override
	public void execute() {
		MemberService memberService = new MemberServiceImpl();
		MemberVO vo = new MemberVO();
//		System.out.println("변경할 멤버의 Id를 입력하세요.");
//		vo.setId(scn.nextLine());
		vo.setId(LoginSt.ID);
		vo = memberService.memberSelect(vo);

//		if (vo.getName().equals(LoginSt.NAME)) {

		System.out.println("변경할 이름을 입력해주세요.");
		vo.setName(scn.nextLine());
		
		System.out.println("변경할 패스워드를 입력해주세요.");
		vo.setPassword(scn.nextLine());
		System.out.println("변경할 연락처를 입력해주세요.");
		vo.setTel(scn.nextLine());
		System.out.println("변경할 주소을 입력해주세요.");
		vo.setAddress(scn.nextLine());
//			System.out.println("변경할 권한을 입력해주세요.");
		vo.setAuthor(vo.getAuthor());

		daoms.memberUpdate(vo);
//			if (n != 0) {
//				System.out.println("정상적으로 변경되었습니다.");
//			} else {
//				System.out.println("글 수정이 실패하였습니다.");
//			}
//		} else {
//			System.out.println("수정할 수 없는 Id입니다.");
//		}
//		BoardService boardService = new BoardServiceImpl();
//		BoardVO bvo = new BoardVO();
//		bvo = boardService.boardSelect(bvo);
//		System.out.println(bvo.toString());
//		
//		if(vo.getName().equals(bvo.getBWriter())) {
//			bvo.setBWriter(vo.getName());
//			daobs.boardWriterUpdate(bvo);
//		} else {}
		System.out.println("정상적으로 수정되었습니다.\n다시 로그인 해주세요.");

	}

}
