import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer("udara");
        customer.setMember(false);
        customer.setMemberType("Gold");
        System.out.println(customer.toString());

        Visit visit = new Visit(customer,new Date());
        visit.setServiceExpense(100);
        visit.setProductExpense(50);
        System.out.println(visit.toString());
        System.out.println(customer.getMemberType());
//
//        System.out.println("Total Expense: "+visit.getTotalExpense());
//        System.out.println(visit);
    }
}
