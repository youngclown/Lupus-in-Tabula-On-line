package lupus.in.tabula.online.domain.chatting;


import lombok.Data;

@Data
public class Room {
    long roomId;		// 방을 만들었을 때 해당 방의 아이디값
    String roomKey;	// 방을 만들었을 때 만든 token 값
}
