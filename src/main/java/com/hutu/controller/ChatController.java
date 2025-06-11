package com.hutu.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.ai.chat.client.ChatClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;

@RestController
@RequestMapping("/ai")
@RequiredArgsConstructor
public class ChatController {
    private final ChatClient chatClient;

    /**
     * 阻塞式
     * @param message
     * @return
     */
    @GetMapping("/aks/{message}")
    public String chat(@PathVariable("message") String message) {
        return chatClient.prompt().user(message).call().content();
    }

    /**
     * 非阻塞式
     * @param prompt
     * @return
     */
    @PostMapping(value = "/chat", produces = "text/html;charset=utf-8")
    public Flux<String> chatStream(String prompt) {
        return chatClient.prompt().user(prompt).stream().content();
    }
}
