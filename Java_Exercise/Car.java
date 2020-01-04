class Car extends Bicycle {
  private int fuel = 100;
  
  Car(String name, String color) {
    super(name, color);
  }
  
  public void printData() {
    super.printData();
    System.out.println("ガソリン量：" + this.fuel + "L");
  }
  
  public void run(int runDistance) {
    System.out.println(runDistance + "km走ります");
    
    if(runDistance <= fuel) {
      this.fuel -= runDistance;
    }else{
      System.out.println("ガソリンが足りません");
      runDistance = 0;
    }
    System.out.println("走行距離：" + runDistance + "km");
    System.out.println("ガソリン量：" + fuel + "L");
  }
  
  public void charge(int chargeFuel) {
    System.out.println(chargeFuel + "L給油します");
    if(chargeFuel <= 0) {
      System.out.println("給油できません");
    }else if(chargeFuel + this.fuel >= 100) {
      System.out.println("満タンまで給油します");
      this.fuel = 100;
    }else{
      this.fuel += chargeFuel;
    }
    System.out.println("ガソリン量：" + this.fuel + "L");
  }
  
}