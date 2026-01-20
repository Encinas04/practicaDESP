package com.example.demo;

import com.example.demo.controller.UsuarioController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@SpringBootTest
class DemoApplicationTests {

    @Autowired
    private UsuarioController usuarioController;

    @Test
    void contextLoads() {
        // Verifica que el controlador se haya cargado correctamente en el contexto
        assertThat(usuarioController).isNotNull();
    }


}
