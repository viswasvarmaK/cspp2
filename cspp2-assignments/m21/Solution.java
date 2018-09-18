import java.util.Scanner;
//@ author SupriyaMadupathi

class FoodLog {
    private String item;
    private int quantity;
    private String time;
    private String date;

    FoodLog(final String name, final int q, final String date1, final String time1) {
        this.item = name;
        this.quantity = q;
        this.date = date1;
        this.time = time1;
    }

    
    public String getItem() {
        return this.item;
    }

    
    public int getQuantity() {
        return this.quantity;
    }

    
    public String getTime() {
        return this.time;
    }

    
    public String getDate() {
        return this.date;
    }

   
    public void setFoodName(final String name1) {
        this.item = name1;
    }

   
    public void setQuantity(final int q1) {
        this.quantity = q1;
    }

    
    public void setTime(final String time2) {
        this.time = time2;
    }

    
    public void setDate(final String date2) {
        this.date = date2;
    }

    public String toString() {
        String str = "Food" + "\n";
        str += "Date :" + getDate() + "\n";
        str += "Time :" + getTime() + "\n";
        str += "Name :" + getItem() + "\n";
        str += "Quantity :" + getQuantity();
        return str;
    }
}


class WaterLog {
    private String quantity;
    private String timeDate;
    
    
    WaterLog(final String q1, final String time1) {
        this.quantity = q1;
        this.timeDate = time1;
    }

    
    public String getWaterQuantity() {
        return this.quantity;
    }

    public String gettimeDate() {
        return this.timeDate;
    }

    

    public void setWaterQuantity(final String quan) {
        this.quantity = quan;
    }

   
    public void setTimeDate(final String time) {
        this.timeDate = time;
    }

   
    public String toString() {
        String str = "Water" + "\n";
        str += "Date :" + gettimeDate() + "\n";
        str += "Quantity :" + getWaterQuantity() + "ml";
        return str;
    }
}


class PhysicalActivity {
    private String pactivity;
    private String date;
    private String startTime;
    private String endTime;
    private String notes;

    PhysicalActivity(final String pN, final String n, final String date1,
        final String sT, final String eT) {
        this.pactivity = pN;
        this.notes = n;
        this.date = date1;
        this.startTime = sT;
        this.endTime = eT;
    }

    
    public String getPActivity() {
        return this.pactivity;
    }

    public String getDate() {
        return this.date;
    }

    
    public String getStartTime() {
        return this.startTime;
    }

    
    public String getEndTime() {
        return this.endTime;
    }

    
    public String getNotes() {
        return this.notes;
    }

   
    public void setPactivity(final String name) {
        this.pactivity = name;
    }

    public void setDate(final String date1) {
        this.date = date1;
    }

    
    public void setStartTime(final String start) {
        this.startTime = start;
    }

    
    public void setEndTime(final String end) {
        this.endTime = end;
    }

    
    public void setNotes(final String note) {
        this.notes = note;
    }

    
    public String toString() {
        String str = "PhysicalActivity" + "\n";
        str += "Name :" + getPActivity() + "\n";
        str += "Notes :" + getNotes() + "\n";
        str += "Date :" + getDate() + "\n";
        str += "Starttime :" + getStartTime() + "\n";
        str += "Endtime :" + getEndTime();
        return str;
    }
}


class SleepLog {
    private String date;
    private String startTime;
    private String endTime;
    
    SleepLog(final String date1, final String sT, final String eT) {
        this.date = date1;
        this.startTime = sT;
        this.endTime = eT;
    }
    
    public String getStartTime() {
        return this.startTime;
    }

    public String getEndTime() {
        return this.endTime;
    }

    public String getDate() {
        return this.date;
    }

    public void setStartTime(final String startT) {
        this.startTime = startT;
    }

    public void setEndTime(final String endT) {
        this.endTime = endT;
    }
    
    public void setDate(final String date2) {
        this.date = date2;
    }
    
    public String toString() {
        String str = "Sleep" + "\n";
        str += "Date :" + getDate() + "\n";
        str += "Starttime :" + getStartTime() + "\n";
        str += "Endtime :" + getEndTime() + "\n";
        return str;
    }
}


class WeightLog {
    private String startDate;
    private String startTime;
    private String weight;
    private String fat;

    
    WeightLog(final String startD, final String startT,
        final String w, final String fat1) {
        this.startDate = startD;
        this.startTime = startT;
        this.weight = w;
        this.fat = fat1;
    }

    public String getWeight() {
        return this.weight;
    }

    public String getFat() {
        return this.fat;
    }
    
    public String getstartDate() {
        return this.startDate;
    }
    
    public String getstartTime() {
        return this.startTime;
    }
    
    public void setWeight(final String w1) {
        this.weight = w1;
    }
    
    public void setFat(final String fat2) {
        this.fat = fat2;
    }

    
    public void setstartDate(final String startD1) {
        this.startDate = startD1;
    }

    
    public void setStartTime(final String startT1) {
        this.startTime = startT1;
    }

    public String toString() {
        String str = "Weight" + "\n";
        str += "Date :" + getstartDate() + "\n";
        str += "Time :" + getstartTime() + "\n";
        str += "Weight :" + getWeight() + "KG" + "\n";
        str += "Fat :" + getFat();
        return str;
    }
}


class FitByte {
    private List<PhysicalActivity> activitiesLog;
    private List<WaterLog> waterLogs;
    private List<FoodLog> foodLogs;
    private List<SleepLog> sleepLogs;
    private List<WeightLog> weightLogs;

   
    FitByte() {
        activitiesLog = new List<PhysicalActivity>();
        waterLogs = new List<WaterLog>();
        foodLogs = new List<FoodLog>();
        sleepLogs = new List<SleepLog>();
        weightLogs = new List<WeightLog>();
    }

    
    public List<WaterLog> getWaterLog() {
        return waterLogs;
    }

    
    public List<FoodLog> getFoodLog() {
        return foodLogs;
    }

    
    public List<SleepLog> getSleepLog() {
        return sleepLogs;
    }

    
    public List<PhysicalActivity> getPhysicalActivity() {
        return activitiesLog;
    }

    
    public List<WeightLog> getWeightLog() {
        return weightLogs;
    }

    
    public void addFood(FoodLog food) {
        foodLogs.add(food);
    }

    public void addWater(WaterLog water) {
        waterLogs.add(water);
    }

    
    public void addActivity(PhysicalActivity activity) {
        activitiesLog.add(activity);
    }

    
    public void addSleep(SleepLog sleep) {
        sleepLogs.add(sleep);
    }

    
    public void addWeight(WeightLog weight) {
        weightLogs.add(weight);
    }

    
    public void getSummary() {
        System.out.println(getFoodLog());
        System.out.println(getWaterLog());
        System.out.println(getPhysicalActivity());
        System.out.println(getWeightLog());
        System.out.println(getSleepLog());
    }

    
    public void getDSummary(final String date) {
        for (int i = 0; i < foodLogs.size(); i++) {
            if (foodLogs.get(i).getDate().equals(date)) {
                System.out.println(foodLogs.get(i));
            }
        }
        for (int i = 0; i < waterLogs.size(); i++) {
            if (waterLogs.get(i).gettimeDate().equals(date)) {
                System.out.println(waterLogs.get(i));
            }
        }
        for (int i = 0; i < sleepLogs.size(); i++) {
            if (sleepLogs.get(i).getDate().equals(date)) {
                System.out.println(sleepLogs.get(i));
            }
        }
        for (int i = 0; i < weightLogs.size(); i++) {
            if (weightLogs.get(i).getstartDate().equals(date)) {
                System.out.println(weightLogs.get(i));
            }
        }
        for (int i = 0; i < activitiesLog.size(); i++) {
            if (activitiesLog.get(i).getDate().equals(date)) {
                System.out.println(activitiesLog.get(i));
            }
        }
    }
}


public class Solution {
    
    private Solution() {
      
    }
    
    public static void main(final String[] args) {
        Scanner scan = new Scanner(System.in);
        FitByte fit = new FitByte();
        while (scan.hasNext()) {
            String[] tokens = scan.nextLine().split(" ");
            switch (tokens[0]) {
                case "Food":
                    String[] logs = tokens[1].split(",");
                    FoodLog food = new FoodLog(
                        logs[0], Integer.parseInt(logs[1]), logs[2], logs[3]);
                    fit.addFood(food);
                break;
                case "Water":
                    logs = tokens[1].split(",");
                    WaterLog water = new WaterLog(logs[0], logs[1]);
                    fit.addWater(water);
                break;
                case "Sleep":
                    logs = tokens[1].split(",");
                    SleepLog sleep = new SleepLog(logs[0], logs[1], logs[2]);
                    fit.addSleep(sleep);
                break;
                case "PhysicalActivity":
                    logs = tokens[1].split(",");
                    PhysicalActivity activity = new PhysicalActivity(logs[0], logs[1],
                        logs[2], logs[3], logs[4]);
                    fit.addActivity(activity);
                break;
                case "Weight":
                    logs = tokens[1].split(",");
                    WeightLog weight = new WeightLog(logs[0], logs[1],
                        logs[2], logs[3]);
                    fit.addWeight(weight);
                break;
                case "Foodlog":
                    System.out.println(fit.getFoodLog());
                break;
                case "Waterlog":
                    System.out.println(fit.getWaterLog());
                break;
                case "Sleeplog":
                    System.out.println(fit.getSleepLog());
                break;
                case "Weightlog":
                    System.out.println(fit.getWeightLog());
                break;
                case "PhysicalPhysicalActivity":
                    if (fit.getPhysicalActivity().size() == 0) {
                        System.out.println("None");
                    } else {
                        System.out.println(fit.getPhysicalActivity());
                    }
                break;
                case "Summary":
                    if (tokens.length == 1) {
                        fit.getSummary();
                    } else {
                        fit.getDSummary(tokens[1]);
                    }
                default:
                break;
            }
        }
    }
}
