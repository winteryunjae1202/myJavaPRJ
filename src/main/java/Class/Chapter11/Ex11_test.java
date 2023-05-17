package Class.Chapter11;

public class Ex11_test {
    public int sum(int a, int b) {
        return a + b;
    }

    public class Child extends Ex11_test {
        @Override
        public int sum(int a, int b) {
            return a * b;
        }
    }
}
