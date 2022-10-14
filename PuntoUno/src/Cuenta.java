
public class Cuenta {
	    //ATRIBUTOS
	    private String titular;
	    private double cantidad;
	 
	    //CONSTRUCTORES
	    public Cuenta(String titular) {
	        this(titular, 0); //SOBRECARGA
	    }
	 
	    public Cuenta(String titular, double cantidad) {
	        this.titular = titular;
	        //SI LA CANTIDAD ES MENOR QUE CERO, LO PONEMOS A 0
	        if (cantidad < 0) {
	            this.cantidad = 0;
	        } else {
	            this.cantidad = cantidad;
	        }
	    }
	 
	    //METODOS
	    public String getTitular() {
	        return titular;
	    }
	 
	    public void setTitular(String titular) {
	        this.titular = titular;
	    }
	 
	    public double getCantidad() {
	        return cantidad;
	    }
	 
	    public void setCantidad(double cantidad) {
	        this.cantidad = cantidad;
	    }
	 
	    
	     // INGRESA DINERO EN LA CUENTA,SOLO SI ES POSITIVO
	     
	     
	     
	    public void ingresar(double cantidad) {
	        if(cantidad > 0){
	            this.cantidad += cantidad;   
	        }
	    }
	 
	    
	    // RETIRA UNA CANTIDAD DE LA CUENTA, SI QUEDA NEGATIVO SE HACE 0
	     
	    
	    public void retirar(double cantidad) {
	        if (this.cantidad - cantidad < 0) {
	            this.cantidad = 0;
	        } else {
	            this.cantidad -= cantidad;
	        }
	    }
	 
	   
	     // DEVUELVE EL ESTADO DEL OBJETO
	     
	    
	   
	    public String toString() {
	        return "El titular " + titular + " tiene " + cantidad + " euros en la cuenta";
	    }
	 
	}

