
public class App {
    public static void main(String[] args) throws Exception {
        PCComponent myPcComponent = new PCComponent();
        CPU CPU1 = new CPU();
        CPU1.price = 100.00;
        CPU1.name = "inteli7";
        CPU1.idNum = 1111;
        
        CPU CPU2 = new CPU();
        CPU2.price = 105.00;
        CPU2.name = "inteli8";
        CPU2.idNum = 2111;


        RAM RAM1 = new RAM();
        RAM1.price = 110.00;
        RAM1.name = "Corsair 32GB";
        RAM1.idNum= 1211;
        
        RAM RAM2 = new RAM();
        RAM2.price = 115.00;
        RAM2.name = "Corsair 64GB";
        RAM2.idNum= 1311;

        GPU GPU1 = new GPU();
        GPU1.price = 120.00;
        GPU1.name = "NVIDIA 3080";
        GPU1.idNum= 1121;

        GPU GPU2 = new GPU();
        GPU2.price = 125.00;
        GPU2.name = "NVIDIA 4080";
        GPU2.idNum= 1131;

        Storage Storage1 = new Storage();
        Storage1.price = 130.00;
        Storage1.name = "1TB";
        Storage1.idNum= 1112;

        Storage Storage2 = new Storage();
        Storage2.price = 135.00;
        Storage2.name = "2TB";
        Storage2.idNum= 1112;       
        
        PCComponent[] setUp1 = new PCComponent[4];

    
        setUp1[0] = CPU1;
        setUp1[1] = RAM1;
        setUp1[2] = GPU1;
        setUp1[3] = Storage1;

        PCComponent[] setUp2 = new PCComponent[4];

        setUp2[0] = CPU2;
        setUp2[1] = RAM2;
        setUp2[2] = GPU2;
        setUp2[3] = Storage2;

        double totalSetUp1Price = 0;
        for (PCComponent component : setUp1) {
            totalSetUp1Price += component.getCost();
        }

        System.out.println("Total price of setUp1: $" + totalSetUp1Price);
        
        
    }
}