package lupus.in.tabula.online.domain.play;

import lombok.Data;

import java.util.List;

/**
 * Player Rull Character!
 * 플레이할 캐릭터의 정보를 가지고 있음.
 */
@Data
public class Character {
    long characterId; // 캐릭터 고유코드(자동증가값)
    String characterNm; // 캐릭터명
    private String descrition; // 설명문
    private List<Skill> skilList;


}
