package lupus.in.tabula.online.domain.play;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * 누구에게 무엇을 어떻게
 * ex)
 * 언제, 어디서, 누구에게, 무엇을, 어떻게
 * "밤에", "모닥불앞에서" , "아군이 아닌 다른 누군가의" "공격을", "방어한다." (경비병)
 * "밤에", "무덤에서", "늑대와 특별한 사람의", "정체를", " 밝힌다." (영매)
 *
 * "낮에", "모닥불앞에서", "다른 누군가의", "투표에의해", "죽지않는다." (귀족)
 * "밤에", "표지판에", "모두에게","자신이 한말을","알린다." (귀족)
 * "밤에", "모닥불앞에서", "늑대와 쥐의", "정체를", "밝힌다."
 * "언제든", "모닥불앞에서", "다른 누군가의", "공격을", "무시한다." (쥐)
 *
 * 언제 : {밤에, 낮에, 언제든}
 * 어디서 : {모닥불앞에서, 표지판에서, 무덤에서}
 * 누구에게 : {모두들, (나말고)다른누군가를, 늑대를, 쥐를, 배신자를 등등} <-- 다중 선택가능
 * 무엇을 : {공격을, 투표를, 정체}
 * 어떻게 : {방어한다, 죽는다, 죽지않는다}
 *
 */

@Data
public class Skill {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long skillNo;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long who; // 누가

    long[] whom; // 누구(나, 다른 누군가, 특정 대상)
    long when; // 언제
    long where; // 어디서
    String what; // 무엇을
    String how; // 어떻게

}
