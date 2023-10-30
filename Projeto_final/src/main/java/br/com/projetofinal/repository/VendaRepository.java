package br.com.projetofinal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.projetofinal.entity.Venda;

@Repository
public interface VendaRepository extends JpaRepository<Venda, Integer> {

}
