import javax.swing.*;
public class Ejecucion {
    public static void main(String[] args) {
        //Instanciación de la clase
        Vehiculo objetoVehiculo = new Vehiculo("","","","",0,0);
        Vehiculo moto = new Vehiculo("","","","",0, 0);

        //Dar valores a los atributos por medio del objeto - SET
        objetoVehiculo.setMarca("Hyundai");
        objetoVehiculo.setModelo("i25");
        objetoVehiculo.setColor("Azul");
        objetoVehiculo.setPlaca("GWN767");
        objetoVehiculo.setAnio(2025);
        objetoVehiculo.setPrecio(500000);

        //Mostrar valores de los atributos por medio del objeto - GET
        String cad = "";
        String caddos = "";
        cad = "La marca del vehiculo es: " +
                "" + objetoVehiculo.getMarca() + "\n" + "El modelo del vehiculo es: " +
                "" + objetoVehiculo.getModelo() + "\n" + "El color del vehiculo es: " +
                "" + objetoVehiculo.getColor() + "\n" + "La placa del vehiculo es: " +
                "" + objetoVehiculo.getPlaca() + "\n" + "El año del vehiculo es: " +
                "" + objetoVehiculo.getAnio() + "\n" + "El precio del vehiculo es: " +
                "" + objetoVehiculo.getPrecio();

        JOptionPane.showMessageDialog(null,cad);

        //Objeto moto
        //Dar valores a los atributos por medio del objeto - SET
        moto.setMarca("Suzuki");
        moto.setModelo("gsx750");
        moto.setColor("Negro");
        moto.setPlaca("GHN45U");
        moto.setAnio(2025);
        moto.setPrecio(20000);

        //Mostrar valores de los atributos por medio del objeto - GET
        caddos = "La marca del vehiculo es: " +
                "" + moto.getMarca() + "\n" + "El modelo del vehiculo es: " +
                "" + moto.getModelo() + "\n" + "El color del vehiculo es: " +
                "" + moto.getColor() + "\n" + "La placa del vehiculo es: " +
                "" + moto.getPlaca() + "\n" + "El año del vehiculo es: " +
                "" + moto.getAnio() + "\n" + "El precio del vehiculo es: " +
                "" + moto.getPrecio();

        JOptionPane.showMessageDialog(null,caddos);
    }
}
