package lupus.in.tabula.online.domain.chatting;

import lombok.Data;

import java.util.List;

// GameRull
@Data
public class Rule {
    List<When> whenList; // 시간을 제어함. 마지막 배열이 끝나면 다시금 0으로 돌아간다.
    List<Character> characterList;
    List<Where> whereList; // 위치에 대한 목록
}
