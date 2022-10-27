/*
1.java规范了多种注释
单行注释
多行注释
文档注释(java特有)
2.单行注释和多行注释的作用
①对所写的程序进行解释说明，增强可读性。方便自己方便别人。
②可以调试所写的代码。
3.特点：单行和多行注释都不参与编译。
换句话说就是，编译以后生成的.class字节码文件不包含注释的信息。
4.文档注释的使用
注释的内容可以被JDK工具javadoc解析
5.多行注释不可以嵌套使用
即不能继续使用多行注释的头尾符号，主要是尾符号。
*/

/**
文档注释
@author Vent
@version v1.0
My First Program.
*/
public class HelloJava{
	/*多行注释：如下的main方法是程序的入口
	main的格式是固定的。*/
	public static void main(String[] args) {
		//单行注释：如下语句表示输出到控制台
		System.out.println("Hello World!");
		System.out.println("Hello World!");
	}
}
