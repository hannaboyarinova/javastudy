public class Counter {

    int min, max;

    Counter(){}
    Counter(int min, int max){
        this.min = min;
        this.max = max;
    }
    public int setMin (int min) {
        this.min = min;
        return min;
    }
    public int setMax (int max) {
        this.max = max;
        return max;
    }
    void increaseCounter (){
        if (this.min < this.max) this.min++;
            else resetCounter();
    }
    void increaseCounter (int min, int max){
        this.min = min;
        this.max = max;
        if (min < max) min++;
            else resetCounter();
    }
    private int resetCounter() {
        if (this.min>=this.max) this.min = 0;
        return this.min;
    }
}
class CounterTest {
    public static void main(String[] args) {
        Counter c2 = new Counter(1, 6);

        c2.setMin(8);
        c2.setMax(4);
        for (int i = 0; i <= 15; i++) {
            c2.increaseCounter();
            System.out.println(c2.min);
        }
    }
}