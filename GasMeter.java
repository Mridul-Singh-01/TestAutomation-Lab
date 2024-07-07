package MyPack;

public class GasMeter {
	public static double calculation(int preReading,int curReading) {
		double NumOfTherms=(curReading-preReading)*1.06748;
		double Charges;
		NumOfTherms=Math.abs(NumOfTherms);
		if(NumOfTherms<=75) {
			Charges=15+(NumOfTherms*1.05);
		}
		else if(NumOfTherms>75 && NumOfTherms<=150) {
			Charges=15+(NumOfTherms*1.25);
		}
		else if(NumOfTherms>150 && NumOfTherms<=250) {
			Charges=15+(NumOfTherms*1.50);
		}
		else {
			Charges=15+(NumOfTherms*2.25);
		}
		return Charges;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print(calculation(500,560));
	}

}
