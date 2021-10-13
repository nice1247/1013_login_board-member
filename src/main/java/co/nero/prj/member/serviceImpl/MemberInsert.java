package co.nero.prj.member.serviceImpl;

import co.nero.prj.comm.Command;
import co.nero.prj.comm.LoginSt;
import co.nero.prj.member.service.MemberVO;

public class MemberInsert implements Command {

	@Override
	public void execute() {
		MemberVO vo = new MemberVO();
		if (LoginSt.AUTHOR.equals("ADMIN")) {
			System.out.println("Id를 입력해주세요.");
			vo.setId(scn.nextLine());
			System.out.println("이름을 입력해주세요.");
			vo.setName(scn.nextLine());
			System.out.println("패스워드를 입력해주세요.");
			vo.setPassword(scn.nextLine());
			System.out.println("연락처를 입력해주세요.");
			vo.setTel(scn.nextLine());
			System.out.println("주소를 입력해주세요.");
			vo.setAddress(scn.nextLine());

			int n = daoms.memberInsert(vo);
			if (n != 0) {
				System.out.println("등록되었습니다.\n");
			} else {
				System.out.println("등록에 실패하였습니다.\n");
			}
		} else {
			System.out.println("권한이 없습니다. \n");
		}
	}

}
