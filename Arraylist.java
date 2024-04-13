import java.util.ArrayList;

public class Arraylist<T, U, V> {
    private T nim;
    private U name;
    private V class_;

    public T getNim() {
        return nim;
    }

    public void setNim(T nim) {
        this.nim = nim;
    }

    public U getName() {
        return name;
    }

    public void setName(U name) {
        this.name = name;
    }

    public V getClass_() {
        return class_;
    }

    public void setClass_(V class_) {
        this.class_ = class_;
    }

    public static void main(String[] args) {
        ArrayList<Mahasiswa<String, String, Integer>> mahasiswaList = new ArrayList<>();

        Mahasiswa<String, String, Integer> m1 = new Mahasiswa<>();
        m1.setNim("20224248");
        m1.setName("Ayu Amaliyah");
        m1.setClass_(20);

        Mahasiswa<String, String, Integer> m2 = new Mahasiswa<>();
        m2.setNim("20224221");
        m2.setName("Nabila Eliazar");
        m2.setClass_(22);

        mahasiswaList.add(m1);
        mahasiswaList.add(m2);

        for (Mahasiswa<String, String, Integer> m : mahasiswaList) {
            System.out.println("NIM: " + m.getNim());
            System.out.println("Name: " + m.getName());
            System.out.println("Class: " + m.getClass_());
            System.out.println("-----------");
        }
    }
}

