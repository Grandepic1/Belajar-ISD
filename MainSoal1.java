public class MainSoal1 {
    public static void main(String[] args) {
        HashSet list = new HashSet(5);// 5vs5
        list.add("Haaland");
        list.add("Marcelino");
        list.add("Messi");
        list.add("Rodri");
        list.add("Ronaldo");
        list.add("Alvarez");
        list.add("Kevin De Bruyne");
        list.add("Mbappe");
        list.add("Joey");
        list.add("Ole");
        list.print(); //Mencetak seluruh anggota tim
        list.printWithRole(true); // Mencetak pemain utama
        list.printWithRole(false); // Mencetak pemain
    }

}
