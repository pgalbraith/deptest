package moduleB;

public class ModuleB {

    public static void main(String[] argv) throws ClassNotFoundException {
        ClassLoader cl = Thread.currentThread().getContextClassLoader();
        Class<?> clazz = cl.loadClass("moduleA.ModuleA");
        System.out.println("loaded " + clazz);
    }

}
