package pbo_9_animal;
class Cat extends Animal implements Pet{
    private String n;
    public Cat (String n)
    {
        super(4);
        this.n = n;
        System.out.println("Nama kucing ini adalah "+n);
    }
    public Cat(){
        super(4);
        System.out.println("Ini kucing punya " + legs + " kaki");
    }
    @Override
    public String getName (){
        return n;
    }
    @Override
    public void setName(String n){
        this.n = n;
    }
    @Override
    public void play(){
        System.out.println(n +" lagi bermain");
    }
    @Override
    public void eat(){
        System.out.println(n + " lagi makan");
    }
}
