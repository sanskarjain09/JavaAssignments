public class Car{
int noOfWheels = 7;
String colour;
float maxSpeed;
public float currentFuelInLiter;
int noOfSeats;

public Car start(){
if(currentFuelInLiter==0){
System.out.println("Out of Fuel");
}
else{
System.out.println("Started");
}
return this;
}

public void drive(){
if(currentFuelInLiter>0)
{
System.out.println("Car is running");
currentFuelInLiter--;
}
else{
System.out.println("add Fuel ");
}
}

public void addFule(int fuel){
currentFuelInLiter+=fuel;
}

public float getCurrentFuel(){
return currentFuelInLiter;
}
}