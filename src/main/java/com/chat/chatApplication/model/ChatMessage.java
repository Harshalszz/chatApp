package com.chat.chatApplication.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ChatMessage {

    Long id;
    String sender;
    String content;
}
