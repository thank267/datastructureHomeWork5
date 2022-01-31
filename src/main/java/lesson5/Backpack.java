package lesson5;

import java.util.*;
import java.util.stream.Collectors;

public class Backpack {
	private NavigableMap<Integer, List<Thing>> resultsMap = new TreeMap<>();
	private List<Thing> things = new ArrayList<>();
	int backpackCapacity = 5;

	public static void main(String[] args) {

		Thing[] arr = new Thing[] {
				new Thing("Кофта", 10, 1),
				new Thing("Брюки", 15, 1),
				new Thing("Пальто", 15, 2),
				new Thing("Собака", 150, 3),
				new Thing("Шняга", 200, 4),
				new Thing("Фигня", 250, 5),
		};

		System.out.println(new Backpack().findBest(arr));

	}

	private Map.Entry<Integer, List<Thing>> findBest(Thing[] arr) {
		resultsMap.clear();
		things = Arrays.asList(arr.clone());
		find(things);
		return resultsMap.lastEntry();

	}

	private void find(List<Thing> things) {

		if (things.size() == 0) {
			return;
		}

		if (isFit(things)) {
			resultsMap.put(getPrice(things),things.stream().collect(Collectors.toList()));
		}

		for (int i = 0; i < things.size(); i++) {
			this.things = new ArrayList<>(things);
			this.things.remove(i);
			find(this.things);

		}
	}

	private int getPrice(List<Thing> things) {
		return things.stream().map(x -> x.getPrice()).reduce(0, Integer::sum);
	}

	private int getWeight(List<Thing> things) {
		return things.stream().map(x -> x.getWeight()).reduce(0, Integer::sum);
	}

	private boolean isFit(List<Thing> things) {
		return getWeight(things) <= backpackCapacity;
	}




}
