public class Main{
    public static void main(String[] args) { 
        Toko<AlatMusikElektronik> modernList = new Toko<>(5);
        Toko<AlatMusikTradisional> tradisionalList = new Toko<>(5);
        modernList.addData(new AlatMusikElektronik("E002", "Gitar", "Elektronik", 50000, 30));
        modernList.addData(new AlatMusikElektronik("E001", "Drum", "Elektronik", 100000, 20));
        modernList.addData(new AlatMusikElektronik("E004", "Bass", "Elektronik", 200000, 20));
        modernList.addData(new AlatMusikElektronik("E003", "Piano", "Elektronik", 350000, 20));
        modernList.addData(new AlatMusikElektronik("E005", "Mic", "Elektronik", 20000, 20));
        modernList.display();
        modernList.displaySort();
        tradisionalList.addData(new AlatMusikTradisional("T002", "Angklung", "Tradisional", 50000, 15));
        tradisionalList.addData(new AlatMusikTradisional("T001", "Suling", "Tradisional", 30000, 25));
        tradisionalList.addData(new AlatMusikTradisional("T004", "Gendang", "Tradisional", 30000, 25));
        tradisionalList.addData(new AlatMusikTradisional("T005", "Gong", "Tradisional", 30000, 25));
        tradisionalList.addData(new AlatMusikTradisional("T003", "Kecapi", "Tradisional", 30000, 25));
        tradisionalList.display();
        tradisionalList.displaySort();
    }
}