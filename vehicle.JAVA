class vehicle{
    String brand;
    int speed;
    public vehicle (String brand,int speed){
        this.brand=brand;
        this.speed=speed; }
    public void display(){
        System.out.println("The brand of the vehicle is: "+brand+" "+"The speed of the vehicle is: "+speed+" "); }
    public void start(){
        System.out.println("The vehicle is starting");
    }}
class car extends vehicle{
int doors;
    public car(String brand,int speed,int doors){
        super(brand, speed);
        this.doors=doors;
    }
    public void details(){
        super.display();
        System.out.println("The number of dooes are: "+doors);
    }}
class bike extends vehicle{
    boolean gears;
    public bike(String brand,int speed,boolean gears){
        super(brand, speed);
        this.gears=gears; }
    public void details(){
        super.display();
        System.out.println("Does the bike have gears: "+gears);
    }}
class truck extends vehicle{
double capacity;
    public truck(String brand,int speed,double capacity){
        super(brand, speed);
        this.capacity=capacity; }
    public void details(){
        super.display();
        System.out.println("The capacity of the truck is: "+capacity);}}
class system{
    public static void main(String[] args){
        car c = new car("benz",100,4);
        bike b = new bike("T.V.S",80,true);
        truck t = new truck("Mahindra",120,60);

        c.start();
        c.display();

        b.start();
        b.display();

        t.start();
        t.display();
    }}
