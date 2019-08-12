package custom.annotation.stringcombine;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class beanProxy implements InvocationHandler {
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
//        if (Object.class.equals(method.getDeclaringClass())) {
//            return method.invoke(this, args);
//        }
//        final Class<?> declaringInterface = findDeclaringInterface(proxy, method);
//        final MapperMethod mapperMethod = new MapperMethod(declaringInterface, method, sqlSession);
//        final Object result = mapperMethod.execute(args);
//        if (result == null && method.getReturnType().isPrimitive() && !method.getReturnType().equals(Void.TYPE)) {
//            throw new BindingException("Mapper method '" + method.getName() + "' (" + method.getDeclaringClass() + ") attempted to return null from a method with a primitive return type (" + method.getReturnType() + ").");
//        }
//        return result;
        return null;
    }
}
