package com.listaDeProdutos.listaDeProdutos.repository;

import com.listaDeProdutos.listaDeProdutos.model.ProdutosModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutosRepository extends JpaRepository<ProdutosModel, Long> {
}
