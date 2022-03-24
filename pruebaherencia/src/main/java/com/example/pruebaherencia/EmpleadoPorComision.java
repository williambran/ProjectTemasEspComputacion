package com.example.pruebaherencia;

public class EmpleadoPorComision
{
    private String primerNombre;
    private String apellidoPaterno;
    private String numeroSeguroSocial;
    private double ventasBrutas; // ventas totales por semana
    private double tarifaComision; // porcentaje de comisi�n

    // constructor con cinco argumentos
    public EmpleadoPorComision( String nombre, String apellido, String nss,
                                double ventas, double tarifa )
    {
        // la llamada impl�cita al constructor de Object ocurre aqu�
        primerNombre = nombre;
        apellidoPaterno = apellido;
        numeroSeguroSocial = nss;
        establecerVentasBrutas( ventas ); // valida y almacena las ventas brutas
        establecerTarifaComision( tarifa ); // valida y almacena la tarifa de comisi�n
    } // fin del constructor de EmpleadoPorComision con cinco argumentos

    // establece el primer nombre
    public void establecerPrimerNombre( String nombre )
    {
        primerNombre = nombre;  // deber�a validar
    } // fin del m�todo establecerPrimerNombre

    // devuelve el primer nombre
    public String obtenerPrimerNombre()
    {
        return primerNombre;
    } // fin del m�todo obtenerPrimerNombre

    // establece el apellido paterno
    public void establecerApellidoPaterno( String apellido )
    {
        apellidoPaterno = apellido;  // deber�a validar
    } // fin del m�todo establecerApellidoPaterno

    // devuelve el apellido paterno
    public String obtenerApellidoPaterno()
    {
        return apellidoPaterno;
    } // fin del m�todo obtenerApellidoPaterno

    // establece el n�mero de seguro social
    public void establecerNumeroSeguroSocial( String nss )
    {
        numeroSeguroSocial = nss; // deber�a validar
    } // fin del m�todo establecerNumeroSeguroSocial

    // devuelve el n�mero de seguro social
    public String obtenerNumeroSeguroSocial()
    {
        return numeroSeguroSocial;
    } // fin del m�todo obtenerNumeroSeguroSocial

    // establece el monto de ventas brutas
    public void establecerVentasBrutas( double ventas )
    {
        if ( ventas >= 0.0 )
            ventasBrutas = ventas;
        else
            throw new IllegalArgumentException(
                    "Las ventas brutas deben ser >= 0.0" );
    } // fin del m�todo establecerVentasBrutas

    // devuelve el monto de ventas brutas
    public double obtenerVentasBrutas()
    {
        return ventasBrutas;
    } // fin del m�todo obtenerVentasBrutas

    // establece la tarifa de comisi�n
    public void establecerTarifaComision( double tarifa )
    {
        if (tarifa > 0.0 && tarifa < 1.0 )
            tarifaComision = tarifa;
        else
            throw new IllegalArgumentException(
                    "La tarifa de comisi�n debe ser > 0.0 y < 1.0" );
    } // fin del m�todo establecerTarifaComision

    // devuelve la tarifa de comisi�n
    public double obtenerTarifaComision()
    {
        return tarifaComision;
    } // fin del m�todo obtenerTarifaComision

    // calcula los ingresos
    public double ingresos()
    {
        return obtenerTarifaComision() * obtenerVentasBrutas();
    } // fin del m�todo ingresos

    // devuelve representaci�n String del objeto EmpleadoPorComision
    @Override // indica que este m�todo sobrescribe el m�todo de la superclase
    public String toString()
    {
        return String.format( "%s: %s %s\n%s: %s\n%s: %.2f\n%s: %.2f",
                "empleado por comision", obtenerPrimerNombre(), obtenerApellidoPaterno(),
                "numero de seguro social", obtenerNumeroSeguroSocial(),
                "ventas brutas", obtenerVentasBrutas(),
                "tarifa de comision", obtenerTarifaComision() );
    } // fin del m�todo toString
} // fin de la clase EmpleadoPorComision