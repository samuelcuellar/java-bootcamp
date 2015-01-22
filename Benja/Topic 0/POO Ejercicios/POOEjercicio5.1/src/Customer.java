public class Customer {
	private String name;
	private boolean member;
	private String memberType;
	
	public Customer(String name) {
		this.name = name;
	}
	
	public boolean isMember() {
		return member;
	}

	public void setMember(boolean member) {
		this.member = member;
	}

	public String getName() {
		return name;
	}

	public String getMemberType() {
		return memberType;
	}

	public void setMemberType(String memberType) {
		this.memberType = memberType;
	}

	@Override
	public String toString() {
		String mesagge = "No";
		if (member) {
			mesagge = memberType;
		}
		return "Customer: " + name + ", member: " + mesagge;
	}
}
