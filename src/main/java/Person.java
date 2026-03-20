// filepath: /home/goros/Workspace/java/chelo-gay/src/main/java/Person.java
public class Person {
    private String name;
    private String address;
    private int age;
    private String zipCode;

    public Person() {
    }

    public Person(String name, String address, int age, String zipCode) {
        this.name = name;
        this.address = address;
        this.age = age;
        this.zipCode = zipCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", age=" + age +
                ", zipCode='" + zipCode + '\'' +
                '}';
    }
}

