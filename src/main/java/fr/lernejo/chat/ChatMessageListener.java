package fr.lernejo.chat;

import org.springframework.stereotype.Component;

import static fr.lernejo.chat.ChatMessageRepository.addChatMessage;

@Component
public class ChatMessageListener {


    public void onMessage(String onMessage){
       addChatMessage(onMessage);
    }
}
