package lupus.in.tabula.online.repository;

import org.springframework.data.repository.CrudRepository;

import lupus.in.tabula.online.domain.Member;


public interface MemberRepository extends CrudRepository<Member, Long> {
	
}
