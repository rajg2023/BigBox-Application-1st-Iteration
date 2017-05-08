import java.text.NumberFormat;

public class Store extends Facility {
	private	String storeNumber;
	private String divisionNumber;
	private double sales;
	
	public Store(int fid,String dn,String sn, double s,String fname, String faddr,String fcity, String fst,String fzip){
		super(fid,fname,faddr,fcity,fst,fzip);
		storeNumber = sn;
		divisionNumber= dn;
		sales = s;	
	}

	public String getStoreNumber() {
		return storeNumber;
	}

	public void setStoreNumber(String storeNumber) {
		this.storeNumber = storeNumber;
	}

	public String getDivisionNumber() {
		return divisionNumber;
	}

	public void setDivisionNumber(String divisionNumber) {
		this.divisionNumber = divisionNumber;
	}

	public double getSales() {
		return sales;
	}

	public void setSales(double sales) {
		this.sales = sales;
	}
	 public String getFormattedSales()
	    {
	        NumberFormat currency = NumberFormat.getCurrencyInstance();
	        return currency.format(sales);
	    }
	 public void print(String varName){
			String printString = " Store Number:   "+ getStoreNumber() + " Division Number:   "+ getDivisionNumber() + " Sales:   "+ getFormattedSales();
			System.out.println(printString);
		}

	@Override
	public String toString(){
		return super.toString() + " Store Number:   "+ storeNumber + " Division Number:   "+ divisionNumber + " Sales:   "+ this.getFormattedSales();
	}



}
