
public class Cat extends Animal implements NoiseCapable{
    //Constructor
    public Cat(){
        this("Cat");
    }
    public Cat(String catName){
        super(catName);
    }
    
    //Methods
    public void purr(){
        System.out.println(super.getName() + " purrs");
    }
    
    public void makeNoise(){
        this.purr();
    }
}
