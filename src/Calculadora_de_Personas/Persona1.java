package Calculadora_de_Personas;
    /**
    * Se direcciona al paquete Calculadora_de_Personas
    */
public class Persona1 {
    public String Nombre;
    public int Edad;
    public String Provincia;
    public int NumeroP = 0;
    public int cantidad;
    /**
     * Se crean los parametros
     * @param Nombre
     * @param Edad
     * @param Provincia 
     */
    
    public Persona1(String Nombre, int Edad, String Provincia ) {
    this.Nombre = Nombre;
    this.Edad = Edad;
    this.Provincia = Provincia;
    }
    /**
     * Se establecen los parametros a la clase
     * @return 
     */
    
    public int getEdad(){
        return Edad;          
    }
    /**
     * Se muestra el valor de edad
     * @param Edad 
     */
    public void setEdad(int Edad){
      this.Edad = Edad;  
    }
    /**
     * se da un valor a la edad
     * @return 
     */
    public String getNombre(){
        return Nombre;          
    }
    /**
     * Se muestra el atributo Nombre 
     * @param Nombre 
     */
    public void setNombre(String Nombre){
      this.Nombre = Nombre;  
    }
    /**
     * se da La propiedad de Nombre
     * @return 
     */
    public String getProvincia(){
        return Provincia;          
    }
    /**
     * Se muestra el atributo Provincia 
     * @param Provincia 
     */
    public void setProvincia(String Provincia){
      this.Provincia = Provincia;  
    }
    /**
     * se da La propiedad de Provincia
     * @return 
     */
}
