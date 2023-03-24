package chapter06;

public class ShopService {
	private static ShopService shopservice = new ShopService();
	//private 필드  
	private ShopService() {}
	
	static ShopService getInstance() {
		return shopservice;
	}

}
