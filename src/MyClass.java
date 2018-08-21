import Samples.Animal;
import Samples.Person;
import Samples.Vehicle;


public class MyClass {
    public static void main(String[] args) {
        Animal dog = new Animal();
        dog.bark();
        int x=5;                    //numeric числовой
        addOneTo(x);                //type тип
        System.out.println(x);


        Person j;                   //reference ссылочный
        j=new Person("John");   //type тип
        j.setAge(20);
        celebrateBirthday(j);
        System.out.println(j.getAge());
        }

        static void celebrateBirthday(Person p){
        p.setAge(p.getAge()+1);
        }

        static  void addOneTo(int num){
        num=num=1; //при передаче в метод мы оперируем над значением, а не над самой переменной
        }
}