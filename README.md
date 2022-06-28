# week2-hamdiyecoskun
week2-hamdiyecoskun created by GitHub Classroom

# Singleton Pattern
` Singleton Design Pattern bir class’tan sadece bir instance oluşturulmasını sağlar. `
## Thread Safe
---
```java
public class SingletonPatternThreadSafe {
        private static volatile SingletonPatternThreadSafe instance;
    
        private SingletonPatternThreadSafe() {
        }
        
        public static SingletonPatternThreadSafe getInstance() {
            if (instance == null) {
                synchronized (SingletonPatternThreadSafe.class) {
                    if (instance == null) {
                        instance = new SingletonPatternThreadSafe();
                    }
                }
            }
            return instance;
        }


 public static void main(String[] args) {
            SingletonPatternThreadSafe example1 = SingletonPatternThreadSafe.getInstance();
            SingletonPatternThreadSafe example2 = SingletonPatternThreadSafe.getInstance();
            System.out.println(example1);
            System.out.println(example2);
            System.out.println(example1 ==example2);
        }
}
```
## Programın Çıktısı

![week2odev1out](https://user-images.githubusercontent.com/30255482/176276832-1563a882-2505-473c-9847-e2da8bb3e675.png)
