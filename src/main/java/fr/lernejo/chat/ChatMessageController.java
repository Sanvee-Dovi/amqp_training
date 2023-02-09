package fr.lernejo.chat;

import org.json.JSONObject;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

import static fr.lernejo.chat.ChatMessageRepository.getLastTenMessages;
import static fr.lernejo.chat.ChatMessageRepository.list;

@RestController
public class ChatMessageController {


    @GetMapping("api/message")
    public List GetMethode(){
        return getLastTenMessages();

    }

}
