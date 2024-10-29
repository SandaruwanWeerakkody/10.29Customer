import java.util.Date;

public class Visit{
	
	
	private Customer customer;
	private Date date;
	private double serviceExpense;
	private double productExpense;
	
	public Visit(String name,Date date){
		this.customer = new Customer(name);
		//super(name);
		this.date=date;
	}
	public String getName(){
		return customer.getName();
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
			double discount = DiscountRate.getServiceDiscountRate(customer.getMemberType());
			this.serviceExpense = serviceExpense -(serviceExpense*discount);
		}else{
			this.serviceExpense=serviceExpense;
		}
	}
	public void setProductExpense(double productExpense){
		if(customer.isMember()){
			double discount = DiscountRate.getServiceDiscountRate(customer.getMemberType());
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
	return "Visit [customer="+customer.toString()+",date = "+date+",serviceExpense="+serviceExpense+",productExpense="+productExpense+"]";
	}
}
