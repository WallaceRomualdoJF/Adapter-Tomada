package padroesestruturais;

import org.example.wallace.AdaptadorDePlugue;
import org.example.wallace.PlugueDeDoisPinos;
import org.example.wallace.PlugueDeTresPinos;
import org.example.wallace.Tomada;
import org.junit.Test;

public class TesteTomada {
    @Test
    public void testarTomadaComPlugueDeDoisPinos() {
        Tomada tomada = new Tomada();
        PlugueDeDoisPinos plugue = new PlugueDeDoisPinos();
        tomada.conectar(plugue);
        // Verificar se o plugue de dois pinos foi conectado corretamente
    }

    @Test
    public void testarTomadaComPlugueDeTresPinos() {
        Tomada tomada = new Tomada();
        PlugueDeTresPinos plugue = new PlugueDeTresPinos();
        tomada.conectar(plugue);
        // Verificar se o plugue de três pinos foi conectado corretamente
    }

    @Test
    public void testarAdaptadorDePlugue() {
        Tomada tomada = new Tomada();
        PlugueDeDoisPinos plugue = new PlugueDeDoisPinos();
        AdaptadorDePlugue adaptador = new AdaptadorDePlugue(plugue);
        tomada.conectar(adaptador);
        // Verificar se o plugue de dois pinos foi conectado corretamente utilizando o adaptador
    }
}
