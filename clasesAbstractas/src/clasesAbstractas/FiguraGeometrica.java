package clasesAbstractas;

public abstract class FiguraGeometrica implements InterfaceFG {

	  private String nombre;
	  private int numero;
	  private String color;
	  public FiguraGeometrica(String nombre,String color){
		this.nombre=nombre;
		this.color=color;
		
	}
	

	//metodo abstracto
	public String toString(){
		
		return nombre+"su area es:" + area()+"y su color es:"+ color;
	}
	
	public  String getName(){
		return nombre;
	}
	public  int suma(){
		return numero;
	}
}
