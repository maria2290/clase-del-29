package com.leidy.heramienta.dao;

import com.leidy.heramienta.Dto.HerramientaDto;

import java.util.ArrayList;

public class HerramientasDao {



    ArrayList<HerramientaDto> herramientaDtos;

    public HerramientasDao() {
        this.herramientaDtos = new ArrayList<>();
    }
    public ArrayList<HerramientaDto>  leerTodos() {
        return this.herramientaDtos;
    }
    public void guardarTodos(ArrayList<HerramientaDto> herramientas) {
        herramientaDtos = herramientas;
    }
}


