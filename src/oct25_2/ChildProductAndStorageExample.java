package oct25_2;

public class ChildProductAndStorageExample {

	public static void main(String[] args) {
		
		ChildProduct<Tv, String, String> product = new ChildProduct<>();
		product.setKind(new Tv());
		product.setModel("스마트 티비");
		product.setCompany("삼성");
		
		Storage<Tv> storage = new StorageImpl<Tv>(100);
		storage.add(new Tv(), 0);
		Tv tv = storage.get(0);
		
		System.out.println(tv);

	}

}

