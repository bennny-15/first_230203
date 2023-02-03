
import com.eightcruz.javaStudy.AccessObj;

public class AccessObjExam extends AccessObj {

	public static void main(String[] args) {
		AccessObjExam obj = new AccessObjExam();	
		// 부모 클래스가 아니라 자식 클래스로 객체 생성하면 부모 클래스에 있는 객체 접근 가능 
		
		System.out.println(obj.p);
		System.out.println(obj.p2);	// 패키지가 다르면 접근 불가(protected) -> 상속받으면 사용 가능
//		System.out.println(obj.k);	// default
//		System.out.println(obj.i);	// 접근 불가능(private)
	}

}
