import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.control.ChoiceBox;
import javafxapplication1.Persona1;
/**
 *
 * @author Jean Carlo Araya
 */
public class Calculadora extends Application{
    

    public static void main(String[] args) {
        /**
         * El metodo main otorga funcionalidad al programa
         */
        launch(args);
        /**
         * El comando launch habilita a JavaFX
         */
    }
    /**
     * Se subdivide la clase Persona1 en 4 objetos persona  
     */
    public Persona1 persona1;
    public Persona1 persona2;
    public Persona1 persona3;
    public Persona1 persona4;
    public Persona1 contador;
    
    
    /**
     * El start es para abrir la ventana con JavaFX
     * @param primaryStage
     * @throws Exception 
     */
    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Calculadora de personas");
      
        contador = new Persona1();
        /**
         * Se crea la variable contador a la clase Persona1 
         */
        
        Label ResultAge = new Label("Resultado ");
        ResultAge.setTranslateX(-150);
        ResultAge.setTranslateY(-200);
        ResultAge.setTextFill(Color.AQUAMARINE);
        Font font = Font.font("Arial", 25);
        ResultAge.setFont(font);
        /**
         * Label para orientar el resultado de las operaciones
         */
        
        Label ResultAge2 = new Label("");
        ResultAge2.setTranslateX(70);
        ResultAge2.setTranslateY(-200);
        ResultAge2.setTextFill(Color.AQUAMARINE);
        ResultAge2.setFont(font);
        /**
         * Label para visualizar el resultado
         */
        
        Label Name = new Label("Nombre ");
        Name.setTranslateX(-150);
        Name.setTranslateY(-50);
        Name.setTextFill(Color.BLACK);
        Font font2 = Font.font("Arial", 15);
        Name.setFont(font2);
        /**
         * Label para orientar el nombre
         */
        
        Label Province = new Label("Provincia ");
        Province.setTranslateX(-145);
        Province.setTranslateY(0);
        Province.setTextFill(Color.BLACK);
        Province.setFont(font2);
        /**
         * Label para orientar la provincia
         */
        
        Label Age = new Label("Edad ");
        Age.setTranslateX(-157);
        Age.setTranslateY(50);
        Age.setTextFill(Color.BLACK);
        Age.setFont(font2);
        /**
         * Label para orientar la edad
         */
        
        Label Agree = new Label("Agregar persona");
        Agree.setTranslateX(-100);
        Agree.setTranslateY(-125);
        Agree.setTextFill(Color.AQUAMARINE);
        Font font3 = Font.font("Arial", 25);
        Agree.setFont(font3);
        /**
         * Label para orientar el agregar persona
         */
        
        Label Operation = new Label("Operaciones");
        Operation.setTranslateX(125);
        Operation.setTranslateY(-125);
        Operation.setTextFill(Color.AQUAMARINE);
        Operation.setFont(font3);
        /**
         * Label para orinetar la operacion
         */
        
        Label Subject1 = new Label("Persona 1:");
        Subject1.setTranslateX(80);
        Subject1.setTranslateY(-50);
        Subject1.setTextFill(Color.BLACK);
        Subject1.setFont(font2);
        /**
         * Label para orientar la persona 1
         */
        
        Label Subject2 = new Label("Persona 2:");
        Subject2.setTranslateX(80);
        Subject2.setTranslateY(15);
        Subject2.setTextFill(Color.BLACK);
        Subject2.setFont(font2);
        /**
         * Label para orientar la persona 2
         */
     
        TextField NamePerson = new TextField();
        NamePerson.setTranslateX(-45);
        NamePerson.setTranslateY(-50);
        NamePerson.setMaxWidth(125);
        /**
         * Textfield para ingresar nombre 
         */
        
        TextField AgePerson = new TextField();
        AgePerson.setTranslateX(-45);
        AgePerson.setTranslateY(50);
        AgePerson.setMaxWidth(125);
        /**
         * Textfield para ingresar la edad 
         */
        
        // Espacio para drop down lists
        ChoiceBox<String> ProvinceDDL = new ChoiceBox<>();
        ProvinceDDL.setTranslateX(-45);
        ProvinceDDL.setTranslateY(0);
        ProvinceDDL.setMaxWidth(125);
        ProvinceDDL.getItems().addAll("San Jose", "Alajuela", 
                "Cartago", "Heredia", "Limon", "Puntarenas", 
                "Guanacaste");
        /**
         * Dropdownlist para seleccionar la provincia de origen  
         */
        
        ChoiceBox<String> Eleccion1 = new ChoiceBox<>();
        Eleccion1.setTranslateX(125);
        Eleccion1.setTranslateY(-15);
        Eleccion1.setMaxWidth(160);
        /**
         * Dropdownlist para seleccionar a la persona1
         */
        
        ChoiceBox<String> Eleccion2 = new ChoiceBox<>();
        Eleccion2.setTranslateX(125);
        Eleccion2.setTranslateY(50);
        Eleccion2.setMaxWidth(160);
        /**
         * Dropdownlist para seleccionar a la persona2
         */
        
        // Espacio para botones 
        Button Agreebtn = new Button("+ Persona");
        Agreebtn.setTranslateX(-50);
        Agreebtn.setTranslateY(100);
        /**
         * Boton para agregar personas
         */
        
        Button Suma = new Button("+");
        Suma.setTranslateX(70);
        Suma.setTranslateY(100);
        /**
         * Boton para suma
         */
        
        Button Resta = new Button("-");
        Resta.setTranslateX(110);
        Resta.setTranslateY(100);
        Resta.setMaxWidth(25);
        /**
         * Boton par resta
         */
        
        Button Producto = new Button("*");
        Producto.setTranslateX(190);
        Producto.setTranslateY(100);
        Producto.setMaxWidth(25);
        /**
         * Boton para producto
         */
        
        Button Division = new Button("/");
        Division.setTranslateX(150);
        Division.setTranslateY(100);
        Division.setMaxWidth(25);
        /**
         * Boton par division 
         */
        
        Agreebtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                /**
                 * Funcionalidad que al dar click se agrega la persona.
                 * Se almacenan datos que se direccionaran a la clase Persona1.
                 */
                try {
                    switch (contador.cantidad) {
                        case 0 -> {
                            persona1 = new Persona1(NamePerson.getText(), Integer.parseInt(AgePerson.getText()), ProvinceDDL.getValue());
                            Eleccion1.getItems().add(persona1.Nombre);
                            Eleccion2.getItems().add(persona1.Nombre);
                            contador.cantidad++;
                        }
                        case 1 -> {
                            persona2 = new Persona1(NamePerson.getText(), Integer.parseInt(AgePerson.getText()), ProvinceDDL.getValue());
                            Eleccion1.getItems().add(persona2.Nombre);
                            Eleccion2.getItems().add(persona2.Nombre);
                            contador.cantidad++;
                        }
                        case 2 -> {
                            persona3 = new Persona1(NamePerson.getText(), Integer.parseInt(AgePerson.getText()), ProvinceDDL.getValue());
                            Eleccion1.getItems().add(persona3.Nombre);
                            Eleccion2.getItems().add(persona3.Nombre);
                            contador.cantidad++;
                        }
                        case 3 -> {
                            persona4 = new Persona1(NamePerson.getText(), Integer.parseInt(AgePerson.getText()), ProvinceDDL.getValue());
                            Eleccion1.getItems().add(persona4.Nombre);
                            Eleccion2.getItems().add(persona4.Nombre);
                            contador.cantidad++;
                        }
                        default -> System.out.println("La cantidad maxima son 4 personas");
                    }
                }
                catch(NumberFormatException except) {
                    System.out.println("Llene todos los espacios");
                }   }
        });
        
        Suma.setOnAction(e -> {
        /**
         * Al dar click se suman las edades. 
         * Se busca el objeto edad para realizar la operacion. 
         */
        String choice1 = Eleccion1.getValue();
        String choice2 = Eleccion2.getValue();
        int edad1;
        int edad2;
        if (choice1 != null && choice2 != null) {
            if (choice1.equals(persona1.Nombre)) {
                edad1 = persona1.Edad;
                if (choice2.equals(persona1.Nombre)){
                    edad2 = persona1.Edad;
                    ResultAge2.setText(Integer.toString(edad1 + edad2));
                }
                else if (choice2.equals(persona2.Nombre)){
                    edad2 = persona2.Edad;
                    ResultAge2.setText(Integer.toString(edad1 + edad2));
                }
                else if (choice2.equals(persona3.Nombre)){
                    edad2 = persona3.Edad;
                    ResultAge2.setText(Integer.toString(edad1 + edad2));
                }
                else {
                    edad2 = persona4.Edad;
                    ResultAge2.setText(Integer.toString(edad1 + edad2));
                }
            }
            else if (choice1.equals(persona2.Nombre)) {
                edad1 = persona2.Edad;
                if (choice2.equals(persona1.Nombre)){
                    edad2 = persona1.Edad;
                    ResultAge2.setText(Integer.toString(edad1 + edad2));
                }
                else if (choice2.equals(persona2.Nombre)){
                    edad2 = persona2.Edad;
                    ResultAge2.setText(Integer.toString(edad1 + edad2));
                }
                else if (choice2.equals(persona3.Nombre)){
                    edad2 = persona3.Edad;
                    ResultAge2.setText(Integer.toString(edad1 + edad2));
                }
                else {
                    edad2 = persona4.Edad;
                    ResultAge2.setText(Integer.toString(edad1 + edad2));
                }
            }
            else if (choice1.equals(persona3.Nombre)) {
                edad1 = persona3.Edad;
                if (choice2.equals(persona1.Nombre)){
                    edad2 = persona1.Edad;
                    ResultAge2.setText(Integer.toString(edad1 + edad2));
                }
                else if (choice2.equals(persona2.Nombre)){
                    edad2 = persona2.Edad;
                    ResultAge2.setText(Integer.toString(edad1 + edad2));
                }
                else if (choice2.equals(persona3.Nombre)){
                    edad2 = persona3.Edad;
                    ResultAge2.setText(Integer.toString(edad1 + edad2));
                }
                else {
                    edad2 = persona4.Edad;
                    ResultAge2.setText(Integer.toString(edad1 + edad2));
                }
            }
            else {
                edad1 = persona4.Edad;
                if (choice2.equals(persona1.Nombre)){
                    edad2 = persona1.Edad;
                    ResultAge2.setText(Integer.toString(edad1 + edad2));
                }
                else if (choice2.equals(persona2.Nombre)){
                    edad2 = persona2.Edad;
                    ResultAge2.setText(Integer.toString(edad1 + edad2));
                }
                else if (choice2.equals(persona3.Nombre)){
                    edad2 = persona3.Edad;
                    ResultAge2.setText(Integer.toString(edad1 + edad2));
                }
                else {
                    edad2 = persona4.Edad;
                    ResultAge2.setText(Integer.toString(edad1 + edad2));
                    
                }
            }
        }
        else {
            System.out.println("seleccione 2 personas");
        }
        });
        
        Division.setOnAction(e -> {
        /**
         * Al dar click se dividen las edades. 
         * Se busca el objeto edad para realizar la operacion. 
         */
        String choice1 = Eleccion1.getValue();
        String choice2 = Eleccion2.getValue();
        int edad1;
        int edad2;
        if (choice1 != null && choice2 != null) {
            if (choice1.equals(persona1.Nombre)) {
                edad1 = persona1.Edad;
                if (choice2.equals(persona1.Nombre)){
                    edad2 = persona1.Edad;
                    ResultAge2.setText(Double.toString((float) edad1 / edad2));
                }
                else if (choice2.equals(persona2.Nombre)){
                    edad2 = persona2.Edad;
                    ResultAge2.setText(Double.toString((float) edad1 / edad2));
                }
                else if (choice2.equals(persona3.Nombre)){
                    edad2 = persona3.Edad;
                    ResultAge2.setText(Double.toString((float) edad1 / edad2));
                }
                else {
                    edad2 = persona4.Edad;
                    ResultAge2.setText(Double.toString((float) edad1 / edad2));
                }
            }
            else if (choice1.equals(persona2.Nombre)) {
                edad1 = persona2.Edad;
                if (choice2.equals(persona1.Nombre)){
                    edad2 = persona1.Edad;
                    ResultAge2.setText(Double.toString((float) edad1 / edad2));
                }
                else if (choice2.equals(persona2.Nombre)){
                    edad2 = persona2.Edad;
                    ResultAge2.setText(Double.toString((float) edad1 / edad2));
                }
                else if (choice2.equals(persona3.Nombre)){
                    edad2 = persona3.Edad;
                    ResultAge2.setText(Double.toString((float) edad1 / edad2));
                }
                else {
                    edad2 = persona4.Edad;
                    ResultAge2.setText(Double.toString((float) edad1 / edad2));
                }
            }
            else if (choice1.equals(persona3.Nombre)) {
                edad1 = persona3.Edad;
                if (choice2.equals(persona1.Nombre)){
                    edad2 = persona1.Edad;
                    ResultAge2.setText(Double.toString((float) edad1 / edad2));
                }
                else if (choice2.equals(persona2.Nombre)){
                    edad2 = persona2.Edad;
                    ResultAge2.setText(Double.toString((float) edad1 / edad2));
                }
                else if (choice2.equals(persona3.Nombre)){
                    edad2 = persona3.Edad;
                    ResultAge2.setText(Double.toString((float) edad1 / edad2));
                }
                else {
                    edad2 = persona4.Edad;
                    ResultAge2.setText(Double.toString((float) edad1 / edad2));
                }
            }
            else {
                edad1 = persona4.Edad;
                if (choice2.equals(persona1.Nombre)){
                    edad2 = persona1.Edad;
                    ResultAge2.setText(Double.toString((float) edad1 / edad2));
                }
                else if (choice2.equals(persona2.Nombre)){
                    edad2 = persona2.Edad;
                    ResultAge2.setText(Double.toString((float) edad1 / edad2));
                }
                else if (choice2.equals(persona3.Nombre)){
                    edad2 = persona3.Edad;
                    ResultAge2.setText(Double.toString((float) edad1 / edad2));
                }
                else {
                    edad2 = persona4.Edad;
                    ResultAge2.setText(Double.toString((float) edad1 / edad2));
                    
                }
            }
        }
        else {
            System.out.println("Seleccione 2 personas");
        }
        });
        
        Resta.setOnAction(e -> {
        /**
         * Al dar click se restan las edades. 
         * Se busca el objeto edad para realizar la operacion. 
         */
        String choice1 = Eleccion1.getValue();
        String choice2 = Eleccion2.getValue();
        int edad1;
        int edad2;
        if (choice1 != null && choice2 != null) {
            if (choice1.equals(persona1.Nombre)) {
                edad1 = persona1.Edad;
                if (choice2.equals(persona1.Nombre)){
                    edad2 = persona1.Edad;
                    ResultAge2.setText(Integer.toString(edad1 - edad2));
                }
                else if (choice2.equals(persona2.Nombre)){
                    edad2 = persona2.Edad;
                    ResultAge2.setText(Integer.toString(edad1 - edad2));
                }
                else if (choice2.equals(persona3.Nombre)){
                    edad2 = persona3.Edad;
                    ResultAge2.setText(Integer.toString(edad1 - edad2));
                }
                else {
                    edad2 = persona4.Edad;
                    ResultAge2.setText(Integer.toString(edad1 - edad2));
                }
            }
            else if (choice1.equals(persona2.Nombre)) {
                edad1 = persona2.Edad;
                if (choice2.equals(persona1.Nombre)){
                    edad2 = persona1.Edad;
                    ResultAge2.setText(Integer.toString(edad1 - edad2));
                }
                else if (choice2.equals(persona2.Nombre)){
                    edad2 = persona2.Edad;
                    ResultAge2.setText(Integer.toString(edad1 - edad2));
                }
                else if (choice2.equals(persona3.Nombre)){
                    edad2 = persona3.Edad;
                    ResultAge2.setText(Integer.toString(edad1 - edad2));
                }
                else {
                    edad2 = persona4.Edad;
                    ResultAge2.setText(Integer.toString(edad1 - edad2));
                }
            }
            else if (choice1.equals(persona3.Nombre)) {
                edad1 = persona3.Edad;
                if (choice2.equals(persona1.Nombre)){
                    edad2 = persona1.Edad;
                    ResultAge2.setText(Integer.toString(edad1 - edad2));
                }
                else if (choice2.equals(persona2.Nombre)){
                    edad2 = persona2.Edad;
                    ResultAge2.setText(Integer.toString(edad1 - edad2));
                }
                else if (choice2.equals(persona3.Nombre)){
                    edad2 = persona3.Edad;
                    ResultAge2.setText(Integer.toString(edad1 - edad2));
                }
                else {
                    edad2 = persona4.Edad;
                    ResultAge2.setText(Integer.toString(edad1 - edad2));
                }
            }
            else {
                edad1 = persona4.Edad;
                if (choice2.equals(persona1.Nombre)){
                    edad2 = persona1.Edad;
                    ResultAge2.setText(Integer.toString(edad1 - edad2));
                }
                else if (choice2.equals(persona2.Nombre)){
                    edad2 = persona2.Edad;
                    ResultAge2.setText(Integer.toString(edad1 - edad2));
                }
                else if (choice2.equals(persona3.Nombre)){
                    edad2 = persona3.Edad;
                    ResultAge2.setText(Integer.toString(edad1 - edad2));
                }
                else {
                    edad2 = persona4.Edad;
                    ResultAge2.setText(Integer.toString(edad1 - edad2));
                    
                }
            }
        }
        else {
            System.out.println("Seleccione 2 personas");
        }
        });
              
        Producto.setOnAction(e -> {
        /**
         * Al dar click se efectua el producto de las edades. 
         * Se busca el objeto edad para realizar la operacion. 
         */
        String choice1 = Eleccion1.getValue();
        String choice2 = Eleccion2.getValue();
        int edad1;
        int edad2;
        if (choice1 != null && choice2 != null) {
            if (choice1.equals(persona1.Nombre)) {
                edad1 = persona1.Edad;
                if (choice2.equals(persona1.Nombre)){
                    edad2 = persona1.Edad;
                    ResultAge2.setText(Integer.toString(edad1 * edad2));
                }
                else if (choice2.equals(persona2.Nombre)){
                    edad2 = persona2.Edad;
                    ResultAge2.setText(Integer.toString(edad1 * edad2));
                }
                else if (choice2.equals(persona3.Nombre)){
                    edad2 = persona3.Edad;
                    ResultAge2.setText(Integer.toString(edad1 * edad2));
                }
                else {
                    edad2 = persona4.Edad;
                    ResultAge2.setText(Integer.toString(edad1 * edad2));
                }
            }
            else if (choice1.equals(persona2.Nombre)) {
                edad1 = persona2.Edad;
                if (choice2.equals(persona1.Nombre)){
                    edad2 = persona1.Edad;
                    ResultAge2.setText(Integer.toString(edad1 * edad2));
                }
                else if (choice2.equals(persona2.Nombre)){
                    edad2 = persona2.Edad;
                    ResultAge2.setText(Integer.toString(edad1 * edad2));
                }
                else if (choice2.equals(persona3.Nombre)){
                    edad2 = persona3.Edad;
                    ResultAge2.setText(Integer.toString(edad1 * edad2));
                }
                else {
                    edad2 = persona4.Edad;
                    ResultAge2.setText(Integer.toString(edad1 * edad2));
                }
            }
            else if (choice1.equals(persona3.Nombre)) {
                edad1 = persona3.Edad;
                if (choice2.equals(persona1.Nombre)){
                    edad2 = persona1.Edad;
                    ResultAge2.setText(Integer.toString(edad1 * edad2));
                }
                else if (choice2.equals(persona2.Nombre)){
                    edad2 = persona2.Edad;
                    ResultAge2.setText(Integer.toString(edad1 * edad2));
                }
                else if (choice2.equals(persona3.Nombre)){
                    edad2 = persona3.Edad;
                    ResultAge2.setText(Integer.toString(edad1 * edad2));
                }
                else {
                    edad2 = persona4.Edad;
                    ResultAge2.setText(Integer.toString(edad1 * edad2));
                }
            }
            else {
                edad1 = persona4.Edad;
                if (choice2.equals(persona1.Nombre)){
                    edad2 = persona1.Edad;
                    ResultAge2.setText(Integer.toString(edad1 * edad2));
                }
                else if (choice2.equals(persona2.Nombre)){
                    edad2 = persona2.Edad;
                    ResultAge2.setText(Integer.toString(edad1 * edad2));
                }
                else if (choice2.equals(persona3.Nombre)){
                    edad2 = persona3.Edad;
                    ResultAge2.setText(Integer.toString(edad1 * edad2));
                }
                else {
                    edad2 = persona4.Edad;
                    ResultAge2.setText(Integer.toString(edad1 * edad2));
                    
                }
            }
        }
        else {
            System.out.println("Seleccione 2 personas");
        }
        });
        
        StackPane layout = new StackPane();
        layout.getChildren().addAll(ResultAge, Name,
     Province, Age, Agree, Operation, 
     Subject1, Subject2, NamePerson, AgePerson, 
     Agreebtn, Suma, Resta, Producto, Division, 
     ProvinceDDL, Eleccion1, Eleccion2, ResultAge2);
        /**
         * El layout se utiliza como plataforma para crear la interfaz. 
         */
        
        Scene scene = new Scene(layout, 500, 500);
        primaryStage.setScene(scene);
        primaryStage.show();
        /**
         * Se dimensiona el escenario
         */
    }
}
