class Solution {
	public int averageVector(ArrayList<Inetegr> list) {
		int result = 0; // sum
		//using for loop
		for (int i = 0; i < list.size(); i++) {
	    result += list.get(i);
    }
    //using for each loop
    for (int i : list) {
	    result += i
    }
  return result / list.size();
  }
}
