import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    Bicycle bicycle = new Bicycle("ビアンキ", "緑");
    System.out.println("【自転車の情報】");    
    bicycle.printData();
    
    System.out.println("-----------------");
    
    System.out.print("走る距離を入力してください：");
    int runDistance = scanner.nextInt();
    bicycle.run(runDistance);
    
    System.out.println("=================");
    
    Car car = new Car("フェラーリ", "赤");
    System.out.println("【車の情報】");
    car.printData();
    
    System.out.println("-----------------");
    
    System.out.print("走る距離を入力してください：");
    runDistance = scanner.nextInt();
    car.run(runDistance);
    
    System.out.println("-----------------");
    
    System.out.print("給油する量を入力してください：");
    int chargeFuel = scanner.nextInt();
    car.charge(chargeFuel);
    
  }
}