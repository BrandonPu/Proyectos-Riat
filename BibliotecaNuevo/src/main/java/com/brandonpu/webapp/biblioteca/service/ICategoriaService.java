package com.brandonpu.webapp.biblioteca.service;

import java.util.List;

import com.brandonpu.webapp.biblioteca.model.Categoria;

public interface ICategoriaService {

    public List<Categoria> listarCategorias();

    public Categoria buscarCategoriaPorId(Long id);

    public Boolean guardarCategoria(Categoria categoria);

    public void eliminarCategoria(Categoria categoria);

    public Boolean verificarCategoriaDuplicado(Categoria categoriaNueva);
}
