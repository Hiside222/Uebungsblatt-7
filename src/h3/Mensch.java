package h3;

public class Mensch {
	public String name;
	public int gebJahr;
	public int alter;

	public void setName(String n) {
		this.name = n;
	}

	public void setGebJahr(int jahr) {
		this.gebJahr = jahr;
	}

	public void setAlter() {
		this.alter = 2025 - this.gebJahr;
	}

	public String getName() {
		return this.name;
	}

	public int getGebJahr() {
		return this.gebJahr;
	}

	public int getAlter() {
		return this.alter;
	}
}
