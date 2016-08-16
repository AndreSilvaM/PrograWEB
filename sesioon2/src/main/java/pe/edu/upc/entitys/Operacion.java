package pe.edu.upc.entitys;

public class Operacion {
	// Atributos

	private char operacion;
	private double numeroA;
	private double numeroB;

	// Constructor .. metodo - reservar espacio
	public Operacion() {

	}

	// Metodos de acceso a datos(get-set)

	public char getOperacion() {
		return operacion;
	}

	public void setOperacion(char operacion) {
		this.operacion = operacion;
	}

	public double getNumeroA() {
		return numeroA;
	}

	public void setNumeroA(double numeroA) {
		this.numeroA = numeroA;
	}

	public double getNumeroB() {
		return numeroB;
	}

	public void setNumeroB(double numeroB) {
		this.numeroB = numeroB;
	}

	// Metodo de usuario: calculadora
	public double Calcular() {
		try {
			switch (this.operacion) {
			case '+':
				return this.numeroA + this.numeroB;

			case '-':
				return this.numeroA - this.numeroB;

			case '*':
				return this.numeroA * this.numeroB;

			case '/':
				return this.numeroA / this.numeroB;

			default:
				return 0;

			}

		} catch (Exception e) {
			// TODO: handle exception
			return 0;
		}

	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+"gjgjg";
	}

}
