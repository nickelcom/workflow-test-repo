public class Cat extends Animal{

    public Cat (String name, int age){
        this.name=name;
        this.age=age;
    }
    @Override

    public void makeNoise(String noise) {

        System.out.println(noise);

    }
}
