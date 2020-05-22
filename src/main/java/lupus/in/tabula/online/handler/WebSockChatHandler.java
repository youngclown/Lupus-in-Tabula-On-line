package lupus.in.tabula.online.handler;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import lupus.in.tabula.online.domain.chatting.ChatMessage;
import lupus.in.tabula.online.domain.chatting.ChatRoom;
import lupus.in.tabula.online.service.ChatService;
import org.springframework.stereotype.Component;
import org.springframework.web.socket.*;
import org.springframework.web.socket.handler.TextWebSocketHandler;

@Slf4j
@Component
public class WebSockChatHandler extends TextWebSocketHandler {
    private final ObjectMapper objectMapper;
    private final ChatService chatService;

    public WebSockChatHandler(ObjectMapper objectMapper, ChatService chatService) {
        this.objectMapper = objectMapper;
        this.chatService = chatService;
    }

    /**
     * socket통신은 서버와 클라이언트가 1:N으로 관계를 맺습니다.
     * 따라서 한 서버에 여러 클라이언트가 접속할 수 있으며,
     * 서버에는 여러 클라이언트가 발송한 메시지를 받아 처리해줄 Handler의 작성이 필요합니다.
     * 다음과 같이 TextWebSocketHandler를 상속받아 Handler를 작성해 줍니다.
     * Client로부터 받은 메시지를 Console Log에 출력하고 Client로 환영 메시지를 보내는 역할을 합니다.
     * @param session
     * @param message
     * @throws Exception
     */
    @Override
    protected void handleTextMessage(WebSocketSession session, TextMessage message) throws Exception {
        String payload = message.getPayload();
        log.info("payload {}", payload);
// 삭제        TextMessage textMessage = new TextMessage("Welcome chatting sever~^^ ");
// 삭제       session.sendMessage(textMessage);
        ChatMessage chatMessage = objectMapper.readValue(payload, ChatMessage.class);
        ChatRoom room = chatService.findRoomById(chatMessage.getRoomId());
        room.handleActions(session, chatMessage, chatService);
    }
}
