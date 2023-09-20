package oop.constructors.exercise1;

public class Adult {
    private String name;
    private String profession;
    private int height;

    public Adult(String name, int height, String profession) {
        this.setName(name);
        this.setProfession(profession);
        this.setHeight(height);
    }

    public Adult(String name, int height) {
        this(name, height, null);
    }

    public Adult(Adult adult) {
        this(adult.name, adult.height, adult.profession);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public int getHeight() {
        return height;
    }

    private void setHeight(int height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return String.format("Name: %s\nHeight: %d\n%s",
                this.name,
                this.height,
                this.profession != null
                        ? "Profession: " + this.profession + "\n" : "");
    }

    public void print() {
        System.out.print(this.toString());
    }
}
