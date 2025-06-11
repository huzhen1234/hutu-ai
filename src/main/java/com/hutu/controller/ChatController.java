package com.hutu.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.ai.chat.client.ChatClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
@RequestMapping("/chat")
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
     * @param message
     * @return
     */
    @GetMapping(value = "/aks/stream/{message}",produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    public Flux<String> chatStream(@PathVariable("message") String message) {
        return chatClient.prompt().user(message).stream().content();
    }
}
