/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public class Mahasiswa<T, U, V> {
    private T nim;
    private U name;
    private V Class;

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
        return Class;
    }

    public void setClass_(V Class) {
        this.Class = Class;
    }

    public static void main(String[] args) {
        Mahasiswa<String, String, Integer> m = new Mahasiswa<>();
        m.setNim("1102020");
        m.setName("Ferdi");
        m.setClass_(21);
        
        System.out.println(m.getNim());
        System.out.println(m.getName());
        System.out.println(m.getClass_());
    }
}

