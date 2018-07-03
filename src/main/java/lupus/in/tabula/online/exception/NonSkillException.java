package lupus.in.tabula.online.exception;

/**
 * Skill 이 오류났을 때 발생하는 에러 처리
 */
public class NonSkillException extends BaseException{

    public NonSkillException() {
    }

    public NonSkillException(String message) {
        super(message);
    }
}
