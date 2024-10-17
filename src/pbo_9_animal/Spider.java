package pbo_9_animal;
class Spider extends Animal {
    public Spider(){
        super(8);
        System.out.println("Spider punya "  + legs +" kaki");
    }
    @Override
    public void eat (){
        System.out.println("Spider lagi makan Miles Morales supaya bisa jadi SPIDERMAN");
}
}