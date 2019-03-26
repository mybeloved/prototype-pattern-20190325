package prototypepattern.simple;

import prototypepattern.Prototype;

/**
 * @Program: prototype-pattern-20190325
 * @Description: 工厂类
 * @Author: whx
 * @Create: 2019-03-25 20:01
 **/
public class Client {
	public Prototype startClone(Prototype concretePrototype) {
		return concretePrototype.clone();
	}
	
}
