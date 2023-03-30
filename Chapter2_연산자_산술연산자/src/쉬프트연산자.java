// << >>
/*
 * 	10 << 2 // 왼쪽으로 2만큼 이동해라 (0 추가)
 * 	10=1010 => 1010()() => 1010(0)(0) => 101000 => 40
 * 						   ---------- 0을 뒤에 두개 채운다
 * 	7 << 3
 * 	7=111 => 111000 => 32+16+8=> 56
 * 	
 * 	8 << 2
 * 	8=1000 => 100000 => 32
 * 
 * 	산술: x<<y ==> x*2^y
 * 
 * ================================
 * 
 * 	10 >> 2 // 오른쪽으로 2만큼 이동해라 (제거)
 * 	10=1010 => 10 => 2
 * 	
 * 	15 >> 3
 * 	15=1111 => 1 => 1
 * 
 * 	27 >> 3
 * 	27=11011 => 11 => 2+1 => 3
 * 
 * 	산술: x>>y ==> x/2^y
 * 
 */
public class 쉬프트연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(10<<2);
		System.out.println(7<<3);
		System.out.println(8<<2);
		System.out.println(15>>3);
		System.out.println(10>>2);
		System.out.println(27>>3);
		System.out.println(100>>3);
	}

}
