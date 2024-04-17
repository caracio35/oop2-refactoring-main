package opp2.tp3.ejercicio1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import oop2.tp3.ejercicio1.Alquiler;
import oop2.tp3.ejercicio1.Cliente;
import oop2.tp3.ejercicio1.CopiaLibro;
import oop2.tp3.ejercicio1.Libro;
import oop2.tp3.ejercicio1.LibroRegular;

public class PrestamosTest {

    @Test
    public void prestamo() {
        Libro elTunel = new LibroRegular("El Túnel");
        CopiaLibro elTunelCopia = new CopiaLibro(elTunel);
        Alquiler alquilerElTunel = new Alquiler(elTunelCopia, 5);
        Cliente yo = new Cliente("Javier");
        yo.alquilar(alquilerElTunel);
        Object[] resultado = yo.calcularDeudaYPuntosObtenidos();
        assertEquals(6.5, resultado[0]);
        assertEquals(1, resultado[1]);

    }
}
