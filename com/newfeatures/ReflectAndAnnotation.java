package com.newfeatures;


import java.lang.annotation.*;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Scanner;

// 自定义接口
interface TestInterface {
    public void methodTest();
}

// 自定义注解
@Retention(RetentionPolicy.RUNTIME)     // 保留策略
@Target(ElementType.TYPE)               // 作用目标
@Inherited
@interface SelfDefineAnnotation {
    public String value() default "";
}

// 接口实现类A
@SelfDefineAnnotation("TestClassA")
class TestClassA implements TestInterface {
    @Override
    public void methodTest() {
        System.out.println("接口实现类A");
    }
}

// 接口实现类B
@SelfDefineAnnotation("TestClassB")
class TestClassB implements TestInterface {
    @Override
    public void methodTest() {
        System.out.println("接口实现类B");
    }
}


public class ReflectAndAnnotation {

    public static void main(String[] args) {
        // 获取包下所有继承了TestInterface接口的类
        List<Class<?>> list = ClassUtil.getAllClassByInterface(TestInterface.class);

        Scanner scanner = new Scanner(System.in);
        String url = scanner.nextLine();

        for (Class<?> clazz : list) {
            // 如果类上存在指定注解
            if (clazz.isAnnotationPresent(SelfDefineAnnotation.class)) {
                // 获取注解中value的值
                SelfDefineAnnotation annotation = clazz.getAnnotation(SelfDefineAnnotation.class);
                String value = annotation.value();
                // 调用指定注解属性值的实现类的方法
                if (value.equals(url)) {
                    try {
                        Method method = clazz.getMethod("methodTest");
                        method.invoke(clazz.newInstance());
                    } catch (NoSuchMethodException e) {
                        e.printStackTrace();
                    } catch (IllegalAccessException e) {
                        e.printStackTrace();
                    } catch (InstantiationException e) {
                        e.printStackTrace();
                    } catch (InvocationTargetException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}


