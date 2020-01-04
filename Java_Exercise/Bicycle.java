class Bicycle {
  private String name;
  private String color;
  private int distance = 0;
  
  Bicycle(String name, String color) {
    this.name = name;
    this.color = color;
  }
    
  public String getName() {
    return this.name;
  }
  
  public void setName(String name) {
    this.name = name;
  }
  
  public String getColor() {
    return this.color;
  }
  
  public void setColor(String color) {
    this.color = color;
  }
  
  public int getDistance() {
    return this.distance;
  }
  
  public void setDistance(int distance) {
    this.distance = distance;
  }
  public void printData() {
    System.out.println("名前：" + this.name);
    System.out.println("色：" + this.color);
    System.out.println("走行距離:" + this.distance + "km");
  }

  public void run(int runDistance) {
    System.out.println(runDistance + "km走ります");
    this.distance += runDistance;
    System.out.println("走行距離：" + this.distance + "km");
  }
  
}