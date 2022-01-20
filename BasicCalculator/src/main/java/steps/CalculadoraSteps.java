package steps;
import pageobjects.CalculadoraPageObject;
import java.io.IOException;
import java.util.concurrent.TimeUnit;




public class CalculadoraSteps {

    CalculadoraPageObject calculadoraPom = new CalculadoraPageObject();


    public void abrirlapaginaCalculadora() {
        calculadoraPom.abrircalculadora();
    }

    public void seleccionarversion() throws IOException {
        calculadoraPom.version();
    }


    public void digitarnumerouno() throws  IOException {
        calculadoraPom.numerouno();

    }

        public void digitarnumerodos() throws IOException {
        calculadoraPom.numerodos();

    }

    public void seleccionaroperacion() throws IOException {
        calculadoraPom.operacion();
    }

    public void calcular(){
        calculadoraPom.botoncalcular();
    }

    public void cerrarpagina(){
        calculadoraPom.cerrar();
    }

}