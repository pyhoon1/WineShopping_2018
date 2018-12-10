package aop;

//import org.apache.logging.log4j.LogManager;
//import org.apache.logging.log4j.core.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

public class MyAspect {
	
//	private Logger logger = LogManager.getLogger(MyAspect.class);
	
	//around 로 붙이기!!!!
	//타겟의 메소드를 수동으로 처리가능!!
	public Object logger(ProceedingJoinPoint jp) throws Throwable{
		//타겟이 실행되는 과정에 대한 로그를 기록해보자!!!
		String sn = jp.getSignature().toString();
		System.out.println(sn+" 시작전!!!");
		
		try {
			//타겟의 메소드를 호출하는 것!!
			Object ob = jp.proceed();
			System.out.println(jp+" 리턴되고 나서");
			return ob;
		}finally {
			System.out.println(jp+" 끝남!");
		} 
	}
	
	public void before(JoinPoint jp) {
		System.out.println(jp.getSignature());
	}
     
}








