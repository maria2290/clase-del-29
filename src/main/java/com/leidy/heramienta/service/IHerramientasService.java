package com.leidy.heramienta.service;

import com.leidy.heramienta.Dto.HerramientaDto;

import java.util.ArrayList;

public interface IHerramientasService {
    ArrayList<HerramientaDto> listar();
    ArrayList<HerramientaDto> listarPorNombre(String nombre);
    void crear(HerramientaDto herramientaDto);
    void eliminar(Long id);
    void eliminar(HerramientaDto herramientaDto);
    void actualizar(Long id, HerramientaDto herramientaDto);
    void actualizar(HerramientaDto herramientaDto);
    HerramientaDto getPorId(Long id);
}
