package co.nero.prj.member.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import co.nero.prj.comm.Command;
import co.nero.prj.member.service.MemberService;
import co.nero.prj.member.service.MemberVO;

public class MemberList implements Command {

	@Override
	public void execute() {
		MemberService memberService = new MemberServiceImpl();
		List<MemberVO> members = new ArrayList<MemberVO>();
		members = memberService.memberSelectList();

		System.out.println("=======회원목록======");
		for (MemberVO vo : members) {
			System.out.print(vo.getId() + " : ");
			System.out.print(vo.getName() + " : ");
			System.out.print(vo.getTel() + " : ");
			System.out.println(vo.getAddress());
			System.out.println(vo.getAuthor());

		}
		System.out.println("======회원목록 끝======");
	}

}
