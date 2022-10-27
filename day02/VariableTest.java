/*
变量的使用
1.java定义变量的格式：数据类型 变量名 = 变量值;
2.说明
①变量必须先声明，后使用。
②变量都定义在其作用域内，在其作用域内是有效的，出了作用域就会失效。
③同一个作用域内，不可以声明两个同名的变量。
*/
class VariableTest {
	public static void main(String[] args) {
		//变量定义
		int myAge = 12;

		//变量的使用
		System.out.println(myAge);
		//使用myNumber之前未定义过myNumber
		//System.out.println(myNumber);

		//变量的声明
		int myNumber;

		//使用myNumber之前未赋值过myNumber
		//System.out.println(myNumber);

		//变量的赋值
		myNumber = 1001;

		//System.out.println(myClass);
		//int myAge = 22;不可以在同一个作用域内定义同名的变量
	}
}


	public void method(){
		int myClass = 1;
}

//class VariableTest {}//逆向思维，反证法。