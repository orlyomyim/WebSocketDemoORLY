package com.websocket.demo.chat;


import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Builder
@Setter
public class ChatMessage {
    private String content;
    private String timestamp;
    private String sender;
    private MessageType type;
    private int count;
    public  static  int UpdateUser ;

    public void setCount(int n) {
        count = n;
    }
    public  static  int AddUser(){
        UpdateUser++ ;
        return  UpdateUser;
    }
    public static  int DelUser(){
        UpdateUser-- ;
        return  UpdateUser ;
    }
}