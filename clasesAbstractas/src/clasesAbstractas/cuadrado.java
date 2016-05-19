package clasesAbstractas;

public class cuadrado extends FiguraGeometrica {

	private int b;
	private String nombre;
	
	public  cuadrado(int b){
		super("cuadrado","rojo");
     this.b=b;
     
	}
	
	@Override
	public double area() {
		// TODO Auto-generated method stub
		return b*b;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return nombre;
	}

	@Override
	public int suma() {
		// TODO Auto-generated method stub
		return 20;
	}

	
}
