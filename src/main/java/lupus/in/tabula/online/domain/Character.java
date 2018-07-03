package lupus.in.tabula.online.domain;

import javax.persistence.*;

@Entity
public class Character {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    String characterId; // 캐릭터 고유코드

    String characterNm; // 캐릭터명

    @Column(length = 200, nullable = false)
    private String descrition; // 설명문

    @Column(length = 50, nullable = false)
    private String skinMenu;


    public String getCharacterId() {
        return characterId;
    }

    public void setCharacterId(String characterId) {
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

    public String getSkinMenu() {
        return skinMenu;
    }

    public void setSkinMenu(String skinMenu) {
        this.skinMenu = skinMenu;
    }
}
