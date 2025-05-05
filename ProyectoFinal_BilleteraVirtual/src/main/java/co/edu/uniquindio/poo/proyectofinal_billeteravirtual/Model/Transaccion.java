package co.edu.uniquindio.poo.proyectofinal_billeteravirtual.Model;

import java.time.LocalDate;
import java.util.LinkedList;

public class Transaccion {

    private String idTransaccion;
    private LocalDate fechaTransaccion;
    private TipoTransaccion tipoTransaccion;
    private double monto;
    private String descripcion;
    private LinkedList<Cuenta> cuentasAsociadas;
    private String empresaDestido;
    private Categoria categoria;

}
