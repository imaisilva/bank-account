public class TerminalAccount {

    public static void main(String[] args) throws Exception {
        
        int accountNumber = Integer.parseInt(args[0]);
        String agency = args[1];
        String customerName = args[2];
        String customerLastName =args[3];
        Double balance = Double.parseDouble(args[4]);

        System.out.println("Enter account number: " + accountNumber);
        System.out.println("Enter agency: " + agency);
        System.out.println("Enter name: " + customerName);
        System.out.println("Enter last name: " + customerLastName);
        System.out.println("Enter balance: " + balance);

        System.out.println("Hi " + customerName + " " + customerLastName + ", thanks for creating with our bank, your agency is " + agency + ", account " + accountNumber + " and your balance " + balance + " it's now available for withdrawal! ");
    }
}
