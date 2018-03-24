/**
 * 
 */
package design.pattern.creational.factory;

/**
 * @author amar
 *
 */
public class Man implements Person {
	private String name;
	private String gender;
	private int age;

	public Man() {
		super();
	}

	public Man(String name, String gender, int age) {
		super();
		this.name = name;
		this.gender = gender;
		this.age = age;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see design.pattern.creational.factory.Person#getName()
	 */
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return this.name;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see design.pattern.creational.factory.Person#getGender()
	 */
	@Override
	public String getGender() {
		// TODO Auto-generated method stub
		return this.gender;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see design.pattern.creational.factory.Person#getAge()
	 */
	@Override
	public int getAge() {
		// TODO Auto-generated method stub
		return this.age;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public void setAge(int age) {
		this.age = age;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Name of the person is : " + getName() + ". Age is : " + getAge() + ". Gender is : " + getGender();
	}
}
