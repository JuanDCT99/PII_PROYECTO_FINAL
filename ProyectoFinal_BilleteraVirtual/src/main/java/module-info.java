module co.edu.uniquindio.poo.proyectofinal_billeteravirtual {
    requires javafx.controls;
    requires javafx.fxml;


    opens co.edu.uniquindio.poo.proyectofinal_billeteravirtual to javafx.fxml;
    exports co.edu.uniquindio.poo.proyectofinal_billeteravirtual;
}