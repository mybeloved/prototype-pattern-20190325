package prototypepattern.deep;


import prototypepattern.Student;

import java.util.ArrayList;
import java.util.List;

/**
 * @Program: prototype-pattern-20190325
 * @Description: 测试类
 * @Author: whx
 * @Create: 2019-03-25 20:01
 **/
public class DeepCloneTest {
	
	public static void main(String[] args) {
		List hobby = new ArrayList<String>();
		Student student = new Student("Lin", 18, hobby);
		try {
			Student student1 = (Student) student.deepClone();
			System.out.println("深克隆：" + (student.getHobby() == student1.getHobby()));
		} catch (Exception e) {
			e.printStackTrace();
		}
		Student student2 = (Student) student.clone();
		System.out.println("浅克隆：" + (student.getHobby() == student2.getHobby()));
	}
}
