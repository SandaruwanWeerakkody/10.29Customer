import java.util.Date;

public class Visit{


    private Customer customer;
    private Date date;
    private double serviceExpense;
    private double productExpense;

    public Visit(Customer customer,Date date){
        this.customer = customer;
        //super(name);
        this.date=date;
    }
    public String getName(){
        return customer.getName();
    }
    public String getMemberType(){
        return customer.getMemberType();
    }
    public boolean isMember(){
        return customer.isMember();
    }
    //public boolean
    public double getServiceExpense(){
        return serviceExpense;
    }
    public double getProductExpense(){
        return productExpense;
    }
    public void setServiceExpense(double serviceExpense){
        if(customer.isMember()){
            //DiscountRate discountRate = new DiscountRate();
            double discount = DiscountRate.getServiceDiscountRate(customer.getMemberType());
            this.serviceExpense = serviceExpense -(serviceExpense*discount);
        }else{
            this.serviceExpense=serviceExpense;
        }
    }
    public void setProductExpense(double productExpense){
        if(customer.isMember()){
            //DiscountRate discountRate = new DiscountRate();
            ///double discount = DiscountRate.getProductDiscountRate(customer.getMemberType());
            double discount = DiscountRate.getProductDiscountRate(customer.getMemberType());
            this.productExpense=productExpense-(productExpense*discount);
        }else{
            this.productExpense=productExpense;
        }
    }
    public double getTotalExpense(){
        return productExpense+serviceExpense;
    }
    @Override
    public String toString(){
        return "Visit [customer: "+customer.toString()+", date: "+date+ ", serviceExpense: "+serviceExpense+", productExpense: "+productExpense+"]";
    }
}
