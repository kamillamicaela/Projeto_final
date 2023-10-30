package br.com.projetofinal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.projetofinal.entity.ItemDaVenda;

@Repository
public interface ItemDaVendaRepository extends JpaRepository<ItemDaVenda, Integer>{

}
