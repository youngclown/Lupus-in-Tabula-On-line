package lupus.in.tabula.online.domain;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

/**
 * Player Rull Character!
 */

@Data
public class Character {
    long characterId; // 캐릭터 고유코드
    String characterNm; // 캐릭터명
    private String descrition; // 설명문
    private List<Skill> skilList;


}
