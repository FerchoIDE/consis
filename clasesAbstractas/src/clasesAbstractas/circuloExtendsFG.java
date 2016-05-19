package clasesAbstractas;

public class circuloExtendsFG extends FiguraGeometrica{

	private int radio;
	private String nombre="circulo";
	 public circuloExtendsFG(int r) {
		 super("circulo","azul");
	radio =r;
	 }
	
	
	@Override
	public double area() {
		// TODO Auto-generated method stub
		return Math.PI*Math.pow(radio, 2);
	}


	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return nombre;
	}


	@Override
	public int suma() {
		// TODO Auto-generated method stub
		return 10;
	}


	


	

}
