public class Helper {

    public void changeNumber(Box b){
        b.setValue(10);
        b=new Box();
        b.setValue(20);
    }

    public void changeName(Box b){
        b.setName("kaveh");
        b=new Box();
        b.setName("the name was not changed because the reference address was modified");
    }
}
