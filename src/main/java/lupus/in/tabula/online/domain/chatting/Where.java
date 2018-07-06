package lupus.in.tabula.online.domain.chatting;

import lupus.in.tabula.online.domain.play.Player;

import java.util.List;

/**
 * 방을 의미함.
 * 만약 마피아라면, 무덤가, 모닥불을 의미하게 됨.
 * 먹이사슬이라면, 하늘, 숲 등등을 의미하게 됨.
 */
public class Where {
    long whereNo;    // when 의 고유값
    String whereNm;  // 밤, 낮, 언제든 등의 위치값
    List<Player> playerList;    // 해당 위치에 있는 사용자

    public List<Player> getPlayerList() {
        return playerList;
    }

    public void setPlayerList(List<Player> playerList) {
        this.playerList = playerList;
    }
}
