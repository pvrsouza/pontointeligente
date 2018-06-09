package br.com.pablovinicius.pontointeligente.services;

import java.util.Optional;

import br.com.pablovinicius.pontointeligente.entities.Lancamento;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;


public interface LancamentoService {

    /**
     * Retorna uma lista paginada de lançamentos de um determinado funcionário.
     *
     * @param funcionarioId
     * @param pageRequest
     * @return Page<Lancamento>
     */
    Page<Lancamento> buscarPorFuncionarioId(Long funcionarioId, PageRequest pageRequest);

    /**
     * Persiste um lançamento na base de dados.
     *
     * @param lancamento
     * @return Lancamento
     */
    Lancamento persistir(Lancamento lancamento);

    /**
     * Remove um lançamento da base de dados.
     *
     * @param lancamento
     */
    void remover(Lancamento lancamento);

}
