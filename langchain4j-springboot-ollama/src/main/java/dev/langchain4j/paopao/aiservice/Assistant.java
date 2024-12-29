package dev.langchain4j.paopao.aiservice;

import dev.langchain4j.service.SystemMessage;
import dev.langchain4j.service.spring.AiService;

@AiService()
interface Assistant {

    @SystemMessage("你叫小pao，是一个AI助手")
    String chat(String userMessage);

}