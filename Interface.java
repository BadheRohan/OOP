interface vehicles{
    public void speedup(int a);
    public void gearchange(int b);
    public void applybreaks();    
}
class Bicycle implements vehicles {
    private int speed;
    int gear;

    public int getspeed(){
        return this.speed;
    }
    public void setspeed(int speed){
        this.speed = speed;
    }
     public void speedup(int increment){
        this.speed=this.speed+increment;

     }
     public void gearchange(int change){
        this.gear=change;

     }
     public void applybreaks(){
        this.speed = this.speed-this.speed;
        this.gear=0;

     }  
     public void display(){
        System.out.println("bicycle info");
        System.out.println("speed of bicycle is:"+this.speed);
        System.out.println("gear of bicycle is="+this.gear);
     }
    }
     class Car implements vehicles {
    private int speed;
    int gear;

    public int getspeed(){
        return this.speed;
    }
    public void setspeed(int speed){
        this.speed = speed;
    }
     public void speedup(int increment){
        this.speed=this.speed+increment;

     }
     public void gearchange(int change){
        this.gear=change;

     }
     public void applybreaks(){
        this.speed = this.speed-this.speed;
        this.gear=0;

     }  
     public void display(){
        System.out.println("bicycle info");
        System.out.println("speed of bicycle is:"+this.speed);
        System.out.println("gear of bicycle is="+this.gear);
     }

    }
class Interface{
    public static void main(String[] args) {
        Bicycle bicycle = new Bicycle();
        System.out.println(bicycle.getspeed());
        bicycle.setspeed(20);
        bicycle.speedup(5);
        bicycle.gearchange(4);
        bicycle.display();
        bicycle.applybreaks();
        bicycle.display();

         Car car = new Car();
         ( car.getspeed());
         car.setspeed(80);
         car.speedup(90);
         car.gearchange(6);
         car.display();
         car.applybreaks();
         car.display();
        
    }
}
