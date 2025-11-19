package br.com.fiap.chatia.controller;

import br.com.fiap.chatia.model.QuestionarioService;
import br.com.fiap.chatia.service.QuestionarioRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/questionario")
public class QuestionarController {
    @Autowired
    private QuestionarioService service;

    @PostMapping("/analisar")
    public String analisar(@Valid @RequestBody QuestionarioRequest req) {
        return service.analisar(req);
    }
}
