package lupus.in.tabula.online.domain.chatting;

/**
 * 현재 Room 에 설정된 When 정보를 가지고 있는 객체
 * - 밤
 * - 낮
 * - 언제든 등등의 의미를 가지고 있음.
 */
public class When {
    long whenNo;    // when 의 고유값
    String whenNm;  // 밤, 낮, 언제든 등의 위치값
    long time;      // 해당 when 이 가지고 있는 시간 (해당 시간이 지나면, 다음 when 으로 이동한다.) 밤 -> 낮 -> 밤 -> 낮

    public long getWhenNo() {
        return whenNo;
    }

    public void setWhenNo(long whenNo) {
        this.whenNo = whenNo;
    }

    public String getWhenNm() {
        return whenNm;
    }

    public void setWhenNm(String whenNm) {
        this.whenNm = whenNm;
    }

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }
}
