import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;
import java.util.stream.Collectors;

public class FruitBasketUtility {
	private List<FruitBasket> fruitBasketList=new ArrayList<FruitBasket>();

	public List<FruitBasket> getFruitBasketList() {
		return fruitBasketList;
	}

	public void setFruitBasketList(List<FruitBasket> fruitBasketList) {
		this.fruitBasketList = fruitBasketList;
	}

	public void addToBasket(FruitBasket fbObj) {
		// Fill your code here
		fruitBasketList.add(fbObj);


	}

	public int calculateBill(Stream<FruitBasket> fruitBasketStream) {
		
		// Fill your code here
		int total = 0;
		for(int price : fruitBasketStream.map(busket -> busket.getWeightInKgs() * busket.getPricePerKg()).collect(Collectors.toList()))
		{
		    total += price;
		}
		return total;
	}

}
