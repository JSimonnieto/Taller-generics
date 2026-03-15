import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Vehiculo> vehiculos = new ArrayList<>();

        vehiculos.add(new Auto());
        vehiculos.add(new Moto());
        vehiculos.add(new Auto());
        vehiculos.add(new Moto());

        SistemaAlquiler.alquilarVehiculos(vehiculos);

    }
}