package prototypepattern;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @Program: prototype-pattern-20190325
 * @Description: 学生实例
 * @Author: whx
 * @Create: 2019-03-25 20:01
 **/
public class Student implements Prototype, Serializable, Cloneable {
	String name;
	int age;
	List hobby;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public List getHobby() {
		return hobby;
	}
	
	public void setHobby(List hobby) {
		this.hobby = hobby;
	}
	
	public Student(String name, int age, List hobby) {
		this.name = name;
		this.age = age;
		this.hobby = hobby;
	}
	
	public Student() {
	}
	
	public Prototype clone() {
		return new Student(this.name, this.age, this.hobby);
	}
	
	public Object deepClone() {
		try {
			ByteArrayOutputStream bos = new ByteArrayOutputStream();
			ObjectOutputStream oos = new ObjectOutputStream(bos);
			oos.writeObject(this);
			ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
			ObjectInputStream ois = new ObjectInputStream(bis);
			Student copy = (Student) ois.readObject();
			copy.hobby = new ArrayList();
			return copy;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}
