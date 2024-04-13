import java.util.ArrayDeque;

public class A<T, U, V> {
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
        ArrayDeque<A<String, String, Integer>> mahasiswaDeque = new ArrayDeque<>();

        A<String, String, Integer> m1 = new A<>();
        m1.setNim("20224221");
        m1.setName("Nabilla Eliazar");
        m1.setClass_(22);

        A<String, String, Integer> m2 = new A<>();
        m2.setNim("20224248");
        m2.setName("Ayu Amaliyah");
        m2.setClass_(20);

        mahasiswaDeque.add(m1);
        mahasiswaDeque.add(m2);

        while (!mahasiswaDeque.isEmpty()) {
            A<String, String, Integer> m = mahasiswaDeque.poll();
            System.out.println("NIM: " + m.getNim());
            System.out.println("Name: " + m.getName());
            System.out.println("Class: " + m.getClass_());
            System.out.println("-----------");
        }
    }
}
