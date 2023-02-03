
public class BizExam {

	public static void main(String[] args) {
		BizService biz = new BizService();
		biz.bizMethod(5);	// 이상 없이 수행
		try {
			biz.bizMethod(-3);	// i가 0보다 작으므로 예외 발생
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
