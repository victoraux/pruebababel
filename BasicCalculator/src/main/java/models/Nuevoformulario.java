package models;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Nuevoformulario {

    String version;
    String numerouno;
    String numerodos;
    String operacion;
    String ruta = "test.properties";

    Properties validardatos = new Properties();

    public String getVersion() throws IOException {
        validardatos.load(new FileReader(ruta));
        version = validardatos.getProperty("version");
        return version;
    }

    public String getNumerouno() throws IOException {
        validardatos.load(new FileReader(ruta));
        numerouno = validardatos.getProperty("numerouno");
        return numerouno;
    }

    public String getNumerodos() throws IOException {
        validardatos.load(new FileReader(ruta));
        numerodos = validardatos.getProperty("numerodos");
        return numerodos;
    }

    public String getOperacion() throws IOException {
        validardatos.load(new FileReader(ruta));
        operacion = validardatos.getProperty("operacion");
        return operacion;

    }
}