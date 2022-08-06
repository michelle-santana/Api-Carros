package com.project.Api.Carros.domain.Servicies;

import com.project.Api.Carros.domain.Entities.CarroEntity;

import java.util.ArrayList;
import java.util.List;

public class CarroService {

    public List<CarroEntity> getCars(){

        List<CarroEntity> cars = new ArrayList<>();

        cars.add( new CarroEntity(1L, "Fusca"));
        cars.add( new CarroEntity(2L, "Chevette"));
        cars.add( new CarroEntity(3L, "Brasilia"));
        return cars;
    }

}
