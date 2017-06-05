package candyPresentPracticeTask;

/**
 * Created by rohau.andrei on 05.06.2017.
 */
public class Spartak extends Candy implements CandyInterface {
    private final int cathegory = 1;
    private final String company = "Spartak";

    public Spartak(int weight, int price, CandyType candyType) {
        super.weight = weight;
        super.price = price;
        super.candyType = candyType;
    }

    @Override
    public CandyType getCandyType() {
        return super.getCandyType();
    }

    public int getCathegory() {
        return cathegory;
    }

    public String getCompany() {
        return company;
    }
}
