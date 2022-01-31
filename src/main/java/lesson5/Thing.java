package lesson5;

import lesson2.HW.Notebook;

import java.util.Comparator;

public class Thing {

	private String name ;
	private int price;
	private int weight;

	public Thing(String name, int price, int weight) {
		setName(name);
		setPrice(price);
		setWeight(weight);
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Thing{" + "name='" + name + '\'' + ", price=" + price + ", weight=" + weight + '}';
	}

	public void setName(String name) {
		this.name = name;
	}
}
