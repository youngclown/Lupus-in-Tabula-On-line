package lupus.in.tabula.online.controller;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lupus.in.tabula.online.domain.Member;
import lupus.in.tabula.online.domain.MemberRole;
import lupus.in.tabula.online.repository.MemberRepository;

@Controller
@RequestMapping("/member")
public class MemberController {
	@Autowired
	MemberRepository memberRepository;

	@PostMapping("")
	public String create(Member member) {
		MemberRole role = new MemberRole();
		
		// 스프링 시큐리티에서 지원해주는 BCryptPasswordEncoder를 이용해 회원 비밀번호를 암호화하고, MemberRole을 정의해 Member에 넣어주고 save를 처리
		BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
		member.setUpw(passwordEncoder.encode(member.getUpw()));
		role.setRoleName("BASIC");
		member.setRoles(Arrays.asList(role));
		memberRepository.save(member);
		return "redirect:/";
	}
}
