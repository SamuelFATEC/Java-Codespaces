public class Main{
    public static void main(String [] args){
        HashTable hT = new HashTable();
        hT.setItem(54, "capivara");
        hT.setItem(26, "cachorro");
        hT.setItem(93, "lontra");
        hT.setItem(17, "tigre");
        hT.setItem(77, "Aguia");
        hT.setItem(31, "peixe");
        hT.setItem(44, "zebra");
        hT.setItem(55, "Leopardo");

        System.out.println(hT.getItem(54)+"\n"+hT.getItem(17)+"\n"+hT.getItem(93)+"\n"+hT.getItem(44));

        hT.setItem(44, "aranha");
        System.out.println(hT.getItem(44));
    }
}