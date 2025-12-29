public class Main {
    public static void main(String[] args) {
        Helper helper = new Helper();
        Box b = new Box();
        b.setName("vahid");
        helper.changeName(b);
        System.out.println(b.getName());
    }
}
