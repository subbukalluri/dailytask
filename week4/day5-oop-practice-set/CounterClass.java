/**
 * OOP Practice 3: Counter class with increment, decrement, and reset, plus a
 * static counter that tracks how many Counter objects were created.
 */
class Counter {
    private int value;
    static int totalCounters = 0;

    Counter() {
        value = 0;
        totalCounters++;
    }

    void increment() {
        value++;
    }

    void decrement() {
        value--;
    }

    void reset() {
        value = 0;
    }

    int getValue() {
        return value;
    }
}

public class CounterClass {
    public static void main(String[] args) {
        Counter first = new Counter();
        Counter second = new Counter();

        first.increment();
        first.increment();
        first.increment();
        first.decrement();
        second.increment();

        System.out.println("First counter  : " + first.getValue());
        System.out.println("Second counter : " + second.getValue());

        first.reset();
        System.out.println("First after reset: " + first.getValue());
        System.out.println("Counters created : " + Counter.totalCounters);
    }
}
