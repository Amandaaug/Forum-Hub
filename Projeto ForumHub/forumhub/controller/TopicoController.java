package com.seuusuario.forumhub.controller;

import com.seuusuario.forumhub.domain.topico.Topico;
import com.seuusuario.forumhub.dto.DadosCadastroTopico;
import com.seuusuario.forumhub.dto.DadosAtualizacaoTopico;
import com.seuusuario.forumhub.repository.TopicoRepository;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/topicos")
public class TopicoController {

    private final TopicoRepository repository;

    public TopicoController(TopicoRepository repository) {
        this.repository = repository;
    }

    @PostMapping
    public ResponseEntity<Topico> criar(@RequestBody @Valid DadosCadastroTopico dados) {
        Topico topico = Topico.builder()
                .titulo(dados.titulo())
                .mensagem(dados.mensagem())
                .status(dados.status())
                .build();

        return ResponseEntity.ok(repository.save(topico));
    }

    @GetMapping
    public ResponseEntity<List<Topico>> listar() {
        return ResponseEntity.ok(repository.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Topico> detalhar(@PathVariable Long id) {
        return repository.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PutMapping("/{id}")
    public ResponseEntity<Topico> atualizar(@PathVariable Long id,
                                            @RequestBody @Valid DadosAtualizacaoTopico dados) {
        return repository.findById(id)
                .map(topico -> {
                    if (dados.titulo() != null) topico.setTitulo(dados.titulo());
                    if (dados.mensagem() != null) topico.setMensagem(dados.mensagem());
                    if (dados.status() != null) topico.setStatus(dados.status());
                    return ResponseEntity.ok(repository.save(topico));
                })
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id) {
        return repository.findById(id)
                .map(topico -> {
                    repository.delete(topico);
                    return ResponseEntity.noContent().<Void>build();
                })
                .orElse(ResponseEntity.notFound().build());
    }
}
