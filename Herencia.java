public class Herencia {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.edad = 43;
        cliente.telefono = "809-6325578";
        cliente.nombre = "Ramon Perez";
        cliente.credito = 50000;
      

        System.out.println("Edad:" + cliente.edad);
        System.out.println("Telefono:" + cliente.telefono);
        System.out.println("Nombre:" + cliente.nombre);
        System.out.println("Credito:" + cliente.credito + "USD$");

        Trabajador trabajador = new Trabajador();
        trabajador.edad = 37;
        trabajador.telefono = "809-5326985";
        trabajador.nombre = "Juan Gonzalez";
        trabajador.salario = 5000;
      

        System.out.println("Edad:" + trabajador.edad);
        System.out.println("Telefono:" + trabajador.telefono);
        System.out.println("Nombre:" + trabajador.nombre);
        System.out.println("Salario:" + trabajador.salario + "USD$");
    }

}

class Persona {
    int edad;
    String nombre;
    String telefono;

}

class Cliente extends Persona{
    double credito;
}

class Trabajador extends Persona{
    double salario;
}

