
public class VideoJuego implements entregable {

private String titulo;
private double horasEst=10;
private boolean entregado=false;
private String genero;
private String compañia;
  


	

public  VideoJuego() {
	
}
public void constructor1(String titulo,double HorasEstimadas) {
	this.titulo=titulo;
	this.horasEst=HorasEstimadas;
}
public void constructor2(String titulo,double HorasEstimadas,String genero,String compañia) {
	this.titulo=titulo;
	this.horasEst=HorasEstimadas;
	this.genero=genero;
	this.compañia=compañia;
}
public String getTitulo() {
	return titulo;
}
public void setTitulo(String titulo) {
	this.titulo = titulo;
}
public double getHorasEst() {
	return horasEst;
}
public void setHorasEst(double horasEst) {
	this.horasEst = horasEst;
}
public String getGenero() {
	return genero;
}
public void setGenero(String genero) {
	this.genero = genero;
}
public String getCompañia() {
	return compañia;
}
public void setCompañia(String compañia) {
	this.compañia = compañia;
}
@Override
public String toString() {
	return "VideoJuego [titulo=" + titulo + ", horasEst=" + horasEst + ", entregado=" + entregado + ", genero=" + genero
			+ ", compañia=" + compañia + "]";
}
@Override
public void entregar() {
	// TODO Auto-generated method stub
	this.entregado=true;
}
@Override
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
	if (numTemporadas==horasEstimadas) {
		System.out.println("las horas estimadas en los videojuegos y en el numero de temporadas de las series son los mismos");
		
	}else System.out.println("las horas estimadas en los videojuegos y en las series el numero de temporadas no son los mismos");
	
}

	// TODO Auto-generated method stub
	
}



