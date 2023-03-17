package domain;

public class Bebida extends ItemDeMenu {

	public Bebida(String descripcion, float price) {
		super(descripcion, price);
		// TODO Auto-generated constructor stub
	}

	@Override
	String tipo() {
		// TODO Auto-generated method stub
		return "Bebida";
	}

}
