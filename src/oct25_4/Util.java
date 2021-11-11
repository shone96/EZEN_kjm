package oct25_4;

public class Util {

	public static <T, M> M getValue(Pair<T, M> pair, T t) {		
		if(pair.getKey() == t) {
			return pair.getValue();			
		}else {
			return null;		
		}
	}

}
