package lupus.in.tabula.online.domain.chatting;

import lombok.Data;

/**
 * 현재 Room 에 설정된 When 정보를 가지고 있는 객체
 * - 밤
 * - 낮
 * - 언제든 등등의 의미를 가지고 있음.
 */
@Data
public class When {
    long whenNo;    // when 의 고유값
    String whenNm;  // 밤, 낮, 언제든 등의 위치값
    long time;      // 해당 when 이 가지고 있는 시간 (해당 시간이 지나면, 다음 when 으로 이동한다.) 밤 -> 낮 -> 밤 -> 낮

}
