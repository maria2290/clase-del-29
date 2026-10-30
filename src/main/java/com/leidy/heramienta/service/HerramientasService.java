package com.leidy.heramienta.service;

import com.leidy.heramienta.Dto.HerramientaDto;
import com.leidy.heramienta.dao.HerramientasDao;

import java.util.ArrayList;

public class HerramientasService implements  IHerramientasService{

    private HerramientasDao dao;

    public HerramientasService() {
        this.dao = new HerramientasDao();
    }

    @Override
    public ArrayList<HerramientaDto> listar() {
        return this.dao.leerTodos();
    }

    @Override
    public ArrayList<HerramientaDto> listarPorNombre(String nombre) {
        ArrayList<HerramientaDto> herramientas = this.dao.leerTodos();
        ArrayList<HerramientaDto> encontrados = new ArrayList<>();
        for (HerramientaDto herr : herramientas) {
            // name = martillo
            // name = alicate
            // name = rodillo
            // 'llo'
            if (herr.getName().contains(nombre)) {
                encontrados.add(herr);
            }
        }
        return encontrados;
    }

    @Override
    public void crear(HerramientaDto herramientaDto) {
        ArrayList<HerramientaDto> herramientas = this.dao.leerTodos();
        herramientas.add(herramientaDto);
        this.dao.guardarTodos(herramientas);
    }

    @Override
    public void eliminar(Long id) {
        ArrayList<HerramientaDto> herramientas = this.dao.leerTodos();
        for (HerramientaDto herr: herramientas) {
            if (herr.getId().equals(id)) {
                herramientas.remove(herr);
            }
        }
        this.dao.guardarTodos(herramientas);
    }

    @Override
    public void eliminar(HerramientaDto herramientaDto) {
        ArrayList<HerramientaDto> herramientas = this.dao.leerTodos();
        herramientas.remove(herramientaDto);
        this.dao.guardarTodos(herramientas);
    }

    @Override
    public void actualizar(Long id, HerramientaDto herramientaDto) {
        ArrayList<HerramientaDto> herramientas = this.dao.leerTodos();
        for (HerramientaDto herr: herramientas) {
            if (herr.getId().equals(id)) {
                herr.setName(herramientaDto.getName());
            }
        }
        this.dao.guardarTodos(herramientas);
    }

    @Override
    public void actualizar(HerramientaDto herramientaDto) {
        ArrayList<HerramientaDto> herramientas = this.dao.leerTodos();
        for (HerramientaDto herr: herramientas) {
            if (herr.getId().equals(herramientaDto.getId())) {
                herr.setName(herramientaDto.getName());
            }
        }
        this.dao.guardarTodos(herramientas);
    }
    @Override
    public HerramientaDto getPorId(Long id) {
        ArrayList<HerramientaDto> herramientas = this.dao.leerTodos();
        HerramientaDto encontrado = null;
        for (HerramientaDto herr: herramientas) {
            if (herr.getId().equals(id)) {
                encontrado = herr;
            }
        }
        return encontrado;
    }
}
