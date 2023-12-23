class TestMaster{
    public static int sum(int a, int b){
        return (a+b);
    }
    public static void main(String[] args) {
        int a = 20, b = 51;
        System.out.println("main() : TestMaster");
        System.out.println(sum(a, b));
    }
}
