// & | ^
/*
 *     &(*)	   |(+)    ^(둘이 같아야 0)
 * 00	0		0		0
 * 01	0		1		1
 * 10	0		1		1
 * 11	1		1		0
 * 
 *  8 & 3
 *  1000
 * 	0011
 * 	----- &
 * 	0000 => 0
 * 
 * 	8 | 3
 *  1000
 * 	0011
 * 	----- |
 * 	1011 => 11
 * 
 * 8 ^ 3
 *  1000
 * 	0011
 * 	----- ^
 * 	1011 => 11
 * 
 * 
 * 	13 & 6
 *  1101
 *  0110
 *  ----- &|^
 *  0100 1111 1011
 * 
 */
public class 비트연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(8&3);

	}

}
