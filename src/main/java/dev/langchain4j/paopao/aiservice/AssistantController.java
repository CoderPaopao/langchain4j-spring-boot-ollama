package dev.langchain4j.paopao.aiservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AssistantController {

    Assistant assistant;

    public AssistantController(Assistant assistant) {
        this.assistant = assistant;
    }

    @GetMapping("/model")
    public String assistant(@RequestParam(value = "message", defaultValue = "现在几点了") String message) {
        return assistant.chat(message);
    }

}
