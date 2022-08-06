package com.project.Api.Carros.api;

import com.project.Api.Carros.domain.Entities.CarroEntity;
import com.project.Api.Carros.domain.Servicies.CarroService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/carros")
public class CarrosController {

    private CarroService service = new CarroService();

    @GetMapping()
    public List<CarroEntity> getCars(){
        return service.getCars();
    }

}
