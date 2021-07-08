package com.example.students.model;

public class home 
{
	public String nameOne;
	public String nameTwoo;
	public String lanaOne;
	public String lanaTwoo;
	public Integer age;
	public String Profession;
	public String getNameOne() {
		return nameOne;
	}
	public void setNameOne(String nameOne) {
		this.nameOne = nameOne;
	}
	public String getNameTwoo() {
		return nameTwoo;
	}
	public void setNameTwoo(String nameTwoo) {
		this.nameTwoo = nameTwoo;
	}
	public String getLanaOne() {
		return lanaOne;
	}
	public void setLanaOne(String lanaOne) {
		this.lanaOne = lanaOne;
	}
	public String getLanaTwoo() {
		return lanaTwoo;
	}
	public void setLanaTwoo(String lanaTwoo) {
		this.lanaTwoo = lanaTwoo;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getProfession() {
		return Profession;
	}
	public void setProfession(String profession) {
		Profession = profession;
	}
	@Override
	public String toString() {
		return "home [nameOne=" + nameOne + ", nameTwoo=" + nameTwoo + ", lanaOne=" + lanaOne + ", lanaTwoo=" + lanaTwoo
				+ ", age=" + age + ", Profession=" + Profession + "]";
	}
	
}
