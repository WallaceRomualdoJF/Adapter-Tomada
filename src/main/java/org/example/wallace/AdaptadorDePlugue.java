package org.example.wallace;

public class AdaptadorDePlugue implements Plugue {
    private PlugueDeDoisPinos plugueDeDoisPinos;

    public AdaptadorDePlugue(PlugueDeDoisPinos plugueDeDoisPinos) {
        this.plugueDeDoisPinos = plugueDeDoisPinos;
    }

    @Override
    public void conectar() {
        // Implementação da adaptação de um plugue de dois pinos para ser utilizado na tomada
        plugueDeDoisPinos.conectar();
    }
}
