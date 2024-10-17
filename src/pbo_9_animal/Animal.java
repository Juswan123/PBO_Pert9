package pbo_9_animal;
abstract class Animal {
    protected int legs;
    protected Animal (int legs)
    {
        this.legs = legs;
    }
    protected int getLegs(){return legs;}
    public void walk (){
        System.out.println("Animal bisa jalan");
    }
    public void eat(){
        System.out.println("Animal bisa eat");
    }
}
