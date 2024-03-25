package javapractice;

public class Address {
	public java.lang.String address;
	public Address(java.lang.String  string) {
		this.address=string;
		
		
	}
	public static void main(String[] args) {
		
		Address address=new Address("hyderabad");
		
		System.out.println(address);
		
	}
	@Override
	public java.lang.String toString() {
		return "Address [address=" + address + "]";
	}

}
