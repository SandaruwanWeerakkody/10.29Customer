public class Customer{
    private String name;
    private boolean member = false;
    private String memberType;

    public Customer(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public boolean isMember(){
        return member;
    }
    public void setMember(boolean member){
        this.member=member;
    }

    public String getMemberType(){
        return memberType;
    }
    public void setMemberType(String type){
        if(member){
            this.memberType=type;
        }else{
            System.out.println("This is not a member");
        }

    }
    public String toString(){
        return "Name: " + name + ", Member: " + member + ", Member Type: " + memberType;
    }
}
