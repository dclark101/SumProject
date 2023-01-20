import java.util.*;


public class Sum {
    private List<Integer> numbers = new ArrayList<>();
    private int total;

    public Sum(List<Integer> numbers) {
        this.numbers = numbers;
    }

    public int getTotal() {
        return this.total;
    }
    public int sumAllNumbers() {
        for(int number : this.numbers) {
            this.total += number;
        }
        return total;
    }
}
