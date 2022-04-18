public class Main {
    public static void main(String[] args) {

        Computer computer1 = new Computer(11L, "LAN-1");
        Computer computer2 = new Computer(12L, "LAN-2");
        Computer computer3 = new Computer(13L, "LAN-3");

        Office office1 = new Office(213L, "St. 1-116");
        Office office2 = new Office(214L, "St. 2-113");
        Office office3 = new Office(215L, "St. 4-201");
        Office office4 = new Office(325L, "St. 5-231");
        Office office5 = new Office(412L, "St. 10-121");

        Employee employee1 = new Employee(1L, "Vasia", computer1, office1);
        Employee employee2 = new Employee(1L, "Vasia", computer1, office4);
        Employee employee3 = new Employee(2L, "Vasia", computer2, office3);
        Employee employee4 = new Employee(3L, "Petia", computer3, office2);

        SecurityGuard securityGuard1 = new SecurityGuard(11L, "Hermione", computer2, office4);
        SecurityGuard securityGuard2 = new SecurityGuard(12L, "Harry", computer3, office5);
        SecurityGuard securityGuard3 = new SecurityGuard(13L, "Ron", computer1, office3);

        System.out.println(employee1.equalTo(employee2));
        System.out.println(employee1.equalTo(employee3));
        System.out.println(employee1.equalTo(employee4));
        System.out.println(employee2.equalTo(employee3));
        System.out.println(employee2.equalTo(office1));
//используем массив т.к. List пока не проходили
        Identifiable[] identifiables = {
                employee1, employee2, employee3, employee4,
                securityGuard1, securityGuard2, securityGuard3,
                computer1, computer2, computer3,
                office1, office2, office3, office4, office5};
        for (Identifiable identifiable : identifiables) {
            identifiable.printIdentifiable();
        }

        OfficeSupportEntity[] workers = {
                securityGuard1, securityGuard2,
                employee1, employee2, employee3, employee4};
        searchByOffice(workers, office1);

        ComputerSupportable[] people = {
                employee1, employee2, employee3, employee4,
                securityGuard1, securityGuard2, securityGuard3,
                new Courier(1111L, "Brain", computer1),
                new Courier(2222L, "Lucy", computer2),
                new Courier(3333L, "Igor", computer3)
        };
        printComputers(people);
    }

    public static OfficeSupportEntity[] searchByOffice(OfficeSupportEntity[] workers, Office office) {
        int count = 0;
        //да, с листом не нужно лишний раз проходиться по списку,
        // но листы будут через несколько занятий
        for (OfficeSupportEntity worker : workers) {
            if (worker.getOffice().equalTo(office)) {
                count++;
            }
        }
        OfficeSupportEntity[] resultList = new OfficeSupportEntity[count];
        int index = 0;
        for (OfficeSupportEntity worker : workers) {
            if (worker.getOffice().equalTo(office)) {
                resultList[index] = worker;
                index++;
            }
        }
        return resultList;
    }

    public static void printComputers(ComputerSupportable[] people) {
        for (ComputerSupportable person : people) {
            person.getComputer().printIdentifiable();
        }
    }

}
