package com.company;


    class President{
        public void methodPresident(){
            System.out.println("he is the head of company");
        }
    }
    class Ceo extends President{
        public void methodStaffing(){
            System.out.println("he reports to president");
        }
    }
    class Cto extends President{
        public void methodDigital(){
            System.out.println("he reports to Precident");
        }
    }
    class Sales extends Ceo{
        public void salesOperations(){
            System.out.println("Sales team reports to ceo");
        }
    }
    class Marketing extends Ceo{
        public void marketingOperation(){
            System.out.println("marketing team is managed my ceo");
        }
    }
    class Hr extends Ceo{
        public void HrOperation(){
            System.out.println("both recruiting and operations are reported to ceo");
        }
    }
    class ExecutiveManagers extends Cto{
        public void ManagingTeamLeads(){
            System.out.println("executive managers look after team leads and report to cto");
    }
    }
    class TeamLeads extends ExecutiveManagers{
        public void ManagingDevelopers(){
            System.out.println("Teamleads reports to executive managers and look after developers");
        }
    }
    class Developer extends TeamLeads{
        public void DevelopingCode(){
            System.out.println("Developers manage junior developers and develop code");
        }
    }
    class JuniorDevs extends Developer{
        public void WriteCode(){
            System.out.println("junior developers write code and reports to developers");
        }
    }

public class Hierarchy {
        public static void main(String args[]) {
            Ceo obj1 = new Ceo();
            Cto obj2 = new Cto();
            Sales obj3 = new Sales();
            Marketing obj4 = new Marketing();
            Hr obj5 = new Hr();
            ExecutiveManagers obj6 = new ExecutiveManagers();
            TeamLeads obj7 = new TeamLeads();
            Developer obj8=new Developer();
            JuniorDevs obj9=new JuniorDevs();



            obj1.methodPresident();
            
        }
}
