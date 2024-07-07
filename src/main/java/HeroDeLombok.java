import java.util.Objects;


// 롬복을 제거하고 IDE의 생성 기능을 이용한다 e.g. getter,setter, equals,hashcode,toString
public class HeroDeLombok {
    private String name;

    private int age;

    private String address;



    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

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



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HeroDeLombok hero = (HeroDeLombok) o;
        return age == hero.age && Objects.equals(name, hero.name) && Objects.equals(address, hero.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, address);
    }

    @Override
    public String toString() {
        return "Hero{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }
}