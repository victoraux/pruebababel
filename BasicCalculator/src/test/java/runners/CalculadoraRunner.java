package runners;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import steps.CalculadoraSteps;

import java.io.IOException;

public class CalculadoraRunner {

    CalculadoraSteps objcalculadora = new CalculadoraSteps();
    @Before
    public void SetUp (){
        objcalculadora.abrirlapaginaCalculadora();
    }
    @Test
    public void operaciones () throws IOException, InterruptedException {
        Thread.sleep(2000);
        objcalculadora.seleccionarversion();
        Thread.sleep(3000);
        objcalculadora.digitarnumerouno();
        Thread.sleep(3000);
        objcalculadora.digitarnumerodos();
        Thread.sleep(3000);
        objcalculadora.seleccionaroperacion();
        Thread.sleep(3000);
        objcalculadora.calcular();
        Thread.sleep(3000);

    }
    @After
    public void tearDown(){
        objcalculadora.cerrarpagina();
    }
}
