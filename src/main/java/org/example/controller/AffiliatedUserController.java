package org.example.controller;

import org.example.entities.AffiliatedUser;
import org.example.services.AffiliatedUserService;

public class AffiliatedUserController {

        //llamar a la clase que valida
        AffiliatedUser usuarioMembresia = new AffiliatedUser();
        //llamar al servicio
        AffiliatedUserService servicioAfiliado = new AffiliatedUserService();

        public void registrarAfiliado(String name, String document, String email, Integer ubication){

            //utilizare los SET del usuario menbresia par avalidar los datos
            this.usuarioMembresia.setNames(name);
            this.usuarioMembresia.setDocument(document);
            this.usuarioMembresia.setEmail(email);
            this.usuarioMembresia.setUbication(ubication);

            //SI TODOS los datos del usuario se cargaron con set y no hubo errores
            //llamo al servicio para guardar los datos
            System.out.println(usuarioMembresia.getEmail());


    }
}
