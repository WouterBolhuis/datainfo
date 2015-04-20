package nl.utwente.di;

public class Quoter {
	public double getBookPrice(String x){
		if(x.equals("1")){
			return 10;
		} else if(x.equals("2")){
			return 45;
		} else if(x.equals("3")){
			return 20;
		} else if(x.equals("4")){
			return 35;
		} else if(x.equals("5")){
			return 50;
		} else {
			return 0;
		}
	}
}
