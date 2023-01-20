public final class Immutable {
    private final String name;
    private final int age;

    public Immutable(final String name, final int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
}