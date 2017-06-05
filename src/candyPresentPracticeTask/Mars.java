package candyPresentPracticeTask;

/**
 * Created by rohau.andrei on 05.06.2017.
 */
public class Mars extends Candy implements CandyInterface {
    private final int cathegory = 2;
    private final String company = "Mars";

    public Mars(int weight, int price, CandyType candyType) {
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
