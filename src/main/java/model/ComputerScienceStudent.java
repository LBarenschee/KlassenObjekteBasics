package model;

public class ComputerScienceStudent extends Students{

    protected String programmingLanguage;

    public ComputerScienceStudent(String name, int ID, String programmingLanguage) {
        super(name, ID);
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    public String toString() {
        return "ComputerScienceStudent{" +
                "programmingLanguage='" + programmingLanguage + '\'' +
                ", name='" + name + '\'' +
                ", ID=" + ID +
                '}';
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public int getID() {
        return 0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        ComputerScienceStudent that = (ComputerScienceStudent) o;

        return programmingLanguage != null ? programmingLanguage.equals(that.programmingLanguage) : that.programmingLanguage == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (programmingLanguage != null ? programmingLanguage.hashCode() : 0);
        return result;
    }
}
