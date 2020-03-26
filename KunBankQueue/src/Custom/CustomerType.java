package Custom;

public enum CustomerType {
	COMMON,EXPRESS,VIP;
	
	public String tosString() {
		String name=null;
		
		switch (this) {
		case COMMON: name="普通顾客"; break;
		case EXPRESS:name="快速业务顾客";break;
		case VIP:name=name();break;
		}
		return name;
	}
}
