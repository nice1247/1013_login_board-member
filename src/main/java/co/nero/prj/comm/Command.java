package co.nero.prj.comm;

import java.util.Scanner;

import co.nero.prj.board.service.BoardService;
import co.nero.prj.board.serviceImpl.BoardServiceImpl;
import co.nero.prj.member.service.MemberService;
import co.nero.prj.member.serviceImpl.MemberServiceImpl;

public interface Command {
	public BoardService daobs = new BoardServiceImpl();
	public MemberService daoms = new MemberServiceImpl();
	public void execute();
	public Scanner scn = new Scanner(System.in);
}
