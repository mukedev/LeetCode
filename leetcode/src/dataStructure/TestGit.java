package dataStructure;

public class TestGit {

    public static void main(String[] args) {
        System.out.printf("test");
        System.out.println(TestGit.add());
    }

    public static int add() {
        int num = 0;
        for (int i = 0; i < 10; i++) {
            ++num;
        }

        return num;
    }

    public static int remove() {
        int num = 0;
        for (int i = 0; i < 10; i++) {
            --num;
        }

        return num;
    }

}
