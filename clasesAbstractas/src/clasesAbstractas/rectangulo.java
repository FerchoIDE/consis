package clasesAbstractas;

public abstract class rectangulo extends FiguraGeometrica{

	protected int b;
	protected int h;
	
	public rectangulo(int b,int h){
		super("rectangulo","amarillo");
    this.b=b;
    this.h=h;
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return b*h/2;
	}
}
