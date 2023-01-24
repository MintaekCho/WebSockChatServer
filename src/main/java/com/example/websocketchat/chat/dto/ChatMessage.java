package com.example.websocketchat.chat.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ChatMessage {

    //메잇시 타입 구별 : 입장, 채팅
    public enum MessageType{
        ENTER, TALK
    }
    private MessageType type; //메시지 타입
    private String roomId; // 방번호
    private String sender; //메시지 보낸사람
    private String message; // 메시지
}
