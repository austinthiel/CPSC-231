public class Ch3Ex8{
	public static void main(String[] args){ // cryptarithmetic puzzle solver for 'TOO + TOO + TOO + TOO = GOOD'

		for(int t = 1; t < 10; t++){
			for(int o = 1; o < 10; o++){
				for(int g = 1; g < 10; g++){
					for(int d = 1; d < 10; d++){
						if(t != o && t != d && t != g && g != o && g != d && d != o){ // make sure no characters are the same number
							if((t*100 + o*10 + o) * 4 == g*1000 + o*100 + o*10 + d){ // make sure both sides of the equation are equal
								System.out.println("GOOD: " + g + o + o + d);
								System.out.println("TOO: " + t + o + o);
							}
						}
					}
				}
			}
		}
	}
}
