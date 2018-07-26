package lupus.in.tabula.online.service;


import lupus.in.tabula.online.domain.play.Skill;
import lupus.in.tabula.online.exception.NonSkillException;


public class PlaySkillService {

    long when;		// 언제 해당 스킬이 동작할 것인가?
    long skillNo;	// 해당 스킬의 번호가 무엇인가? 해당 Num  을 가지고 skill 객체를 찾음.
    
    Skill skill = new Skill();

    /**
     * 설정된 skill 에 대한 값을 가지고 기능 동작을 처리한다.
     * @param when
     * @param skillNo
     */
    public PlaySkillService(long when, long skillNo) {
        this.when = when;
        this.skillNo = skillNo;
    }

    public void skillCheck() throws NonSkillException {
        if (this.when == skill.getWhen()) {

        } else {
            throw new NonSkillException();
        }
    }




}
