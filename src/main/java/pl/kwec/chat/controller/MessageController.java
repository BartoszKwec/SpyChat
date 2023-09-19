package pl.kwec.chat.controller;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import pl.kwec.chat.record.ChatMessage;

@Controller
public class MessageController {

    @MessageMapping("/send-message")
    @SendTo("/topic/livechat")
    public ChatMessage onMessage(@Payload ChatMessage chatMessage){
        //można dodać jakąś logike
        return chatMessage;
    }
}
