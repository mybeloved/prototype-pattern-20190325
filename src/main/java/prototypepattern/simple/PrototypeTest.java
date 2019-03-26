package prototypepattern.simple;

import prototypepattern.Student;

import java.util.ArrayList;
import java.util.List;


/**
 * @Program: prototype-pattern-20190325
 * @Description: 测试类
 * @Author: whx
 * @Create: 2019-03-25 20:01
 **/
public class PrototypeTest {
	
	public static void main(String[] args) {
		
		List hobby = new ArrayList<String>();
		
		Student student = new Student("Lin", 18, hobby);
		student.clone();
		System.out.println(student);
		
		Client client = new Client();
		Student student1 = (Student) client.startClone(student);
		System.out.println(student1);
		
		System.out.println("克隆对象中的引用类型地址值：" + student.getHobby());
		System.out.println("原对象中的引用类型地址值：" + student1.getHobby());
		System.out.println("对象地址比较：" + (student.getHobby() == student1.getHobby()));
		
		
	}
}
