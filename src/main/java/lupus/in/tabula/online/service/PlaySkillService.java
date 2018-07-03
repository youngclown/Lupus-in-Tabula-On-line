package lupus.in.tabula.online.service;


import lupus.in.tabula.online.domain.Skill;
import lupus.in.tabula.online.exception.NonSkillException;


public class PlaySkillService {

    long when;
    long skillNo;
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
            skill.getWhom();
        } else {
            throw new NonSkillException();
        }
    }




}
