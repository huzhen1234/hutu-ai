package org.hutu.com.config;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.ai.chat.client.advisor.SimpleLoggerAdvisor;
import org.springframework.ai.ollama.OllamaChatModel;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CommonConfiguration {
    @Bean
    public ChatClient chatClient(OllamaChatModel model) {
        return ChatClient
                .builder(model)
                .defaultSystem("你是一名高级开发人员，请你依照你的经验提供合理的方案")
                .defaultAdvisors(new SimpleLoggerAdvisor()) // 开启日志
                .build();
    }
}
