package lupus.in.tabula.online.domain;

import javax.persistence.*;
import java.util.List;

/**
 * Player Rull Character!
 */
public class Character {
    long characterId; // 캐릭터 고유코드
    String characterNm; // 캐릭터명
    private String descrition; // 설명문
    private List<Skill> skilList;

    public List<Skill> getSkilList() {
        return skilList;
    }

    public void setSkilList(List<Skill> skilList) {
        this.skilList = skilList;
    }

    public long getCharacterId() {
        return characterId;
    }

    public void setCharacterId(long characterId) {
        this.characterId = characterId;
    }

    public String getCharacterNm() {
        return characterNm;
    }

    public void setCharacterNm(String characterNm) {
        this.characterNm = characterNm;
    }

    public String getDescrition() {
        return descrition;
    }

    public void setDescrition(String descrition) {
        this.descrition = descrition;
    }


}
