interface Animal {
    void makeSound();
    void makeSound(String s); // overwrite
}
class Pet implements Animal {  //实现接口
    public String value;
    @Override
    public void makeSound() { System.out.println("Pet");} // override接口方法
    @Override
    public void makeSound(String s) { System.out.println(s);} // override + overwrite
}
class Dog extends Pet {  //继承父类
    @Override
    public void makeSound(String s) {super.makeSound(s);this.value = s;}//super引用父类,this指向当前实例变量
    @Override
    public void makeSound() { System.out.println("Dog");}// override父类方法
}
public class example_class {
    public static void main(String[] args) {
        Animal dog = new Dog();
        dog.makeSound();
        dog.makeSound("dog.makeSound(String)");
    }
}
