package clases;

public class Cuadrado {
	
	private int id;
	private String lado;
	private String color;
	
	public Cuadrado() {
	}
	
	public Cuadrado(int id, String lado, String color) {
		super();
		this.id = id;
		this.lado = lado;
		this.color = color;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the lado
	 */
	public String getLado() {
		return lado;
	}

	/**
	 * @param lado the lado to set
	 */
	public void setLado(String lado) {
		this.lado = lado;
	}

	/**
	 * @return the color
	 */
	public String getColor() {
		return color;
	}

	/**
	 * @param color the color to set
	 */
	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Cuadrado: id=" + id + ", lado=" + lado + ", color=" + color + ".";
	}
	
	
	
}
