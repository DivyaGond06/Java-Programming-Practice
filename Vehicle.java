
  class Vehicle{
         String brand;
        String model;
       Vehicle(String brand,String model) {
       this.brand=brand;
       this.model=model;
       }
void dispVehicle(){
      System.out.println("Brand Name: " + brand);
     System.out.println("Brand Model: "+ model);
 }
  }
class Car extends Vehicle{
        double price;
        String fuelType;
        Car(String brand,String model,double price,String fuelType){
          super(brand,model);
                this.price= price;
                this.fuelType=fuelType;
        }
        void dispCar(){
                System.out.println("Car price: "+ price);
                System.out.println("Car FuelType: " + fuelType);
        }
}
 class Client{
         public static void main(String[] args) {
                 Car c=new Car("BMW","series7",458078636,"Deisel");
                 c.dispCar();
                 c.dispVehicle();
         }
 }
