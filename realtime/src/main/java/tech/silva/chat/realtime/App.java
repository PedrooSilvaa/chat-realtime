package tech.silva.chat.realtime;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import tech.silva.chat.realtime.config.Msg;

@Controller
public class App {

    @MessageMapping("/chatMessage")
    @SendTo("/canal")
    public Msg sendMessage(Msg message){
        return message;
    }

}
