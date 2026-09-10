public class Dog {
    private String name;
    private boolean isHungry;
    private String color;
    private double age;

    public Dog() {
        name = "Bob";
        isHungry = true;
        color = "Brown";
        age = 8;
    }

    public void setName(String newName) {
        name = newName;
    }

    public String getName() {
        return name;
    }

    public void checkHunger() {
        if (isHungry) {
            System.out.println("The dog is hungry.");
        }
        else {
            System.out.println("The dog is full.");
        }
    }

    public void setAge(double dogAge) {
        age = dogAge;
    }

    public double getAge() {
        return age;
    }
}
