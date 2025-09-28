package com.seuusuario.forumhub.dto;

import com.seuusuario.forumhub.domain.topico.StatusTopico;

public record DadosAtualizacaoTopico(
        String titulo,
        String mensagem,
        StatusTopico status
) {}
