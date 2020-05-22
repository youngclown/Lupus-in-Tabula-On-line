package lupus.in.tabula.online.controller;


import lombok.RequiredArgsConstructor;
import lupus.in.tabula.online.domain.chatting.ChatRoom;
import lupus.in.tabula.online.service.ChatService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/chat")
public class ChatController {

    private final ChatService chatService;

    @PostMapping
    public ChatRoom createRoom(@RequestParam String name) {
        return chatService.createRoom(name);
    }

    @GetMapping
    public List<ChatRoom> findAllRoom() {
        return chatService.findAllRoom();
    }
}