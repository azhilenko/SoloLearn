public class Student {
    int id;
    String name;
    Address address;

    public Student(int id, String name, Address address)
    {
        this.id=id;
        this.name=name;
        this.address=address;
    }

    void showDetails()
    {
        System.out.println(id+" "+name);
        System.out.println(address.city+" "+address.state+" "+address.country);
    }

    public static void main(String[] args) {
        Address add1=new Address("Mumbai", "Maharashtra", "India");
        Address add2=new Address("Surat", "Gurat", "India");
        Student s1=new Student(0015, "Nigel", add1);
        Student s2=new Student(0016, "Yogesh", add2);
        s1.showDetails();
        s2.showDetails();
    }
}
