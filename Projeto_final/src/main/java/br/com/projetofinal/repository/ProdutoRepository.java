package br.com.projetofinal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.projetofinal.entity.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Integer>{

}
