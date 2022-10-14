import javax.swing.JOptionPane;
 
public class PersonaApp {
 
    public static void main(String[] args) {
 
        //Introducimos los datos
        String nombre = JOptionPane.showInputDialog("Introduce el nombre");
 
        String texto = JOptionPane.showInputDialog("Introduce la edad");
        int edad = Integer.parseInt(texto);
 
        texto = JOptionPane.showInputDialog("Introduce el sexo");
        char sexo = texto.charAt(0);
 
        texto = JOptionPane.showInputDialog("Introduce el peso");
        double peso = Double.parseDouble(texto);
 
        texto = JOptionPane.showInputDialog("Introduce la altura");
        double altura = Double.parseDouble(texto);
 
        //Creamos objetos con cada constructor
        
        Persona persona1 = new Persona(nombre, edad, sexo, peso, altura);
 
        //Los datos que no esten completos los insertamos con los metodos set
       
        //Usamos metodos para realizar la misma accion para cada objeto
        
        System.out.println("Persona");
        MuestraMensajePeso(persona1);
        MuestraMayorDeEdad(persona1);
        System.out.println(persona1.toString());
    }
 
    public static void MuestraMensajePeso(Persona p) {
        int IMC = p.calcularIMC();
        switch (IMC) {
            case Persona.PESO_IDEAL:
                System.out.println("La persona esta en su peso ideal");
                break;
            case Persona.INFRAPESO:
                System.out.println("La persona esta por debajo de su peso ideal");
                break;
            case Persona.SOBREPESO:
                System.out.println("La persona esta por encima de su peso ideal");
                break;
        }
    }
 
    public static void MuestraMayorDeEdad(Persona p) {
 
        if (p.esMayorDeEdad()) {
            System.out.println("La persona es mayor de edad");
        } else {
            System.out.println("La persona no es mayor de edad");
        }
    }
 
}
