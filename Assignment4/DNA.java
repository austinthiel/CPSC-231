public class DNA{

	public String complement(String data){ // change DNA strand to its complement
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < data.length(); i++){ 
			char thisOne = data.charAt(i);
			if(thisOne == 'A'){
				sb.append('T');
			}
			if(thisOne == 'T'){
				sb.append('A');
			}
			if(thisOne == 'C'){
				sb.append('G');
			}
			if(thisOne == 'G'){
				sb.append('C');
			}
		}
		return sb.toString();
	}
	
	public String reverseComplement(String data){ // reverse the complement
		StringBuilder sb = new StringBuilder(data).reverse();
		return complement(sb.toString());
	}
}
