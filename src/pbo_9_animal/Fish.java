package pbo_9_animal;
class Fish extends Animal implements Pet {
    private String n;
    public Fish(){
        super(0);
        System.out.println("ikan gak ada kakinya, dia sirip pakai renang");
    }
    @Override
    public String getName(){
        return n;
    }
    @Override
    public void setName(String n){
        this.n = n;
    }
    @Override
    public void play(){
        System.out.println(n + " lagi main");
    }
    @Override
    public void walk(){
        System.out.println(n +" berenang gak jalan");
    }
    @Override
    public void eat(){
        System.out.println(n + " lagi makan makanan ikan");
    }
}
