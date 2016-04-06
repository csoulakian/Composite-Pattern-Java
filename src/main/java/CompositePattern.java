/**
 * Chrissy Soulakian
 * in-class-assignment Project
 * Created on 4/5/2016
 */
public class CompositePattern {
    public static void main(String[] args) {

        //set up employees
        Employee CEO = new Employee("John", 100, "CEO", 300000, "full time");

        Employee salesDirector = new Employee("Carol", 101, "Director of Sales", 150000, "full time");
        Employee researchDirector = new Employee("Tim", 102, "Director of R&D", 175000, "full time");
        Employee marketingDirector = new Employee("Michelle", 103, "Director of Marketing", 150000, "full time");

        Employee salesTeam1 = new Employee("Jim", 111, "Sales Team Lead", 100000, "full time");
        Employee salesTeam2 = new Employee("Billy", 112, "Sales Team", 100000, "full time");
        Employee salesTeam3 = new Employee("Nicole", 113, "Sales Team", 100000, "full time");
        Employee salesAdmin = new Employee("Mike", 141, "Sales Admin", 50000, "full time");

        Employee researchTeam1 = new Employee("Bob", 121, "Research Team Lead", 120000, "full time");
        Employee researchTeam2 = new Employee("Tracy", 122, "Research Team", 120000, "full time");
        Employee researchTeam3 = new Employee("Penelope", 123, "Research Team", 120000, "full time");
        Employee researchAdmin = new Employee("Tanya", 142, "Research Admin", 50000, "part time");

        Employee marketingTeam1 = new Employee("Stacy", 131, "Marketing Team Lead", 100000, "full time");
        Employee marketingTeam2 = new Employee("Bryan", 132, "Marketing Team", 100000, "full time");
        Employee marketingTeam3 = new Employee("Rachel", 133, "Marketing Team", 100000, "full time");
        Employee marketingAdmin = new Employee("Alex", 143, "Marketing Admin", 45000, "part time");

        //set up employee hierarchy structure
        CEO.hire(salesDirector);
        CEO.hire(researchDirector);
        CEO.hire(marketingDirector);

        salesDirector.hire(salesAdmin);
        salesDirector.hire(salesTeam1);
        salesTeam1.hire(salesTeam2);
        salesTeam1.hire(salesTeam3);

        researchDirector.hire(researchAdmin);
        researchDirector.hire(researchTeam1);
        researchTeam1.hire(researchTeam2);
        researchTeam1.hire(researchTeam3);

        marketingDirector.hire(marketingAdmin);
        marketingDirector.hire(marketingTeam1);
        marketingTeam1.hire(marketingTeam2);
        marketingTeam1.hire(marketingTeam3);

        //print employees at all levels
        System.out.println("***********Composite Company Structure***********\n");
        System.out.println(CEO);

        for(Employee level1Employee : CEO.getSubordinates()) {
            System.out.println("\t- " + level1Employee);

            for(Employee level2Employee : level1Employee.getSubordinates()){
                System.out.println("\t\t+ " + level2Employee);

                for(Employee level3Employee : level2Employee.getSubordinates()){
                    System.out.println("\t\t\t~ " + level3Employee);
                }
            }
        }
    }
}
