package com.springbook.view.user;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class LogoutController implements Controller {

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		System.out.println("로그아웃 처리");
		
		// 브라우저와 연결된 세션 객체 강제 종료
		HttpSession session = request.getSession();
		session.invalidate();
		
		// 세션 종료 후 화면 네비게이션
		ModelAndView mav = new ModelAndView();
		mav.setViewName("redirect:login.jsp");
		
		return mav;
	}

}
