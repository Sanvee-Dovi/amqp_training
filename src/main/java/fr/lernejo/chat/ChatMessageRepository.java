package fr.lernejo.chat;

import java.util.ArrayList;
import java.util.List;

public class ChatMessageRepository {

    static ArrayList<String> list = new ArrayList<>();

    static void   addChatMessage(String message){
        list.add(message);
    }

    static List<String> getLastTenMessages(){
        int lastIdx;
        String lastElement;
        ArrayList<String> Element = new ArrayList<>();
        for(int i =1; i<=10;i++){
            lastIdx = list.size() - i;
            lastElement = list.get(lastIdx);
            Element.add(lastElement);
        }

        return Element;
    }
}
