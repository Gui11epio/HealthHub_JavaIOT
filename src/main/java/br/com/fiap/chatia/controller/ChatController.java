package br.com.fiap.chatia.controller;

import br.com.fiap.chatia.model.ChatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/chat")
public class ChatController {
    @Autowired
    private ChatService service;

    @GetMapping("/mensagem")
    public String conversar(@RequestParam String msg) {
        return service.conversar(msg);
    }
}
