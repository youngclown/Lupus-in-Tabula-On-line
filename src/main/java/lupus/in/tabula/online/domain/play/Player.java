package lupus.in.tabula.online.domain.play;

/**
 * 참가한 유저 정보
 */
public class Player {
    long number;
    String userid;

    public long getNumber() {
        return number;
    }

    public void setNumber(long number) {
        this.number = number;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }
}
