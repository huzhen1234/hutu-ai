package org.hutu.com.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.ai.chat.client.ChatClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/chat")
@RequiredArgsConstructor
public class ChatController {
    private final ChatClient chatClient;

    @GetMapping("/aks/{message}")
    public String chat(@PathVariable("message") String message) {
        return chatClient.prompt().user(message).call().content();
    }
}
