package dev.langchain4j.paopao.aiservice;

import dev.langchain4j.agent.tool.Tool;
import org.springframework.stereotype.Component;

import java.time.LocalTime;

@Component
class AssistantTools {

    @Tool
    String currentTime() {
        return LocalTime.now().toString();
    }
}
