package oop2.tp3.ejercicio3;

public class GastoAlquilerAuto extends Gasto {

    public GastoAlquilerAuto(int monto) {
        super(monto);
        // TODO Auto-generated constructor stub
    }

    @Override
    public String nombre() {
        return "Alquiler de Autos";
    }

    @Override
    protected int montoComida() {
        return 0;
    }

    @Override
    protected boolean esExesoComidas() {
        return false;
    }

}
