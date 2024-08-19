public class App {
    public static void main(String[] args) {
        Customer musteri1 = new Customer();
        Employee calisan1 = new Employee();
        CustomerManager musteriManager1 = new CustomerManager();
        EmployeeManager calisManager1 = new EmployeeManager();
        musteri1.id = 31;
        musteri1.name = "Eren";
        musteri1.surname = "Çalban";
        musteri1.age = 20;
        musteri1.email = "ecalban09@gmail.com";
        calisan1.id = 69;
        calisan1.name = "Fatih";
        calisan1.surname = "Talu";
        calisan1.age = 45;
        calisan1.salary = 150000;
        musteriManager1.Add();
        musteriManager1.List();
        calisManager1.Add();
        calisManager1.List();
        calisManager1.Best(); 
    }

}
