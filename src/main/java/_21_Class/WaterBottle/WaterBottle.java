package _21_Class.WaterBottle;

public class WaterBottle {
    private int currentWater;

    WaterBottle(){
        System.out.println("현재 물통용량: " + currentWater + "ml");
    }

    public void fill(int amount){
        if (amount > 0 && currentWater + amount <= 1000){
            currentWater += amount;
            System.out.println(amount + "양의 물을채웠습니다. 현재용량: " + currentWater);
        }else {
            System.out.println("0 이상의 물을 채우지않거나 물병의 양을 초과할수 없습니다. 현재용량: " + currentWater);
        }
    }

    public void drink(int amount){
        if (amount > 0 && amount <= currentWater){
            currentWater -= amount;
            System.out.println(amount + "양의 물을 마셨습니다. 현재용량: " + currentWater);
        }else {
            System.out.println("0 이하의 물을 마시거나 현재 물병의 양을 초과하여 마실수 없습니다. 현재용량: " + currentWater);
        }
    }

    public int getCurrentWater() {
        return currentWater;
    }
}
