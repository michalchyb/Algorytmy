package pl.mchyb.algorytmy.patterns;

public class Person {

    private String name;
    private int age;


    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private Person person = new Person();

        public Builder name(String name) {
            person.name = name;
            return this;
        }

        public Builder age(int age) {
            person.age = age;
            return this;
        }

        public Person build() {
            return person;
        }
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
}
