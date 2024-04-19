package opp2.tp3.ejercicio1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import oop2.tp3.ejercicio1.Alquiler;
import oop2.tp3.ejercicio1.Cliente;
import oop2.tp3.ejercicio1.CopiaLibro;
import oop2.tp3.ejercicio1.Libro;
import oop2.tp3.ejercicio1.LibroInfantiles;
import oop2.tp3.ejercicio1.LibroNuevoLanzamiento;
import oop2.tp3.ejercicio1.LibroRegular;
import oop2.tp3.ejercicio4.Main;

public class PrestamosTest {

    @Test
    public void prestamoLibRegular() {
        var elTunel = new LibroRegular("El Túnel regular");
        CopiaLibro elTunelRegCopia = new CopiaLibro(elTunel);
        Alquiler alquilerElTunel = new Alquiler(elTunelRegCopia, 5);
        Cliente yo = new Cliente("Javier");
        yo.alquilar(alquilerElTunel);
        Object[] resultado = yo.calcularDeudaYPuntosObtenidos();
        assertEquals(6.5, resultado[0]);
        assertEquals(1, resultado[1]);

    }

    @Test
    public void prestamoLibInfantil() {
        var elTunel = new LibroInfantiles("El Túnel infantil");
        CopiaLibro elTunelInfCopia = new CopiaLibro(elTunel);
        Alquiler alquilerElTunel = new Alquiler(elTunelInfCopia, 5);
        Cliente yo = new Cliente("Javier");
        yo.alquilar(alquilerElTunel);
        Object[] resultado = yo.calcularDeudaYPuntosObtenidos();
        assertEquals(6.0, resultado[0]);
        assertEquals(1, resultado[1]);

    }

    @Test
    public void prestamoLibNuevoLanzamiento() {
        var elTunel = new LibroNuevoLanzamiento("El Túnel nuevo lanzamiento");
        CopiaLibro elTunelNLCopia = new CopiaLibro(elTunel);
        Alquiler alquilerElTunel = new Alquiler(elTunelNLCopia, 5);
        Cliente yo = new Cliente("Javier");
        yo.alquilar(alquilerElTunel);
        Object[] resultado = yo.calcularDeudaYPuntosObtenidos();
        assertEquals(15.0, resultado[0]);
        assertEquals(2, resultado[1]);

    }

    @Test
    public void prestamosMultiples() {
        var elTunel = new LibroRegular("El Túnel");
        var antesDelFin = new LibroRegular("Antes del Fin");
        CopiaLibro elTunelCopia = new CopiaLibro(elTunel);
        CopiaLibro antesDelFinCopia = new CopiaLibro(antesDelFin);
        Alquiler alquilerElTunel = new Alquiler(elTunelCopia, 5);
        Alquiler alquilerAntesDelFin = new Alquiler(antesDelFinCopia, 3);
        Cliente yo = new Cliente("Javier");
        yo.alquilar(alquilerElTunel);
        yo.alquilar(alquilerAntesDelFin);
        Object[] resultado = yo.calcularDeudaYPuntosObtenidos();
        assertEquals(10.0, resultado[0]);
        assertEquals(2, resultado[1]);
        Main.main(null);
    }

}
