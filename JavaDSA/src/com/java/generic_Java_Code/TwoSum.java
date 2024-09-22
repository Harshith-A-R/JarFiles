package com.java.generic_Java_Code;



public class TwoSum {

	
public static void main(String[] args) {
	int nu[] = { 6, 3, 7, 8, 4, 9 };
	int target = 15;
	// output =[2,3]
	int size = nu.length;
	int k;
	for (int i = 0; i <= size - 1; i++) {
		for (int j = 0; j <= size - 1; j++) {
			int n2 = nu[i] + nu[j];
			if (n2 == target) {
				 k= i;
					System.out.print(k);

			}
			//return -1;
			//System.out.println(j);

		}
		//return -1;
		//System.out.print();

	}
	//System.out.println("Index");
}
		
		

	}



//user_id: 2433,
//user_name: 'Venkat',
//user_address_State: 'Bangalore',
//user_address_country: 'INDIA',
//user_address_phone_number: '1234567890' 
