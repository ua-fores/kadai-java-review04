package animal;

public class Human extends Animal implements Thinkable{
    private String hobby;

    public Human(String individualName, int age, String hobby) {
        super(individualName, age);
        this.hobby = hobby;
    }

    @Override
    public void think() {

        System.out.println("私は" + hobby + "について考えています。");

    }

}
