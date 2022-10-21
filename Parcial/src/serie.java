

public class serie implements entregable {
private String titulo;
private int numTemporadas=3;
private boolean entregado= false;
private String genero;
private String creador;





public serie( ) {
	
}
public void constructor1(String Titulo, String Creador) {
	this.titulo=Titulo;
	this.creador=Creador;
	
}
public void constructor2(String titulo,int NumTemp,String genero, String creador) {
	this.titulo=titulo;
	this.numTemporadas=NumTemp;
	this.genero=genero;
	this.creador=creador;
	
}

public String getTitulo() {
	return titulo;
}


public void setTitulo(String titulo) {
	this.titulo = titulo;
}


public int getNumTemporadas() {
	return numTemporadas;
}


public void setNumTemporadas(int numTemporadas) {
	this.numTemporadas = numTemporadas;
}


public String getGenero() {
	return genero;
}


public void setGenero(String genero) {
	this.genero = genero;
}


public String getCreador() {
	return creador;
}


public void setCreador(String creador) {
	this.creador = creador;
}

public String toString() {
	return "serie [titulo=" + titulo + ", numTemporadas=" + numTemporadas + ", entregado=" + entregado + ", genero="
			+ genero + ", creador=" + creador + "]";
}
@Override
public void entregar() {
	this.entregado=true;
	
	
	// TODO Auto-generated method stub
	
}

public void devolver() {
	// TODO Auto-generated method stub
	this.entregado=false;
}
@Override
public void isentregado() {
	// TODO Auto-generated method stub
	this.entregado=false;
}
@Override
public void compareTo(Object a) {
	// TODO Auto-generated method stub
	

if (numTemporadas==horasEstimadas) {
	System.out.println("las horas estimadas en los videojuegos y en el numero de temporadas de las series son los mismos");
	
}else System.out.println("las horas estimadas en los videojuegos y el numero de temporadas de las series son distintos");

}
}










